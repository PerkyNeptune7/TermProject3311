public class StrategyMain {

    public static void main(String[] args) {
            System.out.println("--- Testing Pricing Strategies Isolated ---");

            // 1. Test Student Pricing
            PricingStrategy studentStrategy = new StudentPricing();
            System.out.println("Expected Student Rate: $10.0");
            System.out.println("Actual Student Rate:   $" + studentStrategy.calculateRate() + "\n");

            // 2. Test Faculty Pricing
            PricingStrategy facultyStrategy = new FacultyPricing();
            System.out.println("Expected Faculty Rate: $15.0");
            System.out.println("Actual Faculty Rate:   $" + facultyStrategy.calculateRate() + "\n");

            // 3. Test Researcher Pricing
            PricingStrategy researcherStrategy = new ResearcherPricing();
            System.out.println("Expected Researcher Rate: $20.0");
            System.out.println("Actual Researcher Rate:   $" + researcherStrategy.calculateRate() + "\n");

            // 4. Test Guest Pricing
            PricingStrategy guestStrategy = new GuestPricing();
            System.out.println("Expected Guest Rate: $30.0");
            System.out.println("Actual Guest Rate:   $" + guestStrategy.calculateRate() + "\n");

            System.out.println("If the actual rates match the expected rates, the Strategy classes are perfect!");
        }
    }
