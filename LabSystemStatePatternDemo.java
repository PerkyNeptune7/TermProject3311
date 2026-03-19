import java.time.LocalDateTime;
import java.time.Duration;

public class LabSystemStatePatternDemo {


   public static void main(String[] args) {
       // =========================
       // Req6 demo: Equipment state
       // =========================
       //EquipmentForStatePattern microscope = new EquipmentForStatePattern("EQ-101", "Digital Microscope", "Lab A");

       DemoEquipment microscope = new DemoEquipment("EQ-101", "Digital Microscope", "Lab A");
 


       microscope.reserve();              // should work
       microscope.disable();              // should fail because it's reserved
       microscope.release();             // should work, back to available
       microscope.disable();             // now works
       microscope.reserve();             // should fail because disabled
       microscope.enable();              // back to available
       microscope.markMaintenance();     // move to maintenance
       microscope.reserve();             // should fail because under maintenance
       microscope.finishMaintenance();   // back to available


       System.out.println("\n=========================\n");


       // =========================
       // Req4 demo: Deposit state
       // =========================

       //ReservationforStatePattern reservation = new ReservationforStatePattern("RES-001", 10.0, LocalDateTime.now());

       DemoReservation reservation = new DemoReservation("RES-001", 10.0, LocalDateTime.now());
 


       reservation.payDeposit();
       reservation.arrive(reservation.getStartTime().plusMinutes(10));  // on time
       System.out.println("Final amount due: $" + reservation.calculateFinalPayment(30.0));


       System.out.println("\n-------------------------\n");


 
      // ReservationforStatePattern reservation2 = new ReservationforStatePattern("RES-002", 10.0, LocalDateTime.now());

       DemoReservation reservation2 = new DemoReservation("RES-002", 10.0, LocalDateTime.now());
 


       reservation2.payDeposit();
       reservation2.arrive(reservation2.getStartTime().plusMinutes(25)); // late
       System.out.println("Final amount due: $" + reservation2.calculateFinalPayment(30.0));
   }
}



/* =========================================================
* Req6 - Equipment State Pattern
* =========================================================
*/


interface EquipmentState {
   void reserve(DemoEquipment equipment);
   void release(DemoEquipment equipment);
   void enable(DemoEquipment equipment);
   void disable(DemoEquipment equipment);
   void markMaintenance(DemoEquipment equipment);
   void finishMaintenance(DemoEquipment equipment);
   String getStateName();
}


class DemoEquipment {
   private String id;
   private String description;
   private String location;
   private EquipmentState state;


   public DemoEquipment(String id, String description, String location) {
       this.id = id;
       this.description = description;
       this.location = location;
       this.state = new AvailableState();
   }


   public void setState(EquipmentState state) {
       this.state = state;
       System.out.println("Equipment " + id + " changed to state: " + state.getStateName());
   }


   public void reserve() {
       state.reserve(this);
   }


   public void release() {
       state.release(this);
   }


   public void enable() {
       state.enable(this);
   }


   public void disable() {
       state.disable(this);
   }


   public void markMaintenance() {
       state.markMaintenance(this);
   }


   public void finishMaintenance() {
       state.finishMaintenance(this);
   }


   public String getId() {
       return id;
   }


   public String getDescription() {
       return description;
   }


   public String getLocation() {
       return location;
   }
}


class AvailableState implements EquipmentState {


   @Override
   public void reserve(DemoEquipment equipment) {
       System.out.println("Equipment reserved successfully.");
       equipment.setState(new ReservedEquipmentState());
   }


   @Override
   public void release(DemoEquipment equipment) {
       System.out.println("Equipment is already free.");
   }


   @Override
   public void enable(DemoEquipment equipment) {
       System.out.println("Equipment is already enabled.");
   }


   @Override
   public void disable(DemoEquipment equipment) {
       equipment.setState(new DisabledState());
   }


   @Override
   public void markMaintenance(DemoEquipment equipment) {
       equipment.setState(new MaintenanceState());
   }


   @Override
   public void finishMaintenance(DemoEquipment equipment) {
       System.out.println("Equipment is not under maintenance.");
   }


   @Override
   public String getStateName() {
       return "AVAILABLE";
   }
}


class ReservedEquipmentState implements EquipmentState {


   @Override
   public void reserve(DemoEquipment equipment) {
       System.out.println("Equipment is already reserved.");
   }


   @Override
   public void release(DemoEquipment equipment) {
       System.out.println("Equipment reservation finished.");
       equipment.setState(new AvailableState());
   }


   @Override
   public void enable(DemoEquipment equipment) {
       System.out.println("Equipment is already enabled.");
   }


   @Override
   public void disable(DemoEquipment equipment) {
       System.out.println("Cannot disable equipment while it is reserved.");
   }


