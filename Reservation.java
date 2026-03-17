import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ReservationStatus status;

    public Reservation(String reservationId, LocalDateTime startTime, LocalDateTime endTime, ReservationStatus status) {
        this.reservationId = reservationId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public String getReservationId() {
        return reservationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean extendReservation(LocalDateTime newEndTime) {
        if (newEndTime == null) {
            return false;
        }

        if (newEndTime.isAfter(endTime)) {
            endTime = newEndTime;
            return true;
        }

        return false;
    }

    public void cancelReservation() {
        status = ReservationStatus.CANCELLED;
    }
}