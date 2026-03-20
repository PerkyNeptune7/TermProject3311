import java.util.ArrayList;
import java.util.List;

public class ReservationManager implements Observer{
    private List<Reservation> reservations;

    public ReservationManager() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public void update(Sensor sensor) {

        if (sensor.isEquipmentActive()) {
            System.out.println("ReservationManager: Equipment in use. Confirming reservation.");
        } else {
            System.out.println("ReservationManager: Equipment stopped. Ending reservation.");
        }

    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}
