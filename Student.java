public class Student extends UserAccounts {
    public Student(String username, String password) {
        super(username, password);
    }
   @Override
    public String getAccountType(){
        return "Student";
    } 
}