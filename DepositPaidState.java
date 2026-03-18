import java.time.LocalDateTime;
import java.time.Duration;

class DepositPaidState implements DepositState {
 
   @Override
   public void payDeposit(ReservationforStatePattern reservation) {
       System.out.println("Deposit has already been paid.");
   }


   @Override
   public void arrive(ReservationforStatePattern reservation, LocalDateTime arrivalTime) {
       long lateMinutes = Duration.between(reservation.getStartTime(), arrivalTime).toMinutes();


       if (lateMinutes <= 20) {
           System.out.println("User arrived on time. Deposit will be deducted from total.");
           reservation.setDepositState(new DepositAppliedState());
       } else {
           System.out.println("User arrived after 20 minutes. Deposit is forfeited.");
           reservation.setDepositState(new DepositForfeitedState());
       }
   }


   @Override
   public double calculateFinalPayment(ReservationforStatePattern reservation, double totalCost) {
       return totalCost;
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_PAID";
   }
    
}
