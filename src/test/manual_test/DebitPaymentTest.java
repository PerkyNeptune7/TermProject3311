package src.test.manual_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.java.DebitCardPayment;
import src.java.PaymentStrategy;

public class DebitPaymentTest {

    @Test
    public void testProcessPayment_StandardAmount_CalculatesFeeAndFormats() {
        // 1. Arrange
        PaymentStrategy debitCardStrategy = new DebitCardPayment();
        double amount = 100.00;
        // Expecting $100 + 2% ($2.00) = $102.00
        String expectedMessage = "Processing direct debit payment of $100.00. No extra fees.";
        // 2. Act
        String actualMessage = debitCardStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should correctly calculate a 0% fee on a standard amount");
    }

    @Test
    public void testProcessPayment_ZeroAmount_HandlesZeroCorrectly() {
        // 1. Arrange
        PaymentStrategy debitCardStrategy = new DebitCardPayment();
        double amount = 0.00;
        String expectedMessage = "Processing direct debit payment of $0.00. No extra fees.";

        // 2. Act
        String actualMessage = debitCardStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should safely handle an amount of zero");
    }

    @Test
    public void testProcessPayment_AmountRequiringRounding_RoundsToTwoDecimals() {
        // 1. Arrange
        PaymentStrategy debitCardStrategy = new DebitCardPayment();
        double amount = 10.55;
        // 10.55 * 1.02 = 10.761, which should format perfectly to $10.76
        String expectedMessage = "Processing direct debit payment of $10.55. No extra fees.";

        // 2. Act
        String actualMessage = debitCardStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should correctly round standard decimals to two places");
    }
}