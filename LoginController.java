import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private LoginView view;
    private LabDatabase database;

    public LoginController(LoginView view, LabDatabase database) {
        this.view = view;
        this.database = database;

        // Tell the view to trigger our internal LoginAction when the button is clicked
        this.view.addLoginListener(new LoginAction());

        this.view.addSignUpListener(e -> {
            RegistrationView regView = new RegistrationView();
            RegistrationController regController = new RegistrationController(regView, database);
            regView.setVisible(true);
        });
    }


    class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = view.getUsername();
            String password = view.getPassword();

            // Ask the database to verify the user
            UserAccounts loggedInUser = database.authenticate(username, password);

            if (loggedInUser != null) {
                view.showMessage("Success!", new Color(0, 150, 0));

                // Hide the Login Window
                view.setVisible(false);

                // Launch the Dashboard Window
                DashboardView dashboardView = new DashboardView(loggedInUser, database.getAvailableEquipment());
                DashboardController dashController = new DashboardController(dashboardView, database.getAvailableEquipment(), loggedInUser);
                dashboardView.setVisible(true);

            }
        }
    }
}