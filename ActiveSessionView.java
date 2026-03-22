import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ActiveSessionView extends JFrame {
    private JButton closeButton;
    private JButton payDepositButton;
    private JLabel pickupTimerLabel;

    public ActiveSessionView(String equipmentName, String userRole, double hourlyRate) {
        setTitle("Active Session: " + equipmentName);
        setSize(520, 340);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new BorderLayout(10, 10));

        JPanel summaryPanel = new JPanel(new GridLayout(5, 2, 8, 8));
        summaryPanel.setBorder(BorderFactory.createTitledBorder("Booking Summary"));
        summaryPanel.add(new JLabel("Equipment:"));
        summaryPanel.add(new JLabel(equipmentName));
        summaryPanel.add(new JLabel("Role:"));
        summaryPanel.add(new JLabel(userRole));
        summaryPanel.add(new JLabel("Rate:"));
        summaryPanel.add(new JLabel(String.format("$%.2f / hour", hourlyRate)));
        summaryPanel.add(new JLabel("1-Hour Deposit:"));
        summaryPanel.add(new JLabel(String.format("$%.2f", hourlyRate)));
        summaryPanel.add(new JLabel("Grand Total Due Now:"));
        JLabel grandTotalValueLabel = new JLabel(String.format("$%.2f", hourlyRate));
        grandTotalValueLabel.setForeground(new Color(0, 102, 204));
        summaryPanel.add(grandTotalValueLabel);
        topPanel.add(summaryPanel, BorderLayout.NORTH);

        JPanel depositPanel = new JPanel();
        payDepositButton = new JButton("Deposit Policy");
        depositPanel.add(payDepositButton);
        topPanel.add(depositPanel, BorderLayout.CENTER);

        pickupTimerLabel = new JLabel("Pickup countdown starts after you finish the booking.", SwingConstants.CENTER);
        pickupTimerLabel.setForeground(new Color(153, 102, 0));
        topPanel.add(pickupTimerLabel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        closeButton = new JButton("Finish Booking");
        closeButton.setEnabled(true);
        controlPanel.add(closeButton);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public void setDepositPaidState() {
        payDepositButton.setEnabled(false);
        closeButton.setEnabled(true);
    }

    public void startPickupCountdown() {
        closeButton.setEnabled(false);
    }

    public void setBookingClosedState() {
        closeButton.setEnabled(true);
    }

    public void setPickupTimerText(String timerText) {
        pickupTimerLabel.setText(timerText);
    }

    public void setPostSessionCheckoutState() {
        closeButton.setText("Close");
        closeButton.setEnabled(true);
    }

    public void setReservedState() {
        closeButton.setText("Close");
        closeButton.setEnabled(true);
    }

    public void addDepositListener(ActionListener listener) { payDepositButton.addActionListener(listener); }
    public void addCloseListener(ActionListener listener) { closeButton.addActionListener(listener); }
}
