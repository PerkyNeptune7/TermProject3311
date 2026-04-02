package src.test.AI_assistant;

import org.junit.Test;
import src.java.InstitutionalPayment;
import src.java.PaymentStrategy;

import static org.junit.Assert.assertEquals;

public class InstitutionalPaymentTest {

    private final PaymentStrategy strategy = new InstitutionalPayment();

    @Test
    public void testProcessPayment_standardAmount_includesDeanApprovalNotice() {
        String result = strategy.processPayment(5000.00);
        assertEquals("Charging $5000.00 to University Department Account. Pending Dean approval.", result);
    }

    @Test
    public void testProcessPayment_fractionalAmount_truncatesOrRoundsToTwoDecimals() {
        String result = strategy.processPayment(1234.567);
        assertEquals("Charging $1234.57 to University Department Account. Pending Dean approval.", result);
    }
}