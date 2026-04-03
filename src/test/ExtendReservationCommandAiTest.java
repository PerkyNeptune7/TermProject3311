import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ExtendReservationCommandAiTest {

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

    @Test
    void executeReturnsFalseWhenEquipmentIsNull() {
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(null, reservation, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenReservationIsNull() {
        Equipment equipment = createAvailableEquipment();
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, null, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenNewEndTimeIsNull() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, null);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenReservationIsCancelled() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.CANCELLED);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeDoesNotChangeEndTimeWhenReservationIsCancelled() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.CANCELLED);
        LocalDateTime originalEndTime = reservation.getEndTime();
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        command.execute();

        assertEquals(originalEndTime, reservation.getEndTime());
    }

    @Test
    void executeReturnsFalseWhenEquipmentIsUnavailable() {
        Equipment equipment = createUnavailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeDoesNotChangeEndTimeWhenEquipmentIsUnavailable() {
        Equipment equipment = createUnavailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime originalEndTime = reservation.getEndTime();
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        command.execute();

        assertEquals(originalEndTime, reservation.getEndTime());
    }

    @Test
    void executeReturnsTrueWhenExtensionIsValid() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        boolean result = command.execute();

        assertTrue(result);
    }

    @Test
    void executeUpdatesEndTimeWhenExtensionIsValid() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 25, 14, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        command.execute();

        assertEquals(newEndTime, reservation.getEndTime());
    }

    @Test
    void executeReturnsFalseWhenNewEndTimeIsEarlierThanCurrentEndTime() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime earlierEndTime = LocalDateTime.of(2026, 3, 25, 11, 0);

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, earlierEndTime);

        boolean result = command.execute();

        assertFalse(result);
        assertEquals(LocalDateTime.of(2026, 3, 25, 12, 0), reservation.getEndTime());
    }
}