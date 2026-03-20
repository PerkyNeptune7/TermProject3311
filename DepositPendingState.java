import java.time.LocalDateTime;

class DepositPendingState implements DepositState {
    
   @Override
   public void payDeposit(ReservationforStatePattern reservation) {
       System.out.println("Deposit of $" + reservation.getDepositAmount() + " paid successfully.");
       reservation.setDepositState(new DepositPaidState());
   }


   @Override
   public void arrive(ReservationforStatePattern reservation, LocalDateTime arrivalTime) {
       System.out.println("User cannot check in before paying deposit.");
   }


   @Override
   public double calculateFinalPayment(ReservationforStatePattern reservation, double totalCost) {
       return totalCost;
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_PENDING";
   }
}
