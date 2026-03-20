public abstract class UserAccounts {
    public String username;
    public String password;
    public boolean needsapproval;
    public boolean isapproved;
    // 1. Add this protected variable so subclasses can see it
    protected PricingStrategy pricingStrategy;

    public UserAccounts(String username, String password) {
        this.username = username;
        this.password = password;
        this.needsapproval = true;
        this.isapproved = false;

    }
    // 2. Add the method the GUI is looking for!
    public double getHourlyRate() {
        if (pricingStrategy != null) {
            return pricingStrategy.calculateRate();
        }
        return 0.0; // Fallback
    }

public abstract String getAccountType();
}