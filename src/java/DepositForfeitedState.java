import java.time.LocalDateTime;

class DepositForfeitedState implements DepositState {
    

   @Override
   public void payDeposit(ReservationforStatePattern reservation) {
       System.out.println("Deposit has already been forfeited.");
   }


   @Override
   public void arrive(ReservationforStatePattern reservation, LocalDateTime arrivalTime) {
       System.out.println("Reservation already marked as late/no-show.");
   }


   @Override
   public double calculateFinalPayment(ReservationforStatePattern reservation, double totalCost) {
       return totalCost;
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_FORFEITED";
   }
}
