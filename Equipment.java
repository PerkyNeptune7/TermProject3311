import java.time.LocalDateTime;

public class Equipment {
    private static int counter = 1;

    private String equipmentId;
    private String name;
    private String description;
    private String location;
    private EquipmentStatus status;

    public Equipment(String name, String description, String location) {
        this.equipmentId = "EQ-" + counter++;
        this.name = name;
        this.description = description;
        this.location = location;
        this.status = EquipmentStatus.AVAILABLE;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
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

    @Override
    public String toString() {
        return "Equipment ID: " + equipmentId +
               ", Name: " + name +
               ", Description: " + description +
               ", Location: " + location +
               ", Status: " + status;
    }
}