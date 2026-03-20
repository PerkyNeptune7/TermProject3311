public class UserFactory {

    public UserAccounts createUser(String accountType, String username, String password) {
        if (accountType.equalsIgnoreCase("Student")) {
            return new Student(username, password);
        } else if (accountType.equalsIgnoreCase("Faculty")) {
            return new Faculty(username, password);
        } else if (accountType.equalsIgnoreCase("Researcher")) {
            return new Researcher(username, password);
        } else if (accountType.equalsIgnoreCase("Guest")) {
            return new Guest(username, password);
        }
        return null;
    }
}