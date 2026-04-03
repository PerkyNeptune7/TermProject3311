import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class CancelReservationCommandAiTest {

    @Test
    void executeReturnsFalseWhenReservationIsNull() {
        CancelReservationCommand command = new CancelReservationCommand(null);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenReservationAlreadyCancelled() {
        Reservation reservation = new Reservation(
                "R001",
                LocalDateTime.of(2026, 4, 2, 10, 0),
                LocalDateTime.of(2026, 4, 2, 11, 0),
                ReservationStatus.CANCELLED
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeKeepsStatusCancelledWhenReservationAlreadyCancelled() {
        Reservation reservation = new Reservation(
                "R002",
                LocalDateTime.of(2026, 4, 2, 12, 0),
                LocalDateTime.of(2026, 4, 2, 13, 0),
                ReservationStatus.CANCELLED
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        command.execute();

        assertEquals(ReservationStatus.CANCELLED, reservation.getStatus());
    }

    @Test
    void executeReturnsTrueWhenReservationIsActive() {
        Reservation reservation = new Reservation(
                "R003",
                LocalDateTime.of(2026, 4, 2, 14, 0),
                LocalDateTime.of(2026, 4, 2, 15, 0),
                ReservationStatus.ACTIVE
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        boolean result = command.execute();

        assertTrue(result);
    }

    @Test
    void executeChangesStatusFromActiveToCancelled() {
        Reservation reservation = new Reservation(
                "R004",
                LocalDateTime.of(2026, 4, 2, 16, 0),
                LocalDateTime.of(2026, 4, 2, 17, 0),
                ReservationStatus.ACTIVE
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        command.execute();

        assertEquals(ReservationStatus.CANCELLED, reservation.getStatus());
    }

    @Test
    void executeDoesNotChangeReservationId() {
        Reservation reservation = new Reservation(
                "R005",
                LocalDateTime.of(2026, 4, 2, 18, 0),
                LocalDateTime.of(2026, 4, 2, 19, 0),
                ReservationStatus.ACTIVE
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        command.execute();

        assertEquals("R005", reservation.getReservationId());
    }

    @Test
    void executeDoesNotChangeStartTime() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 2, 20, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 2, 21, 0);
        Reservation reservation = new Reservation(
                "R006",
                start,
                end,
                ReservationStatus.ACTIVE
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        command.execute();

        assertEquals(start, reservation.getStartTime());
    }

    @Test
    void executeDoesNotChangeEndTime() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 2, 22, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 2, 23, 0);
        Reservation reservation = new Reservation(
                "R007",
                start,
                end,
                ReservationStatus.ACTIVE
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        command.execute();

        assertEquals(end, reservation.getEndTime());
    }

    @Test
    void executeTwiceReturnsTrueThenFalse() {
        Reservation reservation = new Reservation(
                "R008",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 11, 0),
                ReservationStatus.ACTIVE
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        boolean firstResult = command.execute();
        boolean secondResult = command.execute();

        assertTrue(firstResult);
        assertFalse(secondResult);
    }

    @Test
    void executeTwiceLeavesReservationCancelled() {
        Reservation reservation = new Reservation(
                "R009",
                LocalDateTime.of(2026, 4, 3, 12, 0),
                LocalDateTime.of(2026, 4, 3, 13, 0),
                ReservationStatus.ACTIVE
        );
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        command.execute();
        command.execute();

        assertEquals(ReservationStatus.CANCELLED, reservation.getStatus());
    }
}
