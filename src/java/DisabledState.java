public class DisabledState implements EquipmentState  {
    

   @Override
   public void reserve(EquipmentForStatePattern equipment) {
       System.out.println("Cannot reserve equipment because it is disabled.");
   }


   @Override
   public void release(EquipmentForStatePattern equipment) {
       System.out.println("Disabled equipment is not currently reserved.");
   }


   @Override
   public void enable(EquipmentForStatePattern equipment) {
       equipment.setState(new AvailableState());
   }


   @Override
   public void disable(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is already disabled.");
   }


   @Override
   public void markMaintenance(EquipmentForStatePattern equipment) {
       System.out.println("Disabled equipment cannot be moved to maintenance unless enabled first.");
   }


   @Override
   public void finishMaintenance(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is not under maintenance.");
   }


   @Override
   public String getStateName() {
       return "DISABLED";
   }
}
