import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerDashboardController {
    private ManagerDashboardView view;
    private LabDatabase database;
    private Runnable equipmentRefreshListener;
    private Runnable bookingRefreshListener;

    public ManagerDashboardController(ManagerDashboardView view, LabDatabase database) {
        this.view = view;
        this.database = database;
        this.equipmentRefreshListener = this::refreshManagerData;
        this.bookingRefreshListener = this::refreshManagerData;

        this.view.addAddListener(new AddAction());
        this.view.addEnableListener(new EnableAction());
        this.view.addDisableListener(new DisableAction());
        this.view.addMaintenanceListener(new MaintenanceAction());
        this.view.addCompleteMaintenanceListener(new CompleteMaintenanceAction());
        this.view.addSensorStartListener(new SensorStartAction());
        this.view.addSensorStopListener(new SensorStopAction());
        this.view.addPayNowListener(new PayNowAction());
        this.database.addEquipmentListener(equipmentRefreshListener);
        this.database.addBookingListener(bookingRefreshListener);
        refreshManagerData();

        this.view.addLogoutListener(e -> {
            database.removeEquipmentListener(equipmentRefreshListener);
            database.removeBookingListener(bookingRefreshListener);
            view.dispose();
            LoginView loginView = new LoginView(true);
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
                database.notifyEquipmentChanged();
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
                database.notifyEquipmentChanged();
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
                database.notifyEquipmentChanged();
                view.showMessage("State Change Triggered: markMaintenance()");
            } else {
                view.showMessage("Please select an item first.");
            }
        }
    }

    class CompleteMaintenanceAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int index = view.getSelectedIndex();
            if (index != -1) {
                database.getAvailableEquipment().get(index).finishMaintenance();
                database.notifyEquipmentChanged();
                view.showMessage("State Change Triggered: finishMaintenance()");
            } else {
                view.showMessage("Please select an item first.");
            }
        }
    }

    class SensorStartAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String bookingId = view.getSelectedPendingBookingId();
            if (bookingId == null) {
                view.showMessage("Please select a pending booking first.");
                return;
            }

            PendingBooking booking = database.getBookingById(bookingId);
            if (booking == null) {
                view.showMessage("Pending booking could not be found.");
                return;
            }

            String providedId = javax.swing.JOptionPane.showInputDialog(
                    view,
                    "Verify pickup ID for " + booking.getBookedByUserId() + ":",
                    "ID Verification",
                    javax.swing.JOptionPane.QUESTION_MESSAGE
            );

            if (providedId == null) {
                return;
            }

            if (!booking.getBookedByRegistrationId().equals(providedId.trim())) {
                view.showMessage("ID verification failed. Pickup denied.");
                return;
            }

            database.triggerSensorStart(booking.getEquipmentId());
            view.showMessage("Sensor started. Equipment is now reserved.");
        }
    }

    class SensorStopAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String bookingId = view.getSelectedBookedBookingId();
            if (bookingId == null) {
                view.showMessage("Please select a booked item first.");
                return;
            }

            PendingBooking booking = database.getBookingById(bookingId);
            if (booking == null) {
                view.showMessage("Booked item could not be found.");
                return;
            }

            database.triggerSensorStop(booking.getEquipmentId());
            view.showMessage("Sensor stopped. Equipment moved back to the equipment list.");
        }
    }

    class PayNowAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String bookingId = view.getSelectedBookedBookingId();
            if (bookingId == null) {
                view.showMessage("Please select a booked item first.");
                return;
            }

            double paymentDue = database.getPaymentDueForBooking(bookingId);
            if (paymentDue <= 0) {
                view.showMessage("No payment is due for this booked item.");
                return;
            }

            javax.swing.JComboBox<String> paymentMethodBox = new javax.swing.JComboBox<>(new String[] {
                    "Credit Card",
                    "Debit",
                    "Institutional Account",
                    "Research Grant"
            });
            javax.swing.JTextField accountNumberField = new javax.swing.JTextField();
            javax.swing.JPanel paymentPanel = new javax.swing.JPanel(new java.awt.GridLayout(0, 1, 6, 6));
            paymentPanel.add(new javax.swing.JLabel(String.format("Amount Owed: $%.2f", paymentDue)));
            paymentPanel.add(new javax.swing.JLabel("Payment Method:"));
            paymentPanel.add(paymentMethodBox);
            paymentPanel.add(new javax.swing.JLabel("Number:"));
            paymentPanel.add(accountNumberField);

            int result = javax.swing.JOptionPane.showConfirmDialog(
                    view,
                    paymentPanel,
                    "Pay Now",
                    javax.swing.JOptionPane.OK_CANCEL_OPTION,
                    javax.swing.JOptionPane.QUESTION_MESSAGE
            );

            if (result != javax.swing.JOptionPane.OK_OPTION) {
                return;
            }

            String selected = (String) paymentMethodBox.getSelectedItem();
            String accountNumber = accountNumberField.getText().trim();
            if (selected == null || accountNumber.isEmpty()) {
                view.showMessage("Please select a payment method and enter a valid number.");
                return;
            }

            PaymentStrategy paymentMethod = null;
            switch (selected) {
                case "Credit Card": paymentMethod = new CreditCardPayment(); break;
                case "Debit": paymentMethod = new DebitCardPayment(); break;
                case "Institutional Account": paymentMethod = new InstitutionalPayment(); break;
                case "Research Grant": paymentMethod = new GrantPayment(); break;
            }

            if (paymentMethod == null) {
                return;
            }

            String receipt = paymentMethod.processPayment(paymentDue) + "\nReference Number: " + accountNumber;
            database.markBookingPaid(bookingId);
            view.showMessage(receipt);
        }
    }

    private void refreshManagerData() {
        view.refreshEquipmentLists(database.getAvailableEquipment());
        view.refreshPendingBookings(database.getAllPendingBookings());
        view.refreshBookedBookings(database.getAllReservedBookings());
    }
}
