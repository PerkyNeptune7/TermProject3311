import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActiveSessionController {
    private ActiveSessionView view;
    private EquipmentForStatePattern equipment;
    private UserAccounts user;
    private LabDatabase database;
    private Runnable bookingRefreshListener;
    private String bookingId;
    private double depositAmount = 0.0;
    private double amountDue = 0.0;
    private Timer pickupTimer;
    private int pickupCountdownSeconds = 20 * 60;
    private boolean bookingFinalized = false;

    public ActiveSessionController(
            ActiveSessionView view,
            EquipmentForStatePattern equipment,
            UserAccounts user,
            LabDatabase database,
            String bookingId
    ) {
        this.view = view;
        this.equipment = equipment;
        this.user = user;
        this.database = database;
        this.bookingId = bookingId;
        this.bookingRefreshListener = this::syncBookingState;

        this.view.addDepositListener(new DepositAction());
        this.view.addCloseListener(new CloseAction());
        this.database.addBookingListener(bookingRefreshListener);
    }

    class DepositAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            depositAmount = user.getHourlyRate();
            JOptionPane.showMessageDialog(
                    view,
                    String.format("If you arrive after the 20 minute pickup window, the 1-hour deposit of $%.2f will be charged. If you arrive on time, no deposit is charged.", depositAmount),
                    "Deposit Policy",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    class CloseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!bookingFinalized) {
                PendingBooking booking = database.createPendingBooking(bookingId, equipment, user, pickupCountdownSeconds);
                if (booking == null) {
                    JOptionPane.showMessageDialog(view, "This equipment was just booked by someone else.", "Booking Blocked", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                bookingFinalized = true;
                view.startPickupCountdown();
                startPickupCountdown();
                return;
            }

            if (amountDue <= 0) {
                JOptionPane.showMessageDialog(view, "Booking window closed.", "Booking Complete", JOptionPane.INFORMATION_MESSAGE);
                cleanupListeners();
                view.dispose();
                return;
            }

            String[] options = {"Credit Card", "Debit", "Institutional Account", "Research Grant"};
            String selected = (String) JOptionPane.showInputDialog(
                    view,
                    String.format("Remaining Balance Due: $%.2f\nSelect Payment Method:", amountDue),
                    "Checkout",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (selected != null) {
                PaymentStrategy paymentMethod = null;
                switch (selected) {
                    case "Credit Card": paymentMethod = new CreditCardPayment(); break;
                    case "Debit": paymentMethod = new DebitCardPayment(); break;
                    case "Institutional Account": paymentMethod = new InstitutionalPayment(); break;
                    case "Research Grant": paymentMethod = new GrantPayment(); break;
                }

                if (paymentMethod != null) {
                    String receipt = paymentMethod.processPayment(amountDue);
                    JOptionPane.showMessageDialog(view, receipt, "Payment Successful", JOptionPane.INFORMATION_MESSAGE);
                }
                cleanupListeners();
                view.dispose();
            }
        }
    }

    private void startPickupCountdown() {
        pickupCountdownSeconds = 20 * 60;
        view.setPickupTimerText(formatPickupCountdown());

        pickupTimer = new Timer(1000, e -> {
            pickupCountdownSeconds--;
            view.setPickupTimerText(formatPickupCountdown());
            database.updatePendingBookingCountdown(bookingId, pickupCountdownSeconds);

            if (pickupCountdownSeconds <= 0) {
                stopPickupCountdown();
                database.markPendingBookingLate(bookingId);
                view.setPickupTimerText("Pickup window expired. Late arrival will be charged the 1-hour deposit.");
                view.setBookingClosedState();
            }
        });
        pickupTimer.start();
    }

    private void stopPickupCountdown() {
        if (pickupTimer != null) {
            pickupTimer.stop();
            pickupTimer = null;
        }
    }

    private String formatPickupCountdown() {
        int minutes = pickupCountdownSeconds / 60;
        int seconds = pickupCountdownSeconds % 60;
        return String.format("Time left to arrive for pickup: %02d:%02d", minutes, seconds);
    }

    private void syncBookingState() {
        PendingBooking booking = database.getBookingById(bookingId);
        if (booking == null) {
            return;
        }

        if (booking.getStatus() == BookingStatus.RESERVED) {
            stopPickupCountdown();
            if (booking.isLateArrival()) {
                view.setPickupTimerText("Arrival confirmed. Late arrival detected, 1-hour deposit is due.");
            } else {
                view.setPickupTimerText("Arrival confirmed on time. No 1-hour deposit will be charged.");
            }
            view.setReservedState();
        } else if (booking.getStatus() == BookingStatus.CANCELLED) {
            stopPickupCountdown();
            view.setPickupTimerText("Booking cancelled.");
            view.setPostSessionCheckoutState();
        }
    }

    private void cleanupListeners() {
        stopPickupCountdown();
        database.removeBookingListener(bookingRefreshListener);
    }
}
