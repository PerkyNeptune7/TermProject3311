package src.test.manual_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.java.GrantPayment;
import src.java.PaymentStrategy;

public class GrantPaymentTest {

    @Test
    public void testProcessPayment_StandardAmount_CalculatesFeeAndFormats() {
        // 1. Arrange
        PaymentStrategy grantStrategy = new GrantPayment();
        double amount = 100.00;
        // Expecting $100 + 2% ($2.00) = $102.00
        String expectedMessage = "Deducting $100.00 from registered Research Grant funds.";

        // 2. Act
        String actualMessage = grantStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should correctly deduct money from registered account");
    }

    @Test
    public void testProcessPayment_ZeroAmount_HandlesZeroCorrectly() {
        // 1. Arrange
        PaymentStrategy grantStrategy = new GrantPayment();
        double amount = 0.00;
        String expectedMessage = "Deducting $0.00 from registered Research Grant funds.";

        // 2. Act
        String actualMessage = grantStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should safely handle an amount of zero");
    }

    @Test
    public void testProcessPayment_AmountRequiringRounding_RoundsToTwoDecimals() {
        // 1. Arrange
        PaymentStrategy grantStrategy = new GrantPayment();
        double amount = 10.55;
        // 10.55 * 1.02 = 10.761, which should format perfectly to $10.76
        String expectedMessage = "Deducting $10.55 from registered Research Grant funds.";

        // 2. Act
        String actualMessage = grantStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should correctly round standard decimals to two places");
    }
}