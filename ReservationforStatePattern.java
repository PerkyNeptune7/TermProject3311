import java.time.LocalDateTime;

public class ReservationforStatePattern {
    private String reservationId;
    private double depositAmount;
    private LocalDateTime startTime;
    private DepositState depositState;


   public ReservationforStatePattern(String reservationId, double depositAmount, LocalDateTime startTime) {
       this.reservationId = reservationId;
       this.depositAmount = depositAmount;
       this.startTime = startTime;
       this.depositState = new DepositPendingState();
   }


   public void setDepositState(DepositState depositState) {
       this.depositState = depositState;
       System.out.println("Reservation " + reservationId + " deposit state changed to: " + depositState.getStateName());
   }


   public void payDeposit() {
       depositState.payDeposit(this);
   }


   public void arrive(LocalDateTime arrivalTime) {
       depositState.arrive(this, arrivalTime);
   }


   public double calculateFinalPayment(double totalCost) {
       return depositState.calculateFinalPayment(this, totalCost);
   }


   public String getReservationId() {
       return reservationId;
   }


   public double getDepositAmount() {
       return depositAmount;
   }


   public LocalDateTime getStartTime() {
       return startTime;
   }
}
