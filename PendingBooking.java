public class PendingBooking {
    private final String bookingId;
    private final String equipmentId;
    private final String equipmentDescription;
    private final String bookedByUserId;
    private final String bookedByRegistrationId;
    private final double hourlyRate;
    private BookingStatus status;
    private int secondsRemaining;
    private boolean lateArrival;
    private boolean paymentCompleted;

    public PendingBooking(
            String bookingId,
            String equipmentId,
            String equipmentDescription,
            String bookedByUserId,
            String bookedByRegistrationId,
            double hourlyRate,
            BookingStatus status,
            int secondsRemaining
    ) {
        this.bookingId = bookingId;
        this.equipmentId = equipmentId;
        this.equipmentDescription = equipmentDescription;
        this.bookedByUserId = bookedByUserId;
        this.bookedByRegistrationId = bookedByRegistrationId;
        this.hourlyRate = hourlyRate;
        this.status = status;
        this.secondsRemaining = secondsRemaining;
        this.lateArrival = false;
        this.paymentCompleted = false;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getEquipmentDescription() {
        return equipmentDescription;
    }

    public String getBookedByUserId() {
        return bookedByUserId;
    }

    public String getBookedByRegistrationId() {
        return bookedByRegistrationId;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public int getSecondsRemaining() {
        return secondsRemaining;
    }

    public void setSecondsRemaining(int secondsRemaining) {
        this.secondsRemaining = Math.max(secondsRemaining, 0);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean isLateArrival() {
        return lateArrival;
    }

    public void setLateArrival(boolean lateArrival) {
        this.lateArrival = lateArrival;
    }

    public boolean isPaymentCompleted() {
        return paymentCompleted;
    }

    public void setPaymentCompleted(boolean paymentCompleted) {
        this.paymentCompleted = paymentCompleted;
    }

    public double getPaymentDue() {
        if (paymentCompleted) {
            return 0.0;
        }
        if (status == BookingStatus.RESERVED) {
            return hourlyRate;
        }
        return 0.0;
    }
}
