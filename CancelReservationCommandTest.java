import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class CancelReservationCommandTest {

    private Reservation createReservation(ReservationStatus status) {
        return new Reservation(
                "R001",
                LocalDateTime.of(2026, 3, 23, 9, 0),
                LocalDateTime.of(2026, 3, 23, 12, 0),
                status
        );
    }

    private ReservationStatus getNonCancelledStatus() {
        for (ReservationStatus status : ReservationStatus.values()) {
            if (status != ReservationStatus.CANCELLED) {
                return status;
            }
        }
        throw new IllegalStateException("No non cancelled reservation exists.");
    }

    @Test
    public void testExecuteReturnsFalseWhenReservationIsNull() {
        CancelReservationCommand command = new CancelReservationCommand(null);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteReturnsFalseWhenReservationAlreadyCancelled() {
        Reservation reservation = createReservation(ReservationStatus.CANCELLED);
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        boolean result = command.execute();

        assertFalse(result);
        assertEquals(ReservationStatus.CANCELLED, reservation.getStatus());
    }

    @Test
    public void testExecuteReturnsTrueWhenReservationIsValid() {
        Reservation reservation = createReservation(getNonCancelledStatus());
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        boolean result = command.execute();

        assertTrue(result);
        assertEquals(ReservationStatus.CANCELLED, reservation.getStatus());
    }

    @Test
    public void testExecuteCalledTwiceReturnsTrueThenFalse() {
        Reservation reservation = createReservation(getNonCancelledStatus());
        CancelReservationCommand command = new CancelReservationCommand(reservation);

        boolean firstResult = command.execute();
        boolean secondResult = command.execute();

        assertTrue(firstResult);
        assertFalse(secondResult);
    }

    @Test
    public void testExecuteDoesNotChangeTimes() {
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime originalStart = reservation.getStartTime();
        LocalDateTime originalEnd = reservation.getEndTime();

        CancelReservationCommand command = new CancelReservationCommand(reservation);
        command.execute();

        assertEquals(originalStart, reservation.getStartTime());
        assertEquals(originalEnd, reservation.getEndTime());
    }
}