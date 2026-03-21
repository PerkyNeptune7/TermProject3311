import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class ManagerDashboardView extends JFrame {
    private JTextField idField, descField, locField;
    private JButton addButton;

    private DefaultListModel<String> equipmentModel;
    private DefaultListModel<String> bookedEquipmentModel;
    private JList<String> equipmentListUI;
    private JList<String> bookedEquipmentListUI;
    private java.util.List<Integer> equipmentIndices;
    private java.util.List<String> bookedBookingIds;
    private java.util.List<String> pendingBookingIds;

    private JButton enableButton, disableButton, maintenanceButton, completeMaintenanceButton, sensorStartButton, sensorStopButton, payNowButton, logoutButton;

    public ManagerDashboardView(String username, List<EquipmentForStatePattern> equipment) {
        setTitle("Lab Manager Console - " + username);
        setSize(750, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- TOP PANEL: Add New Equipment ---
        JPanel addPanel = new JPanel(new GridLayout(2, 4, 5, 5));
        addPanel.setBorder(BorderFactory.createTitledBorder("Add New Equipment"));

        addPanel.add(new JLabel(" ID:"));
        idField = new JTextField();
        addPanel.add(idField);

        addPanel.add(new JLabel(" Description:"));
        descField = new JTextField();
        addPanel.add(descField);

        addPanel.add(new JLabel(" Room/Loc:"));
        locField = new JTextField();
        addPanel.add(locField);

        addButton = new JButton("Add Item");
        addPanel.add(addButton);
        add(addPanel, BorderLayout.NORTH);

        // --- CENTER PANEL: Equipment Lists ---
        JPanel equipmentPanel = new JPanel(new GridLayout(1, 2, 10, 10));

        equipmentModel = new DefaultListModel<>();
        bookedEquipmentModel = new DefaultListModel<>();
        equipmentIndices = new java.util.ArrayList<>();
        bookedBookingIds = new java.util.ArrayList<>();
        pendingBookingIds = new java.util.ArrayList<>();

        equipmentListUI = new JList<>(equipmentModel);
        bookedEquipmentListUI = new JList<>(bookedEquipmentModel);

        equipmentPanel.add(createEquipmentSection("Equipment", equipmentListUI));
        equipmentPanel.add(createEquipmentSection("Booked", bookedEquipmentListUI));
        add(equipmentPanel, BorderLayout.CENTER);

        // --- BOTTOM PANEL: State Controls ---
        JPanel controlPanel = new JPanel();
        enableButton = new JButton("Enable");
        disableButton = new JButton("Disable");
        maintenanceButton = new JButton("Send to Maintenance");
        completeMaintenanceButton = new JButton("Complete Maintenance");
        sensorStartButton = new JButton("Start Sensor");
        sensorStopButton = new JButton("Stop Sensor");
        payNowButton = new JButton("Pay Now");
        logoutButton = new JButton("Logout");

        controlPanel.add(enableButton);
        controlPanel.add(disableButton);
        controlPanel.add(maintenanceButton);
        controlPanel.add(completeMaintenanceButton);
        controlPanel.add(sensorStartButton);
        controlPanel.add(sensorStopButton);
        controlPanel.add(payNowButton);
        controlPanel.add(logoutButton);
        add(controlPanel, BorderLayout.SOUTH);

        refreshEquipmentLists(equipment);
    }

    public String getNewId() { return idField.getText(); }
    public String getNewDesc() { return descField.getText(); }
    public String getNewLoc() { return locField.getText(); }

    public void clearAddForm() { idField.setText(""); descField.setText(""); locField.setText(""); }
    public int getSelectedIndex() {
        int selectedEquipmentIndex = equipmentListUI.getSelectedIndex();
        if (selectedEquipmentIndex != -1) {
            return equipmentIndices.get(selectedEquipmentIndex);
        }

        return -1;
    }

    public String getSelectedPendingBookingId() {
        int selectedPendingIndex = equipmentListUI.getSelectedIndex();
        if (selectedPendingIndex == -1) {
            return null;
        }
        if (selectedPendingIndex >= pendingBookingIds.size()) {
            return null;
        }
        return pendingBookingIds.get(selectedPendingIndex);
    }

    public String getSelectedBookedBookingId() {
        int selectedIndex = bookedEquipmentListUI.getSelectedIndex();
        if (selectedIndex == -1 || selectedIndex >= bookedBookingIds.size()) {
            return null;
        }
        return bookedBookingIds.get(selectedIndex);
    }

    public void showMessage(String msg) { JOptionPane.showMessageDialog(this, msg); }

    public void refreshEquipmentLists(List<EquipmentForStatePattern> equipment) {
        String selectedEquipmentId = getSelectedEquipmentId();

        equipmentModel.clear();
        equipmentIndices.clear();
        pendingBookingIds.clear();

        for (int i = 0; i < equipment.size(); i++) {
            EquipmentForStatePattern eq = equipment.get(i);
            if ("RESERVED".equals(eq.getStateName())) {
                continue;
            }
            equipmentModel.addElement(formatEquipmentLabel(eq));
            equipmentIndices.add(i);
            pendingBookingIds.add(null);
        }

        restoreEquipmentSelectionFromId(selectedEquipmentId);
    }

    public void refreshPendingBookings(List<PendingBooking> bookings) {
        String selectedEquipmentId = getSelectedEquipmentId();

        for (int i = 0; i < pendingBookingIds.size(); i++) {
            pendingBookingIds.set(i, null);
        }

        for (PendingBooking booking : bookings) {
            for (int i = 0; i < equipmentIndices.size(); i++) {
                String row = equipmentModel.get(i);
                if (row.startsWith(booking.getEquipmentId() + " - ")) {
                    equipmentModel.set(i, formatEquipmentLabel(booking));
                    pendingBookingIds.set(i, booking.getBookingId());
                    break;
                }
            }
        }

        restoreEquipmentSelectionFromId(selectedEquipmentId);
    }

    public void refreshBookedBookings(List<PendingBooking> bookings) {
        String selectedBookedBookingId = getSelectedBookedBookingId();

        bookedEquipmentModel.clear();
        bookedBookingIds.clear();

        for (PendingBooking booking : bookings) {
            bookedBookingIds.add(booking.getBookingId());
            bookedEquipmentModel.addElement(
                    booking.getEquipmentId()
                            + " - "
                            + booking.getEquipmentDescription()
                            + " [BOOKED]"
                            + " | Time Left: "
                            + formatCountdown(booking.getSecondsRemaining())
                            + formatPaymentStatus(booking)
                            + " | User: "
                            + booking.getBookedByUserId()
            );
        }

        if (selectedBookedBookingId != null) {
            int restoredIndex = bookedBookingIds.indexOf(selectedBookedBookingId);
            if (restoredIndex >= 0) {
                bookedEquipmentListUI.setSelectedIndex(restoredIndex);
            }
        }
    }

    public void addAddListener(ActionListener listener) { addButton.addActionListener(listener); }
    public void addEnableListener(ActionListener listener) { enableButton.addActionListener(listener); }
    public void addDisableListener(ActionListener listener) { disableButton.addActionListener(listener); }
    public void addMaintenanceListener(ActionListener listener) { maintenanceButton.addActionListener(listener); }
    public void addCompleteMaintenanceListener(ActionListener listener) { completeMaintenanceButton.addActionListener(listener); }
    public void addSensorStartListener(ActionListener listener) { sensorStartButton.addActionListener(listener); }
    public void addSensorStopListener(ActionListener listener) { sensorStopButton.addActionListener(listener); }
    public void addPayNowListener(ActionListener listener) { payNowButton.addActionListener(listener); }
    public void addLogoutListener(ActionListener listener) { logoutButton.addActionListener(listener); }

    private JScrollPane createEquipmentSection(String title, JList<String> equipmentList) {
        JScrollPane scrollPane = new JScrollPane(equipmentList);
        scrollPane.setBorder(BorderFactory.createTitledBorder(title));
        return scrollPane;
    }

    private String formatEquipmentLabel(EquipmentForStatePattern equipment) {
        String tag = "";
        if ("DISABLED".equals(equipment.getStateName())) {
            tag = " [DISABLED]";
        } else if ("MAINTENANCE".equals(equipment.getStateName())) {
            tag = " [MAINTENANCE]";
        } else if ("PENDING_PICKUP".equals(equipment.getStateName())) {
            tag = " [PICKUP]";
        }

        return equipment.getId() + " - " + equipment.getDescription() + " (" + equipment.getLocation() + ")" + tag;
    }

    private String formatEquipmentLabel(PendingBooking booking) {
        return booking.getEquipmentId()
                + " - "
                + booking.getEquipmentDescription()
                + " [PICKUP]"
                + " | Time Left: "
                + formatCountdown(booking.getSecondsRemaining())
                + " | User: "
                + booking.getBookedByUserId();
    }

    private String getSelectedEquipmentId() {
        int selectedIndex = equipmentListUI.getSelectedIndex();
        if (selectedIndex == -1 || selectedIndex >= equipmentModel.size()) {
            return null;
        }

        String row = equipmentModel.get(selectedIndex);
        int separatorIndex = row.indexOf(" - ");
        if (separatorIndex == -1) {
            return null;
        }
        return row.substring(0, separatorIndex);
    }

    private void restoreEquipmentSelectionFromId(String selectedEquipmentId) {
        if (selectedEquipmentId == null) {
            return;
        }

        for (int i = 0; i < equipmentModel.size(); i++) {
            String row = equipmentModel.get(i);
            if (row.startsWith(selectedEquipmentId + " - ")) {
                equipmentListUI.setSelectedIndex(i);
                return;
            }
        }
    }

    private String formatCountdown(int secondsRemaining) {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        return String.format("%02d:%02d", minutes, seconds);
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
}
