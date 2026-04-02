/**
 * Pricing strategy for Faculty members.
 * Hourly rate: $15.00
 */
public class FacultyPricing implements PricingStrategy {
    private static final double BASE_RATE = 15.0;

    @Override
    public double calculateRate() {
        return BASE_RATE;
    }
}