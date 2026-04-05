package test.AI_assistant;

import org.junit.Test;
import app.CreditCardPayment;
import app.PaymentStrategy;

import static org.junit.Assert.assertEquals;

public class CreditCardPaymentTest {

    private final PaymentStrategy strategy = new CreditCardPayment();

    @Test
    public void testProcessPayment_standardAmount_calculatesExactTwoPercentFee() {
        // 100.00 * 1.02 = 102.00
        String result = strategy.processPayment(100.00);
        assertEquals("Processing credit card payment of $102.00 plus 2% processing fee.", result);
    }

    @Test
    public void testProcessPayment_fractionalAmount_roundsToTwoDecimalPlaces() {
        // 10.55 * 1.02 = 10.761 -> should format to 10.76
        String result = strategy.processPayment(10.55);
        assertEquals("Processing credit card payment of $10.76 plus 2% processing fee.", result);
    }

    @Test
    public void testProcessPayment_zeroAmount_processesWithoutFee() {
        String result = strategy.processPayment(0.00);
        assertEquals("Processing credit card payment of $0.00 plus 2% processing fee.", result);
    }

    @Test
    public void testProcessPayment_largeAmount_formatsWithoutScientificNotation() {
        // Ensures large floats don't format as $1.02E6
        String result = strategy.processPayment(1_000_000.00);
        assertEquals("Processing credit card payment of $1020000.00 plus 2% processing fee.", result);
    }

    @Test
    public void testProcessPayment_negativeAmount_formatsWithNegativeSign() {
        // Note: In a production e-commerce system, this should likely throw an IllegalArgumentException.
        // This test documents the current behavior of the formatting logic.
        String result = strategy.processPayment(-50.00);
        assertEquals("Processing credit card payment of $-51.00 plus 2% processing fee.", result);
    }
}