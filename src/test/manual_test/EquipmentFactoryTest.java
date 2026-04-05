package test.manual_test;

import static org.junit.Assert.*;

import app.*;
import org.junit.Test;

public class EquipmentFactoryTest {
    //Human tests
    @Test
    public void  createMicroscope_shouldInitializeFieldsCorrectly(){
        EquipmentFactory factory = new EquipmentFactory();
        Equipment eq = factory.createEquipment(
                "Microscope",
                "Optical Microscope",
                "Used for viewing small objects",
                "Lab A" );
        assertNotNull(eq);
        assertEquals("Optical Microscope", eq.getName());
        assertEquals("Used for viewing small objects", eq.getDescription());
        assertEquals("Lab A", eq.getLocation());
        assertEquals(EquipmentStatus.AVAILABLE, eq.getStatus());
    }
    @Test
    public void  createArduino_shouldInitializeFieldsCorrectly(){
        EquipmentFactory factory = new EquipmentFactory();
        Equipment eq = factory.createEquipment(
                "Arduino",
                "Arduino Uno",
                "Microcontroller board for prototyping",
                "Lab B" );
        assertNotNull(eq);
        assertEquals("Arduino Uno", eq.getName());
        assertEquals("Microcontroller board for prototyping", eq.getDescription());
        assertEquals("Lab B", eq.getLocation());
        assertEquals(EquipmentStatus.AVAILABLE, eq.getStatus());
    }
    @Test
    public void  createArduino2_shouldInitializeFieldsCorrectly(){
        EquipmentFactory factory = new EquipmentFactory();
        Equipment eq = factory.createEquipment(
                "Arduino",
                "Arduino Micro",
                "Microcontroller board for prototyping",
                "Lab C" );
        assertNotNull(eq);
        assertEquals("Arduino Micro", eq.getName());
        assertEquals("Microcontroller board for prototyping", eq.getDescription());
        assertEquals("Lab C", eq.getLocation());
        assertEquals(EquipmentStatus.AVAILABLE, eq.getStatus());
    }

    @Test
    public void invalidEquipmentType_shouldThrowException() {
        EquipmentFactory factory = new EquipmentFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.createEquipment(
                    "Unknown",
                    "Test",
                    "Invalid",
                    "Nowhere"
            );
        });
    }

    @Test
    public void partialyinvalidEquipmentType_shouldThrowException(){
        EquipmentFactory factory = new EquipmentFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.createEquipment(
                    "Computer Mouse",
                    "Cheddar",
                    "A mouse you can plug into your computer",
                    "Lab 2"
            );
        });
    }
}
