package test.AI_assistant;


import org.junit.Before;
import org.junit.Test;
import app.FacultyPricing;
import app.PricingStrategy;

import static org.junit.Assert.*;

public class FacultyPricingTest {

    private PricingStrategy strategy;

    @Before
    public void setUp() {
        strategy = new FacultyPricing();
    }

    @Test
    public void testCalculateRate_returnsExactFacultyBaseRate() {
        assertEquals("Faculty pricing should return a base rate of $15.00",
                15.0, strategy.calculateRate(), 0.001);
    }

    @Test
    public void testCalculateRate_isStrictlyPositive() {
        assertTrue("Faculty rate must be strictly greater than zero",
                strategy.calculateRate() > 0);
    }

    @Test
    public void testCalculateRate_isConsistentAcrossMultipleCalls() {
        double firstCall = strategy.calculateRate();
        double secondCall = strategy.calculateRate();
        assertEquals("Rate should remain constant across consecutive calls",
                firstCall, secondCall, 0.001);
    }

    @Test
    public void testStrategy_implementsPricingStrategyInterface() {
        assertTrue("FacultyPricing must be an instance of PricingStrategy",
                strategy instanceof PricingStrategy);
    }

    @Test(timeout = 50)
    public void testCalculateRate_executesQuickly() {
        strategy.calculateRate();
    }
}