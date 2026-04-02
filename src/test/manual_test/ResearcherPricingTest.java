package src.test.manual_test;

import org.junit.jupiter.api.Test;
import src.java.PricingStrategy;
import src.java.ResearcherPricing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ResearcherPricingTest {

    @Test
    public void testResearcherPricing_ReturnsCorrectRate() {
        // 1. Arrange: Set up the specific strategy we want to src.test
        PricingStrategy researcherStrategy = new ResearcherPricing();
        double expectedRate = 20.0;

        // Tolerance for comparing double values
        double delta = 0.001;

        // 2. Act: Execute the method we are testing
        double actualRate = researcherStrategy.calculateRate();

        // 3. Assert: Verify the actual result matches our expectation
        assertEquals(expectedRate, actualRate, delta, "The student rate should be exactly $10.0");
    }

    @Test
    public void testResearcherPricing_DoesNotReturnStudentRate() {
        // 1. Arrange: Set up the strategy and the INCORRECT value we want to guard against
        PricingStrategy researcherStrategy = new ResearcherPricing();

        // We know researchers should pay $20.0, so $10.0 is deliberately wrong
        double incorrectRate = 10.0;
        double delta = 0.001;

        // 2. Act: Calculate the actual rate
        double actualRate = researcherStrategy.calculateRate();

        // 3. Assert: Verify the actual result does NOT match the incorrect rate
        assertNotEquals(incorrectRate, actualRate, delta, "A researchers should never be charged the $10.0 student rate");
    }
}
