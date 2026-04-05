package test.manual_test;


import static org.junit.jupiter.api.Assertions.*;

import app.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ObserverManualTest {

    private Sensor sensor;
    private UsageLogger logger;
    private BookingSystem bookingSystem;
    private ReservationManager manager;

    @BeforeEach
    void setup() {
        // Doing this here so I don't have to type it 10 times
        sensor = new Sensor("SENSOR-69");
        logger = new UsageLogger();
        bookingSystem = new BookingSystem();
        manager = new ReservationManager();
    }

    // 1. Check if the sensor actually has the right ID
    @Test
    void testSensorId() {
        assertEquals("SENSOR-69", sensor.getSensorId());
    }

    // 2. Check if the logger actually gets a message when we start
    @Test
    void testLoggerReceivesStart() {
        sensor.attach(logger);
        sensor.startEquipment();
        assertEquals(1, logger.getLogs().size());
    }

    // 3. Make sure the logger sees the "STOP" too
    @Test
    void testLoggerReceivesStop() {
        sensor.attach(logger);
        sensor.startEquipment();
        sensor.stopEquipment();
        assertEquals(2, logger.getLogs().size());
    }

    // 4. Test if detach actually works (so it stops annoying the logger)
    @Test
    void testDetachWorks() {
        sensor.attach(logger);
        sensor.detach(logger);
        sensor.startEquipment();
        assertEquals(0, logger.getLogs().size());
    }

    // 5. Does the BookingSystem keep the reservation we gave it?
    @Test
    void testBookingSystemStoresReservation() {
        Reservation res = new Reservation("RES-001", null, null, null);
        bookingSystem.addReservation(res);
        assertEquals(1, bookingSystem.getReservations().size());
    }

    // 6. Test if the sensor is actually "active" when we start it
    @Test
    void testSensorState() {
        sensor.startEquipment();
        assertTrue(sensor.isEquipmentActive());
    }

    // 7. Test if the sensor turns off correctly
    @Test
    void testSensorTurnsOff() {
        sensor.startEquipment();
        sensor.stopEquipment();
        assertFalse(sensor.isEquipmentActive());
    }

    // 8. What if we add the same observer twice? (The "Please don't break" test)
    @Test
    void testNoDuplicateObservers() {
        sensor.attach(logger);
        sensor.attach(logger);
        sensor.startEquipment();
        // If our Sensor code is good, it should only notify once
        assertEquals(1, logger.getLogs().size());
    }

    // 9. Check if multiple things can listen to the sensor at once
    @Test
    void testMultipleObservers() {
        sensor.attach(logger);
        sensor.attach(bookingSystem);
        sensor.startEquipment();
        assertEquals(1, logger.getLogs().size());
        // BookingSystem doesn't have a count, but it shouldn't crash!
    }

    // 10. Test if ReservationManager is also holding onto its data
    @Test
    void testManagerStoresData() {
        Reservation res = new Reservation("RES-999", null, null, null);
        manager.addReservation(res);
        assertEquals(1, manager.getReservations().size());
    }
    // 11. FAIL TEST: What if someone attaches 'null'?
    @Test
    void testAttachNull() {
        sensor.attach(null);

        assertThrows(NullPointerException.class, () -> {
            sensor.startEquipment();
        }, "The Sensor currently crashes if a null observer is attached.");
    }

    // 12. FAIL TEST: The "Ghost" Reservation
    @Test
    void testBookingSystemUpdateWithoutReservations() {
        BookingSystem bs = new BookingSystem();
        sensor.attach(bs);
        sensor.startEquipment();

        // Change this to assertTrue
        assertTrue(bs.getReservations().isEmpty(),
                "The system notified, and confirmed there are zero reservations.");
    }
}