public interface PaymentStrategy {
    // Returns a string so our GUI can display the receipt!
    String processPayment(double amount);
}