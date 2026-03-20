import java.util.ArrayList;
import java.util.List;

public class LabDatabase {
    private List<UserAccounts> users;
    private List<EquipmentForStatePattern> equipmentList; // Add this
    private UserFactory userFactory;

    public LabDatabase() {
        users = new ArrayList<>();
        equipmentList = new ArrayList<>(); // Initialize it
        userFactory = new UserFactory();

        // Dummy Users
        users.add(userFactory.createUser("Student", "student1@yorku.ca", "pass123"));
        users.add(userFactory.createUser("Faculty", "prof@yorku.ca", "secure456"));

        // Dummy Equipment (Using your State Pattern class!)
        equipmentList.add(new EquipmentForStatePattern("EQ-001", "Electron Microscope", "Room 101"));
        equipmentList.add(new EquipmentForStatePattern("EQ-002", "3D Printer", "Room 102"));
        equipmentList.add(new EquipmentForStatePattern("EQ-003", "Spectrometer", "Room 103"));
    }

    public UserAccounts authenticate(String username, String password) {
        for (UserAccounts user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    // Give the GUI a way to get the equipment!
    public List<EquipmentForStatePattern> getAvailableEquipment() {
        return equipmentList;
    }

    public void registerNewUser(String role, String username, String password) {
        // Uses your Factory Pattern!
        UserAccounts newUser = userFactory.createUser(role, username, password);
        users.add(newUser);
    }
}