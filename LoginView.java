import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;
    private JButton signUpButton;

    public LoginView() {
        setTitle("York U - Lab Equipment Booking");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centers the window on your screen
        setLayout(new GridLayout(4, 1, 10, 10));

        // Create UI Elements
        JPanel userPanel = new JPanel();
        userPanel.add(new JLabel("Email/Username:"));
        usernameField = new JTextField(15);
        userPanel.add(usernameField);

        JPanel passPanel = new JPanel();
        passPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField(15);
        passPanel.add(passwordField);

        loginButton = new JButton("Login");
        messageLabel = new JLabel("", SwingConstants.CENTER);

        signUpButton = new JButton("Create New Account");
        add(signUpButton);

        // Add to Window
        add(userPanel);
        add(passPanel);
        add(loginButton);
        add(messageLabel);
    }

    // Getters for the Controller to pull text from the boxes
    public String getUsername() { return usernameField.getText(); }
    public String getPassword() { return new String(passwordField.getPassword()); }

    public void showMessage(String msg, Color color) {
        messageLabel.setForeground(color);
        messageLabel.setText(msg);
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }

    public void addSignUpListener(ActionListener listener) {
        signUpButton.addActionListener(listener);
    }
}