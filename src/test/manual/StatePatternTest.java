package manual;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import src.java.*;
import src.app.*;

public class StatePatternTest {

    private app.EquipmentForStatePattern equipment;

    @Before
    public void setUp() {
        equipment = new app.EquipmentForStatePattern("EQ001", "Microscope", "Lab A");
    }

    // =========================
    // Constructor + getters
    // =========================

    @Test
    public void testConstructorSetsId() {
        assertEquals("EQ001", equipment.getId());
    }

    @Test
    public void testConstructorSetsDescription() {
        assertEquals("Microscope", equipment.getDescription());
    }

    @Test
    public void testConstructorSetsLocation() {
        assertEquals("Lab A", equipment.getLocation());
    }

    @Test
    public void testConstructorInitialStateIsAvailable() {
        assertEquals("AVAILABLE", equipment.getStateName());
    }

    @Test
    public void testIsAvailableInitiallyTrue() {
        assertTrue(equipment.isAvailable());
    }

    // =========================
    // setState
    // =========================

    @Test
    public void testSetStateToAvailable() {
        equipment.setState(new AvailableState());

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testSetStateToPendingPickup() {
        equipment.setState(new PendingPickupState());

        assertEquals("PENDING_PICKUP", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testSetStateToReserved() {
        equipment.setState(new ReservedEquipmentState());

        assertEquals("RESERVED", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    // =========================
    // markPendingPickup
    // =========================

    @Test
    public void testMarkPendingPickupChangesState() {
        equipment.markPendingPickup();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testMarkPendingPickupMakesEquipmentUnavailable() {
        equipment.markPendingPickup();

        assertFalse(equipment.isAvailable());
    }

    // =========================
    // confirmReservation
    // =========================

    @Test
    public void testConfirmReservationChangesState() {
        equipment.confirmReservation();

        assertEquals("RESERVED", equipment.getStateName());
    }

    @Test
    public void testConfirmReservationMakesEquipmentUnavailable() {
        equipment.confirmReservation();

        assertFalse(equipment.isAvailable());
    }

    // =========================
    // reserve
    // =========================

    @Test
    public void testReserveFromAvailableChangesStateToReserved() {
        equipment.reserve();

        assertEquals("RESERVED", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testReserveFromPendingPickupKeepsPendingPickup() {
        equipment.setState(new PendingPickupState());

        equipment.reserve();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testReserveFromReservedKeepsReserved() {
        equipment.setState(new ReservedEquipmentState());

        equipment.reserve();

        assertEquals("RESERVED", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    // =========================
    // release
    // =========================

    @Test
    public void testReleaseFromAvailableKeepsAvailable() {
        equipment.release();

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testReleaseFromPendingPickupChangesStateToAvailable() {
        equipment.setState(new PendingPickupState());

        equipment.release();

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testReleaseFromReservedChangesStateToAvailable() {
        equipment.setState(new ReservedEquipmentState());

        equipment.release();

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    // =========================
    // enable
    // =========================

    @Test
    public void testEnableFromAvailableKeepsAvailable() {
        equipment.enable();

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testEnableFromPendingPickupKeepsPendingPickup() {
        equipment.setState(new PendingPickupState());

        equipment.enable();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testEnableFromReservedKeepsReserved() {
        equipment.setState(new ReservedEquipmentState());

        equipment.enable();

        assertEquals("RESERVED", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    // =========================
    // disable
    // =========================
    // Only safe to test the states that do NOT require DisabledState class construction

    @Test
    public void testDisableFromPendingPickupKeepsPendingPickup() {
        equipment.setState(new PendingPickupState());

        equipment.disable();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testDisableFromReservedKeepsReserved() {
        equipment.setState(new ReservedEquipmentState());

        equipment.disable();

        assertEquals("RESERVED", equipment.getStateName());
    }

    // =========================
    // markMaintenance
    // =========================
    // Only safe to test the states that do NOT require MaintenanceState class construction

    @Test
    public void testMarkMaintenanceFromPendingPickupKeepsPendingPickup() {
        equipment.setState(new PendingPickupState());

        equipment.markMaintenance();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testMarkMaintenanceFromReservedKeepsReserved() {
        equipment.setState(new ReservedEquipmentState());

        equipment.markMaintenance();

        assertEquals("RESERVED", equipment.getStateName());
    }

    // =========================
    // finishMaintenance
    // =========================

    @Test
    public void testFinishMaintenanceFromAvailableKeepsAvailable() {
        equipment.finishMaintenance();

        assertEquals("AVAILABLE", equipment.getStateName());
    }

    @Test
    public void testFinishMaintenanceFromPendingPickupKeepsPendingPickup() {
        equipment.setState(new PendingPickupState());

        equipment.finishMaintenance();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testFinishMaintenanceFromReservedKeepsReserved() {
        equipment.setState(new ReservedEquipmentState());

        equipment.finishMaintenance();

        assertEquals("RESERVED", equipment.getStateName());
    }

    // =========================
    // getStateName + isAvailable
    // =========================

    @Test
    public void testGetStateNameReturnsAvailableInitially() {
        assertEquals("AVAILABLE", equipment.getStateName());
    }

    @Test
    public void testIsAvailableReturnsFalseWhenPendingPickup() {
        equipment.setState(new PendingPickupState());

        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testIsAvailableReturnsFalseWhenReserved() {
        equipment.setState(new ReservedEquipmentState());

        assertFalse(equipment.isAvailable());
    }
}