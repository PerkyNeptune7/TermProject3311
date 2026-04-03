import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ModifyReservationCommandAiTest {

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
                "R001",
                LocalDateTime.of(2026, 4, 3, 10, 0),
                LocalDateTime.of(2026, 4, 3, 12, 0),
                status
        );
    }

    @Test
    void executeReturnsFalseWhenEquipmentIsNull() {
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(null, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenReservationIsNull() {
        Equipment equipment = createAvailableEquipment();
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, null, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenNewStartTimeIsNull() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, null, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenNewEndTimeIsNull() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, null);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenReservationIsCancelled() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.CANCELLED);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenNewEndTimeIsNotAfterNewStartTime() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 13, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsFalseWhenEquipmentIsUnavailable() {
        Equipment equipment = createUnavailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    void executeReturnsTrueForValidModification() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertTrue(result);
    }

    @Test
    void executeUpdatesReservationStartTimeForValidModification() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 13, 30);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 15, 30);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        command.execute();

        assertEquals(newStartTime, reservation.getStartTime());
    }

    @Test
    void executeUpdatesReservationEndTimeForValidModification() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.ACTIVE);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 4, 3, 14, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 4, 3, 16, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        command.execute();

        assertEquals(newEndTime, reservation.getEndTime());
    }
}