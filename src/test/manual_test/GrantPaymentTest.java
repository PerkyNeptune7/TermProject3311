package test.manual_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import app.GrantPayment;
import app.PaymentStrategy;

public class GrantPaymentTest {

    @Test
    public void testProcessPayment_StandardAmount_CalculatesFeeAndFormats() {
        // 1. Arrange
        PaymentStrategy grantStrategy = new GrantPayment();
        double amount = 100.00;
        // Expecting exact deduction of $100.00
        String expectedMessage = "Deducting $100.00 from registered Research Grant funds.";

        // 2. Act
        String actualMessage = grantStrategy.processPayment(amount);

        // 3. Assert
        // FIX: Message goes FIRST in JUnit 4
        assertEquals("Should correctly deduct money from registered account", expectedMessage, actualMessage);
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
        // FIX: Message goes FIRST in JUnit 4
        assertEquals("Should safely handle an amount of zero", expectedMessage, actualMessage);
    }

    @Test
    public void testProcessPayment_AmountRequiringRounding_RoundsToTwoDecimals() {
        // 1. Arrange
        PaymentStrategy grantStrategy = new GrantPayment();
        double amount = 10.55;
        // Expecting exact deduction of $10.55
        String expectedMessage = "Deducting $10.55 from registered Research Grant funds.";

        // 2. Act
        String actualMessage = grantStrategy.processPayment(amount);

        // 3. Assert
        // FIX: Message goes FIRST in JUnit 4
        assertEquals("Should correctly round standard decimals to two places", expectedMessage, actualMessage);
    }
}