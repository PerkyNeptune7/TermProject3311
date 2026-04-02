package src.test.manual_test;

import org.junit.jupiter.api.Test;
import src.java.GuestPricing;
import src.java.PricingStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GuestPricingTest {

    @Test
    public void testGuestPricing_ReturnsCorrectRate() {
        // 1. Arrange: Set up the specific strategy we want to src.test
        PricingStrategy guestStrategy = new GuestPricing();
        double expectedRate = 30.0;

        // Tolerance for comparing double values
        double delta = 0.001;

        // 2. Act: Execute the method we are testing
        double actualRate = guestStrategy.calculateRate();

        // 3. Assert: Verify the actual result matches our expectation
        assertEquals(expectedRate, actualRate, delta, "The student rate should be exactly $10.0");
    }
    @Test
    public void testGuestPricing_DoesNotReturnStudentRate() {
        // 1. Arrange: Set up the strategy and the INCORRECT value we want to guard against
        PricingStrategy guestStrategy = new GuestPricing();

        // We know researchers should pay $20.0, so $10.0 is deliberately wrong
        double incorrectRate = 10.0;
        double delta = 0.001;

        // 2. Act: Calculate the actual rate
        double actualRate = guestStrategy.calculateRate();

        // 3. Assert: Verify the actual result does NOT match the incorrect rate
        assertNotEquals(incorrectRate, actualRate, delta, "A guest should never be charged the $10.0 student rate");
    }
}
