public class Student extends UserAccounts {
    public Student(String username, String password) {
        super(username, password);
        this.pricingStrategy = new StudentPricing();
    }

    @Override
    public String getAccountType() {
        return "Student";
    }


}