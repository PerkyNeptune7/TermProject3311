package test.Manual_test;

import static org.junit.jupiter.api.Assertions.*;

import app.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ModifyReservationCommandTest {

    private Equipment createAvailableEquipment() {
        return new Equipment("Microscope", "Lab microscope", "Room 103");
    }

    private Equipment createUnavailableEquipment() {
        Equipment equipment = new Equipment("Microscope", "Lab microscope", "Room 103");
        equipment.setStatus(EquipmentStatus.UNAVAILABLE);
        return equipment;
    }

    private Reservation createReservation(ReservationStatus status) {
        return new Reservation(
                "103",
                LocalDateTime.of(2026, 3, 20, 9, 0),
                LocalDateTime.of(2026, 3, 20, 11, 0),
                status
        );
    }

    private ReservationStatus getNonCancelledStatus() {
        for (ReservationStatus status : ReservationStatus.values()) {
            if (status != ReservationStatus.CANCELLED) {
                return status;
            }
        }
        throw new IllegalStateException("No non cancelled status available.");
    }

    @Test
    public void testExecuteEquipmentIsNull() {
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newStartTime = LocalDateTime.of(2026, 3, 20, 9, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 20, 11, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(null, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteReservationIsNull() {
        Equipment equipment = createAvailableEquipment();
        LocalDateTime newStartTime = LocalDateTime.of(2026, 3, 20, 9, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 20, 11, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, null, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteNewStartTimeIsNull() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 20, 12, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, null, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteNewEndTimeIsNull() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newStartTime = LocalDateTime.of(2026, 3, 20, 9, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, null);

        boolean result = command.execute();

        assertFalse(result);
    }

    @Test
    public void testExecuteReservationIsCancelled() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(ReservationStatus.CANCELLED);
        LocalDateTime newStartTime = LocalDateTime.of(2026, 3, 20, 9, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 20, 11, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 20, 9, 0), reservation.getStartTime());
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 20, 11, 0), reservation.getEndTime());
    }

    @Test
    public void testExecuteNewEndTimeIsNotAfterNewStartTime() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newStartTime = LocalDateTime.of(2026, 3, 20, 11, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 20, 11, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 20, 9, 0), reservation.getStartTime());
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 20, 11, 0), reservation.getEndTime());
    }

    @Test
    public void testExecuteEquipmentIsUnavailable() {
        Equipment equipment = createUnavailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newStartTime = LocalDateTime.of(2026, 3, 20, 9, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 20, 11, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertFalse(result);
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 20, 9, 0), reservation.getStartTime());
        Assertions.assertEquals(LocalDateTime.of(2026, 3, 20, 11, 0), reservation.getEndTime());
    }

    @Test
    public void testExecuteModificationIsValid() {
        Equipment equipment = createAvailableEquipment();
        Reservation reservation = createReservation(getNonCancelledStatus());
        LocalDateTime newStartTime = LocalDateTime.of(2026, 3, 20, 9, 0);
        LocalDateTime newEndTime = LocalDateTime.of(2026, 3, 20, 13, 0);

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        assertTrue(result);
        Assertions.assertEquals(newStartTime, reservation.getStartTime());
        Assertions.assertEquals(newEndTime, reservation.getEndTime());
    }
}