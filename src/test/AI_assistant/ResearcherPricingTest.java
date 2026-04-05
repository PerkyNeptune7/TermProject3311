package src.test.AI_assistant;

import org.junit.Before;
import org.junit.Test;
import src.java.PricingStrategy;
import src.java.ResearcherPricing;

import static org.junit.Assert.*;

public class ResearcherPricingTest {

    private PricingStrategy strategy;

    @Before
    public void setUp() {
        strategy = new ResearcherPricing();
    }

    @Test
    public void testCalculateRate_returnsExactResearcherBaseRate() {
        assertEquals("Researcher pricing should return a base rate of $20.00",
                20.0, strategy.calculateRate(), 0.001);
    }

    @Test
    public void testCalculateRate_isStrictlyPositive() {
        assertTrue("Researcher rate must be strictly greater than zero",
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
        assertTrue("ResearcherPricing must be an instance of PricingStrategy",
                strategy instanceof PricingStrategy);
    }

    @Test(timeout = 50)
    public void testCalculateRate_executesQuickly() {
        strategy.calculateRate();
    }
}