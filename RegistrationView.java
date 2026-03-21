import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegistrationView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField idField;
    private JComboBox<String> roleDropdown; // This handles the Account Type!
    private JButton submitButton;
    private JButton cancelButton;

    public RegistrationView() {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e) {}

        setTitle("Register New Account");
        setSize(450, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- Header ---
        JPanel headerPanel = new JPanel();
        headerPanel.setBorder(new EmptyBorder(20, 10, 10, 10));
        JLabel titleLabel = new JLabel("Account Registration");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        headerPanel.add(titleLabel);
        add(headerPanel, BorderLayout.NORTH);

        // --- Registration Form ---
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(new EmptyBorder(10, 30, 10, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 10, 12, 10);

        // Row 1: Email
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.4;
        formPanel.add(new JLabel("Email Address:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0; gbc.weightx = 0.6;
        emailField = new JTextField();
        formPanel.add(emailField, gbc);

        // Row 2: Password
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(new JLabel("Strong Password:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        passwordField = new JPasswordField();
        formPanel.add(passwordField, gbc);

        // Row 3: ID (Req 8)
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(new JLabel("Student/Staff ID:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        idField = new JTextField();
        formPanel.add(idField, gbc);

        // Row 4: Account Type (Req 1)
        gbc.gridx = 0; gbc.gridy = 3;
        formPanel.add(new JLabel("Account Type:"), gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        String[] roles = {"Student", "Faculty", "Researcher", "Guest"};
        roleDropdown = new JComboBox<>(roles);
        formPanel.add(roleDropdown, gbc);

        add(formPanel, BorderLayout.CENTER);

        // --- Buttons ---
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 20, 10));

        submitButton = new JButton("Register");
        submitButton.setPreferredSize(new Dimension(120, 35));

        cancelButton = new JButton("Cancel");
        cancelButton.setPreferredSize(new Dimension(120, 35));

        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Getters for the Controller
    public String getEmail() { return emailField.getText(); }
    public String getPassword() { return new String(passwordField.getPassword()); }
    public String getId() { return idField.getText(); }

    // This perfectly grabs the selected string ("Student", "Faculty", etc.)
    public String getSelectedRole() { return (String) roleDropdown.getSelectedItem(); }

    // Listeners
    public void addSubmitListener(ActionListener listener) { submitButton.addActionListener(listener); }
    public void addCancelListener(ActionListener listener) { cancelButton.addActionListener(listener); }

    public void showMessage(String msg, String title, int messageType) {
        JOptionPane.showMessageDialog(this, msg, title, messageType);
    }
}