import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ActiveSessionView extends JFrame {
    private JButton startButton, stopButton, closeButton;
    private JButton payDepositButton, testLateButton; // Req 4 Buttons
    private JTextArea logArea;

    public ActiveSessionView(String equipmentName, String userRole, double hourlyRate) {
        setTitle("Active Session: " + equipmentName);
        setSize(450, 450); // Made it slightly taller to fit the new buttons
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- TOP PANEL: Info & Deposit (Req 4) ---
        JPanel topPanel = new JPanel(new GridLayout(2, 1));

        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        infoPanel.add(new JLabel("Equipment: " + equipmentName, SwingConstants.CENTER));
        JLabel priceLabel = new JLabel("Role: " + userRole + " | Rate: $" + hourlyRate + "/hr", SwingConstants.CENTER);
        priceLabel.setForeground(new Color(0, 102, 204));
        infoPanel.add(priceLabel);
        topPanel.add(infoPanel);

        JPanel depositPanel = new JPanel();
        payDepositButton = new JButton("Pay 1-Hour Deposit ($" + hourlyRate + ")");
        testLateButton = new JButton("[Test] Arrive 21 Mins Late");
        testLateButton.setForeground(Color.RED);
        testLateButton.setEnabled(false); // Can't be late if you haven't paid yet!

        depositPanel.add(payDepositButton);
        depositPanel.add(testLateButton);
        topPanel.add(depositPanel);

        add(topPanel, BorderLayout.NORTH);

        // --- CENTER PANEL: Logs ---
        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Live Sensor Logs"));
        add(scrollPane, BorderLayout.CENTER);

        // --- BOTTOM PANEL: Controls ---
        JPanel controlPanel = new JPanel();
        startButton = new JButton("Start Equipment");
        stopButton = new JButton("Stop Equipment");
        closeButton = new JButton("Finish & Pay");

        // Equipment is locked until the deposit is paid
        startButton.setEnabled(false);
        stopButton.setEnabled(false);
        closeButton.setEnabled(false);

        controlPanel.add(startButton);
        controlPanel.add(stopButton);
        controlPanel.add(closeButton);
        add(controlPanel, BorderLayout.SOUTH);
    }

    // UI Updaters
    public void appendLog(String message) { logArea.append(message + "\n"); }

    public void setDepositPaidState() {
        payDepositButton.setEnabled(false);
        startButton.setEnabled(true);
        testLateButton.setEnabled(true);
    }

    public void setSessionActive(boolean active) {
        startButton.setEnabled(!active);
        testLateButton.setEnabled(false); // Can't arrive late if it already started
        stopButton.setEnabled(active);
    }

    public void setSessionEnded() {
        startButton.setEnabled(false);
        stopButton.setEnabled(false);
        testLateButton.setEnabled(false);
        closeButton.setEnabled(true);
    }

    // Listeners
    public void addDepositListener(ActionListener listener) { payDepositButton.addActionListener(listener); }
    public void addLateTestListener(ActionListener listener) { testLateButton.addActionListener(listener); }
    public void addStartListener(ActionListener listener) { startButton.addActionListener(listener); }
    public void addStopListener(ActionListener listener) { stopButton.addActionListener(listener); }
    public void addCloseListener(ActionListener listener) { closeButton.addActionListener(listener); }
}