import java.util.ArrayList;
import java.util.List;

public class LabDatabase {
    private List<UserAccounts> users;
    private List<EquipmentForStatePattern> equipmentList; // Add this
    private UserFactory userFactory;

    public LabDatabase() {
        users = new ArrayList<>();
        equipmentList = new ArrayList<>();
        userFactory = new UserFactory();

        // --- FIX: Manually approve the hardcoded test accounts ---
        UserAccounts dummyStudent = userFactory.createUser("Student", "student1@yorku.ca", "pass123");
        dummyStudent.isapproved = true;     // Bypass the queue
        dummyStudent.needsapproval = false;
        users.add(dummyStudent);

        UserAccounts dummyFaculty = userFactory.createUser("Faculty", "prof@yorku.ca", "secure456");
        dummyFaculty.isapproved = true;     // Bypass the queue
        dummyFaculty.needsapproval = false;
        users.add(dummyFaculty);
        // ---------------------------------------------------------

        // 1. Add the Head Lab Coordinator to the system (Already approved by default)
        HeadLabCoordinator boss = HeadLabCoordinator.getInstance();
        users.add(boss);

        // 2. Have the Coordinator auto-generate a Lab Manager for testing
        LabManager manager1 = boss.autoGenerateLabManager("manager1@yorku.ca", "managepass");
        users.add(manager1);

        // Dummy Equipment
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
    public void addUser(UserAccounts user) {
        this.users.add(user);
    }

    public void addEquipment(EquipmentForStatePattern eq) {
        this.equipmentList.add(eq);
    }
    public java.util.List<UserAccounts> getPendingUsers() {
        java.util.List<UserAccounts> pending = new java.util.ArrayList<>();
        for (UserAccounts u : users) {
            if (u.needsapproval && !u.isapproved) {
                pending.add(u);
            }
        }
        return pending;
    }
}