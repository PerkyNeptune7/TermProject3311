import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DashboardController {
    private DashboardView view;
    private List<EquipmentForStatePattern> equipmentList;
    private UserAccounts currentUser;

    public DashboardController(DashboardView view, List<EquipmentForStatePattern> equipmentList, UserAccounts currentUser) {
        this.view = view;
        this.equipmentList = equipmentList;
        this.currentUser = currentUser;

        // Attach listeners to all three buttons on the Dashboard
        this.view.addReserveListener(new ReserveAction());
        this.view.addCancelListener(new CancelAction());
        this.view.addExtendListener(new ExtendAction());
    }

    // --- Action for "Proceed to Booking" (Top Panel) ---
    class ReserveAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = view.getSelectedEquipmentIndex();

            if (selectedIndex != -1) {
                EquipmentForStatePattern selectedEq = equipmentList.get(selectedIndex);

                // 1. Create and show the Active Session Window
                ActiveSessionView sessionView = new ActiveSessionView(
                        selectedEq.getDescription(),
                        currentUser.getAccountType(),
                        currentUser.getHourlyRate()
                );

                // 2. Wire it up with the controller
                ActiveSessionController sessionController = new ActiveSessionController(sessionView, selectedEq, currentUser);
                sessionView.setVisible(true);

            } else {
                view.showMessage("Please select an equipment item from 'Available Equipment' first.");
            }
        }
    }

    // --- Action for "Cancel Booking" (Bottom Panel) ---
    class CancelAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = view.getSelectedReservationIndex();

            if (selectedIndex != -1) {
                // Simulating a successful command execution for GUI testing
                boolean success = true;

                if (success) {
                    view.removeReservation(selectedIndex); // Removes it from the visual list
                    view.showMessage("Booking successfully cancelled using Command Pattern!");
                } else {
                    view.showMessage("Error: Cannot cancel this booking (it may already be started).");
                }
            } else {
                view.showMessage("Please select a booking from 'My Active Bookings' to cancel.");
            }
        }
    }

    // --- Action for "Extend Time" (Bottom Panel) ---
    class ExtendAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = view.getSelectedReservationIndex();

            if (selectedIndex != -1) {
                view.showMessage("Checking equipment availability...\nSuccess! Reservation extended by 1 hour.");
            } else {
                view.showMessage("Please select a booking from 'My Active Bookings' to extend.");
            }
        }
    }
} // <- This is the closing brace for DashboardController!