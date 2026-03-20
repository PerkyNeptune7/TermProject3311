public class Guest extends UserAccounts {
    public Guest(String username, String password) {
        super(username, password);
        this.needsapproval = false;
        this.isapproved = true;
    }

    @Override
    public String getAccountType() {
        return "Guest";
    }

}