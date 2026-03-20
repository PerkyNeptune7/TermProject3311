public class CancelReservationCommand implements Command {
    private Reservation reservation;

    public CancelReservationCommand(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public boolean execute() {
        if (reservation == null) {
            return false;
        }

        if (reservation.getStatus() == ReservationStatus.CANCELLED) {
            return false;
        }

        reservation.cancelReservation();
        return true;
    }
}