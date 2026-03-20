import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.*;

// ==========================================
// 1. SINGLETON PATTERN: LabManager
// ==========================================
class LabManager {
    private static LabManager instance;
    private Map<String, EquipmentForStatePattern> inventory = new HashMap<>();
    private final String CSV_FILE = "equipment.csv";

    private LabManager() { loadFromCSV(); }

    public static LabManager getInstance() {
        if (instance == null) instance = new LabManager();
        return instance;
    }

    public void loadFromCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                // Use Factory to create objects
                EquipmentForStatePattern eq = EquipmentFactory.createEquipment(data[0], data[1], data[2], data[3]);
                inventory.put(eq.getId(), eq);
            }
        } catch (IOException e) { System.out.println("No database found, starting fresh."); }
    }

    public void saveToCSV() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(CSV_FILE))) {
            for (EquipmentForStatePattern eq : inventory.values()) {
                pw.println(eq.getId() + "," + eq.getDescription() + "," + eq.getLocation() + "," + eq.getState().getStateName());
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    public Collection<EquipmentForStatePattern> getAllEquipment() { return inventory.values(); }
    public EquipmentForStatePattern getEquipment(String id) { return inventory.get(id); }
}

// ==========================================
// 2. FACTORY METHOD PATTERN: EquipmentFactory
// ==========================================
class EquipmentFactory {
    public static EquipmentForStatePattern createEquipment(String id, String desc, String loc, String stateName) {
        EquipmentForStatePattern eq = new EquipmentForStatePattern(id, desc, loc);
        // Set initial state based on CSV
        switch (stateName) {
            case "MAINTENANCE": eq.setState(new MaintenanceState()); break;
            case "DISABLED": eq.setState(new DisabledState()); break;
            case "RESERVED": eq.setState(new ReservedEquipmentState()); break;
            default: eq.setState(new AvailableState()); break;
        }
        return eq;
    }
}

// ==========================================
// 3. COMMAND PATTERN: Implementation
// ==========================================
class ReserveCommand implements Command {
    private EquipmentForStatePattern equipment;
    public ReserveCommand(EquipmentForStatePattern eq) { this.equipment = eq; }
    @Override
    public boolean execute() {
        if (equipment.getState().getStateName().equals("AVAILABLE")) {
            equipment.reserve();
            return true;
        }
        return false;
    }
}

// ==========================================
// 4. GUI APPLICATION (Main Entry Point)
// ==========================================
public class LabManagementGUI extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JComboBox<String> userTypeBox;
    private Sensor labSensor;

    public LabManagementGUI() {
        // Observer Setup
        labSensor = new Sensor("MAIN_SENSOR");
        labSensor.attach(new UsageLogger());
        labSensor.attach(new ReservationManager());

        setupUI();
        refreshTable();
    }

    private void setupUI() {
        setTitle("University Lab Booking System");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel: User/Strategy Selection
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Role:"));
        userTypeBox = new JComboBox<>(new String[]{"Student", "Faculty", "Researcher", "Guest"});
        topPanel.add(userTypeBox);
        add(topPanel, BorderLayout.NORTH);

        // Center Table
        String[] cols = {"ID", "Description", "Location", "Status", "Hourly Rate"};
        tableModel = new DefaultTableModel(cols, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Bottom Controls
        JPanel botPanel = new JPanel();
        JButton btnReserve = new JButton("Reserve Selected");
        JButton btnMaintenance = new JButton("Toggle Maintenance");

        btnReserve.addActionListener(e -> handleReserve());
        btnMaintenance.addActionListener(e -> handleMaintenance());

        botPanel.add(btnReserve);
        botPanel.add(btnMaintenance);
        add(botPanel, BorderLayout.SOUTH);
    }

    private void handleReserve() {
        int row = table.getSelectedRow();
        if (row == -1) return;

        String id = (String) tableModel.getValueAt(row, 0);
        EquipmentForStatePattern eq = LabManager.getInstance().getEquipment(id);

        // STRATEGY PATTERN: Calculate pricing based on role
        PricingStrategy strategy = getPricingStrategy((String) userTypeBox.getSelectedItem());
        double rate = strategy.calculateRate();

        // COMMAND PATTERN: Execute reservation
        Command reserveCmd = new ReserveCommand(eq);
        if (reserveCmd.execute()) {
            // OBSERVER PATTERN: Trigger sensor
            labSensor.startEquipment();
            JOptionPane.showMessageDialog(this, "Reserved! Hourly Rate: $" + rate);
            LabManager.getInstance().saveToCSV();
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Equipment unavailable for reservation.");
        }
    }

    private void handleMaintenance() {
        int row = table.getSelectedRow();
        if (row == -1) return;
        String id = (String) tableModel.getValueAt(row, 0);
        EquipmentForStatePattern eq = LabManager.getInstance().getEquipment(id);

        // STATE PATTERN: Logic handled by internal state objects
        if (eq.getState().getStateName().equals("MAINTENANCE")) {
            eq.finishMaintenance();
        } else {
            eq.markMaintenance();
        }

        LabManager.getInstance().saveToCSV();
        refreshTable();
    }

    private PricingStrategy getPricingStrategy(String type) {
        switch (type) {
            case "Student": return new StudentPricing();
            case "Faculty": return new FacultyPricing();
            case "Researcher": return new ResearcherPricing();
            default: return new GuestPricing();
        }
    }

    private void refreshTable() {
        tableModel.setRowCount(0);
        PricingStrategy currentStrategy = getPricingStrategy((String) userTypeBox.getSelectedItem());
        for (EquipmentForStatePattern eq : LabManager.getInstance().getAllEquipment()) {
            tableModel.addRow(new Object[]{
                    eq.getId(), eq.getDescription(), eq.getLocation(),
                    eq.getState().getStateName(), "$" + currentStrategy.calculateRate()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LabManagementGUI().setVisible(true));
    }
}
