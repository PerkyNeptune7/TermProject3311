public class PendingPickupState implements EquipmentState {
    @Override
    public void reserve(EquipmentForStatePattern equipment) {
        System.out.println("Equipment is already pending pickup.");
    }

    @Override
    public void release(EquipmentForStatePattern equipment) {
        System.out.println("Pending pickup expired or was cleared.");
        equipment.setState(new AvailableState());
    }

    @Override
    public void enable(EquipmentForStatePattern equipment) {
        System.out.println("Equipment is already enabled.");
    }

    @Override
    public void disable(EquipmentForStatePattern equipment) {
        System.out.println("Cannot disable equipment while it is pending pickup.");
    }

    @Override
    public void markMaintenance(EquipmentForStatePattern equipment) {
        System.out.println("Cannot move equipment to maintenance while pickup is pending.");
    }

    @Override
    public void finishMaintenance(EquipmentForStatePattern equipment) {
        System.out.println("Equipment is not under maintenance.");
    }

    @Override
    public String getStateName() {
        return "PENDING_PICKUP";
    }
}
