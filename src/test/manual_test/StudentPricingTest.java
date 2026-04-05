package test.manual_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals; // Swapped to JUnit 4
import app.PricingStrategy;
import app.StudentPricing;

public class StudentPricingTest {

    @Test
    public void testStudentPricing_ReturnsCorrectRate() {
        // 1. Arrange: Set up the specific strategy we want to test
        PricingStrategy studentStrategy = new StudentPricing();
        double expectedRate = 10.0;

        // Tolerance for comparing double values
        double delta = 0.001;

        // 2. Act: Execute the method we are testing
        double actualRate = studentStrategy.calculateRate();

        // 3. Assert: Verify the actual result matches our expectation
        // FIX: In JUnit 4, the String message goes FIRST
        assertEquals("The student rate should be exactly $10.0", expectedRate, actualRate, delta);
    }

    @Test
    public void testStudentPricing_DoesNotReturnStudentRate() {
        // 1. Arrange: Set up the strategy and the INCORRECT value we want to guard against
        PricingStrategy studentStrategy = new StudentPricing();

        // We know students should pay $10.0, so $15.0 is deliberately wrong
        double incorrectRate = 15.0;
        double delta = 0.001;

        // 2. Act: Calculate the actual rate
        double actualRate = studentStrategy.calculateRate();

        // 3. Assert: Verify the actual result does NOT match the incorrect rate
        // FIX: In JUnit 4, the String message goes FIRST
        assertNotEquals("A student should never be charged the $15.0 faculty rate", incorrectRate, actualRate, delta);
    }
}