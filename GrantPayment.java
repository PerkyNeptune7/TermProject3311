public class GrantPayment implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return String.format("Deducting $%.2f from registered Research Grant funds.", amount);
    }
}