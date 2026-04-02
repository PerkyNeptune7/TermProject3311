/**
 * Pricing strategy for Students.
 * Hourly rate: $10.00
 */
public class StudentPricing implements PricingStrategy {
    private static final double BASE_RATE = 10.0;

    @Override
    public double calculateRate() {
        return BASE_RATE;
    }
}