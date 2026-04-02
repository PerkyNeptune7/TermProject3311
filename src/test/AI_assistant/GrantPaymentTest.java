package src.test.AI_assistant;

import org.junit.Test;
import src.java.GrantPayment;
import src.java.PaymentStrategy;

import static org.junit.Assert.assertEquals;

public class GrantPaymentTest {

    private final PaymentStrategy strategy = new GrantPayment();

    @Test
    public void testProcessPayment_standardAmount_deductsFromGrant() {
        String result = strategy.processPayment(250.75);
        assertEquals("Deducting $250.75 from registered Research Grant funds.", result);
    }

    @Test
    public void testProcessPayment_wholeNumber_addsDecimalZeros() {
        String result = strategy.processPayment(1000);
        assertEquals("Deducting $1000.00 from registered Research Grant funds.", result);
    }
}