package test.AI_assistant;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.AvailableState;
import app.DepositAppliedState;
import app.DepositForfeitedState;
import app.DepositPaidState;
import app.DepositPendingState;
import app.DisabledState;
import app.EquipmentForStatePattern;
import app.MaintenanceState;
import app.PendingPickupState;
import app.ReservationforStatePattern;
import app.ReservedEquipmentState;

public class StatePatternAITest {

    private EquipmentForStatePattern equipment;
    private ReservationforStatePattern reservation;
    private LocalDateTime startTime;

    @BeforeEach
    public void setUp() {
        equipment = new EquipmentForStatePattern("EQ001", "Microscope", "Lab A");
        startTime = LocalDateTime.of(2026, 4, 5, 10, 0);
        reservation = new ReservationforStatePattern("R001", 25.0, startTime);
    }

    // =========================
    // EquipmentForStatePattern
    // =========================

    @Test
    public void testEquipmentConstructorSetsFields() {
        assertEquals("EQ001", equipment.getId());
        assertEquals("Microscope", equipment.getDescription());
        assertEquals("Lab A", equipment.getLocation());
    }

    @Test
    public void testEquipmentStartsAvailable() {
        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testMarkPendingPickupChangesState() {
        equipment.markPendingPickup();

        assertEquals("PENDING_PICKUP", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testConfirmReservationChangesState() {
        equipment.confirmReservation();

        assertEquals("RESERVED", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testDisableFromAvailableMovesToDisabled() {
        equipment.disable();

        assertEquals("DISABLED", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    @Test
    public void testMarkMaintenanceFromAvailableMovesToMaintenance() {
        equipment.markMaintenance();

        assertEquals("MAINTENANCE", equipment.getStateName());
        assertFalse(equipment.isAvailable());
    }

    // =========================
    // AvailableState
    // =========================

    @Test
    public void testAvailableStateName() {
        AvailableState state = new AvailableState();

        assertEquals("AVAILABLE", state.getStateName());
    }

    @Test
    public void testAvailableReserveMovesToReserved() {
        AvailableState state = new AvailableState();

        state.reserve(equipment);

        assertEquals("RESERVED", equipment.getStateName());
    }

    @Test
    public void testAvailableDisableMovesToDisabled() {
        AvailableState state = new AvailableState();

        state.disable(equipment);

        assertEquals("DISABLED", equipment.getStateName());
    }

    @Test
    public void testAvailableMarkMaintenanceMovesToMaintenance() {
        AvailableState state = new AvailableState();

        state.markMaintenance(equipment);

        assertEquals("MAINTENANCE", equipment.getStateName());
    }

    @Test
    public void testAvailableReleaseKeepsAvailable() {
        AvailableState state = new AvailableState();

        state.release(equipment);

        assertEquals("AVAILABLE", equipment.getStateName());
    }

    @Test
    public void testAvailableFinishMaintenanceKeepsAvailable() {
        AvailableState state = new AvailableState();

        state.finishMaintenance(equipment);

        assertEquals("AVAILABLE", equipment.getStateName());
    }

    // =========================
    // PendingPickupState
    // =========================

    @Test
    public void testPendingPickupStateName() {
        PendingPickupState state = new PendingPickupState();

        assertEquals("PENDING_PICKUP", state.getStateName());
    }

    @Test
    public void testPendingPickupReleaseMovesToAvailable() {
        equipment.markPendingPickup();

        new PendingPickupState().release(equipment);

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testPendingPickupReserveKeepsPendingPickup() {
        equipment.markPendingPickup();

        new PendingPickupState().reserve(equipment);

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    @Test
    public void testPendingPickupDisableKeepsPendingPickup() {
        equipment.markPendingPickup();

        new PendingPickupState().disable(equipment);

        assertEquals("PENDING_PICKUP", equipment.getStateName());
    }

    // =========================
    // ReservedEquipmentState
    // =========================

    @Test
    public void testReservedEquipmentStateName() {
        ReservedEquipmentState state = new ReservedEquipmentState();

        assertEquals("RESERVED", state.getStateName());
    }

    @Test
    public void testReservedReleaseMovesToAvailable() {
        equipment.confirmReservation();

        new ReservedEquipmentState().release(equipment);

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testReservedDisableKeepsReserved() {
        equipment.confirmReservation();

        new ReservedEquipmentState().disable(equipment);

        assertEquals("RESERVED", equipment.getStateName());
    }

    @Test
    public void testReservedMarkMaintenanceKeepsReserved() {
        equipment.confirmReservation();

        new ReservedEquipmentState().markMaintenance(equipment);

        assertEquals("RESERVED", equipment.getStateName());
    }

    // =========================
    // DisabledState
    // =========================

    @Test
    public void testDisabledStateName() {
        DisabledState state = new DisabledState();

        assertEquals("DISABLED", state.getStateName());
    }

    @Test
    public void testDisabledEnableMovesToAvailable() {
        equipment.disable();

        new DisabledState().enable(equipment);

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testDisabledReserveKeepsDisabled() {
        equipment.disable();

        new DisabledState().reserve(equipment);

        assertEquals("DISABLED", equipment.getStateName());
    }

    @Test
    public void testDisabledMarkMaintenanceKeepsDisabled() {
        equipment.disable();

        new DisabledState().markMaintenance(equipment);

        assertEquals("DISABLED", equipment.getStateName());
    }

    // =========================
    // MaintenanceState
    // =========================

    @Test
    public void testMaintenanceStateName() {
        MaintenanceState state = new MaintenanceState();

        assertEquals("MAINTENANCE", state.getStateName());
    }

    @Test
    public void testMaintenanceFinishMovesToAvailable() {
        equipment.markMaintenance();

        new MaintenanceState().finishMaintenance(equipment);

        assertEquals("AVAILABLE", equipment.getStateName());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testMaintenanceDisableMovesToDisabled() {
        equipment.markMaintenance();

        new MaintenanceState().disable(equipment);

        assertEquals("DISABLED", equipment.getStateName());
    }

    @Test
    public void testMaintenanceReserveKeepsMaintenance() {
        equipment.markMaintenance();

        new MaintenanceState().reserve(equipment);

        assertEquals("MAINTENANCE", equipment.getStateName());
    }

    // =========================
    // ReservationforStatePattern
    // =========================

    @Test
    public void testReservationConstructorSetsFields() {
        assertEquals("R001", reservation.getReservationId());
        assertEquals(25.0, reservation.getDepositAmount(), 0.0001);
        assertEquals(startTime, reservation.getStartTime());
    }

    @Test
    public void testReservationStartsWithPendingDepositBehavior() {
        assertEquals(100.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    @Test
    public void testReservationPayDepositThenArriveOnTimeAppliesDeposit() {
        reservation.payDeposit();
        reservation.arrive(startTime.plusMinutes(10));

        assertEquals(75.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    @Test
    public void testReservationPayDepositThenArriveLateForfeitsDeposit() {
        reservation.payDeposit();
        reservation.arrive(startTime.plusMinutes(30));

        assertEquals(100.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    @Test
    public void testReservationPayDepositAndArriveOnTimeChangesFinalPayment() {
        reservation.payDeposit();
        reservation.arrive(startTime.plusMinutes(5));

        assertEquals(75.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    // =========================
    // DepositPendingState
    // =========================

    @Test
    public void testDepositPendingStateName() {
        DepositPendingState state = new DepositPendingState();

        assertEquals("DEPOSIT_PENDING", state.getStateName());
    }

    @Test
    public void testDepositPendingCalculateFinalPaymentReturnsTotalCost() {
        DepositPendingState state = new DepositPendingState();

        assertEquals(100.0, state.calculateFinalPayment(reservation, 100.0), 0.0001);
    }

    @Test
    public void testDepositPendingPayDepositMovesReservationToPaidBehavior() {
        DepositPendingState state = new DepositPendingState();

        state.payDeposit(reservation);

        assertEquals(100.0, reservation.calculateFinalPayment(100.0), 0.0001);
        reservation.arrive(startTime.plusMinutes(5));
        assertEquals(75.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    // =========================
    // DepositPaidState
    // =========================

    @Test
    public void testDepositPaidStateName() {
        DepositPaidState state = new DepositPaidState();

        assertEquals("DEPOSIT_PAID", state.getStateName());
    }

    @Test
    public void testDepositPaidCalculateFinalPaymentReturnsTotalCost() {
        DepositPaidState state = new DepositPaidState();

        assertEquals(100.0, state.calculateFinalPayment(reservation, 100.0), 0.0001);
    }

    @Test
    public void testDepositPaidArriveOnTimeMovesToAppliedBehavior() {
        reservation.payDeposit();

        new DepositPaidState().arrive(reservation, startTime.plusMinutes(15));

        assertEquals(75.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    @Test
    public void testDepositPaidArriveLateMovesToForfeitedBehavior() {
        reservation.payDeposit();

        new DepositPaidState().arrive(reservation, startTime.plusMinutes(45));

        assertEquals(100.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    // =========================
    // DepositAppliedState
    // =========================

    @Test
    public void testDepositAppliedStateName() {
        DepositAppliedState state = new DepositAppliedState();

        assertEquals("DEPOSIT_APPLIED", state.getStateName());
    }

    @Test
    public void testDepositAppliedCalculateFinalPaymentSubtractsDeposit() {
        reservation.payDeposit();
        reservation.arrive(startTime.plusMinutes(5));

        DepositAppliedState state = new DepositAppliedState();

        assertEquals(75.0, state.calculateFinalPayment(reservation, 100.0), 0.0001);
    }

    @Test
    public void testDepositAppliedPayDepositDoesNotChangeBehavior() {
        reservation.payDeposit();
        reservation.arrive(startTime.plusMinutes(5));

        new DepositAppliedState().payDeposit(reservation);

        assertEquals(75.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }

    // =========================
    // DepositForfeitedState
    // =========================

    @Test
    public void testDepositForfeitedStateName() {
        DepositForfeitedState state = new DepositForfeitedState();

        assertEquals("DEPOSIT_FORFEITED", state.getStateName());
    }

    @Test
    public void testDepositForfeitedCalculateFinalPaymentReturnsTotalCost() {
        reservation.payDeposit();
        reservation.arrive(startTime.plusMinutes(45));

        DepositForfeitedState state = new DepositForfeitedState();

        assertEquals(100.0, state.calculateFinalPayment(reservation, 100.0), 0.0001);
    }

    @Test
    public void testDepositForfeitedArriveDoesNotChangeBehavior() {
        reservation.payDeposit();
        reservation.arrive(startTime.plusMinutes(45));

        new DepositForfeitedState().arrive(reservation, startTime.plusMinutes(5));

        assertEquals(100.0, reservation.calculateFinalPayment(100.0), 0.0001);
    }
}