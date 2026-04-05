package test.AI_assistant;

import org.junit.Test;
import app.DebitCardPayment;
import app.PaymentStrategy;

import static org.junit.Assert.assertEquals;

public class DebitCardPaymentTest {

    private final PaymentStrategy strategy = new DebitCardPayment();

    @Test
    public void testProcessPayment_standardAmount_noFeeApplied() {
        String result = strategy.processPayment(150.50);
        assertEquals("Processing direct debit payment of $150.50. No extra fees.", result);
    }

    @Test
    public void testProcessPayment_trailingZero_formatsToTwoDecimals() {
        // Ensures 45.1 formats to 45.10
        String result = strategy.processPayment(45.1);
        assertEquals("Processing direct debit payment of $45.10. No extra fees.", result);
    }

    @Test
    public void testProcessPayment_zeroAmount_formatsCorrectly() {
        String result = strategy.processPayment(0.00);
        assertEquals("Processing direct debit payment of $0.00. No extra fees.", result);
    }
}