package test.manual_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals; // Swapped Jupiter for standard JUnit 4
import app.FacultyPricing;
import app.PricingStrategy;

public class FacultyPricingTest {

    @Test
    public void testFacultyPricing_ReturnsCorrectRate() {
        // 1. Arrange: Set up the specific strategy we want to test
        PricingStrategy facultyStrategy = new FacultyPricing();
        double expectedRate = 15.0;

        // Tolerance for comparing double values
        double delta = 0.001;

        // 2. Act: Execute the method we are testing
        double actualRate = facultyStrategy.calculateRate();

        // 3. Assert: Verify the actual result matches our expectation
        // FIX: In JUnit 4, the String message goes FIRST
        assertEquals("The faculty rate should be exactly $15.0", expectedRate, actualRate, delta);
    }

    @Test
    public void testFacultyPricing_DoesNotReturnStudentRate() {
        // 1. Arrange: Set up the strategy and the INCORRECT value we want to guard against
        PricingStrategy facultyStrategy = new FacultyPricing();

        // We know faculty should pay $15.0, so $10.0 is deliberately wrong
        double incorrectRate = 10.0;
        double delta = 0.001;

        // 2. Act: Calculate the actual rate
        double actualRate = facultyStrategy.calculateRate();

        // 3. Assert: Verify the actual result does NOT match the incorrect rate
        // FIX: In JUnit 4, the String message goes FIRST
        assertNotEquals("A faculty member should never be charged the $10.0 student rate", incorrectRate, actualRate, delta);
    }
}