import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DashboardController {
    private static final int EXTENSION_SECONDS = 20 * 60;

    private DashboardView view;
    private List<EquipmentForStatePattern> equipmentList;
    private UserAccounts currentUser;
    private LabDatabase database;
    private Runnable equipmentRefreshListener;
    private Runnable bookingRefreshListener;
    private int bookingSequence = 1;

    public DashboardController(DashboardView view, List<EquipmentForStatePattern> equipmentList, UserAccounts currentUser, LabDatabase database) {
        this.view = view;
        this.equipmentList = equipmentList;
        this.currentUser = currentUser;
        this.database = database;
        this.equipmentRefreshListener = () -> view.refreshEquipmentLists(database.getAvailableEquipment());
        this.bookingRefreshListener = this::refreshBookings;

        this.view.addReserveListener(new ReserveAction());
        this.view.addCancelListener(new CancelAction());
        this.view.addExtendListener(new ExtendAction());
        this.view.addPayNowListener(new PayNowAction());
        this.view.addLogoutListener(new LogoutAction());
        this.database.addEquipmentListener(equipmentRefreshListener);
        this.database.addBookingListener(bookingRefreshListener);
        refreshBookings();
    }

    class ReserveAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = view.getSelectedEquipmentIndex();

            if (selectedIndex != -1) {
                EquipmentForStatePattern selectedEq = equipmentList.get(selectedIndex);

                if (!selectedEq.isAvailable()) {
                    view.showMessage(
                            "This equipment cannot be booked because its current state is " + selectedEq.getStateName() + ".",
                            "Booking Blocked",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }

                String bookingId = selectedEq.getId() + "-pending-" + bookingSequence++;

                ActiveSessionView sessionView = new ActiveSessionView(
                        selectedEq.getDescription(),
                        currentUser.getAccountType(),
                        currentUser.getHourlyRate()
                );

                new ActiveSessionController(
                        sessionView,
                        selectedEq,
                        currentUser,
                        database,
                        bookingId
                );
                view.refreshEquipmentLists(equipmentList);
                sessionView.setVisible(true);

            } else {
                view.showMessage("Please select an equipment item from 'Available Equipment' first.", "Modification Complete", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    class CancelAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedPendingBookingId = view.getSelectedPendingBookingId();
            String selectedReservedBookingId = view.getSelectedReservationId();
            if (selectedPendingBookingId != null) {
                database.cancelBooking(selectedPendingBookingId);
                view.showMessage("Pending booking cancelled.", "Modification Complete", JOptionPane.INFORMATION_MESSAGE);
            } else if (selectedReservedBookingId != null) {
                view.showMessage("This booking is active. It stays booked in the backend until Stop Sensor is used. Use Pay Now to settle any deposit due.", "Modification Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                view.showMessage("Please select a booking from 'Pending Pickup' or 'My Booked Equipment' to cancel.", "Modification Complete", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    class ExtendAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedBookingId = view.getSelectedReservationId();

            if (selectedBookingId != null) {
                int addedSeconds = database.extendReservedBooking(selectedBookingId, EXTENSION_SECONDS);

                if (addedSeconds > 0) {
                    view.showMessage("Booked time extended by 20 minutes.", "Modification Complete", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    view.showMessage("Extension failed. The booked timer is already at the 1 hour maximum.", "Schedule Collision Detected", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                view.showMessage("Please select a booking from 'My Booked Equipment' to extend.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class PayNowAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedBookingId = view.getSelectedReservationId();
            if (selectedBookingId == null) {
                view.showMessage("Please select a booking from 'My Booked Equipment' to pay.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double paymentDue = database.getPaymentDueForBooking(selectedBookingId);
            if (paymentDue <= 0) {
                view.showMessage("No payment is due for this booking.", "Payment", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            JComboBox<String> paymentMethodBox = new JComboBox<>(new String[] {
                    "Credit Card",
                    "Debit",
                    "Institutional Account",
                    "Research Grant"
            });
            JTextField accountNumberField = new JTextField();
            JPanel paymentPanel = new JPanel(new java.awt.GridLayout(0, 1, 6, 6));
            paymentPanel.add(new JLabel(String.format("Amount Owed: $%.2f", paymentDue)));
            paymentPanel.add(new JLabel("Payment Method:"));
            paymentPanel.add(paymentMethodBox);
            paymentPanel.add(new JLabel("Number:"));
            paymentPanel.add(accountNumberField);

            int result = JOptionPane.showConfirmDialog(
                    view,
                    paymentPanel,
                    "Pay Now",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (result != JOptionPane.OK_OPTION) {
                return;
            }

            String selected = (String) paymentMethodBox.getSelectedItem();
            String accountNumber = accountNumberField.getText().trim();
            if (selected == null || accountNumber.isEmpty()) {
                view.showMessage("Please select a payment method and enter a valid number.", "Payment", JOptionPane.WARNING_MESSAGE);
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
            database.markBookingPaid(selectedBookingId);
            view.showMessage(receipt, "Payment Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    class LogoutAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            database.removeEquipmentListener(equipmentRefreshListener);
            database.removeBookingListener(bookingRefreshListener);
            view.dispose();
            LoginView loginView = new LoginView(false);
            new LoginController(loginView, database);
            loginView.setVisible(true);
        }
    }

    private void refreshBookings() {
        view.refreshPendingBookings(database.getPendingBookingsForUser(currentUser.username));
        view.refreshReservedBookings(database.getReservedBookingsForUser(currentUser.username));
    }
} // <- This is the closing brace for DashboardController!
