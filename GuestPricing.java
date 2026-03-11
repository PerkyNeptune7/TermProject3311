/**
 * Pricing strategy for Guests.
 * Hourly rate: $30.00
 */
public class GuestPricing implements PricingStrategy {
    private static final double BASE_RATE = 30.0;

    @Override
    public double calculateRate() {
        return BASE_RATE;
    }
}