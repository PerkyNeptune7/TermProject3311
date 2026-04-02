class MaintenanceState implements EquipmentState {

   @Override
   public void reserve(EquipmentForStatePattern equipment) {
       System.out.println("Cannot reserve equipment because it is under maintenance.");
   }


   @Override
   public void release(EquipmentForStatePattern equipment) {
       System.out.println("Equipment under maintenance is not reserved.");
   }


   @Override
   public void enable(EquipmentForStatePattern equipment) {
       System.out.println("Finish maintenance first.");
   }


   @Override
   public void disable(EquipmentForStatePattern equipment) {
       equipment.setState(new DisabledState());
   }


   @Override
   public void markMaintenance(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is already under maintenance.");
   }


   @Override
   public void finishMaintenance(EquipmentForStatePattern equipment) {
       equipment.setState(new AvailableState());
   }


   @Override
   public String getStateName() {
       return "MAINTENANCE";
   }    
}
