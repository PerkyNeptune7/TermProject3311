package test.manual_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import app.CreditCardPayment;
import app.PaymentStrategy;

public class CreditPaymentTest {

    @Test
    public void testProcessPayment_StandardAmount_CalculatesFeeAndFormats() {
        // 1. Arrange
        PaymentStrategy creditCardStrategy = new CreditCardPayment();
        double amount = 100.00;
        // Expecting $100 + 2% ($2.00) = $102.00
        String expectedMessage = "Processing credit card payment of $102.00 plus 2% processing fee.";

        // 2. Act
        String actualMessage = creditCardStrategy.processPayment(amount);

        // 3. Assert
        // FIX: Moved message to the front for JUnit 4
        assertEquals("Should correctly calculate a 2% fee on a standard amount", expectedMessage, actualMessage);
    }

    @Test
    public void testProcessPayment_ZeroAmount_HandlesZeroCorrectly() {
        // 1. Arrange
        PaymentStrategy creditCardStrategy = new CreditCardPayment();
        double amount = 0.00;
        String expectedMessage = "Processing credit card payment of $0.00 plus 2% processing fee.";

        // 2. Act
        String actualMessage = creditCardStrategy.processPayment(amount);

        // 3. Assert
        // FIX: Moved message to the front for JUnit 4
        assertEquals("Should safely handle an amount of zero", expectedMessage, actualMessage);
    }

    @Test
    public void testProcessPayment_AmountRequiringRounding_RoundsToTwoDecimals() {
        // 1. Arrange
        PaymentStrategy creditCardStrategy = new CreditCardPayment();
        double amount = 10.55;
        // 10.55 * 1.02 = 10.761, which should format perfectly to $10.76
        String expectedMessage = "Processing credit card payment of $10.76 plus 2% processing fee.";

        // 2. Act
        String actualMessage = creditCardStrategy.processPayment(amount);

        // 3. Assert
        // FIX: Moved message to the front for JUnit 4
        assertEquals("Should correctly round standard decimals to two places", expectedMessage, actualMessage);
    }
}