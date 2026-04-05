package test.AI_assistant;

import app.*;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EquipmentFactoryAITest {

    @Test
    public void createArduino_InitializeFieldsCorrectly() {
        EquipmentFactory factory = new EquipmentFactory();

        Equipment eq = factory.createEquipment(
                "Arduino",
                "Arduino Uno",
                "Microcontroller board",
                "Lab B"
        );

        assertNotNull(eq);
        assertEquals("Arduino Uno", eq.getName());
        assertEquals("Microcontroller board", eq.getDescription());
        assertEquals("Lab B", eq.getLocation());
        assertEquals(EquipmentStatus.AVAILABLE, eq.getStatus());
    }

    @Test
    public void createMicroscope_shouldReturnMicroscopeInstance() {
        EquipmentFactory factory = new EquipmentFactory();

        Equipment eq = factory.createEquipment(
                "Microscope",
                "Scope",
                "Desc",
                "Lab A"
        );

        assertTrue(eq instanceof Microscope);
    }

    @Test
    public void createArduino_shouldReturnArduinoInstance() {
        EquipmentFactory factory = new EquipmentFactory();

        Equipment eq = factory.createEquipment(
                "Arduino",
                "Uno",
                "Desc",
                "Lab B"
        );

        assertTrue(eq instanceof Arduino);
    }

    @Test
    public void createEquipment_shouldIgnoreCase() {
        EquipmentFactory factory = new EquipmentFactory();

        Equipment eq = factory.createEquipment(
                "mIcRoScOpE",
                "Case Test",
                "Desc",
                "Lab C"
        );

        assertTrue(eq instanceof Microscope);
    }
    @Test(expected = IllegalArgumentException.class)
    public void createEquipment_invalidType_shouldThrowException() {
        EquipmentFactory factory = new EquipmentFactory();

        factory.createEquipment(
                "Laptop",
                "Dell",
                "Invalid",
                "Lab D"
        );
    }
    @Test(expected = IllegalArgumentException.class)
    public void createEquipment_emptyType_shouldThrowException() {
        EquipmentFactory factory = new EquipmentFactory();

        factory.createEquipment(
                "",
                "Empty",
                "Desc",
                "Lab E"
        );
    }
    @Test(expected = NullPointerException.class)
    public void createEquipment_nullType_shouldThrowException() {
        EquipmentFactory factory = new EquipmentFactory();

        factory.createEquipment(
                null,
                "Null",
                "Desc",
                "Lab F"
        );
    }
    @Test
    public void createEquipment_shouldGenerateEquipmentId() {
        EquipmentFactory factory = new EquipmentFactory();

        Equipment eq = factory.createEquipment(
                "Arduino",
                "Uno",
                "Desc",
                "Lab G"
        );

        assertNotNull(eq.getEquipmentId());
        assertTrue(eq.getEquipmentId().startsWith("EQ-"));
    }
}
