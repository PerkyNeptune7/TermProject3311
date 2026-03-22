public class DebitCardPayment implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return String.format("Processing direct debit payment of $%.2f. No extra fees.", amount);
    }
}