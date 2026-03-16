public class EquipmentFactory {
    public Equipment createEquipment(String equipmentType, String name, String description, String location) {
        
        if (equipmentType.equalsIgnoreCase("Microscope")) {
            return new Microscope(name, description, location);
        } else if (equipmentType.equalsIgnoreCase("Arduino")) {
            return new Arduino(name, description, location);
        } else if (equipmentType.equalsIgnoreCase("Circuit Board")) {
            return new CircuitBoard(name, description, location);
        }
        return null;
    }
}