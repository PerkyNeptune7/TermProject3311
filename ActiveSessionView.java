import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ActiveSessionView extends JFrame {
    private JButton startButton;
    private JButton stopButton;
    private JButton closeButton;
    private JTextArea logArea;

    public ActiveSessionView(String equipmentName, String userRole, double hourlyRate) {
        setTitle("Active Session: " + equipmentName);
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Closes just this window, not the app
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // 1. Top Panel - Information & Pricing Strategy
        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        infoPanel.add(new JLabel("Equipment: " + equipmentName, SwingConstants.CENTER));
        JLabel priceLabel = new JLabel("Role: " + userRole + " | Rate: $" + hourlyRate + "/hr", SwingConstants.CENTER);
        priceLabel.setForeground(new Color(0, 102, 204));
        infoPanel.add(priceLabel);
        add(infoPanel, BorderLayout.NORTH);

        // 2. Center Panel - Live Observer Logs
        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Live Sensor Logs"));
        add(scrollPane, BorderLayout.CENTER);

        // 3. Bottom Panel - Controls
        JPanel controlPanel = new JPanel();
        startButton = new JButton("Start Equipment");
        stopButton = new JButton("Stop Equipment");
        closeButton = new JButton("Finish & Pay");

        stopButton.setEnabled(false); // Can't stop if it hasn't started
        closeButton.setEnabled(false); // Can't pay if it hasn't finished

        controlPanel.add(startButton);
        controlPanel.add(stopButton);
        controlPanel.add(closeButton);
        add(controlPanel, BorderLayout.SOUTH);
    }

    // Methods to update the UI from the Controller
    public void appendLog(String message) {
        logArea.append(message + "\n");
    }

    public void setSessionActive(boolean active) {
        startButton.setEnabled(!active);
        stopButton.setEnabled(active);
    }

    public void enableCloseButton() {
        closeButton.setEnabled(true);
    }

    // Listeners for the buttons
    public void addStartListener(ActionListener listener) { startButton.addActionListener(listener); }
    public void addStopListener(ActionListener listener) { stopButton.addActionListener(listener); }
    public void addCloseListener(ActionListener listener) { closeButton.addActionListener(listener); }
}