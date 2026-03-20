public class AvailableState implements EquipmentState {
    
   @Override
   public void reserve(EquipmentForStatePattern equipment) {
       System.out.println("Equipment reserved successfully.");
       equipment.setState(new ReservedEquipmentState());
   }


   @Override
   public void release(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is already free.");
   }


   @Override
   public void enable(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is already enabled.");
   }


   @Override
   public void disable(EquipmentForStatePattern equipment) {
       equipment.setState(new DisabledState());
   }


   @Override
   public void markMaintenance(EquipmentForStatePattern equipment) {
       equipment.setState(new MaintenanceState());
   }


   @Override
   public void finishMaintenance(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is not under maintenance.");
   }


   @Override
   public String getStateName() {
       return "AVAILABLE";
   }
}
