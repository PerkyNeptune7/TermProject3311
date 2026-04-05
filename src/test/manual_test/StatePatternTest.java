package test.manual_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.EquipmentForStatePattern;

public class StatePatternTest {

    private EquipmentForStatePattern equipment;

    @BeforeEach
    public void setUp() {
        equipment = new EquipmentForStatePattern("EQ001", "Microscope", "Lab A");
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
        equipment.markPendingPickup();

        equipment.reserve();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testReserveFromReservedKeepsReserved() {
        equipment.confirmReservation();

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
        equipment.markPendingPickup();

        equipment.release();

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testReleaseFromReservedChangesStateToAvailable() {
        equipment.confirmReservation();

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
        equipment.markPendingPickup();

        equipment.enable();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testEnableFromReservedKeepsReserved() {
        equipment.confirmReservation();

        equipment.enable();

        assertEquals("RESERVED", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    // =========================
    // disable
    // =========================

    @Test
    public void testDisableFromPendingPickupKeepsPendingPickup() {
        equipment.markPendingPickup();

        equipment.disable();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testDisableFromReservedKeepsReserved() {
        equipment.confirmReservation();

        equipment.disable();

        assertEquals("RESERVED", equipment.getStateName());
    }

    // =========================
    // markMaintenance
    // =========================

    @Test
    public void testMarkMaintenanceFromPendingPickupKeepsPendingPickup() {
        equipment.markPendingPickup();

        equipment.markMaintenance();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testMarkMaintenanceFromReservedKeepsReserved() {
        equipment.confirmReservation();

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
        equipment.markPendingPickup();

        equipment.finishMaintenance();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testFinishMaintenanceFromReservedKeepsReserved() {
        equipment.confirmReservation();

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
        equipment.markPendingPickup();

        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testIsAvailableReturnsFalseWhenReserved() {
        equipment.confirmReservation();

        assertFalse(equipment.isAvailable());
    }
}