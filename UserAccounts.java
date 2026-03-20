public abstract class UserAccounts {
public String username;
public String password;
public boolean needsapproval;
public boolean isapproved;

public UserAccounts(String username, String password) {
    this.username = username;
    this.password = password;
    this.needsapproval = true;
    this.isapproved = false;

}

public abstract String getAccountType();
}