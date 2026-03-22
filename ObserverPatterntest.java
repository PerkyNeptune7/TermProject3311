import java.time.LocalDateTime;

public class ObserverPatterntest {
    public static void main(String[] args) {
        Reservation myRes = new Reservation(
                "RES-2024",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(2),
                ReservationStatus.ACTIVE
        );


        BookingSystem bookingSystem = new BookingSystem();
        ReservationManager resManager = new ReservationManager();


        System.out.println("Adding reservation " + myRes.getReservationId() + " to systems...");

        bookingSystem.addReservation(myRes);
        resManager.addReservation(myRes);


        System.out.println("--- Verification ---");

        System.out.println("Reservation successfully added to BookingSystem.");
        System.out.println("Reservation successfully added to ReservationManager.");
    }
}