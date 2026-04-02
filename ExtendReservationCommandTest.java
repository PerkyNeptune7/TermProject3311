import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ExtendReservationCommandTest {

    private Equipment createAvailableEquipment() {
        return new Equipment("Microscope", "Lab microscope", "Room 102");
    }

    private Equipment createUnavailableEquipment() {
        Equipment equipment = new Equipment("Microscope", "Lab microscope", "Room 102");
        equipment.setStatus(EquipmentStatus.UNAVAILABLE);
        return equipment;
    }

    private Reservation createReservation(ReservationStatus status) {
        return new Reservation(
                "102",
                LocalDateTime.of(2026, 3, 25, 10, 0),
                LocalDateTime.of(2026, 3, 25, 12, 0),
                status
        );
    }

    private ReservationStatus getNonCancelledStatus() {
        for (ReservationStatus status : ReservationStatus.values()) {
            if (status != ReservationStatus.CANCELLED) {
                return status;
            }
        }
        throw new IllegalStateException("No non cancelled status exists.");
    }

    @Test
    public void testExecuteWithNullEquipment() {
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(null, reservation, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteWithNullReservation() {
        Equipment equipment = createAvailableEquipment();
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, null, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteNullNewEndTime() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, null);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteWithCancelledReservation() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.CANCELLED);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
        assertEquals(LocalDateTime.of(2026, 3, 25, 12, 0), reservation.getEndTime());
    }

    @Test
    public void testExecuteNotAvailableEquipment() {
        Equipment equipment = createUnavailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
        assertEquals(LocalDateTime.of(2026, 3, 25, 12, 0), reservation.getEndTime());
    }

    @Test
    public void testExecuteWithValidExtension() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        boolean result = command.execute();

        assertTrue(result);
        assertEquals(newEndTime, reservation.getEndTime());
    }

    @Test
    public void testExecuteEarlierNewEndTime() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime earlierEndTime = LocalDateTime.of(2026, 3, 25, 11, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, earlierEndTime);

        boolean result = command.execute();

        assertFalse(result);
        assertEquals(LocalDateTime.of(2026, 3, 25, 12, 0), reservation.getEndTime());
    }

    @Test
    public void testExecuteEqualNewEndTime() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime sameEndTime = LocalDateTime.of(2026, 3, 25, 12, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, sameEndTime);

        boolean result = command.execute();

        assertFalse(result);
        assertEquals(LocalDateTime.of(2026, 3, 25, 12, 0), reservation.getEndTime());
    }
}