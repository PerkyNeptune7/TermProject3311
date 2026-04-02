package src.test.manual_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.java.CreditCardPayment;
import src.java.PaymentStrategy;

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
        assertEquals(expectedMessage, actualMessage, "Should correctly calculate a 2% fee on a standard amount");
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
        assertEquals(expectedMessage, actualMessage, "Should safely handle an amount of zero");
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
        assertEquals(expectedMessage, actualMessage, "Should correctly round standard decimals to two places");
    }
}