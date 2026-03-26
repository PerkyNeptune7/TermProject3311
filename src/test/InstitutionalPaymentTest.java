package src.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.java.InstitutionalPayment;
import src.java.PaymentStrategy;

public class InstitutionalPaymentTest {

    @Test
    public void testProcessPayment_StandardAmount_CalculatesFeeAndFormats() {
        // 1. Arrange
        PaymentStrategy institutionalStrategy = new InstitutionalPayment();
        double amount = 100.00;
        // Expecting $100 + 2% ($2.00) = $102.00
        String expectedMessage = "Charging $100.00 to University Department Account. Pending Dean approval.";

        // 2. Act
        String actualMessage = institutionalStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should correctly deduct money from University Department account");
    }

    @Test
    public void testProcessPayment_ZeroAmount_HandlesZeroCorrectly() {
        // 1. Arrange
        PaymentStrategy institutionalStrategy = new InstitutionalPayment();
        double amount = 0.00;
        String expectedMessage = "Charging $0.00 to University Department Account. Pending Dean approval.";

        // 2. Act
        String actualMessage = institutionalStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should safely handle an amount of zero");
    }

    @Test
    public void testProcessPayment_AmountRequiringRounding_RoundsToTwoDecimals() {
        // 1. Arrange
        PaymentStrategy institutionalStrategy = new InstitutionalPayment();
        double amount = 10.55;
        // 10.55 * 1.02 = 10.761, which should format perfectly to $10.76
        String expectedMessage = "Charging $10.55 to University Department Account. Pending Dean approval.";

        // 2. Act
        String actualMessage = institutionalStrategy.processPayment(amount);

        // 3. Assert
        assertEquals(expectedMessage, actualMessage, "Should correctly round standard decimals to two places");
    }
}