import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private LoginView view;
    private LabDatabase database;

    public LoginController(LoginView view, LabDatabase database) {
        this.view = view;
        this.database = database;

        this.view.addLoginListener(new LoginAction());

        // Opens the Registration Window
        this.view.addSignUpListener(e -> {
            RegistrationView regView = new RegistrationView();
            new RegistrationController(regView, database);
            regView.setVisible(true);
        });
    }

    class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Grab all fields
            String username = view.getUsername();
            String email = view.getEmail();
            String password = view.getPassword();

            // Smart check: Use whichever field they actually filled out!
            String loginID = username.isEmpty() ? email : username;

            if (loginID.isEmpty() || password.isEmpty()) {
                view.showMessage("Please enter your login details.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Attempt Authentication
            UserAccounts loggedInUser = database.authenticate(loginID, password);

            if (loggedInUser != null) {
                // --- REQ 1: Check Departmental Approval ---
                if (loggedInUser.needsapproval && !loggedInUser.isapproved) {
                    view.showMessage("Your account is pending departmental approval. Please contact the Head Coordinator.", "Access Denied", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                view.dispose(); // Close login window on success

                // --- ROUTING LOGIC ---
                if (loggedInUser.getAccountType().equals("Head Lab Coordinator")) {
                    CoordinatorDashboardView adminView = new CoordinatorDashboardView(loggedInUser.username, database.getPendingUsers());
                    new CoordinatorDashboardController(adminView, (HeadLabCoordinator) loggedInUser, database);
                    adminView.setVisible(true);

                } else if (loggedInUser.getAccountType().equals("Lab Manager")) {
                    ManagerDashboardView managerView = new ManagerDashboardView(loggedInUser.username, database.getAvailableEquipment());
                    new ManagerDashboardController(managerView, database);
                    managerView.setVisible(true);

                } else {
                    DashboardView dashboardView = new DashboardView(loggedInUser, database.getAvailableEquipment());
                    new DashboardController(dashboardView, database.getAvailableEquipment(), loggedInUser);
                    dashboardView.setVisible(true);
                }
            } else {
                view.showMessage("Invalid credentials! Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}