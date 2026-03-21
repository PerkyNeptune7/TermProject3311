import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class DashboardView extends JFrame {
    // Top Half: Booking new equipment
    private JList<String> equipmentListUI;
    private DefaultListModel<String> equipmentModel;
    private JButton reserveButton;

    // Bottom Half: Managing existing bookings
    private JList<String> reservationListUI;
    private DefaultListModel<String> reservationModel;
    private JButton cancelButton;
    private JButton extendButton;

    public DashboardView(UserAccounts loggedInUser, List<EquipmentForStatePattern> equipment) {
        setTitle("Lab Dashboard - Logged in as: " + loggedInUser.getAccountType());
        setSize(500, 500); // Made it a bit taller to fit both lists
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1, 10, 10)); // Splits window into top and bottom

        // --- TOP PANEL: Book Equipment ---
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createTitledBorder("Available Equipment"));

        equipmentModel = new DefaultListModel<>();
        for (EquipmentForStatePattern eq : equipment) {
            equipmentModel.addElement(eq.getId() + " - " + eq.getDescription());
        }
        equipmentListUI = new JList<>(equipmentModel);
        topPanel.add(new JScrollPane(equipmentListUI), BorderLayout.CENTER);

        reserveButton = new JButton("Proceed to Booking");
        topPanel.add(reserveButton, BorderLayout.SOUTH);
        add(topPanel);

        // --- BOTTOM PANEL: Manage My Bookings ---
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createTitledBorder("My Active Bookings"));

        reservationModel = new DefaultListModel<>();
        // For testing, let's add a fake existing reservation so you have something to click!
        reservationModel.addElement("RES-999 | Electron Microscope | 2:00 PM - 3:00 PM");
        reservationModel.addElement("RES-888 | 3D Printer | 3:00 PM - 4:00 PM (NEXT SLOT FULL)");

        reservationListUI = new JList<>(reservationModel);
        bottomPanel.add(new JScrollPane(reservationListUI), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        extendButton = new JButton("Extend Time");
        cancelButton = new JButton("Cancel Booking");
        buttonPanel.add(extendButton);
        buttonPanel.add(cancelButton);
        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(bottomPanel);
    }

    // Getters for the Controller
    public int getSelectedEquipmentIndex() { return equipmentListUI.getSelectedIndex(); }
    public int getSelectedReservationIndex() { return reservationListUI.getSelectedIndex(); }

    // Listeners
    public void addReserveListener(ActionListener listener) { reserveButton.addActionListener(listener); }
    public void addCancelListener(ActionListener listener) { cancelButton.addActionListener(listener); }
    public void addExtendListener(ActionListener listener) { extendButton.addActionListener(listener); }

    // Methods to update the UI
    public void removeReservation(int index) {
        reservationModel.remove(index);
    }

    public void showMessage(String msg, String modificationComplete, int informationMessage) {
        JOptionPane.showMessageDialog(this, msg);
    }
}