import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalDateTime;

public class ActiveSessionController {
    private ActiveSessionView view;
    private Sensor sensor;
    private UsageLogger logger;
    private UserAccounts user;
    private LocalDateTime startTime;
    private double finalCost = 0.0; // Added this so the payment button knows how much to charge!

    public ActiveSessionController(ActiveSessionView view, EquipmentForStatePattern equipment, UserAccounts user) {
        this.view = view;
        this.user = user;

        // Initialize the Observer Pattern!
        this.sensor = new Sensor("SENS-" + equipment.getId());
        this.logger = new UsageLogger();
        this.sensor.attach(this.logger); // Hooking them up

        // Attach listeners to the GUI buttons
        this.view.addStartListener(new StartAction());
        this.view.addStopListener(new StopAction());
        this.view.addCloseListener(new CloseAction());
    }

    class StartAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sensor.startEquipment(); // Triggers the Observer
            startTime = LocalDateTime.now();
            view.setSessionActive(true);
            updateLogsToView();
        }
    }

    class StopAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sensor.stopEquipment(); // Triggers the Observer
            view.setSessionActive(false);
            view.enableCloseButton();
            updateLogsToView();

            // Calculate mock duration (using seconds instead of hours for quick testing)
            LocalDateTime stopTime = LocalDateTime.now();
            long seconds = Duration.between(startTime, stopTime).getSeconds();

            // Save the math to our class variable
            finalCost = (seconds / 3600.0) * user.getHourlyRate();

            view.appendLog("\n--- Session Ended ---");
            view.appendLog(String.format("Final Estimated Cost: $%.5f", finalCost));
        }
    }

    class CloseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. Create a dropdown menu of payment options
            String[] options = {"Credit Card", "Debit", "Institutional Account", "Research Grant"};
            String selected = (String) JOptionPane.showInputDialog(
                    view,
                    String.format("Total Due: $%.5f\nSelect Payment Method:", finalCost),
                    "Checkout",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            // 2. If they didn't click cancel, process it using the Strategy Pattern!
            if (selected != null) {
                PaymentStrategy paymentMethod = null;

                switch (selected) {
                    case "Credit Card": paymentMethod = new CreditCardPayment(); break;
                    case "Debit": paymentMethod = new DebitCardPayment(); break;
                    case "Institutional Account": paymentMethod = new InstitutionalPayment(); break;
                    case "Research Grant": paymentMethod = new GrantPayment(); break;
                }

                // Execute the strategy and show the receipt
                if (paymentMethod != null) {
                    String receipt = paymentMethod.processPayment(finalCost);
                    JOptionPane.showMessageDialog(view, receipt, "Payment Successful", JOptionPane.INFORMATION_MESSAGE);
                }

                // Close the session window and return to dashboard
                view.dispose();
            }
        }
    }

    private void updateLogsToView() {
        // Grab the absolute latest log from the UsageLogger and put it on screen
        int lastIndex = logger.getLogs().size() - 1;
        if (lastIndex >= 0) {
            view.appendLog(logger.getLogs().get(lastIndex));
        }
    }
}