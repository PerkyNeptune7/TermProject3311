import java.time.LocalDateTime;

class DepositAppliedState implements DepositState {
    

   @Override
   public void payDeposit(ReservationforStatePattern reservation) {
       System.out.println("Deposit has already been handled.");
   }


   @Override
   public void arrive(ReservationforStatePattern reservation, LocalDateTime arrivalTime) {
       System.out.println("User has already checked in.");
   }


   @Override
   public double calculateFinalPayment(ReservationforStatePattern reservation, double totalCost) {
       return totalCost - reservation.getDepositAmount();
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_APPLIED";
   }
}
