package src.java;

public class LabManager extends UserAccounts {


    protected LabManager(String username, String password, String registrationId) {
        super(username, password, registrationId);
        this.needsapproval = false;
        this.isapproved = true;


        this.pricingStrategy = null;
    }

    @Override
    public String getAccountType() {
        return "Lab Manager";
    }
}
