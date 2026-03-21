public abstract class UserAccounts {
    public String username;
    public String password;
    private String registrationId;
    public boolean needsapproval;
    public boolean isapproved;
    protected PricingStrategy pricingStrategy;

    public UserAccounts(String username, String password, String registrationId) {
        this.username = username;
        this.password = password;
        this.registrationId = registrationId;
        this.needsapproval = true;
        this.isapproved = false;
    }

    public double getHourlyRate() {
        if (pricingStrategy != null) {
            return pricingStrategy.calculateRate();
        }
        return 0.0;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public abstract String getAccountType();
}
