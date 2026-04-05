package test.Manual_test;

import static org.junit.jupiter.api.Assertions.*;

import app.Reservation;
import app.ReservationStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ReservationTest {

    private ReservationStatus getNonCancelledStatus() {
        for (ReservationStatus status : ReservationStatus.values()) {
            if (status != ReservationStatus.CANCELLED) {
                return status;
            }
        }
        throw new IllegalStateException("Only cancelled status exists.");
    }

    private Reservation createReservation() {
        return new Reservation(
                "R002",
                LocalDateTime.of(2026, 3, 23, 9, 0),
                LocalDateTime.of(2026, 3, 23, 12, 0),
                getNonCancelledStatus()
        );
    }

    @Test
    public void testConstructorSetsReservationId() {
        Reservation reservation = createReservation();
        Assertions.assertEquals("R002", reservation.getReservationId());
    }

    @Test
    public void testConstructorSetsStartTime() {
        Reservation reservation = createReservation();
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 23, 9, 0), reservation.getStartTime());
    }

    @Test
    public void testConstructorSetsEndTime() {
        Reservation reservation = createReservation();
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 23, 12, 0), reservation.getEndTime());
    }

    @Test
    public void testConstructorSetsStatus() {
        Reservation reservation = createReservation();
        Assertions.assertEquals(getNonCancelledStatus(), reservation.getStatus());
    }

    @Test
    public void testSetStartTimeUpdatesStartTime() {
        Reservation reservation = createReservation();
        LocalDateTime newStart = LocalDateTime.of(2026, 3, 23, 9, 0);

        reservation.setStartTime(newStart);

        Assertions.assertEquals(newStart, reservation.getStartTime());
    }

    @Test
    public void testSetEndTimeUpdatesEndTime() {
        Reservation reservation = createReservation();
        LocalDateTime newEnd = LocalDateTime.of(2026, 3, 24, 13, 0);

        reservation.setEndTime(newEnd);

        Assertions.assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void testExtendReservationNewEndTimeIsNull() {
        Reservation reservation = createReservation();

        boolean result = reservation.extendReservation(null);

        assertFalse(result);
    }

    @Test
    public void testExtendReservationNewEndTimeIsLater() {
        Reservation reservation = createReservation();
        LocalDateTime newEnd = LocalDateTime.of(2026, 3, 23, 14, 0);

        boolean result = reservation.extendReservation(newEnd);

        assertTrue(result);
    }

    @Test
    public void testExtendReservationUpdatesEndTimeSuccessful() {
        Reservation reservation = createReservation();
        LocalDateTime newEnd = LocalDateTime.of(2026, 3, 23, 14, 0);

        reservation.extendReservation(newEnd);

        Assertions.assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void testExtendReservationEarlierNewEndTime() {
        Reservation reservation = createReservation();
        LocalDateTime earlierEnd = LocalDateTime.of(2026, 3, 23, 11, 0);

        boolean result = reservation.extendReservation(earlierEnd);

        assertFalse(result);
    }

    @Test
    public void testExtendReservationEqualNewEndTime() {
        Reservation reservation = createReservation();
        LocalDateTime sameEnd = LocalDateTime.of(2026, 3, 23, 12, 0);

        boolean result = reservation.extendReservation(sameEnd);

        assertFalse(result);
    }

    @Test
    public void testReservationStatusToCancelled() {
        Reservation reservation = createReservation();

        reservation.cancelReservation();

        Assertions.assertEquals(ReservationStatus.CANCELLED, reservation.getStatus());
    }
}