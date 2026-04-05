package app;

public interface PaymentStrategy {
    String processPayment(double amount);
}