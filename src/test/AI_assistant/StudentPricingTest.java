package test.AI_assistant;
import org.junit.Before;
import org.junit.Test;
import app.PricingStrategy;
import app.StudentPricing;

import static org.junit.Assert.*;

public class StudentPricingTest {

    private PricingStrategy strategy;

    @Before
    public void setUp() {
        // Initialize before each test to guarantee a fresh instance
        strategy = new StudentPricing();
    }

    @Test
    public void testCalculateRate_returnsExactStudentBaseRate() {
        assertEquals("Student pricing should return a base rate of $10.00",
                10.0, strategy.calculateRate(), 0.001);
    }

    @Test
    public void testCalculateRate_isStrictlyPositive() {
        // Business rule: Hourly rates should never be zero or negative
        assertTrue("Student rate must be strictly greater than zero",
                strategy.calculateRate() > 0);
    }

    @Test
    public void testCalculateRate_isConsistentAcrossMultipleCalls() {
        // Ensures no hidden state or counters are mutating the base rate
        double firstCall = strategy.calculateRate();
        double secondCall = strategy.calculateRate();
        assertEquals("Rate should remain constant across consecutive calls",
                firstCall, secondCall, 0.001);
    }

    @Test
    public void testStrategy_implementsPricingStrategyInterface() {
        // Structural test: prevents someone from accidentally removing 'implements PricingStrategy'
        assertTrue("StudentPricing must be an instance of PricingStrategy",
                strategy instanceof PricingStrategy);
    }

    @Test(timeout = 50)
    public void testCalculateRate_executesQuickly() {
        // Performance test: ensures no heavy blocking operations or Thread.sleeps are accidentally added
        strategy.calculateRate();
    }
}