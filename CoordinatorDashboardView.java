import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class CoordinatorDashboardView extends JFrame {
    // Tab 1: Generate Manager
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton generateButton;

    // Tab 2: Approvals
    private DefaultListModel<String> pendingModel;
    private JList<String> pendingListUI;
    private JButton approveButton;
    private JButton rejectButton;

    private JButton logoutButton;

    public CoordinatorDashboardView(String username, List<UserAccounts> pendingUsers) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception e) {}

        setTitle("Head Coordinator Panel - " + username);
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();

        // --- TAB 1: Auto-Generate Managers ---
        JPanel generatePanel = new JPanel(new GridBagLayout());
        generatePanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0; gbc.gridy = 0; generatePanel.add(new JLabel("Manager Email:"), gbc);
        gbc.gridx = 1; emailField = new JTextField(); generatePanel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; generatePanel.add(new JLabel("Temp Password:"), gbc);
        gbc.gridx = 1; passwordField = new JPasswordField(); generatePanel.add(passwordField, gbc);

        generateButton = new JButton("Generate Lab Manager");
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2; generatePanel.add(generateButton, gbc);

        tabbedPane.addTab("System Managers", generatePanel);

        // --- TAB 2: Departmental Approvals ---
        JPanel approvalPanel = new JPanel(new BorderLayout(10, 10));
        approvalPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        pendingModel = new DefaultListModel<>();
        for (UserAccounts u : pendingUsers) {
            pendingModel.addElement(u.username + " (" + u.getAccountType() + ")");
        }
        pendingListUI = new JList<>(pendingModel);
        approvalPanel.add(new JScrollPane(pendingListUI), BorderLayout.CENTER);

        JPanel actionPanel = new JPanel();
        approveButton = new JButton("Approve Account");
        rejectButton = new JButton("Reject");
        actionPanel.add(approveButton);
        actionPanel.add(rejectButton);
        approvalPanel.add(actionPanel, BorderLayout.SOUTH);

        tabbedPane.addTab("Pending Approvals", approvalPanel);

        add(tabbedPane, BorderLayout.CENTER);

        // --- BOTTOM: Logout ---
        JPanel bottomPanel = new JPanel();
        logoutButton = new JButton("Logout & Exit");
        bottomPanel.add(logoutButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    // Getters
    public String getEmail() { return emailField.getText(); }
    public String getPassword() { return new String(passwordField.getPassword()); }
    public int getSelectedPendingIndex() { return pendingListUI.getSelectedIndex(); }

    // UI Updaters
    public void clearFields() { emailField.setText(""); passwordField.setText(""); }
    public void removePendingItem(int index) { pendingModel.remove(index); }
    public void showMessage(String msg, String title, int type) { JOptionPane.showMessageDialog(this, msg, title, type); }

    // Listeners
    public void addGenerateListener(ActionListener listener) { generateButton.addActionListener(listener); }
    public void addApproveListener(ActionListener listener) { approveButton.addActionListener(listener); }
    public void addRejectListener(ActionListener listener) { rejectButton.addActionListener(listener); }
    public void addLogoutListener(ActionListener listener) { logoutButton.addActionListener(listener); }
}