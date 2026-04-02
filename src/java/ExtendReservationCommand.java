import java.time.LocalDateTime;

public class ExtendReservationCommand implements Command {
    private Equipment equipment;
    private Reservation reservation;
    private LocalDateTime newEndTime;

    public ExtendReservationCommand(Equipment equipment, Reservation reservation, LocalDateTime newEndTime) {
        this.equipment = equipment;
        this.reservation = reservation;
        this.newEndTime = newEndTime;
    }

    @Override
    public boolean execute() {
        if (equipment == null || reservation == null || newEndTime == null) {
            return false;
        }

        if (reservation.getStatus() == ReservationStatus.CANCELLED) {
            return false;
        }

        if (!equipment.isAvailable(reservation.getStartTime(), newEndTime)) {
            return false;
        }

        return reservation.extendReservation(newEndTime);
    }
}