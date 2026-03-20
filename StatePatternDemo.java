import java.time.LocalDateTime;

public class StatePatternDemo {


   public static void main(String[] args) {
       // =========================
       // Req6 demo: Equipment state
       // =========================
       //EquipmentForStatePattern microscope = new EquipmentForStatePattern("EQ-101", "Digital Microscope", "Lab A");

       EquipmentForStatePattern microscope = new EquipmentForStatePattern("EQ-101", "Digital Microscope", "Lab A");
 


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

       ReservationforStatePattern reservation = new ReservationforStatePattern("RES-001", 10.0, LocalDateTime.now());
 


       reservation.payDeposit();
       reservation.arrive(reservation.getStartTime().plusMinutes(10));  // on time
       System.out.println("Final amount due: $" + reservation.calculateFinalPayment(30.0));


       System.out.println("\n-------------------------\n");


 
      // ReservationforStatePattern reservation2 = new ReservationforStatePattern("RES-002", 10.0, LocalDateTime.now());

       ReservationforStatePattern reservation2 = new ReservationforStatePattern("RES-002", 10.0, LocalDateTime.now());
 


       reservation2.payDeposit();
       reservation2.arrive(reservation2.getStartTime().plusMinutes(25)); // late
       System.out.println("Final amount due: $" + reservation2.calculateFinalPayment(30.0));
   }
}


