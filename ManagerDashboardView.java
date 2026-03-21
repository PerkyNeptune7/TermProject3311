import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class ManagerDashboardView extends JFrame {
    // Add Equipment Form
    private JTextField idField, descField, locField;
    private JButton addButton;

    // Equipment List
    private DefaultListModel<String> equipmentModel;
    private JList<String> equipmentListUI;

    // State Control Buttons
    private JButton enableButton, disableButton, maintenanceButton, logoutButton;

    public ManagerDashboardView(String username, List<EquipmentForStatePattern> equipment) {
        setTitle("Lab Manager Console - " + username);
        setSize(550, 500);
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

        // --- CENTER PANEL: Equipment List ---
        equipmentModel = new DefaultListModel<>();
        for (EquipmentForStatePattern eq : equipment) {
            equipmentModel.addElement(eq.getId() + " - " + eq.getDescription() + " (" + eq.getLocation() + ")");
        }
        equipmentListUI = new JList<>(equipmentModel);
        JScrollPane scrollPane = new JScrollPane(equipmentListUI);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Manage Existing Equipment"));
        add(scrollPane, BorderLayout.CENTER);

        // --- BOTTOM PANEL: State Controls ---
        JPanel controlPanel = new JPanel();
        enableButton = new JButton("Enable");
        disableButton = new JButton("Disable");
        maintenanceButton = new JButton("Send to Maintenance");
        logoutButton = new JButton("Logout");

        controlPanel.add(enableButton);
        controlPanel.add(disableButton);
        controlPanel.add(maintenanceButton);
        controlPanel.add(logoutButton);
        add(controlPanel, BorderLayout.SOUTH);
    }

    // Getters for Add Form
    public String getNewId() { return idField.getText(); }
    public String getNewDesc() { return descField.getText(); }
    public String getNewLoc() { return locField.getText(); }

    // UI Updaters
    public void clearAddForm() { idField.setText(""); descField.setText(""); locField.setText(""); }
    public int getSelectedIndex() { return equipmentListUI.getSelectedIndex(); }
    public void addEquipmentToList(String displayString) { equipmentModel.addElement(displayString); }
    public void showMessage(String msg) { JOptionPane.showMessageDialog(this, msg); }

    // Listeners
    public void addAddListener(ActionListener listener) { addButton.addActionListener(listener); }
    public void addEnableListener(ActionListener listener) { enableButton.addActionListener(listener); }
    public void addDisableListener(ActionListener listener) { disableButton.addActionListener(listener); }
    public void addMaintenanceListener(ActionListener listener) { maintenanceButton.addActionListener(listener); }
    public void addLogoutListener(ActionListener listener) { logoutButton.addActionListener(listener); }
}