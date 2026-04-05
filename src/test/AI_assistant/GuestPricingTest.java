package test.AI_assistant;

import org.junit.Before;
import org.junit.Test;
import app.GuestPricing;
import app.PricingStrategy;

import static org.junit.Assert.*;

public class GuestPricingTest {

    private PricingStrategy strategy;

    @Before
    public void setUp() {
        strategy = new GuestPricing();
    }

    @Test
    public void testCalculateRate_returnsExactGuestBaseRate() {
        assertEquals("Guest pricing should return a base rate of $30.00",
                30.0, strategy.calculateRate(), 0.001);
    }

    @Test
    public void testCalculateRate_isStrictlyPositive() {
        assertTrue("Guest rate must be strictly greater than zero",
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
        assertTrue("GuestPricing must be an instance of PricingStrategy",
                strategy instanceof PricingStrategy);
    }

    @Test(timeout = 50)
    public void testCalculateRate_executesQuickly() {
        strategy.calculateRate();
    }
}