import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CoordinatorDashboardController {
    private CoordinatorDashboardView view;
    private HeadLabCoordinator coordinator;
    private LabDatabase database;
    private List<UserAccounts> pendingQueue; // Keep track of the queue list
    private Runnable pendingUsersRefreshListener;

    public CoordinatorDashboardController(CoordinatorDashboardView view, HeadLabCoordinator coordinator, LabDatabase database) {
        this.view = view;
        this.coordinator = coordinator;
        this.database = database;
        this.pendingQueue = database.getPendingUsers();
        this.pendingUsersRefreshListener = this::refreshPendingUsers;

        this.view.addGenerateListener(new GenerateAction());
        this.view.addApproveListener(new ApproveAction());
        this.view.addRejectListener(new RejectAction());
        this.database.addPendingUsersListener(pendingUsersRefreshListener);

        this.view.addLogoutListener(e -> {
            database.removePendingUsersListener(pendingUsersRefreshListener);
            view.dispose();
            LoginView loginView = new LoginView(true);
            new LoginController(loginView, database);
            loginView.setVisible(true);
        });
    }

    class GenerateAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String email = view.getEmail();
            String password = view.getPassword();

            if (email.trim().isEmpty() || password.trim().isEmpty()) {
                view.showMessage("Please fill in both fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LabManager newManager = coordinator.autoGenerateLabManager(email, password);
            database.addUser(newManager);

            view.showMessage("Success! Lab Manager account created for:\n" + email, "Account Generated", JOptionPane.INFORMATION_MESSAGE);
            view.clearFields();
        }
    }

    // --- REQ 1: Departmental Approval Logic ---
    class ApproveAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int index = view.getSelectedPendingIndex();
            if (index != -1) {
                UserAccounts approvedUser = pendingQueue.get(index);

                // FLIP THE FLAGS!
                approvedUser.isapproved = true;
                approvedUser.needsapproval = false;

                database.notifyPendingUsersChanged();
                view.showMessage("Account Approved: " + approvedUser.username, "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                view.showMessage("Select an account to approve.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class RejectAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int index = view.getSelectedPendingIndex();
            if (index != -1) {
                UserAccounts rejectedUser = pendingQueue.get(index);
                database.removeUser(rejectedUser);
                view.showMessage("Account application rejected.", "Rejected", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void refreshPendingUsers() {
        pendingQueue = database.getPendingUsers();
        view.refreshPendingUsers(pendingQueue);
    }
}
