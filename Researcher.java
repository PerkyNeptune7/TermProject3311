public class Researcher extends UserAccounts {
    public Researcher(String username, String password) {
        super(username, password);
    }
   @Override
    public String getAccountType(){
        return "Researcher";
    } 
}