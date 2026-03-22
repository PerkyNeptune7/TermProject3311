public class InstitutionalPayment implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return String.format("Charging $%.2f to University Department Account. Pending Dean approval.", amount);
    }
}