public class HeadLabCoordinator extends UserAccounts {

    // 1. The single, static instance of this class stored in memory
    private static HeadLabCoordinator instance;

    // 2. A PRIVATE constructor! No one can say "new HeadLabCoordinator()"
    private HeadLabCoordinator(String username, String password, String registrationId) {
        super(username, password, registrationId);
        this.needsapproval = false;
        this.isapproved = true;
    }

    // 3. The global access point to get the one-and-only coordinator
    public static HeadLabCoordinator getInstance() {
        if (instance == null) {
            // This is the only time it will ever be created
            instance = new HeadLabCoordinator("headcoord@yorku.ca", "MasterAdmin123!", "COORD-001");
        }
        return instance;
    }

    @Override
    public String getAccountType() {
        return "Head Lab Coordinator";
    }

    // --- REQUIREMENT 2 LOGIC ---
    // Only this class has this method. It acts as a specialized factory.
    public LabManager autoGenerateLabManager(String username, String password) {
        System.out.println("Head Coordinator authorized creation of Lab Manager: " + username);
        return new LabManager(username, password, "MANAGER-" + Math.abs(username.hashCode()));
    }
}
