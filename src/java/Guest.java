public class Guest extends UserAccounts {
    public Guest(String username, String password, String registrationId) {
        super(username, password, registrationId);
        this.needsapproval = false;
        this.isapproved = true;
        this.pricingStrategy = new GuestPricing();
    }

    @Override
    public String getAccountType() {
        return "Guest";
    }

}
