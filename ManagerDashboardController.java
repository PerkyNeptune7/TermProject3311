import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ManagerDashboardController {
    private ManagerDashboardView view;
    private LabDatabase database;

    public ManagerDashboardController(ManagerDashboardView view, LabDatabase database) {
        this.view = view;
        this.database = database;

        this.view.addAddListener(new AddAction());
        this.view.addEnableListener(new EnableAction());
        this.view.addDisableListener(new DisableAction());
        this.view.addMaintenanceListener(new MaintenanceAction());

        // Logout logic
        this.view.addLogoutListener(e -> {
            view.dispose();
            LoginView loginView = new LoginView();
            new LoginController(loginView, database);
            loginView.setVisible(true);
        });
    }

    class AddAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = view.getNewId();
            String desc = view.getNewDesc();
            String loc = view.getNewLoc();

            if (id.isEmpty() || desc.isEmpty() || loc.isEmpty()) {
                view.showMessage("All fields are required to add equipment.");
                return;
            }

            // Create new equipment and add it to the database
            EquipmentForStatePattern newEq = new EquipmentForStatePattern(id, desc, loc);
            database.addEquipment(newEq);

            // Update the GUI
            view.addEquipmentToList(id + " - " + desc + " (" + loc + ")");
            view.clearAddForm();
            view.showMessage("Equipment added successfully!");
        }
    }

    // --- STATE PATTERN TRIGGERS ---

    class EnableAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int index = view.getSelectedIndex();
            if (index != -1) {
                database.getAvailableEquipment().get(index).enable();
                view.showMessage("State Change Triggered: Enable()");
            } else {
                view.showMessage("Please select an item first.");
            }
        }
    }

    class DisableAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int index = view.getSelectedIndex();
            if (index != -1) {
                database.getAvailableEquipment().get(index).disable();
                view.showMessage("State Change Triggered: Disable()");
            } else {
                view.showMessage("Please select an item first.");
            }
        }
    }

    class MaintenanceAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int index = view.getSelectedIndex();
            if (index != -1) {
                database.getAvailableEquipment().get(index).markMaintenance();
                view.showMessage("State Change Triggered: markMaintenance()");
            } else {
                view.showMessage("Please select an item first.");
            }
        }
    }
}