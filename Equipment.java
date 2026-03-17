import java.time.LocalDateTime;

public class Equipment {
    private String equipmentId;
    private EquipmentStatus status;

    public Equipment(String equipmentId, EquipmentStatus status) {
        this.equipmentId = equipmentId;
        this.status = status;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public EquipmentStatus getStatus() {
        return status;
    }

    public void setStatus(EquipmentStatus status) {
        this.status = status;
    }

    public boolean isAvailable(LocalDateTime start, LocalDateTime end) {
        return status == EquipmentStatus.AVAILABLE;
    }
}