public class Researcher extends UserAccounts {
    public Researcher(String username, String password, String registrationId) {
        super(username, password, registrationId);
        this.pricingStrategy = new ResearcherPricing();
    }

    @Override
    public String getAccountType() {
        return "Researcher";
    }
}
