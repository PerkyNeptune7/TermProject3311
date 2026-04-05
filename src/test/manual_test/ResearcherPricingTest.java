package test.manual_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals; // Added JUnit 4 assertNotEquals
import app.PricingStrategy;
import app.ResearcherPricing;

public class ResearcherPricingTest {

    @Test
    public void testResearcherPricing_ReturnsCorrectRate() {
        // 1. Arrange: Set up the specific strategy we want to test
        PricingStrategy researcherStrategy = new ResearcherPricing();
        double expectedRate = 20.0;

        // Tolerance for comparing double values
        double delta = 0.001;

        // 2. Act: Execute the method we are testing
        double actualRate = researcherStrategy.calculateRate();

        // 3. Assert: Verify the actual result matches our expectation
        // FIX: Moved message to the front, updated text to mention Researcher and $20.0
        assertEquals("The researcher rate should be exactly $20.0", expectedRate, actualRate, delta);
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
        // FIX: Moved message to the front, fixed typo "researchers" -> "researcher"
        assertNotEquals("A researcher should never be charged the $10.0 student rate", incorrectRate, actualRate, delta);
    }
}