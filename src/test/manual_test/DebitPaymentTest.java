package test.manual_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import app.DebitCardPayment;
import app.PaymentStrategy;

public class DebitPaymentTest {

    @Test
    public void testProcessPayment_StandardAmount_CalculatesFeeAndFormats() {
        // 1. Arrange
        PaymentStrategy debitCardStrategy = new DebitCardPayment();
        double amount = 100.00;
        // Expecting exactly $100.00 (No fees for Debit)
        String expectedMessage = "Processing direct debit payment of $100.00. No extra fees.";

        // 2. Act
        String actualMessage = debitCardStrategy.processPayment(amount);

        // 3. Assert
        // FIX: Message goes FIRST in JUnit 4
        assertEquals("Should correctly process a 0% fee on a standard amount", expectedMessage, actualMessage);
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
        // FIX: Message goes FIRST in JUnit 4
        assertEquals("Should safely handle an amount of zero", expectedMessage, actualMessage);
    }

    @Test
    public void testProcessPayment_AmountRequiringRounding_RoundsToTwoDecimals() {
        // 1. Arrange
        PaymentStrategy debitCardStrategy = new DebitCardPayment();
        double amount = 10.55;
        // Expecting exactly $10.55 (No fees for Debit)
        String expectedMessage = "Processing direct debit payment of $10.55. No extra fees.";

        // 2. Act
        String actualMessage = debitCardStrategy.processPayment(amount);

        // 3. Assert
        // FIX: Message goes FIRST in JUnit 4
        assertEquals("Should correctly format decimals to two places", expectedMessage, actualMessage);
    }
}