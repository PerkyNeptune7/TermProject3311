public class Faculty extends UserAccounts {
    public Faculty(String username, String password) {
        super(username, password);
        this.pricingStrategy = new FacultyPricing();
    }

    @Override
    public String getAccountType() {
        return "Faculty";
    }
}