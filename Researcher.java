public class Researcher extends UserAccounts {
    public Researcher(String username, String password) {
        super(username, password);
        this.pricingStrategy = new ResearcherPricing();
    }

    @Override
    public String getAccountType() {
        return "Researcher";
    }
}