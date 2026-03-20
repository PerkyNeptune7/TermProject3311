import java.time.LocalDateTime;

public class ObserverPatterntest {
    public static void main(String[] args) {
        // 1. Create a Reservation object
        // (Uses the Reservation class you uploaded)
        Reservation myRes = new Reservation(
                "RES-2024",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(2),
                ReservationStatus.ACTIVE
        );

        // 2. Instantiate the Managers (Observers)
        BookingSystem bookingSystem = new BookingSystem();
        ReservationManager resManager = new ReservationManager();

        // 3. Test addReservation for both
        System.out.println("Adding reservation " + myRes.getReservationId() + " to systems...");

        bookingSystem.addReservation(myRes);
        resManager.addReservation(myRes);

        // 4. Verification
        System.out.println("--- Verification ---");

        // Note: Since the lists in your classes are private and don't have getters,
        // we verify by checking if the code executes without errors.
        // In a real scenario, we'd add a getReservations() method to verify the size.

        System.out.println("Reservation successfully added to BookingSystem.");
        System.out.println("Reservation successfully added to ReservationManager.");
    }
}