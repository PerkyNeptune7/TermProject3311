public class Faculty extends UserAccounts {
    public Faculty(String username, String password, String registrationId) {
        super(username, password, registrationId);
        this.pricingStrategy = new FacultyPricing();
    }

    @Override
    public String getAccountType() {
        return "Faculty";
    }
}
