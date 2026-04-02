import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signUpButton;
    private boolean backendPortal;

    public LoginView(boolean backendPortal) {
        this.backendPortal = backendPortal;

        // Force Java to use your computer's native UI look!
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e) {}

        setTitle(backendPortal
                ? "York University - Backend Portal"
                : "York University - Lab Equipment System");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centers the window
        setLayout(new BorderLayout());

        // --- Header ---
        JPanel headerPanel = new JPanel();
        headerPanel.setBorder(new EmptyBorder(20, 10, 10, 10));
        JLabel titleLabel = new JLabel(backendPortal ? "Backend Staff Portal" : "Lab Equipment Portal");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        titleLabel.setForeground(new Color(227, 24, 55)); // YorkU Red
        headerPanel.add(titleLabel);
        add(headerPanel, BorderLayout.NORTH);

        // --- Login Form ---
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(new EmptyBorder(10, 40, 10, 40));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // Spacing between rows

        // Row 1: Email
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.3;
        formPanel.add(new JLabel("Email Address:"), gbc);

        gbc.gridx = 1; gbc.gridy = 0; gbc.weightx = 0.7;
        emailField = new JTextField();
        formPanel.add(emailField, gbc);

        // Row 2: Password
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0.3;
        formPanel.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1; gbc.gridy = 1; gbc.weightx = 0.7;
        passwordField = new JPasswordField();
        formPanel.add(passwordField, gbc);

        add(formPanel, BorderLayout.CENTER);

        // --- Buttons ---
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 20, 10));

        loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(120, 35));

        signUpButton = new JButton("Create Account");
        signUpButton.setPreferredSize(new Dimension(140, 35));
        signUpButton.setEnabled(!backendPortal);
        signUpButton.setVisible(!backendPortal);

        buttonPanel.add(loginButton);
        if (!backendPortal) {
            buttonPanel.add(signUpButton);
        }
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Getters for the Controller
    public String getEmail() { return emailField.getText(); }
    public String getPassword() { return new String(passwordField.getPassword()); }
    public boolean isBackendPortal() { return backendPortal; }

    // Listeners
    public void addLoginListener(ActionListener listener) { loginButton.addActionListener(listener); }
    public void addSignUpListener(ActionListener listener) { signUpButton.addActionListener(listener); }

    // Multi-purpose message display
    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    // Kept this so your existing LoginController doesn't break!
    public void showMessage(String msg, String title, int messageType) {
        JOptionPane.showMessageDialog(this, msg, title, messageType);
    }
}
