import java.util.List;
import java.util.ArrayList;
public class BookingSystem implements Observer{

    private List<Reservation> reservations;

    public BookingSystem() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }


    @Override
    public void update(Sensor sensor) {
        if (sensor.isEquipmentActive()) {
            System.out.println("BookingSystem: Equipment started. Updating reservation status.");
        } else {
            System.out.println("BookingSystem: Equipment stopped. Updating reservation status.");
        }

        // Example logic: update reservations based on sensor activity
        for (Reservation r : reservations) {
            r.updateStatus(sensor.isEquipmentActive());
        }

    }
}
