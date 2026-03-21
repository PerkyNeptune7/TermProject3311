public class UserFactory{
   
    public UserAccounts createUser(String accountType, String username, String password){
        return createUser(accountType, username, password, "ID-" + Math.abs(username.hashCode()));
    }

    public UserAccounts createUser(String accountType, String username, String password, String registrationId){
        if(accountType.equalsIgnoreCase("Student")){
            return new Student(username, password, registrationId);
        } else if(accountType.equalsIgnoreCase("Faculty")){
            return new Faculty(username, password, registrationId);
        } else if(accountType.equalsIgnoreCase("Researcher")){
            return new Researcher(username, password, registrationId);
        }
        else if(accountType.equalsIgnoreCase("Guest")){
            return new Guest(username, password, registrationId);
        }
        return null;
    }
}
