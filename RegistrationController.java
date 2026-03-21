import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class RegistrationController {
    private RegistrationView view;
    private LabDatabase database;

    public RegistrationController(RegistrationView view, LabDatabase database) {
        this.view = view;
        this.database = database;

        this.view.addSubmitListener(new SubmitAction());
        this.view.addCancelListener(e -> view.dispose()); // Quickly close on cancel
    }

    class SubmitAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String email = view.getEmail();
            String password = view.getPassword();
            String id = view.getId();
            String role = view.getSelectedRole();

            // 1. Check if fields are empty
            if (email.isEmpty() || password.isEmpty() || id.isEmpty()) {
                view.showMessage("All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // 2. REQUIREMENT 1: Strong Password Validation
            // Must contain: 1 uppercase, 1 lowercase, 1 number, 1 special char, min 8 chars long.
            String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

            if (!Pattern.matches(passwordRegex, password)) {
                view.showMessage("Password is too weak!\nMust be at least 8 characters and include:\n- Uppercase & Lowercase letters\n- A number\n- A special symbol (@$!%*?&)", "Weak Password", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // 3. Register the user in the database
            database.registerNewUser(role, email, password, id);

            view.showMessage("Account successfully created! Pending Departmental Approval.", "Success", JOptionPane.INFORMATION_MESSAGE);
            view.dispose(); // Close registration window
        }
    }
}
