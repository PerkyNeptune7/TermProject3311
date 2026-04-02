import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DashboardView extends JFrame {
    private JList<String> availableEquipmentListUI;
    private DefaultListModel<String> availableEquipmentModel;
    private java.util.List<Integer> availableEquipmentIndices;
    private JButton reserveButton;

    private JList<String> maintenanceEquipmentListUI;
    private DefaultListModel<String> maintenanceEquipmentModel;

    private JList<String> pendingBookingListUI;
    private DefaultListModel<String> pendingBookingModel;
    private Map<String, Integer> pendingBookingIndices;

    private JList<String> reservationListUI;
    private DefaultListModel<String> reservationModel;
    private Map<String, Integer> reservationIndices;
    private JButton cancelButton;
    private JButton extendButton;
    private JButton payNowButton;
    private JButton logoutButton;

    public DashboardView(UserAccounts loggedInUser, List<EquipmentForStatePattern> equipment) {
        setTitle("Lab Dashboard - Logged in as: " + loggedInUser.getAccountType());
        setSize(700, 820);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        // --- TOP PANEL: Book Equipment ---
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createTitledBorder("Available Equipment"));

        availableEquipmentModel = new DefaultListModel<>();
        availableEquipmentIndices = new java.util.ArrayList<>();
        availableEquipmentListUI = new JList<>(availableEquipmentModel);
        topPanel.add(new JScrollPane(availableEquipmentListUI), BorderLayout.CENTER);

        reserveButton = new JButton("Proceed to Booking");
        topPanel.add(reserveButton, BorderLayout.SOUTH);
        add(topPanel);

        // --- MIDDLE PANEL: Maintenance Equipment ---
        JPanel middlePanel = new JPanel(new BorderLayout());
        middlePanel.setBorder(BorderFactory.createTitledBorder("Equipment Under Maintenance"));

        maintenanceEquipmentModel = new DefaultListModel<>();
        maintenanceEquipmentListUI = new JList<>(maintenanceEquipmentModel);
        maintenanceEquipmentListUI.setEnabled(false);
        middlePanel.add(new JScrollPane(maintenanceEquipmentListUI), BorderLayout.CENTER);
        add(middlePanel);

        JPanel pendingPanel = new JPanel(new BorderLayout());
        pendingPanel.setBorder(BorderFactory.createTitledBorder("Pending Pickup"));

        pendingBookingModel = new DefaultListModel<>();
        pendingBookingIndices = new LinkedHashMap<>();
        pendingBookingListUI = new JList<>(pendingBookingModel);
        pendingPanel.add(new JScrollPane(pendingBookingListUI), BorderLayout.CENTER);
        add(pendingPanel);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createTitledBorder("My Booked Equipment"));

        reservationModel = new DefaultListModel<>();
        reservationIndices = new LinkedHashMap<>();
        reservationListUI = new JList<>(reservationModel);
        bottomPanel.add(new JScrollPane(reservationListUI), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        extendButton = new JButton("Extend Time");
        cancelButton = new JButton("Cancel Booking");
        payNowButton = new JButton("Pay Now");
        logoutButton = new JButton("Logout");
        buttonPanel.add(extendButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(payNowButton);
        buttonPanel.add(logoutButton);
        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(bottomPanel);

        refreshEquipmentLists(equipment);
    }

    // Getters for the Controller
    public int getSelectedEquipmentIndex() {
        int selectedIndex = availableEquipmentListUI.getSelectedIndex();
        if (selectedIndex == -1) {
            return -1;
        }
        return availableEquipmentIndices.get(selectedIndex);
    }

    public int getSelectedReservationIndex() { return reservationListUI.getSelectedIndex(); }

    public String getSelectedReservationId() { return getBookingIdForIndex(reservationIndices, reservationListUI.getSelectedIndex()); }

    public String getSelectedPendingBookingId() { return getBookingIdForIndex(pendingBookingIndices, pendingBookingListUI.getSelectedIndex()); }

    // Listeners
    public void addReserveListener(ActionListener listener) { reserveButton.addActionListener(listener); }
    public void addCancelListener(ActionListener listener) { cancelButton.addActionListener(listener); }
    public void addExtendListener(ActionListener listener) { extendButton.addActionListener(listener); }
    public void addPayNowListener(ActionListener listener) { payNowButton.addActionListener(listener); }
    public void addLogoutListener(ActionListener listener) { logoutButton.addActionListener(listener); }

    // Methods to update the UI
    public void refreshPendingBookings(List<PendingBooking> bookings) {
        String selectedBookingId = getSelectedPendingBookingId();

        pendingBookingModel.clear();
        pendingBookingIndices.clear();

        for (PendingBooking booking : bookings) {
            pendingBookingIndices.put(booking.getBookingId(), pendingBookingModel.size());
            pendingBookingModel.addElement(formatPendingReservation(booking));
        }

        restoreSelection(pendingBookingListUI, pendingBookingIndices, selectedBookingId);
    }

    public void refreshReservedBookings(List<PendingBooking> bookings) {
        String selectedBookingId = getSelectedReservationId();

        reservationModel.clear();
        reservationIndices.clear();

        for (PendingBooking booking : bookings) {
            reservationIndices.put(booking.getBookingId(), reservationModel.size());
            reservationModel.addElement(formatReservedBooking(booking));
        }

        restoreSelection(reservationListUI, reservationIndices, selectedBookingId);
    }

    public void refreshEquipmentLists(List<EquipmentForStatePattern> equipment) {
        availableEquipmentModel.clear();
        maintenanceEquipmentModel.clear();
        availableEquipmentIndices.clear();

        for (int i = 0; i < equipment.size(); i++) {
            EquipmentForStatePattern eq = equipment.get(i);
            String label = eq.getId() + " - " + eq.getDescription() + " (" + eq.getLocation() + ")";

            if ("MAINTENANCE".equals(eq.getStateName())) {
                maintenanceEquipmentModel.addElement(label);
            } else if ("AVAILABLE".equals(eq.getStateName())) {
                availableEquipmentModel.addElement(label);
                availableEquipmentIndices.add(i);
            }
        }
    }

    public void showMessage(String msg, String modificationComplete, int informationMessage) {
        JOptionPane.showMessageDialog(this, msg);
    }

    private String formatPendingReservation(PendingBooking booking) {
        return "<html>"
                + booking.getEquipmentId() + " - " + booking.getEquipmentDescription()
                + " <span style='color:#666666;'>(" + booking.getBookedByUserId() + ")</span> "
                + " <span style='color:#b00020;font-weight:bold;'>[RESERVED]</span> "
                + "<span style='color:#d32f2f;font-weight:bold;'>" + formatCountdown(booking.getSecondsRemaining()) + "</span>"
                + "</html>";
    }

    private String formatReservedBooking(PendingBooking booking) {
        return booking.getEquipmentId()
                + " - "
                + booking.getEquipmentDescription()
                + " [BOOKED] "
                + formatBookedCountdown(booking.getSecondsRemaining())
                + formatPaymentStatus(booking);
    }

    private String getBookingIdForIndex(Map<String, Integer> indexMap, int selectedIndex) {
        if (selectedIndex == -1) {
            return null;
        }

        for (Map.Entry<String, Integer> entry : indexMap.entrySet()) {
            if (entry.getValue() == selectedIndex) {
                return entry.getKey();
            }
        }

        return null;
    }

    private String formatCountdown(int secondsRemaining) {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        return String.format("Time left to arrive: %02d:%02d", minutes, seconds);
    }

    private String formatBookedCountdown(int secondsRemaining) {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        return String.format("Time Left: %02d:%02d", minutes, seconds);
    }

    private String formatPaymentStatus(PendingBooking booking) {
        if (booking.isPaymentCompleted()) {
            return " | Paid";
        }
        if (booking.getPaymentDue() > 0) {
            return String.format(" | Amount Due: $%.2f", booking.getPaymentDue());
        }
        return " | No Amount Due";
    }

    private void restoreSelection(JList<String> listUI, Map<String, Integer> indexMap, String selectedId) {
        if (selectedId == null) {
            return;
        }

        Integer restoredIndex = indexMap.get(selectedId);
        if (restoredIndex != null) {
            listUI.setSelectedIndex(restoredIndex);
        }
    }
}