   @Override
   public void markMaintenance(DemoEquipment equipment) {
       System.out.println("Cannot move reserved equipment to maintenance.");
   }


   @Override
   public void finishMaintenance(DemoEquipment equipment) {
       System.out.println("Equipment is not under maintenance.");
   }


   @Override
   public String getStateName() {
       return "RESERVED";
   }
}


class DisabledState implements EquipmentState {


   @Override
   public void reserve(DemoEquipment equipment) {
       System.out.println("Cannot reserve equipment because it is disabled.");
   }


   @Override
   public void release(DemoEquipment equipment) {
       System.out.println("Disabled equipment is not currently reserved.");
   }


   @Override
   public void enable(DemoEquipment equipment) {
       equipment.setState(new AvailableState());
   }


   @Override
   public void disable(DemoEquipment equipment) {
       System.out.println("Equipment is already disabled.");
   }


   @Override
   public void markMaintenance(DemoEquipment equipment) {
       System.out.println("Disabled equipment cannot be moved to maintenance unless enabled first.");
   }


   @Override
   public void finishMaintenance(DemoEquipment equipment) {
       System.out.println("Equipment is not under maintenance.");
   }


   @Override
   public String getStateName() {
       return "DISABLED";
   }
}


class MaintenanceState implements EquipmentState {


   @Override
   public void reserve(DemoEquipment equipment) {
       System.out.println("Cannot reserve equipment because it is under maintenance.");
   }


   @Override
   public void release(DemoEquipment equipment) {
       System.out.println("Equipment under maintenance is not reserved.");
   }


   @Override
   public void enable(DemoEquipment equipment) {
       System.out.println("Finish maintenance first.");
   }


   @Override
   public void disable(DemoEquipment equipment) {
       equipment.setState(new DisabledState());
   }


   @Override
   public void markMaintenance(DemoEquipment equipment) {
       System.out.println("Equipment is already under maintenance.");
   }


   @Override
   public void finishMaintenance(DemoEquipment equipment) {
       equipment.setState(new AvailableState());
   }


   @Override
   public String getStateName() {
       return "MAINTENANCE";
   }
}


/* =========================================================
* Req4 - Reservation Deposit State Pattern
* =========================================================
*/


interface DepositState {
   void payDeposit(DemoReservation reservation);
   void arrive(DemoReservation reservation, LocalDateTime arrivalTime);
   double calculateFinalPayment(DemoReservation reservation, double totalCost);
   String getStateName();
}


class DemoReservation {
   private String reservationId;
   private double depositAmount;
   private LocalDateTime startTime;
   private DepositState depositState;


   public DemoReservation(String reservationId, double depositAmount, LocalDateTime startTime) {
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


class DepositPendingState implements DepositState {


   @Override
   public void payDeposit(DemoReservation reservation) {
       System.out.println("Deposit of $" + reservation.getDepositAmount() + " paid successfully.");
       reservation.setDepositState(new DepositPaidState());
   }


   @Override
   public void arrive(DemoReservation reservation, LocalDateTime arrivalTime) {
       System.out.println("User cannot check in before paying deposit.");
   }


   @Override
   public double calculateFinalPayment(DemoReservation reservation, double totalCost) {
       return totalCost;
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_PENDING";
   }
}


class DepositPaidState implements DepositState {


   @Override
   public void payDeposit(DemoReservation reservation) {
       System.out.println("Deposit has already been paid.");
   }


   @Override
   public void arrive(DemoReservation reservation, LocalDateTime arrivalTime) {
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
   public double calculateFinalPayment(DemoReservation reservation, double totalCost) {
       return totalCost;
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_PAID";
   }
}


class DepositAppliedState implements DepositState {


   @Override
   public void payDeposit(DemoReservation reservation) {
       System.out.println("Deposit has already been handled.");
   }


   @Override
   public void arrive(DemoReservation reservation, LocalDateTime arrivalTime) {
       System.out.println("User has already checked in.");
   }


   @Override
   public double calculateFinalPayment(DemoReservation reservation, double totalCost) {
       return totalCost - reservation.getDepositAmount();
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_APPLIED";
   }
}


class DepositForfeitedState implements DepositState {


   @Override
   public void payDeposit(DemoReservation reservation) {
       System.out.println("Deposit has already been forfeited.");
   }


   @Override
   public void arrive(DemoReservation reservation, LocalDateTime arrivalTime) {
       System.out.println("Reservation already marked as late/no-show.");
   }


   @Override
   public double calculateFinalPayment(DemoReservation reservation, double totalCost) {
       return totalCost;
   }


   @Override
   public String getStateName() {
       return "DEPOSIT_FORFEITED";
   }
}


