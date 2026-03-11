/**
 * Pricing strategy for Researchers.
 * Hourly rate: $20.00
 */
public class ResearcherPricing implements PricingStrategy {
    private static final double BASE_RATE = 20.0;

    @Override
    public double calculateRate() {
        return BASE_RATE;
    }
}