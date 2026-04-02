import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class EquipmentTest {

    private Equipment createEquipment() {
        return new Equipment("Arduino", "Lab Arduino", "Room 101");
    }

    @Test
    public void testConstructorSetsName() {
        Equipment equipment = createEquipment();
        assertEquals("Arduino", equipment.getName());
    }

    @Test
    public void testConstructorDescription() {
        Equipment equipment = createEquipment();
        assertEquals("Lab Arduino", equipment.getDescription());
    }

    @Test
    public void testConstructorLocation() {
        Equipment equipment = createEquipment();
        assertEquals("Room 101", equipment.getLocation());
    }

    @Test
    public void testConstructorStatusAvailable() {
        Equipment equipment = createEquipment();
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
    }

    @Test
    public void testEquipmentIdIsNotNull() {
        Equipment equipment = createEquipment();
        assertNotNull(equipment.getEquipmentId());
    }

    @Test
    public void testEquipmentIdStartsWithAR() {
        Equipment equipment = createEquipment();
        assertTrue(equipment.getEquipmentId().startsWith("EQ-"));
    }

    @Test
    public void testUpdatesStatus() {
        Equipment equipment = createEquipment();

        equipment.setStatus(EquipmentStatus.UNAVAILABLE);

        assertEquals(EquipmentStatus.UNAVAILABLE, equipment.getStatus());
    }

    @Test
    public void testStatusIsAvailable() {
        Equipment equipment = createEquipment();

        boolean result = equipment.isAvailable(
                LocalDateTime.of(2026, 3, 28, 10, 0),
                LocalDateTime.of(2026, 3, 28, 12, 0)
        );

        assertTrue(result);
    }

    @Test
    public void testStatusIsUnavailable() {
        Equipment equipment = createEquipment();
        equipment.setStatus(EquipmentStatus.UNAVAILABLE);

        boolean result = equipment.isAvailable(
                LocalDateTime.of(2026, 3, 28, 10, 0),
                LocalDateTime.of(2026, 3, 28, 12, 0)
        );

        assertFalse(result);
    }

    @Test
    public void testToStringContainsName() {
        Equipment equipment = createEquipment();
        assertTrue(equipment.toString().contains("Arduino"));
    }
}