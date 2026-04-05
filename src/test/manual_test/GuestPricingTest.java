package test.manual_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals; // Added JUnit 4 assertNotEquals
import app.GuestPricing;
import app.PricingStrategy;

public class GuestPricingTest {

    @Test
    public void testGuestPricing_ReturnsCorrectRate() {
        // 1. Arrange: Set up the specific strategy we want to test
        PricingStrategy guestStrategy = new GuestPricing();
        double expectedRate = 30.0;

        // Tolerance for comparing double values
        double delta = 0.001;

        // 2. Act: Execute the method we are testing
        double actualRate = guestStrategy.calculateRate();

        // 3. Assert: Verify the actual result matches our expectation
        // FIX: Moved message to the front, updated text to mention Guest and $30.0
        assertEquals("The guest rate should be exactly $30.0", expectedRate, actualRate, delta);
    }

    @Test
    public void testGuestPricing_DoesNotReturnStudentRate() {
        // 1. Arrange: Set up the strategy and the INCORRECT value we want to guard against
        PricingStrategy guestStrategy = new GuestPricing();

        // We know guests should pay $30.0, so $10.0 is deliberately wrong
        double incorrectRate = 10.0;
        double delta = 0.001;

        // 2. Act: Calculate the actual rate
        double actualRate = guestStrategy.calculateRate();

        // 3. Assert: Verify the actual result does NOT match the incorrect rate
        // FIX: Moved message to the front
        assertNotEquals("A guest should never be charged the $10.0 student rate", incorrectRate, actualRate, delta);
    }
}