import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegistrationView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField idField;
    private JComboBox<String> roleDropdown;
    private JButton submitButton;
    private JButton cancelButton;

    public RegistrationView() {
        setTitle("Register New Account");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        // UI Components
        add(new JLabel("  Email Address:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("  Strong Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("  Student/Staff ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("  Account Role:"));
        String[] roles = {"Student", "Faculty", "Researcher", "Guest"};
        roleDropdown = new JComboBox<>(roles);
        add(roleDropdown);

        submitButton = new JButton("Register");
        cancelButton = new JButton("Cancel");
        add(submitButton);
        add(cancelButton);
    }

    // Getters for the Controller
    public String getEmail() { return emailField.getText(); }
    public String getPassword() { return new String(passwordField.getPassword()); }
    public String getId() { return idField.getText(); }
    public String getSelectedRole() { return (String) roleDropdown.getSelectedItem(); }

    // Listeners
    public void addSubmitListener(ActionListener listener) { submitButton.addActionListener(listener); }
    public void addCancelListener(ActionListener listener) { cancelButton.addActionListener(listener); }

    public void showMessage(String msg, String title, int messageType) {
        JOptionPane.showMessageDialog(this, msg, title, messageType);
    }
}