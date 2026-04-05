package test.AI_assistant;

import app.Equipment;
import app.EquipmentStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentAiTest {

    @Test
    void constructorSetsNameCorrectly() {
        Equipment equipment = new Equipment("Projector", "HD projector", "Room 101");

        Assertions.assertEquals("Projector", equipment.getName());
    }

    @Test
    void constructorSetsDescriptionCorrectly() {
        Equipment equipment = new Equipment("Laptop", "Dell laptop", "Lab A");

        Assertions.assertEquals("Dell laptop", equipment.getDescription());
    }

    @Test
    void constructorSetsLocationCorrectly() {
        Equipment equipment = new Equipment("Camera", "4K camera", "Storage Room");

        Assertions.assertEquals("Storage Room", equipment.getLocation());
    }

    @Test
    void constructorSetsDefaultStatusToAvailable() {
        Equipment equipment = new Equipment("Microphone", "Wireless microphone", "Room 202");

        Assertions.assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
    }

    @Test
    void equipmentIdIsGeneratedAndStartsWithEqPrefix() {
        Equipment equipment = new Equipment("Speaker", "Bluetooth speaker", "Auditorium");

        assertNotNull(equipment.getEquipmentId());
        Assertions.assertTrue(equipment.getEquipmentId().startsWith("EQ-"));
    }

    @Test
    void generatedEquipmentIdsAreUnique() {
        Equipment equipment1 = new Equipment("Monitor", "24 inch monitor", "Lab 1");
        Equipment equipment2 = new Equipment("Keyboard", "Mechanical keyboard", "Lab 2");

        Assertions.assertNotEquals(equipment1.getEquipmentId(), equipment2.getEquipmentId());
    }

    @Test
    void setStatusChangesStatusToUnavailable() {
        Equipment equipment = new Equipment("Tablet", "Android tablet", "Room 303");

        equipment.setStatus(EquipmentStatus.UNAVAILABLE);

        Assertions.assertEquals(EquipmentStatus.UNAVAILABLE, equipment.getStatus());
    }

    @Test
    void isAvailableReturnsTrueWhenStatusIsAvailable() {
        Equipment equipment = new Equipment("Printer", "Color printer", "Office");
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 3, 11, 0);

        boolean result = equipment.isAvailable(start, end);

        assertTrue(result);
    }

    @Test
    void isAvailableReturnsFalseWhenStatusIsMaintenance() {
        Equipment equipment = new Equipment("Scanner", "High speed scanner", "Office");
        equipment.setStatus(EquipmentStatus.MAINTENANCE);
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 12, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 3, 13, 0);

        boolean result = equipment.isAvailable(start, end);

        assertFalse(result);
    }

    @Test
    void toStringContainsAllImportantFields() {
        Equipment equipment = new Equipment("Whiteboard", "Large whiteboard", "Room 404");

        String result = equipment.toString();

        assertTrue(result.contains("Equipment ID: " + equipment.getEquipmentId()));
        assertTrue(result.contains("Name: Whiteboard"));
        assertTrue(result.contains("Description: Large whiteboard"));
        assertTrue(result.contains("Location: Room 404"));
        assertTrue(result.contains("Status: AVAILABLE"));
    }
}