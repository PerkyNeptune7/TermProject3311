import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

public class ObserverPatternAIJUnitTest {

    @Test
    void sensorStartEquipmentNotifiesAttachedObserver() {
        Sensor sensor = new Sensor("S-100");
        TestObserver observer = new TestObserver();

        sensor.attach(observer);
        sensor.startEquipment();

        assertTrue(sensor.isEquipmentActive());
        assertEquals(1, observer.updateCount);
        assertSame(sensor, observer.lastSensor);
    }

    @Test
    void sensorDetachStopsFurtherNotifications() {
        Sensor sensor = new Sensor("S-101");
        TestObserver observer = new TestObserver();

        sensor.attach(observer);
        sensor.detach(observer);
        sensor.startEquipment();

        assertTrue(sensor.isEquipmentActive());
        assertEquals(0, observer.updateCount);
    }

    @Test
    void bookingSystemStoresReservationsAndRespondsToStartEvent() {
        BookingSystem bookingSystem = new BookingSystem();
        Reservation reservation = createReservation("RES-1");
        Sensor sensor = new Sensor("S-102");

        bookingSystem.addReservation(reservation);
        sensor.attach(bookingSystem);

        String output = captureOutput(sensor::startEquipment);

        assertEquals(1, bookingSystem.getReservations().size());
        assertSame(reservation, bookingSystem.getReservations().get(0));
        assertTrue(output.contains("BookingSystem: Equipment started. Updating reservation status."));
    }

    @Test
    void reservationManagerStoresReservationsAndRespondsToStopEvent() {
        ReservationManager reservationManager = new ReservationManager();
        Reservation reservation = createReservation("RES-2");
        Sensor sensor = new Sensor("S-103");

        reservationManager.addReservation(reservation);
        sensor.attach(reservationManager);

        String output = captureOutput(sensor::stopEquipment);

        assertFalse(sensor.isEquipmentActive());
        assertEquals(1, reservationManager.getReservations().size());
        assertSame(reservation, reservationManager.getReservations().get(0));
        assertTrue(output.contains("ReservationManager: Equipment stopped. Ending reservation."));
    }

    @Test
    void usageLoggerCreatesLogsForStartAndStopEvents() {
        UsageLogger usageLogger = new UsageLogger();
        Sensor sensor = new Sensor("S-104");

        sensor.attach(usageLogger);
        sensor.startEquipment();
        sensor.stopEquipment();

        assertEquals(2, usageLogger.getLogs().size());
        assertTrue(usageLogger.getLogs().get(0).startsWith("Equipment started at "));
        assertTrue(usageLogger.getLogs().get(1).startsWith("Equipment stopped at "));
    }

    private Reservation createReservation(String reservationId) {
        LocalDateTime start = LocalDateTime.of(2026, 4, 2, 10, 0);
        return new Reservation(reservationId, start, start.plusHours(2), ReservationStatus.ACTIVE);
    }

    private String captureOutput(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        try {
            action.run();
            return outputStream.toString();
        } finally {
            System.setOut(originalOut);
        }
    }

    private static class TestObserver implements Observer {
        private int updateCount;
        private Sensor lastSensor;

        @Override
        public void update(Sensor sensor) {
            updateCount++;
            lastSensor = sensor;
        }
    }
}
