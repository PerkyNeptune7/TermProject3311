public class Student extends UserAccounts {
    public Student(String username, String password, String registrationId) {
        super(username, password, registrationId);
        this.pricingStrategy = new StudentPricing();
    }

    @Override
    public String getAccountType() {
        return "Student";
    }


}
