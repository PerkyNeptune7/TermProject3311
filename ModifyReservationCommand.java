import java.time.LocalDateTime;

public class ModifyReservationCommand implements Command {
    private Equipment equipment;
    private Reservation reservation;
    private LocalDateTime newStartTime;
    private LocalDateTime newEndTime;

    public ModifyReservationCommand(Equipment equipment, Reservation reservation, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        this.equipment = equipment;
        this.reservation = reservation;
        this.newStartTime = newStartTime;
        this.newEndTime = newEndTime;
    }

    @Override
    public boolean execute() {
        if (equipment == null || reservation == null || newStartTime == null || newEndTime == null) {
            return false;
        }

        if (reservation.getStatus() == ReservationStatus.CANCELLED) {
            return false;
        }

        if (!newEndTime.isAfter(newStartTime)) {
            return false;
        }

        if (!equipment.isAvailable(newStartTime, newEndTime)) {
            return false;
        }

        reservation.setStartTime(newStartTime);
        reservation.setEndTime(newEndTime);
        return true;
    }
}