public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return String.format("Processing credit card payment of $%.2f plus 2%% processing fee.", (amount * 1.02));
    }
}