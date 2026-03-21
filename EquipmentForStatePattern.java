public class EquipmentForStatePattern {
       private String id;
   private String description;
   private String location;
   private EquipmentState state;


   public EquipmentForStatePattern(String id, String description, String location) {
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

   public void markPendingPickup() {
       setState(new PendingPickupState());
   }

   public void confirmReservation() {
       setState(new ReservedEquipmentState());
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

   public String getStateName() {
       return state.getStateName();
   }

   public boolean isAvailable() {
       return "AVAILABLE".equals(state.getStateName());
   }
}
