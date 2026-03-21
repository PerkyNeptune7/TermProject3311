import java.time.LocalDateTime;


/* =========================================================
* Req4 - Reservation Deposit State Pattern
* =========================================================
*/

public interface DepositState {
    void payDeposit(ReservationforStatePattern reservation);
    void arrive(ReservationforStatePattern reservation, LocalDateTime arrivalTime);
    double calculateFinalPayment(ReservationforStatePattern reservation, double totalCost);
    String getStateName();
}
