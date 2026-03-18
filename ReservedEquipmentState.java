class ReservedEquipmentState implements EquipmentState {
   @Override
   public void reserve(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is already reserved.");
   }


   @Override
   public void release(EquipmentForStatePattern equipment) {
       System.out.println("Equipment reservation finished.");
       equipment.setState(new AvailableState());
   }


   @Override
   public void enable(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is already enabled.");
   }


   @Override
   public void disable(EquipmentForStatePattern equipment) {
       System.out.println("Cannot disable equipment while it is reserved.");
   }


   @Override
   public void markMaintenance(EquipmentForStatePattern equipment) {
       System.out.println("Cannot move reserved equipment to maintenance.");
   }


   @Override
   public void finishMaintenance(EquipmentForStatePattern equipment) {
       System.out.println("Equipment is not under maintenance.");
   }


   @Override
   public String getStateName() {
       return "RESERVED";
   }

}