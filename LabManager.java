public class LabManager extends UserAccounts {

    // Notice we use default modifier (package-private) or protected for the constructor
    // This makes it harder for random classes to create a LabManager directly!
    protected LabManager(String username, String password) {
        super(username, password);
        this.needsapproval = false; // Managers are pre-approved
        this.isapproved = true;

        // Managers don't pay to use equipment, so they get a null or $0 strategy
        this.pricingStrategy = null;
    }

    @Override
    public String getAccountType() {
        return "Lab Manager";
    }
}