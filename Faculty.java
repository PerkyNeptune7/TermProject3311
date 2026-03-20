public class Faculty extends UserAccounts {
    public Faculty(String username, String password) {
        super(username, password);
    }

    @Override
    public String getAccountType() {
        return "Faculty";
    }
}