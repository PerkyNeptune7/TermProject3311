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

    // Financial Tracking Variables
    private double depositAmount = 0.0;
    private double amountDue = 0.0;

    public ActiveSessionController(ActiveSessionView view, EquipmentForStatePattern equipment, UserAccounts user) {
        this.view = view;
        this.user = user;

        this.sensor = new Sensor("SENS-" + equipment.getId());
        this.logger = new UsageLogger();
        this.sensor.attach(this.logger);

        // Attach listeners to all 5 buttons
        this.view.addDepositListener(new DepositAction());
        this.view.addLateTestListener(new LateTestAction());
        this.view.addStartListener(new StartAction());
        this.view.addStopListener(new StopAction());
        this.view.addCloseListener(new CloseAction());
    }

    // --- REQ 4: Pay the Deposit ---
    class DepositAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            depositAmount = user.getHourlyRate(); // 1 hour fee
            view.appendLog(String.format("System: Deposit of $%.2f paid.", depositAmount));
            view.setDepositPaidState(); // Unlocks the Start button!
        }
    }

    // --- REQ 4: The 20-Minute Penalty ---
    class LateTestAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.appendLog("\nSYSTEM ALERT: User arrived > 20 mins late!");
            view.appendLog(String.format("Penalty: Deposit of $%.2f FORFEITED.", depositAmount));
            view.appendLog("Reservation Cancelled.");

            depositAmount = 0; // The money is gone!
            amountDue = 0; // Nothing more to pay, they just lose the session
            view.setSessionEnded(); // Lock the machine, force them to close
        }
    }

    // --- Normal Operations ---
    class StartAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sensor.startEquipment();
            startTime = LocalDateTime.now();
            view.setSessionActive(true);
            updateLogsToView();
        }
    }

    class StopAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sensor.stopEquipment();
            view.setSessionEnded();
            updateLogsToView();

            // Calculate duration (using seconds instead of hours for quick testing)
            LocalDateTime stopTime = LocalDateTime.now();
            long seconds = Duration.between(startTime, stopTime).getSeconds();

            // Total cost of the session
            double totalCost = (seconds / 3600.0) * user.getHourlyRate();

            view.appendLog("\n--- Session Ended ---");
            view.appendLog(String.format("Total Usage Cost: $%.5f", totalCost));

            // Deduct the deposit from the final bill
            if (totalCost <= depositAmount) {
                amountDue = 0.0;
                view.appendLog("Status: Covered entirely by deposit.");
            } else {
                amountDue = totalCost - depositAmount;
                view.appendLog(String.format("Remaining Balance Due: $%.5f", amountDue));
            }
        }
    }

    class CloseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // If the deposit covered the whole session (or it was forfeited), just close it.
            if (amountDue <= 0) {
                JOptionPane.showMessageDialog(view, "Balance is $0.00. Session Complete.", "Checkout", JOptionPane.INFORMATION_MESSAGE);
                view.dispose();
                return;
            }

            // Otherwise, open the Payment Strategy dropdown to pay the remaining balance
            String[] options = {"Credit Card", "Debit", "Institutional Account", "Research Grant"};
            String selected = (String) JOptionPane.showInputDialog(
                    view,
                    String.format("Remaining Balance Due: $%.5f\nSelect Payment Method:", amountDue),
                    "Checkout",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (selected != null) {
                PaymentStrategy paymentMethod = null;
                switch (selected) {
                    case "Credit Card": paymentMethod = new CreditCardPayment(); break;
                    case "Debit": paymentMethod = new DebitCardPayment(); break;
                    case "Institutional Account": paymentMethod = new InstitutionalPayment(); break;
                    case "Research Grant": paymentMethod = new GrantPayment(); break;
                }

                if (paymentMethod != null) {
                    String receipt = paymentMethod.processPayment(amountDue);
                    JOptionPane.showMessageDialog(view, receipt, "Payment Successful", JOptionPane.INFORMATION_MESSAGE);
                }
                view.dispose();
            }
        }
    }

    private void updateLogsToView() {
        int lastIndex = logger.getLogs().size() - 1;
        if (lastIndex >= 0) {
            view.appendLog(logger.getLogs().get(lastIndex));
        }
    }
}