package test.AI_assistant;

import static org.junit.jupiter.api.Assertions.*;

import app.Reservation;
import app.ReservationStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ReservationAiTest {

    @Test
    void constructorSetsReservationIdCorrectly() {
        Reservation reservation = new Reservation(
                "R001",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );

        Assertions.assertEquals("R001", reservation.getReservationId());
    }

    @Test
    void constructorSetsStartTimeCorrectly() {
        LocalDateTime startTime = LocalDateTime.of(2026, 4, 3, 10, 0);
        Reservation reservation = new Reservation(
                "R002",
                startTime,
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );

        Assertions.assertEquals(startTime, reservation.getStartTime());
    }

    @Test
    void constructorSetsEndTimeCorrectly() {
        LocalDateTime endTime = LocalDateTime.of(2026, 4, 3, 12, 0);
        Reservation reservation = new Reservation(
                "R003",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                endTime,
                ReservationStatus.ACTIVE
        );

        Assertions.assertEquals(endTime, reservation.getEndTime());
    }

    @Test
    void constructorSetsStatusCorrectly() {
        Reservation reservation = new Reservation(
                "R004",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );

        Assertions.assertEquals(ReservationStatus.ACTIVE, reservation.getStatus());
    }

    @Test
    void setStartTimeUpdatesStartTime() {
        Reservation reservation = new Reservation(
                "R005",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 11, 0);

        reservation.setStartTime(newStartTime);

        Assertions.assertEquals(newStartTime, reservation.getStartTime());
    }

    @Test
    void setEndTimeUpdatesEndTime() {
        Reservation reservation = new Reservation(
                "R006",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 13, 0);

        reservation.setEndTime(newEndTime);

        Assertions.assertEquals(newEndTime, reservation.getEndTime());
    }

    @Test
    void extendReservationReturnsFalseWhenNewEndTimeIsNull() {
        Reservation reservation = new Reservation(
                "R007",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );

        boolean result = reservation.extendReservation(null);

        assertFalse(result);
    }

    @Test
    void extendReservationReturnsTrueWhenNewEndTimeIsLater() {
        Reservation reservation = new Reservation(
                "R008",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 14, 0);

        boolean result = reservation.extendReservation(newEndTime);

        assertTrue(result);
    }

    @Test
    void extendReservationUpdatesEndTimeWhenNewEndTimeIsLater() {
        Reservation reservation = new Reservation(
                "R009",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 0);

        reservation.extendReservation(newEndTime);

        Assertions.assertEquals(newEndTime, reservation.getEndTime());
    }

    @Test
    void cancelReservationChangesStatusToCancelled() {
        Reservation reservation = new Reservation(
                "R010",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                ReservationStatus.ACTIVE
        );

        reservation.cancelReservation();

        Assertions.assertEquals(ReservationStatus.CANCELLED, reservation.getStatus());
    }
}