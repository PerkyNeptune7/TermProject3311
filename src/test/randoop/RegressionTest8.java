package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) '4');
        reservationforStatePattern3.payDeposit();
        double double8 = reservationforStatePattern3.calculateFinalPayment((double) 100.0f);
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.arrive(localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Charging $0.00 to University Department Account. Pending Dean approval.", 0.0d, localDateTime2);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        app.ReservationCommandInvoker reservationCommandInvoker0 = new app.ReservationCommandInvoker();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        app.ReservationStatus reservationStatus4 = null;
        app.Reservation reservation5 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime2, localDateTime3, reservationStatus4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        app.CancelReservationCommand cancelReservationCommand11 = new app.CancelReservationCommand(reservation5);
        boolean boolean12 = reservationCommandInvoker0.submitCommand((app.Command) cancelReservationCommand11);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        app.ReservationStatus reservationStatus16 = null;
        app.Reservation reservation17 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime14, localDateTime15, reservationStatus16);
        app.CancelReservationCommand cancelReservationCommand18 = new app.CancelReservationCommand(reservation17);
        java.time.LocalDateTime localDateTime19 = reservation17.getStartTime();
        app.CancelReservationCommand cancelReservationCommand20 = new app.CancelReservationCommand(reservation17);
        boolean boolean21 = cancelReservationCommand20.execute();
        boolean boolean22 = reservationCommandInvoker0.submitCommand((app.Command) cancelReservationCommand20);
        app.Equipment equipment26 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        app.ReservationStatus reservationStatus30 = null;
        app.Reservation reservation31 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime28, localDateTime29, reservationStatus30);
        app.CancelReservationCommand cancelReservationCommand32 = new app.CancelReservationCommand(reservation31);
        java.time.LocalDateTime localDateTime33 = reservation31.getStartTime();
        java.time.LocalDateTime localDateTime34 = null;
        app.ExtendReservationCommand extendReservationCommand35 = new app.ExtendReservationCommand(equipment26, reservation31, localDateTime34);
        app.ReservationManager reservationManager36 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        app.ReservationStatus reservationStatus40 = null;
        app.Reservation reservation41 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime38, localDateTime39, reservationStatus40);
        java.time.LocalDateTime localDateTime42 = null;
        reservation41.setStartTime(localDateTime42);
        java.time.LocalDateTime localDateTime44 = null;
        reservation41.setEndTime(localDateTime44);
        java.time.LocalDateTime localDateTime46 = null;
        reservation41.setEndTime(localDateTime46);
        reservationManager36.addReservation(reservation41);
        java.time.LocalDateTime localDateTime49 = null;
        app.ExtendReservationCommand extendReservationCommand50 = new app.ExtendReservationCommand(equipment26, reservation41, localDateTime49);
        app.ReservationStatus reservationStatus51 = reservation41.getStatus();
        java.time.LocalDateTime localDateTime52 = reservation41.getEndTime();
        java.time.LocalDateTime localDateTime53 = null;
        reservation41.setEndTime(localDateTime53);
        app.CancelReservationCommand cancelReservationCommand55 = new app.CancelReservationCommand(reservation41);
        boolean boolean56 = reservationCommandInvoker0.submitCommand((app.Command) cancelReservationCommand55);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(localDateTime33);
        org.junit.Assert.assertNull(reservationStatus51);
        org.junit.Assert.assertNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationStatus reservationStatus3 = null;
        app.Reservation reservation4 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime1, localDateTime2, reservationStatus3);
        java.time.LocalDateTime localDateTime5 = null;
        reservation4.setStartTime(localDateTime5);
        app.CancelReservationCommand cancelReservationCommand7 = new app.CancelReservationCommand(reservation4);
        app.CancelReservationCommand cancelReservationCommand8 = new app.CancelReservationCommand(reservation4);
        java.time.LocalDateTime localDateTime9 = null;
        reservation4.setStartTime(localDateTime9);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.AvailableState availableState32 = new app.AvailableState();
        java.lang.String str33 = availableState32.getStateName();
        app.DisabledState disabledState34 = new app.DisabledState();
        app.DisabledState disabledState35 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern39 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern39.disable();
        equipmentForStatePattern39.release();
        disabledState35.release(equipmentForStatePattern39);
        disabledState34.enable(equipmentForStatePattern39);
        availableState32.disable(equipmentForStatePattern39);
        app.AvailableState availableState45 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern49 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern49.disable();
        equipmentForStatePattern49.release();
        availableState45.finishMaintenance(equipmentForStatePattern49);
        app.EquipmentForStatePattern equipmentForStatePattern56 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern56.release();
        equipmentForStatePattern56.confirmReservation();
        availableState45.reserve(equipmentForStatePattern56);
        app.DisabledState disabledState60 = new app.DisabledState();
        app.DisabledState disabledState61 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern65 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern65.release();
        disabledState61.reserve(equipmentForStatePattern65);
        disabledState60.release(equipmentForStatePattern65);
        availableState45.markMaintenance(equipmentForStatePattern65);
        availableState32.markMaintenance(equipmentForStatePattern65);
        equipmentForStatePattern65.release();
        pendingPickupState0.enable(equipmentForStatePattern65);
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("Charging $10.00 to University Department Account. Pending Dean approval.", "Processing direct debit payment of $97.00. No extra fees.", "Processing credit card payment of $0.00 plus 2% processing fee.");
        pendingPickupState0.finishMaintenance(equipmentForStatePattern76);
        java.lang.String str78 = pendingPickupState0.getStateName();
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AVAILABLE" + "'", str33, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "PENDING_PICKUP" + "'", str78, "PENDING_PICKUP");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.ReservationManager reservationManager1 = new app.ReservationManager();
        java.util.List<app.Reservation> reservationList2 = reservationManager1.getReservations();
        app.ReservationManager reservationManager3 = new app.ReservationManager();
        app.Sensor sensor5 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager3.update(sensor5);
        app.UsageLogger usageLogger7 = new app.UsageLogger();
        java.util.List<java.lang.String> strList8 = usageLogger7.getLogs();
        sensor5.detach((app.Observer) usageLogger7);
        app.UsageLogger usageLogger10 = new app.UsageLogger();
        sensor5.attach((app.Observer) usageLogger10);
        reservationManager1.update(sensor5);
        reservationManager0.update(sensor5);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        disabledState0.release(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.disable();
        disabledState0.markMaintenance(equipmentForStatePattern11);
        app.DisabledState disabledState14 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern18.disable();
        equipmentForStatePattern18.release();
        disabledState14.release(equipmentForStatePattern18);
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern25.disable();
        disabledState14.markMaintenance(equipmentForStatePattern25);
        disabledState0.finishMaintenance(equipmentForStatePattern25);
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern32.release();
        equipmentForStatePattern32.confirmReservation();
        disabledState0.disable(equipmentForStatePattern32);
        app.DisabledState disabledState36 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern40.disable();
        equipmentForStatePattern40.release();
        disabledState36.release(equipmentForStatePattern40);
        app.EquipmentForStatePattern equipmentForStatePattern47 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern47.disable();
        disabledState36.markMaintenance(equipmentForStatePattern47);
        app.DisabledState disabledState50 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern54 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern54.disable();
        equipmentForStatePattern54.release();
        disabledState50.release(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern61.disable();
        disabledState50.markMaintenance(equipmentForStatePattern61);
        disabledState36.finishMaintenance(equipmentForStatePattern61);
        app.DisabledState disabledState65 = new app.DisabledState();
        app.DisabledState disabledState66 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern70 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern70.release();
        disabledState66.reserve(equipmentForStatePattern70);
        disabledState65.release(equipmentForStatePattern70);
        disabledState36.disable(equipmentForStatePattern70);
        app.AvailableState availableState75 = new app.AvailableState();
        java.lang.String str76 = availableState75.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern80 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str81 = equipmentForStatePattern80.getId();
        availableState75.markMaintenance(equipmentForStatePattern80);
        disabledState36.reserve(equipmentForStatePattern80);
        app.EquipmentForStatePattern equipmentForStatePattern87 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str88 = equipmentForStatePattern87.getId();
        disabledState36.enable(equipmentForStatePattern87);
        equipmentForStatePattern87.disable();
        equipmentForStatePattern87.enable();
        disabledState0.release(equipmentForStatePattern87);
        equipmentForStatePattern87.reserve();
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "AVAILABLE" + "'", str76, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.confirmReservation();
        pendingPickupState0.finishMaintenance(equipmentForStatePattern35);
        app.AvailableState availableState38 = new app.AvailableState();
        java.lang.String str39 = availableState38.getStateName();
        app.DisabledState disabledState40 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern44.release();
        disabledState40.reserve(equipmentForStatePattern44);
        availableState38.reserve(equipmentForStatePattern44);
        app.DisabledState disabledState48 = new app.DisabledState();
        app.DisabledState disabledState49 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern53.release();
        disabledState49.reserve(equipmentForStatePattern53);
        disabledState48.release(equipmentForStatePattern53);
        availableState38.markMaintenance(equipmentForStatePattern53);
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str62 = equipmentForStatePattern61.getId();
        availableState38.finishMaintenance(equipmentForStatePattern61);
        pendingPickupState0.reserve(equipmentForStatePattern61);
        app.AvailableState availableState65 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern69 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern69.disable();
        equipmentForStatePattern69.release();
        availableState65.finishMaintenance(equipmentForStatePattern69);
        app.DisabledState disabledState73 = new app.DisabledState();
        app.DisabledState disabledState74 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern78 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern78.disable();
        equipmentForStatePattern78.release();
        disabledState74.release(equipmentForStatePattern78);
        disabledState73.enable(equipmentForStatePattern78);
        availableState65.finishMaintenance(equipmentForStatePattern78);
        equipmentForStatePattern78.enable();
        java.lang.String str85 = equipmentForStatePattern78.getStateName();
        pendingPickupState0.markMaintenance(equipmentForStatePattern78);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AVAILABLE" + "'", str39, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "AVAILABLE" + "'", str85, "AVAILABLE");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Charging $-1.00 to University Department Account. Pending Dean approval.", 1.0d, localDateTime2);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        availableState0.finishMaintenance(equipmentForStatePattern4);
        app.DisabledState disabledState8 = new app.DisabledState();
        app.DisabledState disabledState9 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern13.disable();
        equipmentForStatePattern13.release();
        disabledState9.release(equipmentForStatePattern13);
        disabledState8.enable(equipmentForStatePattern13);
        availableState0.finishMaintenance(equipmentForStatePattern13);
        equipmentForStatePattern13.reserve();
        equipmentForStatePattern13.finishMaintenance();
        equipmentForStatePattern13.release();
        equipmentForStatePattern13.markMaintenance();
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("Charging $100.00 to University Department Account. Pending Dean approval.", "Deducting $15.00 from registered Research Grant funds.", "Processing direct debit payment of $100.00. No extra fees.");
        equipmentForStatePattern3.reserve();
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        reservationforStatePattern3.payDeposit();
        double double6 = reservationforStatePattern3.calculateFinalPayment((double) 0);
        double double8 = reservationforStatePattern3.calculateFinalPayment((double) (byte) 0);
        java.time.LocalDateTime localDateTime9 = reservationforStatePattern3.getStartTime();
        java.time.LocalDateTime localDateTime10 = reservationforStatePattern3.getStartTime();
        reservationforStatePattern3.payDeposit();
        java.lang.String str12 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.arrive(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        sensor2.notifyObservers();
        java.lang.String str8 = sensor2.getSensorId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationStatus reservationStatus3 = null;
        app.Reservation reservation4 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime1, localDateTime2, reservationStatus3);
        java.time.LocalDateTime localDateTime5 = null;
        reservation4.setStartTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = null;
        reservation4.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = reservation4.getEndTime();
        java.time.LocalDateTime localDateTime10 = reservation4.getStartTime();
        java.lang.String str11 = reservation4.getReservationId();
        app.ReservationStatus reservationStatus12 = reservation4.getStatus();
        java.time.LocalDateTime localDateTime13 = reservation4.getStartTime();
        java.lang.String str14 = reservation4.getReservationId();
        app.CancelReservationCommand cancelReservationCommand15 = new app.CancelReservationCommand(reservation4);
        java.lang.String str16 = reservation4.getReservationId();
        java.time.LocalDateTime localDateTime17 = reservation4.getEndTime();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str11, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNull(reservationStatus12);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str16, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        app.AvailableState availableState0 = new app.AvailableState();
        java.lang.String str1 = availableState0.getStateName();
        app.DisabledState disabledState2 = new app.DisabledState();
        app.DisabledState disabledState3 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern7 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern7.disable();
        equipmentForStatePattern7.release();
        disabledState3.release(equipmentForStatePattern7);
        disabledState2.enable(equipmentForStatePattern7);
        availableState0.disable(equipmentForStatePattern7);
        java.lang.String str13 = availableState0.getStateName();
        app.AvailableState availableState14 = new app.AvailableState();
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        app.DisabledState disabledState29 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern33.disable();
        equipmentForStatePattern33.release();
        disabledState29.release(equipmentForStatePattern33);
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern40.disable();
        disabledState29.markMaintenance(equipmentForStatePattern40);
        disabledState15.finishMaintenance(equipmentForStatePattern40);
        app.DisabledState disabledState44 = new app.DisabledState();
        app.DisabledState disabledState45 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern49 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern49.release();
        disabledState45.reserve(equipmentForStatePattern49);
        disabledState44.release(equipmentForStatePattern49);
        disabledState15.disable(equipmentForStatePattern49);
        availableState14.disable(equipmentForStatePattern49);
        app.AvailableState availableState55 = new app.AvailableState();
        java.lang.String str56 = availableState55.getStateName();
        app.DisabledState disabledState57 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern61.release();
        disabledState57.reserve(equipmentForStatePattern61);
        app.EquipmentForStatePattern equipmentForStatePattern67 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState57.markMaintenance(equipmentForStatePattern67);
        availableState55.enable(equipmentForStatePattern67);
        app.EquipmentForStatePattern equipmentForStatePattern73 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern73.release();
        availableState55.disable(equipmentForStatePattern73);
        equipmentForStatePattern73.reserve();
        equipmentForStatePattern73.markPendingPickup();
        availableState14.finishMaintenance(equipmentForStatePattern73);
        equipmentForStatePattern73.disable();
        availableState0.finishMaintenance(equipmentForStatePattern73);
        boolean boolean81 = equipmentForStatePattern73.isAvailable();
        java.lang.String str82 = equipmentForStatePattern73.getLocation();
        java.lang.String str83 = equipmentForStatePattern73.getStateName();
        equipmentForStatePattern73.markMaintenance();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AVAILABLE" + "'", str13, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AVAILABLE" + "'", str56, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "PENDING_PICKUP" + "'", str83, "PENDING_PICKUP");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        app.Equipment equipment3 = new app.Equipment("AVAILABLE", "Processing direct debit payment of $1.00. No extra fees.", "Charging $20.00 to University Department Account. Pending Dean approval.");
        app.Equipment equipment7 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        app.ReservationManager reservationManager8 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        app.ReservationStatus reservationStatus12 = null;
        app.Reservation reservation13 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime10, localDateTime11, reservationStatus12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation13.setStartTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        reservation13.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation13.setEndTime(localDateTime18);
        reservationManager8.addReservation(reservation13);
        java.time.LocalDateTime localDateTime21 = reservation13.getEndTime();
        java.time.LocalDateTime localDateTime22 = null;
        app.ExtendReservationCommand extendReservationCommand23 = new app.ExtendReservationCommand(equipment7, reservation13, localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        app.ReservationStatus reservationStatus27 = null;
        app.Reservation reservation28 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime25, localDateTime26, reservationStatus27);
        java.time.LocalDateTime localDateTime29 = null;
        reservation28.setStartTime(localDateTime29);
        java.time.LocalDateTime localDateTime31 = null;
        reservation28.setEndTime(localDateTime31);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        app.ModifyReservationCommand modifyReservationCommand35 = new app.ModifyReservationCommand(equipment7, reservation28, localDateTime33, localDateTime34);
        app.ReservationStatus reservationStatus36 = reservation28.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        reservation28.setEndTime(localDateTime37);
        java.lang.String str39 = reservation28.getReservationId();
        java.time.LocalDateTime localDateTime40 = reservation28.getStartTime();
        java.time.LocalDateTime localDateTime41 = null;
        reservation28.setEndTime(localDateTime41);
        app.ReservationStatus reservationStatus43 = reservation28.getStatus();
        java.time.LocalDateTime localDateTime44 = reservation28.getEndTime();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        app.ModifyReservationCommand modifyReservationCommand47 = new app.ModifyReservationCommand(equipment3, reservation28, localDateTime45, localDateTime46);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(reservationStatus36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str39, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNull(reservationStatus43);
        org.junit.Assert.assertNull(localDateTime44);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.release();
        disabledState0.reserve(equipmentForStatePattern4);
        app.PendingPickupState pendingPickupState7 = new app.PendingPickupState();
        app.DisabledState disabledState8 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        equipmentForStatePattern12.release();
        disabledState8.release(equipmentForStatePattern12);
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        disabledState8.markMaintenance(equipmentForStatePattern19);
        app.DisabledState disabledState22 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        equipmentForStatePattern26.release();
        disabledState22.release(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern33.disable();
        disabledState22.markMaintenance(equipmentForStatePattern33);
        disabledState8.finishMaintenance(equipmentForStatePattern33);
        equipmentForStatePattern33.enable();
        pendingPickupState7.enable(equipmentForStatePattern33);
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern42.disable();
        equipmentForStatePattern42.release();
        equipmentForStatePattern42.enable();
        java.lang.String str46 = equipmentForStatePattern42.getId();
        pendingPickupState7.disable(equipmentForStatePattern42);
        disabledState0.reserve(equipmentForStatePattern42);
        app.AvailableState availableState49 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern53.disable();
        equipmentForStatePattern53.release();
        availableState49.finishMaintenance(equipmentForStatePattern53);
        app.DisabledState disabledState57 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern61.release();
        disabledState57.reserve(equipmentForStatePattern61);
        app.EquipmentForStatePattern equipmentForStatePattern67 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState57.markMaintenance(equipmentForStatePattern67);
        equipmentForStatePattern67.enable();
        boolean boolean70 = equipmentForStatePattern67.isAvailable();
        equipmentForStatePattern67.reserve();
        java.lang.String str72 = equipmentForStatePattern67.getId();
        availableState49.disable(equipmentForStatePattern67);
        disabledState0.disable(equipmentForStatePattern67);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        disabledState0.release(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.disable();
        disabledState0.markMaintenance(equipmentForStatePattern11);
        app.DisabledState disabledState14 = new app.DisabledState();
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState14.reserve(equipmentForStatePattern26);
        disabledState0.finishMaintenance(equipmentForStatePattern26);
        app.DisabledState disabledState31 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.release();
        disabledState31.reserve(equipmentForStatePattern35);
        equipmentForStatePattern35.reserve();
        disabledState0.reserve(equipmentForStatePattern35);
        app.AvailableState availableState40 = new app.AvailableState();
        app.DisabledState disabledState41 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern45 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern45.disable();
        equipmentForStatePattern45.release();
        disabledState41.release(equipmentForStatePattern45);
        app.EquipmentForStatePattern equipmentForStatePattern52 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern52.disable();
        disabledState41.markMaintenance(equipmentForStatePattern52);
        app.DisabledState disabledState55 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern59.disable();
        equipmentForStatePattern59.release();
        disabledState55.release(equipmentForStatePattern59);
        app.EquipmentForStatePattern equipmentForStatePattern66 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern66.disable();
        disabledState55.markMaintenance(equipmentForStatePattern66);
        disabledState41.finishMaintenance(equipmentForStatePattern66);
        app.DisabledState disabledState70 = new app.DisabledState();
        app.DisabledState disabledState71 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern75.release();
        disabledState71.reserve(equipmentForStatePattern75);
        disabledState70.release(equipmentForStatePattern75);
        disabledState41.disable(equipmentForStatePattern75);
        availableState40.disable(equipmentForStatePattern75);
        equipmentForStatePattern75.confirmReservation();
        java.lang.String str82 = equipmentForStatePattern75.getStateName();
        boolean boolean83 = equipmentForStatePattern75.isAvailable();
        disabledState0.release(equipmentForStatePattern75);
        java.lang.String str85 = equipmentForStatePattern75.getId();
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "RESERVED" + "'", str82, "RESERVED");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        app.Equipment equipment0 = null;
        app.ReservationManager reservationManager1 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        app.ReservationStatus reservationStatus5 = null;
        app.Reservation reservation6 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime3, localDateTime4, reservationStatus5);
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setStartTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation6.setEndTime(localDateTime11);
        reservationManager1.addReservation(reservation6);
        app.Equipment equipment17 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        app.ReservationStatus reservationStatus21 = null;
        app.Reservation reservation22 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime19, localDateTime20, reservationStatus21);
        java.time.LocalDateTime localDateTime23 = null;
        reservation22.setStartTime(localDateTime23);
        java.time.LocalDateTime localDateTime25 = null;
        reservation22.setEndTime(localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        reservation22.setEndTime(localDateTime27);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        app.ModifyReservationCommand modifyReservationCommand31 = new app.ModifyReservationCommand(equipment17, reservation22, localDateTime29, localDateTime30);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        app.ReservationStatus reservationStatus35 = null;
        app.Reservation reservation36 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime33, localDateTime34, reservationStatus35);
        java.time.LocalDateTime localDateTime37 = null;
        reservation36.setStartTime(localDateTime37);
        java.time.LocalDateTime localDateTime39 = null;
        reservation36.setEndTime(localDateTime39);
        java.time.LocalDateTime localDateTime41 = reservation36.getEndTime();
        app.CancelReservationCommand cancelReservationCommand42 = new app.CancelReservationCommand(reservation36);
        java.time.LocalDateTime localDateTime43 = reservation36.getEndTime();
        java.time.LocalDateTime localDateTime44 = null;
        app.ExtendReservationCommand extendReservationCommand45 = new app.ExtendReservationCommand(equipment17, reservation36, localDateTime44);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        app.ReservationStatus reservationStatus49 = null;
        app.Reservation reservation50 = new app.Reservation("", localDateTime47, localDateTime48, reservationStatus49);
        java.time.LocalDateTime localDateTime51 = reservation50.getStartTime();
        java.time.LocalDateTime localDateTime52 = null;
        app.ExtendReservationCommand extendReservationCommand53 = new app.ExtendReservationCommand(equipment17, reservation50, localDateTime52);
        java.time.LocalDateTime localDateTime54 = null;
        reservation50.setStartTime(localDateTime54);
        reservationManager1.addReservation(reservation50);
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        app.ModifyReservationCommand modifyReservationCommand59 = new app.ModifyReservationCommand(equipment0, reservation50, localDateTime57, localDateTime58);
        java.time.LocalDateTime localDateTime60 = null;
        reservation50.setEndTime(localDateTime60);
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertNull(localDateTime51);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        sensor2.detach((app.Observer) reservationManager7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        app.ReservationStatus reservationStatus12 = null;
        app.Reservation reservation13 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime10, localDateTime11, reservationStatus12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation13.setStartTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        reservation13.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime18 = reservation13.getEndTime();
        reservationManager7.addReservation(reservation13);
        app.ReservationStatus reservationStatus20 = reservation13.getStatus();
        reservation13.cancelReservation();
        java.time.LocalDateTime localDateTime22 = null;
        reservation13.setStartTime(localDateTime22);
        app.CancelReservationCommand cancelReservationCommand24 = new app.CancelReservationCommand(reservation13);
        java.time.LocalDateTime localDateTime25 = reservation13.getEndTime();
        app.ReservationStatus reservationStatus26 = reservation13.getStatus();
        app.CancelReservationCommand cancelReservationCommand27 = new app.CancelReservationCommand(reservation13);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(reservationStatus20);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + app.ReservationStatus.CANCELLED + "'", reservationStatus26.equals(app.ReservationStatus.CANCELLED));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        app.Equipment equipment3 = new app.Equipment("Deducting $1.00 from registered Research Grant funds.", "DISABLED", "Processing direct debit payment of $35.00. No extra fees.");
        app.Equipment equipment7 = new app.Equipment("Deducting $10.00 from registered Research Grant funds.", "Processing direct debit payment of $97.00. No extra fees.", "Charging $1.00 to University Department Account. Pending Dean approval.");
        app.BookingSystem bookingSystem8 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList9 = bookingSystem8.getReservations();
        app.BookingSystem bookingSystem10 = new app.BookingSystem();
        app.Sensor sensor12 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem10.update(sensor12);
        bookingSystem8.update(sensor12);
        app.BookingSystem bookingSystem15 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList16 = bookingSystem15.getReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        app.ReservationStatus reservationStatus20 = null;
        app.Reservation reservation21 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime18, localDateTime19, reservationStatus20);
        java.time.LocalDateTime localDateTime22 = null;
        reservation21.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation21.setEndTime(localDateTime24);
        java.time.LocalDateTime localDateTime26 = null;
        reservation21.setEndTime(localDateTime26);
        bookingSystem15.addReservation(reservation21);
        bookingSystem8.addReservation(reservation21);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        app.ModifyReservationCommand modifyReservationCommand32 = new app.ModifyReservationCommand(equipment7, reservation21, localDateTime30, localDateTime31);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        app.ReservationStatus reservationStatus36 = null;
        app.Reservation reservation37 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime34, localDateTime35, reservationStatus36);
        java.time.LocalDateTime localDateTime38 = null;
        reservation37.setStartTime(localDateTime38);
        java.time.LocalDateTime localDateTime40 = null;
        reservation37.setEndTime(localDateTime40);
        java.time.LocalDateTime localDateTime42 = reservation37.getEndTime();
        java.time.LocalDateTime localDateTime43 = reservation37.getStartTime();
        java.lang.String str44 = reservation37.getReservationId();
        java.time.LocalDateTime localDateTime45 = null;
        app.ExtendReservationCommand extendReservationCommand46 = new app.ExtendReservationCommand(equipment7, reservation37, localDateTime45);
        java.lang.String str47 = reservation37.getReservationId();
        java.time.LocalDateTime localDateTime48 = null;
        app.ExtendReservationCommand extendReservationCommand49 = new app.ExtendReservationCommand(equipment3, reservation37, localDateTime48);
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        app.ReservationStatus reservationStatus53 = null;
        app.Reservation reservation54 = new app.Reservation("Processing direct debit payment of $97.00. No extra fees.", localDateTime51, localDateTime52, reservationStatus53);
        app.CancelReservationCommand cancelReservationCommand55 = new app.CancelReservationCommand(reservation54);
        reservation54.cancelReservation();
        java.time.LocalDateTime localDateTime57 = reservation54.getStartTime();
        java.time.LocalDateTime localDateTime58 = null;
        app.ExtendReservationCommand extendReservationCommand59 = new app.ExtendReservationCommand(equipment3, reservation54, localDateTime58);
        app.Equipment equipment63 = new app.Equipment("", "Charging $0.00 to University Department Account. Pending Dean approval.", "Charging $35.00 to University Department Account. Pending Dean approval.");
        app.BookingSystem bookingSystem64 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList65 = bookingSystem64.getReservations();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        app.ReservationStatus reservationStatus69 = null;
        app.Reservation reservation70 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime67, localDateTime68, reservationStatus69);
        java.time.LocalDateTime localDateTime71 = null;
        reservation70.setStartTime(localDateTime71);
        java.time.LocalDateTime localDateTime73 = null;
        reservation70.setEndTime(localDateTime73);
        java.time.LocalDateTime localDateTime75 = null;
        reservation70.setEndTime(localDateTime75);
        bookingSystem64.addReservation(reservation70);
        java.time.LocalDateTime localDateTime78 = null;
        boolean boolean79 = reservation70.extendReservation(localDateTime78);
        java.lang.String str80 = reservation70.getReservationId();
        java.time.LocalDateTime localDateTime81 = null;
        reservation70.setEndTime(localDateTime81);
        java.time.LocalDateTime localDateTime83 = null;
        boolean boolean84 = reservation70.extendReservation(localDateTime83);
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        app.ModifyReservationCommand modifyReservationCommand87 = new app.ModifyReservationCommand(equipment63, reservation70, localDateTime85, localDateTime86);
        java.time.LocalDateTime localDateTime88 = null;
        java.time.LocalDateTime localDateTime89 = null;
        app.ModifyReservationCommand modifyReservationCommand90 = new app.ModifyReservationCommand(equipment3, reservation70, localDateTime88, localDateTime89);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str44, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str47, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNull(localDateTime57);
        org.junit.Assert.assertNotNull(reservationList65);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str80, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        disabledState0.release(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.disable();
        disabledState0.markMaintenance(equipmentForStatePattern11);
        app.DisabledState disabledState14 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern18.disable();
        equipmentForStatePattern18.release();
        disabledState14.release(equipmentForStatePattern18);
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern25.disable();
        disabledState14.markMaintenance(equipmentForStatePattern25);
        disabledState0.finishMaintenance(equipmentForStatePattern25);
        app.PendingPickupState pendingPickupState29 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern33.disable();
        equipmentForStatePattern33.release();
        boolean boolean36 = equipmentForStatePattern33.isAvailable();
        pendingPickupState29.release(equipmentForStatePattern33);
        disabledState0.release(equipmentForStatePattern33);
        app.PendingPickupState pendingPickupState39 = new app.PendingPickupState();
        app.DisabledState disabledState40 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern44.disable();
        equipmentForStatePattern44.release();
        disabledState40.release(equipmentForStatePattern44);
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern51.disable();
        disabledState40.markMaintenance(equipmentForStatePattern51);
        app.DisabledState disabledState54 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern58 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern58.disable();
        equipmentForStatePattern58.release();
        disabledState54.release(equipmentForStatePattern58);
        app.EquipmentForStatePattern equipmentForStatePattern65 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern65.disable();
        disabledState54.markMaintenance(equipmentForStatePattern65);
        disabledState40.finishMaintenance(equipmentForStatePattern65);
        equipmentForStatePattern65.enable();
        pendingPickupState39.enable(equipmentForStatePattern65);
        app.DisabledState disabledState71 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern75.release();
        disabledState71.reserve(equipmentForStatePattern75);
        pendingPickupState39.reserve(equipmentForStatePattern75);
        app.EquipmentForStatePattern equipmentForStatePattern82 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern82.release();
        boolean boolean84 = equipmentForStatePattern82.isAvailable();
        pendingPickupState39.finishMaintenance(equipmentForStatePattern82);
        disabledState0.enable(equipmentForStatePattern82);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        app.Sensor sensor9 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager7.update(sensor9);
        app.UsageLogger usageLogger11 = new app.UsageLogger();
        java.util.List<java.lang.String> strList12 = usageLogger11.getLogs();
        sensor9.detach((app.Observer) usageLogger11);
        app.Sensor sensor15 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger11.update(sensor15);
        sensor2.detach((app.Observer) usageLogger11);
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        app.Sensor sensor20 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager18.update(sensor20);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        java.util.List<java.lang.String> strList23 = usageLogger22.getLogs();
        sensor20.detach((app.Observer) usageLogger22);
        app.ReservationManager reservationManager25 = new app.ReservationManager();
        app.Sensor sensor27 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager25.update(sensor27);
        app.UsageLogger usageLogger29 = new app.UsageLogger();
        java.util.List<java.lang.String> strList30 = usageLogger29.getLogs();
        sensor27.detach((app.Observer) usageLogger29);
        app.Sensor sensor33 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger29.update(sensor33);
        sensor20.detach((app.Observer) usageLogger29);
        sensor2.attach((app.Observer) usageLogger29);
        app.ReservationManager reservationManager37 = new app.ReservationManager();
        app.Sensor sensor39 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager37.update(sensor39);
        app.UsageLogger usageLogger41 = new app.UsageLogger();
        java.util.List<java.lang.String> strList42 = usageLogger41.getLogs();
        sensor39.detach((app.Observer) usageLogger41);
        app.UsageLogger usageLogger44 = new app.UsageLogger();
        sensor39.attach((app.Observer) usageLogger44);
        sensor2.attach((app.Observer) usageLogger44);
        java.util.List<java.lang.String> strList47 = usageLogger44.getLogs();
        app.BookingSystem bookingSystem48 = new app.BookingSystem();
        app.Sensor sensor50 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem48.update(sensor50);
        app.BookingSystem bookingSystem52 = new app.BookingSystem();
        app.Sensor sensor54 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem52.update(sensor54);
        sensor50.attach((app.Observer) bookingSystem52);
        sensor50.notifyObservers();
        sensor50.notifyObservers();
        usageLogger44.update(sensor50);
        sensor50.notifyObservers();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        reservationforStatePattern3.payDeposit();
        java.lang.String str5 = reservationforStatePattern3.getReservationId();
        java.lang.String str6 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.arrive(localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.release();
        disabledState0.reserve(equipmentForStatePattern4);
        java.lang.String str7 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.release();
        boolean boolean13 = equipmentForStatePattern11.isAvailable();
        disabledState0.disable(equipmentForStatePattern11);
        java.lang.String str15 = disabledState0.getStateName();
        app.PendingPickupState pendingPickupState16 = new app.PendingPickupState();
        app.DisabledState disabledState17 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern21.disable();
        equipmentForStatePattern21.release();
        disabledState17.release(equipmentForStatePattern21);
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern28.disable();
        disabledState17.markMaintenance(equipmentForStatePattern28);
        app.DisabledState disabledState31 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.disable();
        equipmentForStatePattern35.release();
        disabledState31.release(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern42.disable();
        disabledState31.markMaintenance(equipmentForStatePattern42);
        disabledState17.finishMaintenance(equipmentForStatePattern42);
        equipmentForStatePattern42.enable();
        pendingPickupState16.enable(equipmentForStatePattern42);
        java.lang.String str48 = equipmentForStatePattern42.getDescription();
        equipmentForStatePattern42.finishMaintenance();
        boolean boolean50 = equipmentForStatePattern42.isAvailable();
        disabledState0.finishMaintenance(equipmentForStatePattern42);
        app.EquipmentForStatePattern equipmentForStatePattern55 = new app.EquipmentForStatePattern("Processing direct debit payment of $-1.00. No extra fees.", "Processing direct debit payment of $30.00. No extra fees.", "hi!");
        equipmentForStatePattern55.finishMaintenance();
        disabledState0.enable(equipmentForStatePattern55);
        equipmentForStatePattern55.markMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DISABLED" + "'", str7, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DISABLED" + "'", str15, "DISABLED");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        app.Sensor sensor9 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager7.update(sensor9);
        app.UsageLogger usageLogger11 = new app.UsageLogger();
        java.util.List<java.lang.String> strList12 = usageLogger11.getLogs();
        sensor9.detach((app.Observer) usageLogger11);
        app.Sensor sensor15 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger11.update(sensor15);
        sensor2.detach((app.Observer) usageLogger11);
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        app.Sensor sensor20 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager18.update(sensor20);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        java.util.List<java.lang.String> strList23 = usageLogger22.getLogs();
        sensor20.detach((app.Observer) usageLogger22);
        app.ReservationManager reservationManager25 = new app.ReservationManager();
        app.Sensor sensor27 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager25.update(sensor27);
        app.UsageLogger usageLogger29 = new app.UsageLogger();
        java.util.List<java.lang.String> strList30 = usageLogger29.getLogs();
        sensor27.detach((app.Observer) usageLogger29);
        app.Sensor sensor33 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger29.update(sensor33);
        sensor20.detach((app.Observer) usageLogger29);
        sensor2.attach((app.Observer) usageLogger29);
        app.ReservationManager reservationManager37 = new app.ReservationManager();
        app.Sensor sensor39 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager37.update(sensor39);
        app.UsageLogger usageLogger41 = new app.UsageLogger();
        java.util.List<java.lang.String> strList42 = usageLogger41.getLogs();
        sensor39.detach((app.Observer) usageLogger41);
        app.UsageLogger usageLogger44 = new app.UsageLogger();
        sensor39.attach((app.Observer) usageLogger44);
        sensor2.attach((app.Observer) usageLogger44);
        sensor2.startEquipment();
        sensor2.notifyObservers();
        sensor2.startEquipment();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        availableState0.finishMaintenance(equipmentForStatePattern4);
        app.AvailableState availableState8 = new app.AvailableState();
        java.lang.String str9 = availableState8.getStateName();
        app.DisabledState disabledState10 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern14 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern14.release();
        disabledState10.reserve(equipmentForStatePattern14);
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState10.markMaintenance(equipmentForStatePattern20);
        availableState8.enable(equipmentForStatePattern20);
        app.DisabledState disabledState23 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern27 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern27.release();
        disabledState23.reserve(equipmentForStatePattern27);
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState23.markMaintenance(equipmentForStatePattern33);
        app.DisabledState disabledState35 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern39 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern39.disable();
        equipmentForStatePattern39.release();
        disabledState35.release(equipmentForStatePattern39);
        app.EquipmentForStatePattern equipmentForStatePattern46 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern46.disable();
        disabledState35.markMaintenance(equipmentForStatePattern46);
        equipmentForStatePattern46.finishMaintenance();
        disabledState23.disable(equipmentForStatePattern46);
        availableState8.disable(equipmentForStatePattern46);
        equipmentForStatePattern46.release();
        equipmentForStatePattern46.finishMaintenance();
        availableState0.reserve(equipmentForStatePattern46);
        app.AvailableState availableState55 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern59.disable();
        equipmentForStatePattern59.release();
        availableState55.finishMaintenance(equipmentForStatePattern59);
        java.lang.String str63 = availableState55.getStateName();
        app.DisabledState disabledState64 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern68 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern68.disable();
        equipmentForStatePattern68.release();
        disabledState64.release(equipmentForStatePattern68);
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern75.disable();
        disabledState64.markMaintenance(equipmentForStatePattern75);
        equipmentForStatePattern75.finishMaintenance();
        java.lang.String str79 = equipmentForStatePattern75.getDescription();
        availableState55.disable(equipmentForStatePattern75);
        java.lang.String str81 = availableState55.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern85 = new app.EquipmentForStatePattern("Deducting $10.00 from registered Research Grant funds.", "Deducting $100.00 from registered Research Grant funds.", "Deducting $0.00 from registered Research Grant funds.");
        boolean boolean86 = equipmentForStatePattern85.isAvailable();
        availableState55.reserve(equipmentForStatePattern85);
        availableState0.reserve(equipmentForStatePattern85);
        equipmentForStatePattern85.disable();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AVAILABLE" + "'", str9, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "AVAILABLE" + "'", str63, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "AVAILABLE" + "'", str81, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.AvailableState availableState32 = new app.AvailableState();
        java.lang.String str33 = availableState32.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern37 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str38 = equipmentForStatePattern37.getId();
        availableState32.markMaintenance(equipmentForStatePattern37);
        pendingPickupState0.finishMaintenance(equipmentForStatePattern37);
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        pendingPickupState0.disable(equipmentForStatePattern44);
        app.EquipmentForStatePattern equipmentForStatePattern49 = new app.EquipmentForStatePattern("Deducting $10.00 from registered Research Grant funds.", "AVAILABLE", "Deducting $10.00 from registered Research Grant funds.");
        pendingPickupState0.finishMaintenance(equipmentForStatePattern49);
        equipmentForStatePattern49.release();
        equipmentForStatePattern49.finishMaintenance();
        equipmentForStatePattern49.enable();
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AVAILABLE" + "'", str33, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("DISABLED", "Charging $1.00 to University Department Account. Pending Dean approval.", "");
        equipmentForStatePattern3.markMaintenance();
        equipmentForStatePattern3.finishMaintenance();
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.release();
        disabledState0.reserve(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern10 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState0.markMaintenance(equipmentForStatePattern10);
        app.DisabledState disabledState12 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern16 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern16.disable();
        equipmentForStatePattern16.release();
        disabledState12.release(equipmentForStatePattern16);
        app.EquipmentForStatePattern equipmentForStatePattern23 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern23.disable();
        disabledState12.markMaintenance(equipmentForStatePattern23);
        equipmentForStatePattern23.finishMaintenance();
        disabledState0.disable(equipmentForStatePattern23);
        java.lang.String str28 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("Processing direct debit payment of $-1.00. No extra fees.", "Processing credit card payment of $10.20 plus 2% processing fee.", "Charging $100.00 to University Department Account. Pending Dean approval.");
        disabledState0.reserve(equipmentForStatePattern32);
        app.DisabledState disabledState34 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern38 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern38.disable();
        equipmentForStatePattern38.release();
        disabledState34.release(equipmentForStatePattern38);
        app.EquipmentForStatePattern equipmentForStatePattern45 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern45.disable();
        disabledState34.markMaintenance(equipmentForStatePattern45);
        equipmentForStatePattern45.finishMaintenance();
        boolean boolean49 = equipmentForStatePattern45.isAvailable();
        java.lang.String str50 = equipmentForStatePattern45.getStateName();
        equipmentForStatePattern45.reserve();
        disabledState0.markMaintenance(equipmentForStatePattern45);
        equipmentForStatePattern45.confirmReservation();
        java.lang.String str54 = equipmentForStatePattern45.getDescription();
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DISABLED" + "'", str28, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "DISABLED" + "'", str50, "DISABLED");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        app.BookingSystem bookingSystem0 = new app.BookingSystem();
        app.ReservationManager reservationManager1 = new app.ReservationManager();
        app.Sensor sensor3 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager1.update(sensor3);
        app.UsageLogger usageLogger5 = new app.UsageLogger();
        java.util.List<java.lang.String> strList6 = usageLogger5.getLogs();
        sensor3.detach((app.Observer) usageLogger5);
        app.ReservationManager reservationManager8 = new app.ReservationManager();
        sensor3.detach((app.Observer) reservationManager8);
        bookingSystem0.update(sensor3);
        sensor3.notifyObservers();
        app.BookingSystem bookingSystem12 = new app.BookingSystem();
        app.Sensor sensor14 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem12.update(sensor14);
        app.BookingSystem bookingSystem16 = new app.BookingSystem();
        app.Sensor sensor18 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem16.update(sensor18);
        sensor14.attach((app.Observer) bookingSystem16);
        sensor3.attach((app.Observer) bookingSystem16);
        java.util.List<app.Reservation> reservationList22 = bookingSystem16.getReservations();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        app.ReservationStatus reservationStatus26 = null;
        app.Reservation reservation27 = new app.Reservation("Processing direct debit payment of $97.00. No extra fees.", localDateTime24, localDateTime25, reservationStatus26);
        app.CancelReservationCommand cancelReservationCommand28 = new app.CancelReservationCommand(reservation27);
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = reservation27.extendReservation(localDateTime29);
        reservation27.cancelReservation();
        java.lang.String str32 = reservation27.getReservationId();
        bookingSystem16.addReservation(reservation27);
        app.ReservationStatus reservationStatus34 = reservation27.getStatus();
        java.time.LocalDateTime localDateTime35 = reservation27.getEndTime();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str32, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + app.ReservationStatus.CANCELLED + "'", reservationStatus34.equals(app.ReservationStatus.CANCELLED));
        org.junit.Assert.assertNull(localDateTime35);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.disable();
        equipmentForStatePattern35.release();
        equipmentForStatePattern35.enable();
        java.lang.String str39 = equipmentForStatePattern35.getId();
        pendingPickupState0.disable(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern44.disable();
        equipmentForStatePattern44.release();
        equipmentForStatePattern44.enable();
        java.lang.String str48 = equipmentForStatePattern44.getId();
        pendingPickupState0.enable(equipmentForStatePattern44);
        java.lang.String str50 = pendingPickupState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern54 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str55 = equipmentForStatePattern54.getId();
        equipmentForStatePattern54.disable();
        pendingPickupState0.release(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("Deducting $-1.00 from registered Research Grant funds.", "Charging $-1.00 to University Department Account. Pending Dean approval.", "Processing direct debit payment of $100.00. No extra fees.");
        pendingPickupState0.reserve(equipmentForStatePattern61);
        equipmentForStatePattern61.markMaintenance();
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PENDING_PICKUP" + "'", str50, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str4 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 'a');
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str2, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str4, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str6, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        app.Equipment equipment3 = new app.Equipment("Processing direct debit payment of $1.00. No extra fees.", "Processing direct debit payment of $1.00. No extra fees.", "Processing credit card payment of $10.20 plus 2% processing fee.");
        app.Sensor sensor5 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        boolean boolean6 = sensor5.isEquipmentActive();
        sensor5.stopEquipment();
        app.ReservationManager reservationManager8 = new app.ReservationManager();
        app.Sensor sensor10 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager8.update(sensor10);
        app.UsageLogger usageLogger12 = new app.UsageLogger();
        java.util.List<java.lang.String> strList13 = usageLogger12.getLogs();
        sensor10.detach((app.Observer) usageLogger12);
        app.ReservationManager reservationManager15 = new app.ReservationManager();
        sensor10.detach((app.Observer) reservationManager15);
        java.util.List<app.Reservation> reservationList17 = reservationManager15.getReservations();
        app.Sensor sensor19 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        java.lang.String str20 = sensor19.getSensorId();
        boolean boolean21 = sensor19.isEquipmentActive();
        app.ReservationManager reservationManager22 = new app.ReservationManager();
        app.Sensor sensor24 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager22.update(sensor24);
        app.UsageLogger usageLogger26 = new app.UsageLogger();
        java.util.List<java.lang.String> strList27 = usageLogger26.getLogs();
        sensor24.detach((app.Observer) usageLogger26);
        app.UsageLogger usageLogger29 = new app.UsageLogger();
        sensor24.attach((app.Observer) usageLogger29);
        sensor19.attach((app.Observer) usageLogger29);
        reservationManager15.update(sensor19);
        sensor5.attach((app.Observer) reservationManager15);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        app.ReservationStatus reservationStatus37 = null;
        app.Reservation reservation38 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime35, localDateTime36, reservationStatus37);
        app.CancelReservationCommand cancelReservationCommand39 = new app.CancelReservationCommand(reservation38);
        java.time.LocalDateTime localDateTime40 = reservation38.getStartTime();
        app.CancelReservationCommand cancelReservationCommand41 = new app.CancelReservationCommand(reservation38);
        app.CancelReservationCommand cancelReservationCommand42 = new app.CancelReservationCommand(reservation38);
        reservationManager15.addReservation(reservation38);
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = reservation38.extendReservation(localDateTime44);
        java.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = reservation38.extendReservation(localDateTime46);
        java.time.LocalDateTime localDateTime48 = null;
        app.ExtendReservationCommand extendReservationCommand49 = new app.ExtendReservationCommand(equipment3, reservation38, localDateTime48);
        java.time.LocalDateTime localDateTime50 = reservation38.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(localDateTime50);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.UsageLogger usageLogger7 = new app.UsageLogger();
        sensor2.attach((app.Observer) usageLogger7);
        app.BookingSystem bookingSystem9 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList10 = bookingSystem9.getReservations();
        app.ReservationManager reservationManager11 = new app.ReservationManager();
        app.Sensor sensor13 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager11.update(sensor13);
        app.UsageLogger usageLogger15 = new app.UsageLogger();
        java.util.List<java.lang.String> strList16 = usageLogger15.getLogs();
        sensor13.detach((app.Observer) usageLogger15);
        app.UsageLogger usageLogger18 = new app.UsageLogger();
        sensor13.attach((app.Observer) usageLogger18);
        app.ReservationManager reservationManager20 = new app.ReservationManager();
        app.Sensor sensor22 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager20.update(sensor22);
        app.UsageLogger usageLogger24 = new app.UsageLogger();
        java.util.List<java.lang.String> strList25 = usageLogger24.getLogs();
        sensor22.detach((app.Observer) usageLogger24);
        app.UsageLogger usageLogger27 = new app.UsageLogger();
        sensor22.attach((app.Observer) usageLogger27);
        sensor13.detach((app.Observer) usageLogger27);
        app.Sensor sensor31 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger27.update(sensor31);
        bookingSystem9.update(sensor31);
        app.BookingSystem bookingSystem34 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList35 = bookingSystem34.getReservations();
        app.BookingSystem bookingSystem36 = new app.BookingSystem();
        app.Sensor sensor38 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem36.update(sensor38);
        bookingSystem34.update(sensor38);
        bookingSystem9.update(sensor38);
        usageLogger7.update(sensor38);
        app.ReservationManager reservationManager43 = new app.ReservationManager();
        app.Sensor sensor45 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager43.update(sensor45);
        app.UsageLogger usageLogger47 = new app.UsageLogger();
        java.util.List<java.lang.String> strList48 = usageLogger47.getLogs();
        sensor45.detach((app.Observer) usageLogger47);
        app.UsageLogger usageLogger50 = new app.UsageLogger();
        sensor45.attach((app.Observer) usageLogger50);
        java.util.List<java.lang.String> strList52 = usageLogger50.getLogs();
        app.ReservationManager reservationManager53 = new app.ReservationManager();
        app.Sensor sensor55 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager53.update(sensor55);
        app.UsageLogger usageLogger57 = new app.UsageLogger();
        java.util.List<java.lang.String> strList58 = usageLogger57.getLogs();
        sensor55.detach((app.Observer) usageLogger57);
        usageLogger50.update(sensor55);
        sensor55.notifyObservers();
        usageLogger7.update(sensor55);
        sensor55.notifyObservers();
        sensor55.stopEquipment();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        availableState0.finishMaintenance(equipmentForStatePattern4);
        java.lang.String str8 = availableState0.getStateName();
        app.AvailableState availableState9 = new app.AvailableState();
        app.DisabledState disabledState10 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern14 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern14.disable();
        equipmentForStatePattern14.release();
        disabledState10.release(equipmentForStatePattern14);
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern21.disable();
        disabledState10.markMaintenance(equipmentForStatePattern21);
        app.DisabledState disabledState24 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern28.disable();
        equipmentForStatePattern28.release();
        disabledState24.release(equipmentForStatePattern28);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.disable();
        disabledState24.markMaintenance(equipmentForStatePattern35);
        disabledState10.finishMaintenance(equipmentForStatePattern35);
        app.DisabledState disabledState39 = new app.DisabledState();
        app.DisabledState disabledState40 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern44.release();
        disabledState40.reserve(equipmentForStatePattern44);
        disabledState39.release(equipmentForStatePattern44);
        disabledState10.disable(equipmentForStatePattern44);
        availableState9.disable(equipmentForStatePattern44);
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern53.confirmReservation();
        availableState9.markMaintenance(equipmentForStatePattern53);
        equipmentForStatePattern53.enable();
        availableState0.disable(equipmentForStatePattern53);
        boolean boolean58 = equipmentForStatePattern53.isAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVAILABLE" + "'", str8, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.DisabledState disabledState32 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern36 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern36.release();
        disabledState32.reserve(equipmentForStatePattern36);
        pendingPickupState0.reserve(equipmentForStatePattern36);
        app.EquipmentForStatePattern equipmentForStatePattern43 = new app.EquipmentForStatePattern("Processing direct debit payment of $0.00. No extra fees.", "Processing direct debit payment of $0.00. No extra fees.", "");
        pendingPickupState0.finishMaintenance(equipmentForStatePattern43);
        app.EquipmentForStatePattern equipmentForStatePattern48 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern48.release();
        equipmentForStatePattern48.finishMaintenance();
        pendingPickupState0.finishMaintenance(equipmentForStatePattern48);
        java.lang.String str52 = pendingPickupState0.getStateName();
        app.DisabledState disabledState53 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern57 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern57.release();
        disabledState53.reserve(equipmentForStatePattern57);
        app.EquipmentForStatePattern equipmentForStatePattern63 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState53.markMaintenance(equipmentForStatePattern63);
        app.DisabledState disabledState65 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern69 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern69.disable();
        equipmentForStatePattern69.release();
        disabledState65.release(equipmentForStatePattern69);
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern76.disable();
        disabledState65.markMaintenance(equipmentForStatePattern76);
        equipmentForStatePattern76.finishMaintenance();
        disabledState53.disable(equipmentForStatePattern76);
        java.lang.String str81 = disabledState53.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern85 = new app.EquipmentForStatePattern("Processing direct debit payment of $-1.00. No extra fees.", "Processing credit card payment of $10.20 plus 2% processing fee.", "Charging $100.00 to University Department Account. Pending Dean approval.");
        disabledState53.reserve(equipmentForStatePattern85);
        pendingPickupState0.release(equipmentForStatePattern85);
        app.EquipmentForStatePattern equipmentForStatePattern91 = new app.EquipmentForStatePattern("Deducting $0.00 from registered Research Grant funds.", "Charging $-1.00 to University Department Account. Pending Dean approval.", "Charging $35.00 to University Department Account. Pending Dean approval.");
        pendingPickupState0.markMaintenance(equipmentForStatePattern91);
        java.lang.String str93 = pendingPickupState0.getStateName();
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PENDING_PICKUP" + "'", str52, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "DISABLED" + "'", str81, "DISABLED");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "PENDING_PICKUP" + "'", str93, "PENDING_PICKUP");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        disabledState0.release(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.disable();
        disabledState0.markMaintenance(equipmentForStatePattern11);
        app.DisabledState disabledState14 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern18.disable();
        equipmentForStatePattern18.release();
        disabledState14.release(equipmentForStatePattern18);
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern25.disable();
        disabledState14.markMaintenance(equipmentForStatePattern25);
        disabledState0.finishMaintenance(equipmentForStatePattern25);
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern32.release();
        equipmentForStatePattern32.confirmReservation();
        disabledState0.disable(equipmentForStatePattern32);
        java.lang.String str36 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("Charging $97.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $0.00 from registered Research Grant funds.");
        disabledState0.release(equipmentForStatePattern40);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DISABLED" + "'", str36, "DISABLED");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        app.BookingSystem bookingSystem0 = new app.BookingSystem();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem0.update(sensor2);
        sensor2.stopEquipment();
        sensor2.notifyObservers();
        app.ReservationManager reservationManager6 = new app.ReservationManager();
        app.Sensor sensor8 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager6.update(sensor8);
        app.ReservationManager reservationManager10 = new app.ReservationManager();
        app.Sensor sensor12 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager10.update(sensor12);
        app.UsageLogger usageLogger14 = new app.UsageLogger();
        java.util.List<java.lang.String> strList15 = usageLogger14.getLogs();
        sensor12.detach((app.Observer) usageLogger14);
        app.UsageLogger usageLogger17 = new app.UsageLogger();
        sensor12.attach((app.Observer) usageLogger17);
        java.util.List<java.lang.String> strList19 = usageLogger17.getLogs();
        app.ReservationManager reservationManager20 = new app.ReservationManager();
        app.Sensor sensor22 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager20.update(sensor22);
        app.UsageLogger usageLogger24 = new app.UsageLogger();
        java.util.List<java.lang.String> strList25 = usageLogger24.getLogs();
        sensor22.detach((app.Observer) usageLogger24);
        usageLogger17.update(sensor22);
        reservationManager6.update(sensor22);
        java.util.List<app.Reservation> reservationList29 = reservationManager6.getReservations();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        app.ReservationStatus reservationStatus33 = null;
        app.Reservation reservation34 = new app.Reservation("Deducting $10.00 from registered Research Grant funds.", localDateTime31, localDateTime32, reservationStatus33);
        java.time.LocalDateTime localDateTime35 = null;
        reservation34.setEndTime(localDateTime35);
        java.time.LocalDateTime localDateTime37 = reservation34.getStartTime();
        reservationManager6.addReservation(reservation34);
        sensor2.detach((app.Observer) reservationManager6);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        app.ReservationStatus reservationStatus43 = null;
        app.Reservation reservation44 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime41, localDateTime42, reservationStatus43);
        java.time.LocalDateTime localDateTime45 = null;
        reservation44.setStartTime(localDateTime45);
        reservationManager6.addReservation(reservation44);
        app.ReservationStatus reservationStatus48 = reservation44.getStatus();
        app.CancelReservationCommand cancelReservationCommand49 = new app.CancelReservationCommand(reservation44);
        boolean boolean50 = cancelReservationCommand49.execute();
        boolean boolean51 = cancelReservationCommand49.execute();
        boolean boolean52 = cancelReservationCommand49.execute();
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(reservationStatus48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.DisabledState disabledState32 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern36 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern36.release();
        disabledState32.reserve(equipmentForStatePattern36);
        pendingPickupState0.reserve(equipmentForStatePattern36);
        app.EquipmentForStatePattern equipmentForStatePattern43 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern43.release();
        boolean boolean45 = equipmentForStatePattern43.isAvailable();
        pendingPickupState0.finishMaintenance(equipmentForStatePattern43);
        app.EquipmentForStatePattern equipmentForStatePattern50 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern50.disable();
        equipmentForStatePattern50.release();
        boolean boolean53 = equipmentForStatePattern50.isAvailable();
        pendingPickupState0.release(equipmentForStatePattern50);
        app.DisabledState disabledState55 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern59.release();
        disabledState55.reserve(equipmentForStatePattern59);
        app.EquipmentForStatePattern equipmentForStatePattern65 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState55.markMaintenance(equipmentForStatePattern65);
        equipmentForStatePattern65.enable();
        boolean boolean68 = equipmentForStatePattern65.isAvailable();
        pendingPickupState0.markMaintenance(equipmentForStatePattern65);
        app.DisabledState disabledState70 = new app.DisabledState();
        app.DisabledState disabledState71 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern75.release();
        disabledState71.reserve(equipmentForStatePattern75);
        disabledState70.release(equipmentForStatePattern75);
        pendingPickupState0.disable(equipmentForStatePattern75);
        java.lang.String str80 = equipmentForStatePattern75.getStateName();
        equipmentForStatePattern75.disable();
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "AVAILABLE" + "'", str80, "AVAILABLE");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) (-1L), localDateTime2);
        reservationforStatePattern3.payDeposit();
        reservationforStatePattern3.payDeposit();
        double double7 = reservationforStatePattern3.calculateFinalPayment((double) (byte) -1);
        java.lang.String str8 = reservationforStatePattern3.getReservationId();
        reservationforStatePattern3.payDeposit();
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.arrive(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        app.Equipment equipment3 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        app.ReservationStatus reservationStatus7 = null;
        app.Reservation reservation8 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime5, localDateTime6, reservationStatus7);
        app.CancelReservationCommand cancelReservationCommand9 = new app.CancelReservationCommand(reservation8);
        java.time.LocalDateTime localDateTime10 = reservation8.getStartTime();
        java.time.LocalDateTime localDateTime11 = null;
        app.ExtendReservationCommand extendReservationCommand12 = new app.ExtendReservationCommand(equipment3, reservation8, localDateTime11);
        app.ReservationManager reservationManager13 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        app.ReservationStatus reservationStatus17 = null;
        app.Reservation reservation18 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime15, localDateTime16, reservationStatus17);
        java.time.LocalDateTime localDateTime19 = null;
        reservation18.setStartTime(localDateTime19);
        java.time.LocalDateTime localDateTime21 = null;
        reservation18.setEndTime(localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        reservation18.setEndTime(localDateTime23);
        reservationManager13.addReservation(reservation18);
        java.time.LocalDateTime localDateTime26 = null;
        app.ExtendReservationCommand extendReservationCommand27 = new app.ExtendReservationCommand(equipment3, reservation18, localDateTime26);
        app.ReservationStatus reservationStatus28 = reservation18.getStatus();
        java.time.LocalDateTime localDateTime29 = reservation18.getEndTime();
        java.time.LocalDateTime localDateTime30 = null;
        reservation18.setEndTime(localDateTime30);
        app.CancelReservationCommand cancelReservationCommand32 = new app.CancelReservationCommand(reservation18);
        boolean boolean33 = cancelReservationCommand32.execute();
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(reservationStatus28);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("hi!", "Deducting $10.00 from registered Research Grant funds.", "Processing direct debit payment of $15.00. No extra fees.");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Processing direct debit payment of $10.00. No extra fees.", (double) 0.0f, localDateTime2);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) '4');
        double double7 = reservationforStatePattern3.calculateFinalPayment((double) (byte) 100);
        java.time.LocalDateTime localDateTime8 = null;
        reservationforStatePattern3.arrive(localDateTime8);
        double double11 = reservationforStatePattern3.calculateFinalPayment(15.0d);
        java.time.LocalDateTime localDateTime12 = reservationforStatePattern3.getStartTime();
        reservationforStatePattern3.payDeposit();
        double double14 = reservationforStatePattern3.getDepositAmount();
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.arrive(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        app.BookingSystem bookingSystem0 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList1 = bookingSystem0.getReservations();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        app.ReservationStatus reservationStatus5 = null;
        app.Reservation reservation6 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime3, localDateTime4, reservationStatus5);
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setStartTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation6.setEndTime(localDateTime11);
        bookingSystem0.addReservation(reservation6);
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservation6.extendReservation(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservation6.extendReservation(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation6.setStartTime(localDateTime18);
        app.CancelReservationCommand cancelReservationCommand20 = new app.CancelReservationCommand(reservation6);
        java.time.LocalDateTime localDateTime21 = null;
        reservation6.setStartTime(localDateTime21);
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.disable();
        equipmentForStatePattern35.release();
        equipmentForStatePattern35.enable();
        java.lang.String str39 = equipmentForStatePattern35.getId();
        pendingPickupState0.disable(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern44.disable();
        equipmentForStatePattern44.release();
        equipmentForStatePattern44.enable();
        java.lang.String str48 = equipmentForStatePattern44.getId();
        pendingPickupState0.enable(equipmentForStatePattern44);
        app.AvailableState availableState50 = new app.AvailableState();
        app.DisabledState disabledState51 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern55 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern55.disable();
        equipmentForStatePattern55.release();
        disabledState51.release(equipmentForStatePattern55);
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern62.disable();
        disabledState51.markMaintenance(equipmentForStatePattern62);
        app.DisabledState disabledState65 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern69 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern69.disable();
        equipmentForStatePattern69.release();
        disabledState65.release(equipmentForStatePattern69);
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern76.disable();
        disabledState65.markMaintenance(equipmentForStatePattern76);
        disabledState51.finishMaintenance(equipmentForStatePattern76);
        app.DisabledState disabledState80 = new app.DisabledState();
        app.DisabledState disabledState81 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern85 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern85.release();
        disabledState81.reserve(equipmentForStatePattern85);
        disabledState80.release(equipmentForStatePattern85);
        disabledState51.disable(equipmentForStatePattern85);
        availableState50.disable(equipmentForStatePattern85);
        equipmentForStatePattern85.confirmReservation();
        java.lang.String str92 = equipmentForStatePattern85.getStateName();
        java.lang.String str93 = equipmentForStatePattern85.getLocation();
        equipmentForStatePattern85.markMaintenance();
        pendingPickupState0.enable(equipmentForStatePattern85);
        equipmentForStatePattern85.markMaintenance();
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "RESERVED" + "'", str92, "RESERVED");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        reservationforStatePattern3.payDeposit();
        reservationforStatePattern3.payDeposit();
        reservationforStatePattern3.payDeposit();
        double double7 = reservationforStatePattern3.getDepositAmount();
        double double9 = reservationforStatePattern3.calculateFinalPayment((double) 0);
        java.time.LocalDateTime localDateTime10 = reservationforStatePattern3.getStartTime();
        app.DepositState depositState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.setDepositState(depositState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"app.DepositState.getStateName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Processing direct debit payment of $35.00. No extra fees.", (double) (byte) 1, localDateTime2);
        reservationforStatePattern3.payDeposit();
        double double5 = reservationforStatePattern3.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.disable();
        equipmentForStatePattern35.release();
        equipmentForStatePattern35.enable();
        java.lang.String str39 = equipmentForStatePattern35.getId();
        pendingPickupState0.disable(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern44.disable();
        equipmentForStatePattern44.release();
        equipmentForStatePattern44.enable();
        java.lang.String str48 = equipmentForStatePattern44.getId();
        pendingPickupState0.enable(equipmentForStatePattern44);
        java.lang.String str50 = pendingPickupState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern54 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str55 = equipmentForStatePattern54.getId();
        equipmentForStatePattern54.disable();
        pendingPickupState0.release(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str62 = equipmentForStatePattern61.getId();
        pendingPickupState0.release(equipmentForStatePattern61);
        app.EquipmentForStatePattern equipmentForStatePattern67 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern67.release();
        equipmentForStatePattern67.confirmReservation();
        equipmentForStatePattern67.release();
        pendingPickupState0.finishMaintenance(equipmentForStatePattern67);
        app.DisabledState disabledState72 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern76.release();
        disabledState72.reserve(equipmentForStatePattern76);
        java.lang.String str79 = disabledState72.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern83 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern83.disable();
        equipmentForStatePattern83.release();
        equipmentForStatePattern83.enable();
        java.lang.String str87 = equipmentForStatePattern83.getId();
        equipmentForStatePattern83.markPendingPickup();
        disabledState72.release(equipmentForStatePattern83);
        pendingPickupState0.finishMaintenance(equipmentForStatePattern83);
        boolean boolean91 = equipmentForStatePattern83.isAvailable();
        equipmentForStatePattern83.finishMaintenance();
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PENDING_PICKUP" + "'", str50, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "DISABLED" + "'", str79, "DISABLED");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        java.lang.String str32 = equipmentForStatePattern26.getDescription();
        equipmentForStatePattern26.finishMaintenance();
        java.lang.String str34 = equipmentForStatePattern26.getDescription();
        java.lang.String str35 = equipmentForStatePattern26.getDescription();
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        app.Equipment equipment3 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        app.ReservationStatus reservationStatus7 = null;
        app.Reservation reservation8 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime5, localDateTime6, reservationStatus7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation8.setStartTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation8.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation8.getEndTime();
        app.CancelReservationCommand cancelReservationCommand14 = new app.CancelReservationCommand(reservation8);
        java.lang.String str15 = reservation8.getReservationId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        app.ModifyReservationCommand modifyReservationCommand18 = new app.ModifyReservationCommand(equipment3, reservation8, localDateTime16, localDateTime17);
        app.Reservation reservation19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        app.ExtendReservationCommand extendReservationCommand21 = new app.ExtendReservationCommand(equipment3, reservation19, localDateTime20);
        app.Equipment equipment25 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        app.ReservationManager reservationManager26 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        app.ReservationStatus reservationStatus30 = null;
        app.Reservation reservation31 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime28, localDateTime29, reservationStatus30);
        java.time.LocalDateTime localDateTime32 = null;
        reservation31.setStartTime(localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        reservation31.setEndTime(localDateTime34);
        java.time.LocalDateTime localDateTime36 = null;
        reservation31.setEndTime(localDateTime36);
        reservationManager26.addReservation(reservation31);
        java.time.LocalDateTime localDateTime39 = reservation31.getEndTime();
        java.time.LocalDateTime localDateTime40 = null;
        app.ExtendReservationCommand extendReservationCommand41 = new app.ExtendReservationCommand(equipment25, reservation31, localDateTime40);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        app.ReservationStatus reservationStatus45 = null;
        app.Reservation reservation46 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime43, localDateTime44, reservationStatus45);
        java.time.LocalDateTime localDateTime47 = null;
        reservation46.setStartTime(localDateTime47);
        java.time.LocalDateTime localDateTime49 = null;
        reservation46.setEndTime(localDateTime49);
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        app.ModifyReservationCommand modifyReservationCommand53 = new app.ModifyReservationCommand(equipment25, reservation46, localDateTime51, localDateTime52);
        java.time.LocalDateTime localDateTime54 = reservation46.getStartTime();
        app.CancelReservationCommand cancelReservationCommand55 = new app.CancelReservationCommand(reservation46);
        java.time.LocalDateTime localDateTime56 = null;
        app.ExtendReservationCommand extendReservationCommand57 = new app.ExtendReservationCommand(equipment3, reservation46, localDateTime56);
        app.BookingSystem bookingSystem58 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList59 = bookingSystem58.getReservations();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        app.ReservationStatus reservationStatus63 = null;
        app.Reservation reservation64 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime61, localDateTime62, reservationStatus63);
        java.time.LocalDateTime localDateTime65 = null;
        reservation64.setStartTime(localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        reservation64.setEndTime(localDateTime67);
        java.time.LocalDateTime localDateTime69 = null;
        reservation64.setEndTime(localDateTime69);
        bookingSystem58.addReservation(reservation64);
        app.ReservationStatus reservationStatus72 = reservation64.getStatus();
        reservation64.cancelReservation();
        java.time.LocalDateTime localDateTime74 = null;
        boolean boolean75 = reservation64.extendReservation(localDateTime74);
        java.time.LocalDateTime localDateTime76 = null;
        app.ExtendReservationCommand extendReservationCommand77 = new app.ExtendReservationCommand(equipment3, reservation64, localDateTime76);
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        app.ReservationStatus reservationStatus81 = null;
        app.Reservation reservation82 = new app.Reservation("", localDateTime79, localDateTime80, reservationStatus81);
        java.time.LocalDateTime localDateTime83 = reservation82.getStartTime();
        java.time.LocalDateTime localDateTime84 = null;
        reservation82.setEndTime(localDateTime84);
        java.time.LocalDateTime localDateTime86 = null;
        reservation82.setEndTime(localDateTime86);
        java.time.LocalDateTime localDateTime88 = null;
        app.ExtendReservationCommand extendReservationCommand89 = new app.ExtendReservationCommand(equipment3, reservation82, localDateTime88);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str15, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDateTime54);
        org.junit.Assert.assertNotNull(reservationList59);
        org.junit.Assert.assertNull(reservationStatus72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(localDateTime83);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.BookingSystem bookingSystem7 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList8 = bookingSystem7.getReservations();
        app.ReservationManager reservationManager9 = new app.ReservationManager();
        app.Sensor sensor11 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager9.update(sensor11);
        app.UsageLogger usageLogger13 = new app.UsageLogger();
        java.util.List<java.lang.String> strList14 = usageLogger13.getLogs();
        sensor11.detach((app.Observer) usageLogger13);
        app.UsageLogger usageLogger16 = new app.UsageLogger();
        sensor11.attach((app.Observer) usageLogger16);
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        app.Sensor sensor20 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager18.update(sensor20);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        java.util.List<java.lang.String> strList23 = usageLogger22.getLogs();
        sensor20.detach((app.Observer) usageLogger22);
        app.UsageLogger usageLogger25 = new app.UsageLogger();
        sensor20.attach((app.Observer) usageLogger25);
        sensor11.detach((app.Observer) usageLogger25);
        app.Sensor sensor29 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger25.update(sensor29);
        bookingSystem7.update(sensor29);
        app.BookingSystem bookingSystem32 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList33 = bookingSystem32.getReservations();
        app.BookingSystem bookingSystem34 = new app.BookingSystem();
        app.Sensor sensor36 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem34.update(sensor36);
        bookingSystem32.update(sensor36);
        bookingSystem7.update(sensor36);
        sensor2.attach((app.Observer) bookingSystem7);
        app.ReservationManager reservationManager41 = new app.ReservationManager();
        app.Sensor sensor43 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager41.update(sensor43);
        app.UsageLogger usageLogger45 = new app.UsageLogger();
        java.util.List<java.lang.String> strList46 = usageLogger45.getLogs();
        sensor43.detach((app.Observer) usageLogger45);
        app.UsageLogger usageLogger48 = new app.UsageLogger();
        sensor43.attach((app.Observer) usageLogger48);
        sensor43.notifyObservers();
        sensor43.notifyObservers();
        app.ReservationManager reservationManager52 = new app.ReservationManager();
        app.Sensor sensor54 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager52.update(sensor54);
        app.UsageLogger usageLogger56 = new app.UsageLogger();
        java.util.List<java.lang.String> strList57 = usageLogger56.getLogs();
        sensor54.detach((app.Observer) usageLogger56);
        app.ReservationManager reservationManager59 = new app.ReservationManager();
        sensor54.detach((app.Observer) reservationManager59);
        app.ReservationManager reservationManager61 = new app.ReservationManager();
        app.Sensor sensor63 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager61.update(sensor63);
        app.UsageLogger usageLogger65 = new app.UsageLogger();
        java.util.List<java.lang.String> strList66 = usageLogger65.getLogs();
        sensor63.detach((app.Observer) usageLogger65);
        app.Sensor sensor69 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger65.update(sensor69);
        sensor54.detach((app.Observer) usageLogger65);
        app.Sensor sensor73 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        java.lang.String str74 = sensor73.getSensorId();
        boolean boolean75 = sensor73.isEquipmentActive();
        usageLogger65.update(sensor73);
        java.util.List<java.lang.String> strList77 = usageLogger65.getLogs();
        sensor43.attach((app.Observer) usageLogger65);
        sensor2.attach((app.Observer) usageLogger65);
        sensor2.notifyObservers();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str74, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strList77);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.AvailableState availableState32 = new app.AvailableState();
        java.lang.String str33 = availableState32.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern37 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str38 = equipmentForStatePattern37.getId();
        availableState32.markMaintenance(equipmentForStatePattern37);
        pendingPickupState0.finishMaintenance(equipmentForStatePattern37);
        equipmentForStatePattern37.disable();
        equipmentForStatePattern37.markMaintenance();
        equipmentForStatePattern37.disable();
        equipmentForStatePattern37.finishMaintenance();
        equipmentForStatePattern37.disable();
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AVAILABLE" + "'", str33, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        app.Equipment equipment3 = new app.Equipment("Processing credit card payment of $102.00 plus 2% processing fee.", "DISABLED", "Processing credit card payment of $30.60 plus 2% processing fee.");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        reservationforStatePattern3.arrive(localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservationforStatePattern3.arrive(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservationforStatePattern3.getStartTime();
        double double10 = reservationforStatePattern3.calculateFinalPayment(15.0d);
        java.time.LocalDateTime localDateTime11 = reservationforStatePattern3.getStartTime();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        app.Sensor sensor1 = new app.Sensor("");
        app.ReservationManager reservationManager2 = new app.ReservationManager();
        app.Sensor sensor4 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager2.update(sensor4);
        app.UsageLogger usageLogger6 = new app.UsageLogger();
        java.util.List<java.lang.String> strList7 = usageLogger6.getLogs();
        sensor4.detach((app.Observer) usageLogger6);
        app.UsageLogger usageLogger9 = new app.UsageLogger();
        sensor4.attach((app.Observer) usageLogger9);
        java.util.List<java.lang.String> strList11 = usageLogger9.getLogs();
        sensor1.detach((app.Observer) usageLogger9);
        app.ReservationManager reservationManager13 = new app.ReservationManager();
        app.Sensor sensor15 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager13.update(sensor15);
        app.UsageLogger usageLogger17 = new app.UsageLogger();
        java.util.List<java.lang.String> strList18 = usageLogger17.getLogs();
        sensor15.detach((app.Observer) usageLogger17);
        app.ReservationManager reservationManager20 = new app.ReservationManager();
        app.Sensor sensor22 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager20.update(sensor22);
        app.UsageLogger usageLogger24 = new app.UsageLogger();
        java.util.List<java.lang.String> strList25 = usageLogger24.getLogs();
        sensor22.detach((app.Observer) usageLogger24);
        app.Sensor sensor28 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger24.update(sensor28);
        sensor15.detach((app.Observer) usageLogger24);
        app.ReservationManager reservationManager31 = new app.ReservationManager();
        app.Sensor sensor33 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager31.update(sensor33);
        app.UsageLogger usageLogger35 = new app.UsageLogger();
        java.util.List<java.lang.String> strList36 = usageLogger35.getLogs();
        sensor33.detach((app.Observer) usageLogger35);
        app.UsageLogger usageLogger38 = new app.UsageLogger();
        sensor33.attach((app.Observer) usageLogger38);
        usageLogger24.update(sensor33);
        usageLogger9.update(sensor33);
        app.ReservationManager reservationManager42 = new app.ReservationManager();
        app.Sensor sensor44 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager42.update(sensor44);
        app.UsageLogger usageLogger46 = new app.UsageLogger();
        java.util.List<java.lang.String> strList47 = usageLogger46.getLogs();
        sensor44.detach((app.Observer) usageLogger46);
        app.UsageLogger usageLogger49 = new app.UsageLogger();
        sensor44.attach((app.Observer) usageLogger49);
        sensor33.attach((app.Observer) usageLogger49);
        app.ReservationManager reservationManager52 = new app.ReservationManager();
        app.Sensor sensor54 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager52.update(sensor54);
        app.UsageLogger usageLogger56 = new app.UsageLogger();
        java.util.List<java.lang.String> strList57 = usageLogger56.getLogs();
        sensor54.detach((app.Observer) usageLogger56);
        sensor54.notifyObservers();
        app.ReservationManager reservationManager60 = new app.ReservationManager();
        java.util.List<app.Reservation> reservationList61 = reservationManager60.getReservations();
        sensor54.detach((app.Observer) reservationManager60);
        app.Observer observer63 = null;
        sensor54.detach(observer63);
        usageLogger49.update(sensor54);
        app.ReservationManager reservationManager66 = new app.ReservationManager();
        app.Sensor sensor68 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager66.update(sensor68);
        app.UsageLogger usageLogger70 = new app.UsageLogger();
        java.util.List<java.lang.String> strList71 = usageLogger70.getLogs();
        sensor68.detach((app.Observer) usageLogger70);
        app.UsageLogger usageLogger73 = new app.UsageLogger();
        sensor68.attach((app.Observer) usageLogger73);
        sensor68.notifyObservers();
        boolean boolean76 = sensor68.isEquipmentActive();
        app.ReservationManager reservationManager77 = new app.ReservationManager();
        app.Sensor sensor79 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager77.update(sensor79);
        sensor68.detach((app.Observer) reservationManager77);
        sensor54.detach((app.Observer) reservationManager77);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        app.AvailableState availableState0 = new app.AvailableState();
        java.lang.String str1 = availableState0.getStateName();
        app.DisabledState disabledState2 = new app.DisabledState();
        app.DisabledState disabledState3 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern7 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern7.disable();
        equipmentForStatePattern7.release();
        disabledState3.release(equipmentForStatePattern7);
        disabledState2.enable(equipmentForStatePattern7);
        availableState0.disable(equipmentForStatePattern7);
        java.lang.String str13 = availableState0.getStateName();
        app.DisabledState disabledState14 = new app.DisabledState();
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.release();
        disabledState15.reserve(equipmentForStatePattern19);
        disabledState14.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState14.markMaintenance(equipmentForStatePattern26);
        availableState0.reserve(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("Processing credit card payment of $53.04 plus 2% processing fee.", "Charging $1.00 to University Department Account. Pending Dean approval.", "Processing credit card payment of $102.00 plus 2% processing fee.");
        equipmentForStatePattern33.markPendingPickup();
        availableState0.enable(equipmentForStatePattern33);
        equipmentForStatePattern33.release();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AVAILABLE" + "'", str13, "AVAILABLE");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationStatus reservationStatus3 = null;
        app.Reservation reservation4 = new app.Reservation("Deducting $10.00 from registered Research Grant funds.", localDateTime1, localDateTime2, reservationStatus3);
        java.time.LocalDateTime localDateTime5 = null;
        reservation4.setEndTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = reservation4.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservation4.extendReservation(localDateTime8);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern3.release();
        boolean boolean5 = equipmentForStatePattern3.isAvailable();
        equipmentForStatePattern3.markMaintenance();
        equipmentForStatePattern3.markPendingPickup();
        equipmentForStatePattern3.reserve();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        availableState0.finishMaintenance(equipmentForStatePattern4);
        java.lang.String str8 = availableState0.getStateName();
        app.DisabledState disabledState9 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern13.disable();
        equipmentForStatePattern13.release();
        disabledState9.release(equipmentForStatePattern13);
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern20.disable();
        disabledState9.markMaintenance(equipmentForStatePattern20);
        equipmentForStatePattern20.finishMaintenance();
        java.lang.String str24 = equipmentForStatePattern20.getDescription();
        availableState0.disable(equipmentForStatePattern20);
        java.lang.String str26 = availableState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern30 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern30.markPendingPickup();
        equipmentForStatePattern30.enable();
        equipmentForStatePattern30.finishMaintenance();
        equipmentForStatePattern30.markPendingPickup();
        availableState0.reserve(equipmentForStatePattern30);
        app.PendingPickupState pendingPickupState36 = new app.PendingPickupState();
        app.DisabledState disabledState37 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern41 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern41.disable();
        equipmentForStatePattern41.release();
        disabledState37.release(equipmentForStatePattern41);
        app.EquipmentForStatePattern equipmentForStatePattern48 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern48.disable();
        disabledState37.markMaintenance(equipmentForStatePattern48);
        app.DisabledState disabledState51 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern55 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern55.disable();
        equipmentForStatePattern55.release();
        disabledState51.release(equipmentForStatePattern55);
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern62.disable();
        disabledState51.markMaintenance(equipmentForStatePattern62);
        disabledState37.finishMaintenance(equipmentForStatePattern62);
        equipmentForStatePattern62.enable();
        pendingPickupState36.enable(equipmentForStatePattern62);
        java.lang.String str68 = equipmentForStatePattern62.getDescription();
        equipmentForStatePattern62.enable();
        availableState0.markMaintenance(equipmentForStatePattern62);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVAILABLE" + "'", str8, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AVAILABLE" + "'", str26, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        app.Equipment equipment0 = null;
        app.ReservationManager reservationManager1 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        app.ReservationStatus reservationStatus5 = null;
        app.Reservation reservation6 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime3, localDateTime4, reservationStatus5);
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setStartTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation6.setEndTime(localDateTime11);
        reservationManager1.addReservation(reservation6);
        java.time.LocalDateTime localDateTime14 = reservation6.getEndTime();
        app.CancelReservationCommand cancelReservationCommand15 = new app.CancelReservationCommand(reservation6);
        java.time.LocalDateTime localDateTime16 = reservation6.getStartTime();
        app.CancelReservationCommand cancelReservationCommand17 = new app.CancelReservationCommand(reservation6);
        java.time.LocalDateTime localDateTime18 = null;
        reservation6.setStartTime(localDateTime18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        app.ModifyReservationCommand modifyReservationCommand22 = new app.ModifyReservationCommand(equipment0, reservation6, localDateTime20, localDateTime21);
        app.ReservationStatus reservationStatus23 = reservation6.getStatus();
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(reservationStatus23);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("Charging $30.00 to University Department Account. Pending Dean approval.", "Charging $97.00 to University Department Account. Pending Dean approval.", "Charging $10.00 to University Department Account. Pending Dean approval.");
        equipmentForStatePattern3.disable();
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationStatus reservationStatus3 = null;
        app.Reservation reservation4 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime1, localDateTime2, reservationStatus3);
        java.time.LocalDateTime localDateTime5 = null;
        reservation4.setStartTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = null;
        reservation4.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation4.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = reservation4.getStartTime();
        java.time.LocalDateTime localDateTime12 = reservation4.getEndTime();
        app.CancelReservationCommand cancelReservationCommand13 = new app.CancelReservationCommand(reservation4);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        app.Sensor sensor9 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager7.update(sensor9);
        app.UsageLogger usageLogger11 = new app.UsageLogger();
        java.util.List<java.lang.String> strList12 = usageLogger11.getLogs();
        sensor9.detach((app.Observer) usageLogger11);
        app.Sensor sensor15 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger11.update(sensor15);
        sensor2.detach((app.Observer) usageLogger11);
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        app.Sensor sensor20 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager18.update(sensor20);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        java.util.List<java.lang.String> strList23 = usageLogger22.getLogs();
        sensor20.detach((app.Observer) usageLogger22);
        app.ReservationManager reservationManager25 = new app.ReservationManager();
        app.Sensor sensor27 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager25.update(sensor27);
        app.UsageLogger usageLogger29 = new app.UsageLogger();
        java.util.List<java.lang.String> strList30 = usageLogger29.getLogs();
        sensor27.detach((app.Observer) usageLogger29);
        app.Sensor sensor33 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger29.update(sensor33);
        sensor20.detach((app.Observer) usageLogger29);
        sensor2.attach((app.Observer) usageLogger29);
        app.ReservationManager reservationManager37 = new app.ReservationManager();
        app.Sensor sensor39 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager37.update(sensor39);
        app.UsageLogger usageLogger41 = new app.UsageLogger();
        java.util.List<java.lang.String> strList42 = usageLogger41.getLogs();
        sensor39.detach((app.Observer) usageLogger41);
        app.UsageLogger usageLogger44 = new app.UsageLogger();
        sensor39.attach((app.Observer) usageLogger44);
        sensor2.attach((app.Observer) usageLogger44);
        java.util.List<java.lang.String> strList47 = usageLogger44.getLogs();
        app.BookingSystem bookingSystem48 = new app.BookingSystem();
        app.Sensor sensor50 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem48.update(sensor50);
        app.BookingSystem bookingSystem52 = new app.BookingSystem();
        app.Sensor sensor54 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem52.update(sensor54);
        sensor50.attach((app.Observer) bookingSystem52);
        sensor50.notifyObservers();
        sensor50.notifyObservers();
        usageLogger44.update(sensor50);
        java.util.List<java.lang.String> strList60 = usageLogger44.getLogs();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        app.BookingSystem bookingSystem0 = new app.BookingSystem();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem0.update(sensor2);
        app.BookingSystem bookingSystem4 = new app.BookingSystem();
        app.Sensor sensor6 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem4.update(sensor6);
        sensor2.attach((app.Observer) bookingSystem4);
        java.util.List<app.Reservation> reservationList9 = bookingSystem4.getReservations();
        app.ReservationManager reservationManager10 = new app.ReservationManager();
        app.Sensor sensor12 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager10.update(sensor12);
        app.Sensor sensor15 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        boolean boolean16 = sensor15.isEquipmentActive();
        reservationManager10.update(sensor15);
        app.Sensor sensor19 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        sensor19.notifyObservers();
        reservationManager10.update(sensor19);
        app.ReservationManager reservationManager22 = new app.ReservationManager();
        app.Sensor sensor24 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager22.update(sensor24);
        app.UsageLogger usageLogger26 = new app.UsageLogger();
        java.util.List<java.lang.String> strList27 = usageLogger26.getLogs();
        sensor24.detach((app.Observer) usageLogger26);
        app.UsageLogger usageLogger29 = new app.UsageLogger();
        sensor24.attach((app.Observer) usageLogger29);
        sensor24.notifyObservers();
        boolean boolean32 = sensor24.isEquipmentActive();
        app.ReservationManager reservationManager33 = new app.ReservationManager();
        app.Sensor sensor35 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager33.update(sensor35);
        sensor24.detach((app.Observer) reservationManager33);
        sensor24.notifyObservers();
        sensor24.notifyObservers();
        reservationManager10.update(sensor24);
        bookingSystem4.update(sensor24);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        app.ReservationStatus reservationStatus45 = null;
        app.Reservation reservation46 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime43, localDateTime44, reservationStatus45);
        app.CancelReservationCommand cancelReservationCommand47 = new app.CancelReservationCommand(reservation46);
        java.time.LocalDateTime localDateTime48 = reservation46.getEndTime();
        java.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = reservation46.extendReservation(localDateTime49);
        bookingSystem4.addReservation(reservation46);
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        app.ReservationStatus reservationStatus55 = null;
        app.Reservation reservation56 = new app.Reservation("Charging $32.00 to University Department Account. Pending Dean approval.", localDateTime53, localDateTime54, reservationStatus55);
        bookingSystem4.addReservation(reservation56);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        sensor2.detach((app.Observer) reservationManager7);
        app.ReservationManager reservationManager9 = new app.ReservationManager();
        app.Sensor sensor11 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager9.update(sensor11);
        app.UsageLogger usageLogger13 = new app.UsageLogger();
        java.util.List<java.lang.String> strList14 = usageLogger13.getLogs();
        sensor11.detach((app.Observer) usageLogger13);
        app.Sensor sensor17 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger13.update(sensor17);
        sensor2.detach((app.Observer) usageLogger13);
        sensor2.startEquipment();
        boolean boolean21 = sensor2.isEquipmentActive();
        sensor2.notifyObservers();
        sensor2.notifyObservers();
        app.Sensor sensor25 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        boolean boolean26 = sensor25.isEquipmentActive();
        sensor25.stopEquipment();
        app.ReservationManager reservationManager28 = new app.ReservationManager();
        app.Sensor sensor30 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager28.update(sensor30);
        app.UsageLogger usageLogger32 = new app.UsageLogger();
        java.util.List<java.lang.String> strList33 = usageLogger32.getLogs();
        sensor30.detach((app.Observer) usageLogger32);
        app.ReservationManager reservationManager35 = new app.ReservationManager();
        sensor30.detach((app.Observer) reservationManager35);
        java.util.List<app.Reservation> reservationList37 = reservationManager35.getReservations();
        app.Sensor sensor39 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        java.lang.String str40 = sensor39.getSensorId();
        boolean boolean41 = sensor39.isEquipmentActive();
        app.ReservationManager reservationManager42 = new app.ReservationManager();
        app.Sensor sensor44 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager42.update(sensor44);
        app.UsageLogger usageLogger46 = new app.UsageLogger();
        java.util.List<java.lang.String> strList47 = usageLogger46.getLogs();
        sensor44.detach((app.Observer) usageLogger46);
        app.UsageLogger usageLogger49 = new app.UsageLogger();
        sensor44.attach((app.Observer) usageLogger49);
        sensor39.attach((app.Observer) usageLogger49);
        reservationManager35.update(sensor39);
        sensor25.attach((app.Observer) reservationManager35);
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        app.ReservationStatus reservationStatus57 = null;
        app.Reservation reservation58 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime55, localDateTime56, reservationStatus57);
        app.CancelReservationCommand cancelReservationCommand59 = new app.CancelReservationCommand(reservation58);
        java.time.LocalDateTime localDateTime60 = reservation58.getStartTime();
        app.CancelReservationCommand cancelReservationCommand61 = new app.CancelReservationCommand(reservation58);
        app.CancelReservationCommand cancelReservationCommand62 = new app.CancelReservationCommand(reservation58);
        reservationManager35.addReservation(reservation58);
        sensor2.attach((app.Observer) reservationManager35);
        sensor2.startEquipment();
        app.BookingSystem bookingSystem66 = new app.BookingSystem();
        app.Sensor sensor68 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem66.update(sensor68);
        sensor68.stopEquipment();
        sensor68.startEquipment();
        app.ReservationManager reservationManager72 = new app.ReservationManager();
        app.Sensor sensor74 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager72.update(sensor74);
        app.UsageLogger usageLogger76 = new app.UsageLogger();
        java.util.List<java.lang.String> strList77 = usageLogger76.getLogs();
        sensor74.detach((app.Observer) usageLogger76);
        app.UsageLogger usageLogger79 = new app.UsageLogger();
        sensor74.attach((app.Observer) usageLogger79);
        app.ReservationManager reservationManager81 = new app.ReservationManager();
        app.Sensor sensor83 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager81.update(sensor83);
        app.UsageLogger usageLogger85 = new app.UsageLogger();
        java.util.List<java.lang.String> strList86 = usageLogger85.getLogs();
        sensor83.detach((app.Observer) usageLogger85);
        app.UsageLogger usageLogger88 = new app.UsageLogger();
        sensor83.attach((app.Observer) usageLogger88);
        sensor74.detach((app.Observer) usageLogger88);
        app.Sensor sensor92 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger88.update(sensor92);
        java.util.List<java.lang.String> strList94 = usageLogger88.getLogs();
        sensor68.detach((app.Observer) usageLogger88);
        java.util.List<java.lang.String> strList96 = usageLogger88.getLogs();
        sensor2.attach((app.Observer) usageLogger88);
        java.util.List<java.lang.String> strList98 = usageLogger88.getLogs();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(reservationList37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str40, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNull(localDateTime60);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList98);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        app.Equipment equipment3 = new app.Equipment("Charging $35.00 to University Department Account. Pending Dean approval.", "", "Processing direct debit payment of $35.00. No extra fees.");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        app.Sensor sensor9 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager7.update(sensor9);
        app.UsageLogger usageLogger11 = new app.UsageLogger();
        java.util.List<java.lang.String> strList12 = usageLogger11.getLogs();
        sensor9.detach((app.Observer) usageLogger11);
        sensor9.notifyObservers();
        app.ReservationManager reservationManager15 = new app.ReservationManager();
        java.util.List<app.Reservation> reservationList16 = reservationManager15.getReservations();
        sensor9.detach((app.Observer) reservationManager15);
        sensor2.detach((app.Observer) reservationManager15);
        sensor2.notifyObservers();
        sensor2.notifyObservers();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.UsageLogger usageLogger7 = new app.UsageLogger();
        sensor2.attach((app.Observer) usageLogger7);
        sensor2.startEquipment();
        app.ReservationManager reservationManager10 = new app.ReservationManager();
        app.Sensor sensor12 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager10.update(sensor12);
        app.UsageLogger usageLogger14 = new app.UsageLogger();
        java.util.List<java.lang.String> strList15 = usageLogger14.getLogs();
        sensor12.detach((app.Observer) usageLogger14);
        app.ReservationManager reservationManager17 = new app.ReservationManager();
        app.Sensor sensor19 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager17.update(sensor19);
        app.UsageLogger usageLogger21 = new app.UsageLogger();
        java.util.List<java.lang.String> strList22 = usageLogger21.getLogs();
        sensor19.detach((app.Observer) usageLogger21);
        app.Sensor sensor25 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger21.update(sensor25);
        sensor12.detach((app.Observer) usageLogger21);
        app.ReservationManager reservationManager28 = new app.ReservationManager();
        app.Sensor sensor30 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager28.update(sensor30);
        app.UsageLogger usageLogger32 = new app.UsageLogger();
        java.util.List<java.lang.String> strList33 = usageLogger32.getLogs();
        sensor30.detach((app.Observer) usageLogger32);
        app.UsageLogger usageLogger35 = new app.UsageLogger();
        sensor30.attach((app.Observer) usageLogger35);
        usageLogger21.update(sensor30);
        sensor30.startEquipment();
        sensor30.notifyObservers();
        app.ReservationManager reservationManager40 = new app.ReservationManager();
        java.util.List<app.Reservation> reservationList41 = reservationManager40.getReservations();
        sensor30.detach((app.Observer) reservationManager40);
        java.util.List<app.Reservation> reservationList43 = reservationManager40.getReservations();
        sensor2.attach((app.Observer) reservationManager40);
        sensor2.startEquipment();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(reservationList41);
        org.junit.Assert.assertNotNull(reservationList43);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.DisabledState disabledState32 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern36 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern36.release();
        disabledState32.reserve(equipmentForStatePattern36);
        pendingPickupState0.reserve(equipmentForStatePattern36);
        app.EquipmentForStatePattern equipmentForStatePattern43 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern43.release();
        boolean boolean45 = equipmentForStatePattern43.isAvailable();
        pendingPickupState0.finishMaintenance(equipmentForStatePattern43);
        app.EquipmentForStatePattern equipmentForStatePattern50 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern50.disable();
        equipmentForStatePattern50.release();
        boolean boolean53 = equipmentForStatePattern50.isAvailable();
        pendingPickupState0.release(equipmentForStatePattern50);
        app.DisabledState disabledState55 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern59.release();
        disabledState55.reserve(equipmentForStatePattern59);
        app.EquipmentForStatePattern equipmentForStatePattern65 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState55.markMaintenance(equipmentForStatePattern65);
        equipmentForStatePattern65.enable();
        boolean boolean68 = equipmentForStatePattern65.isAvailable();
        pendingPickupState0.markMaintenance(equipmentForStatePattern65);
        java.lang.String str70 = pendingPickupState0.getStateName();
        java.lang.String str71 = pendingPickupState0.getStateName();
        java.lang.String str72 = pendingPickupState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PENDING_PICKUP" + "'", str70, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PENDING_PICKUP" + "'", str71, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PENDING_PICKUP" + "'", str72, "PENDING_PICKUP");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Processing credit card payment of $15.30 plus 2% processing fee.", (double) (short) 100, localDateTime2);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("Processing credit card payment of $35.70 plus 2% processing fee.", "Processing credit card payment of $10.20 plus 2% processing fee.", "");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        app.AvailableState availableState0 = new app.AvailableState();
        java.lang.String str1 = availableState0.getStateName();
        app.AvailableState availableState2 = new app.AvailableState();
        java.lang.String str3 = availableState2.getStateName();
        app.DisabledState disabledState4 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern8 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern8.release();
        disabledState4.reserve(equipmentForStatePattern8);
        availableState2.reserve(equipmentForStatePattern8);
        app.DisabledState disabledState12 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern16 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern16.release();
        disabledState12.reserve(equipmentForStatePattern16);
        java.lang.String str19 = disabledState12.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern23 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern23.release();
        boolean boolean25 = equipmentForStatePattern23.isAvailable();
        disabledState12.disable(equipmentForStatePattern23);
        app.EquipmentForStatePattern equipmentForStatePattern30 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern30.release();
        boolean boolean32 = equipmentForStatePattern30.isAvailable();
        boolean boolean33 = equipmentForStatePattern30.isAvailable();
        equipmentForStatePattern30.release();
        disabledState12.finishMaintenance(equipmentForStatePattern30);
        availableState2.finishMaintenance(equipmentForStatePattern30);
        availableState0.finishMaintenance(equipmentForStatePattern30);
        app.PendingPickupState pendingPickupState38 = new app.PendingPickupState();
        app.AvailableState availableState39 = new app.AvailableState();
        java.lang.String str40 = availableState39.getStateName();
        app.DisabledState disabledState41 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern45 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern45.release();
        disabledState41.reserve(equipmentForStatePattern45);
        availableState39.reserve(equipmentForStatePattern45);
        app.DisabledState disabledState49 = new app.DisabledState();
        app.DisabledState disabledState50 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern54 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern54.release();
        disabledState50.reserve(equipmentForStatePattern54);
        disabledState49.release(equipmentForStatePattern54);
        availableState39.markMaintenance(equipmentForStatePattern54);
        java.lang.String str59 = equipmentForStatePattern54.getId();
        pendingPickupState38.disable(equipmentForStatePattern54);
        java.lang.String str61 = equipmentForStatePattern54.getLocation();
        availableState0.disable(equipmentForStatePattern54);
        java.lang.String str63 = availableState0.getStateName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DISABLED" + "'", str19, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AVAILABLE" + "'", str40, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "AVAILABLE" + "'", str63, "AVAILABLE");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        reservationforStatePattern3.payDeposit();
        java.lang.String str5 = reservationforStatePattern3.getReservationId();
        reservationforStatePattern3.payDeposit();
        double double8 = reservationforStatePattern3.calculateFinalPayment(0.0d);
        java.lang.String str9 = reservationforStatePattern3.getReservationId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        app.BookingSystem bookingSystem0 = new app.BookingSystem();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem0.update(sensor2);
        sensor2.stopEquipment();
        sensor2.notifyObservers();
        app.ReservationManager reservationManager6 = new app.ReservationManager();
        app.Sensor sensor8 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager6.update(sensor8);
        app.UsageLogger usageLogger10 = new app.UsageLogger();
        java.util.List<java.lang.String> strList11 = usageLogger10.getLogs();
        sensor8.detach((app.Observer) usageLogger10);
        app.ReservationManager reservationManager13 = new app.ReservationManager();
        sensor8.detach((app.Observer) reservationManager13);
        app.ReservationManager reservationManager15 = new app.ReservationManager();
        app.Sensor sensor17 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager15.update(sensor17);
        app.UsageLogger usageLogger19 = new app.UsageLogger();
        java.util.List<java.lang.String> strList20 = usageLogger19.getLogs();
        sensor17.detach((app.Observer) usageLogger19);
        app.Sensor sensor23 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger19.update(sensor23);
        sensor8.detach((app.Observer) usageLogger19);
        sensor2.attach((app.Observer) usageLogger19);
        app.ReservationManager reservationManager27 = new app.ReservationManager();
        app.Sensor sensor29 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager27.update(sensor29);
        app.UsageLogger usageLogger31 = new app.UsageLogger();
        java.util.List<java.lang.String> strList32 = usageLogger31.getLogs();
        sensor29.detach((app.Observer) usageLogger31);
        app.UsageLogger usageLogger34 = new app.UsageLogger();
        sensor29.attach((app.Observer) usageLogger34);
        app.ReservationManager reservationManager36 = new app.ReservationManager();
        app.Sensor sensor38 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager36.update(sensor38);
        app.UsageLogger usageLogger40 = new app.UsageLogger();
        java.util.List<java.lang.String> strList41 = usageLogger40.getLogs();
        sensor38.detach((app.Observer) usageLogger40);
        app.UsageLogger usageLogger43 = new app.UsageLogger();
        sensor38.attach((app.Observer) usageLogger43);
        sensor29.detach((app.Observer) usageLogger43);
        app.Sensor sensor47 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger43.update(sensor47);
        app.Sensor sensor50 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        java.lang.String str51 = sensor50.getSensorId();
        app.ReservationManager reservationManager52 = new app.ReservationManager();
        app.Sensor sensor54 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager52.update(sensor54);
        sensor50.detach((app.Observer) reservationManager52);
        sensor47.attach((app.Observer) reservationManager52);
        sensor2.detach((app.Observer) reservationManager52);
        app.Sensor sensor60 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        boolean boolean61 = sensor60.isEquipmentActive();
        sensor60.startEquipment();
        reservationManager52.update(sensor60);
        java.lang.String str64 = sensor60.getSensorId();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str51, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str64, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        app.ReservationStatus reservationStatus4 = null;
        app.Reservation reservation5 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime2, localDateTime3, reservationStatus4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        reservationManager0.addReservation(reservation5);
        app.BookingSystem bookingSystem13 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList14 = bookingSystem13.getReservations();
        app.ReservationManager reservationManager15 = new app.ReservationManager();
        app.Sensor sensor17 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager15.update(sensor17);
        app.UsageLogger usageLogger19 = new app.UsageLogger();
        java.util.List<java.lang.String> strList20 = usageLogger19.getLogs();
        sensor17.detach((app.Observer) usageLogger19);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        sensor17.attach((app.Observer) usageLogger22);
        app.ReservationManager reservationManager24 = new app.ReservationManager();
        app.Sensor sensor26 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager24.update(sensor26);
        app.UsageLogger usageLogger28 = new app.UsageLogger();
        java.util.List<java.lang.String> strList29 = usageLogger28.getLogs();
        sensor26.detach((app.Observer) usageLogger28);
        app.UsageLogger usageLogger31 = new app.UsageLogger();
        sensor26.attach((app.Observer) usageLogger31);
        sensor17.detach((app.Observer) usageLogger31);
        app.Sensor sensor35 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger31.update(sensor35);
        bookingSystem13.update(sensor35);
        app.BookingSystem bookingSystem38 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList39 = bookingSystem38.getReservations();
        app.BookingSystem bookingSystem40 = new app.BookingSystem();
        app.Sensor sensor42 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem40.update(sensor42);
        bookingSystem38.update(sensor42);
        bookingSystem13.update(sensor42);
        sensor42.notifyObservers();
        java.lang.String str47 = sensor42.getSensorId();
        reservationManager0.update(sensor42);
        app.ReservationManager reservationManager49 = new app.ReservationManager();
        app.Sensor sensor51 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager49.update(sensor51);
        app.UsageLogger usageLogger53 = new app.UsageLogger();
        java.util.List<java.lang.String> strList54 = usageLogger53.getLogs();
        sensor51.detach((app.Observer) usageLogger53);
        app.ReservationManager reservationManager56 = new app.ReservationManager();
        sensor51.detach((app.Observer) reservationManager56);
        app.ReservationManager reservationManager58 = new app.ReservationManager();
        app.Sensor sensor60 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager58.update(sensor60);
        app.UsageLogger usageLogger62 = new app.UsageLogger();
        java.util.List<java.lang.String> strList63 = usageLogger62.getLogs();
        sensor60.detach((app.Observer) usageLogger62);
        app.Sensor sensor66 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger62.update(sensor66);
        sensor51.detach((app.Observer) usageLogger62);
        sensor51.startEquipment();
        boolean boolean70 = sensor51.isEquipmentActive();
        boolean boolean71 = sensor51.isEquipmentActive();
        app.BookingSystem bookingSystem72 = new app.BookingSystem();
        app.Sensor sensor74 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem72.update(sensor74);
        java.util.List<app.Reservation> reservationList76 = bookingSystem72.getReservations();
        java.util.List<app.Reservation> reservationList77 = bookingSystem72.getReservations();
        sensor51.attach((app.Observer) bookingSystem72);
        reservationManager0.update(sensor51);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(reservationList39);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str47, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(reservationList76);
        org.junit.Assert.assertNotNull(reservationList77);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str4 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 'a');
        java.lang.String str8 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str2, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str4, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str6, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        app.Equipment equipment3 = new app.Equipment("Deducting $100.00 from registered Research Grant funds.", "Charging $100.00 to University Department Account. Pending Dean approval.", "Charging $10.00 to University Department Account. Pending Dean approval.");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        app.ReservationStatus reservationStatus7 = null;
        app.Reservation reservation8 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime5, localDateTime6, reservationStatus7);
        app.CancelReservationCommand cancelReservationCommand9 = new app.CancelReservationCommand(reservation8);
        java.time.LocalDateTime localDateTime10 = reservation8.getEndTime();
        java.time.LocalDateTime localDateTime11 = null;
        reservation8.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservation8.extendReservation(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        app.ModifyReservationCommand modifyReservationCommand17 = new app.ModifyReservationCommand(equipment3, reservation8, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation8.setEndTime(localDateTime18);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        app.Equipment equipment3 = new app.Equipment("Processing credit card payment of $102.00 plus 2% processing fee.", "Processing direct debit payment of $-1.00. No extra fees.", "Processing direct debit payment of $20.00. No extra fees.");
        app.Equipment equipment7 = new app.Equipment("Deducting $100.00 from registered Research Grant funds.", "Charging $100.00 to University Department Account. Pending Dean approval.", "Charging $10.00 to University Department Account. Pending Dean approval.");
        app.BookingSystem bookingSystem8 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList9 = bookingSystem8.getReservations();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        app.ReservationStatus reservationStatus13 = null;
        app.Reservation reservation14 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime11, localDateTime12, reservationStatus13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation14.setStartTime(localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        reservation14.setEndTime(localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        reservation14.setEndTime(localDateTime19);
        bookingSystem8.addReservation(reservation14);
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservation14.extendReservation(localDateTime22);
        java.time.LocalDateTime localDateTime24 = null;
        app.ExtendReservationCommand extendReservationCommand25 = new app.ExtendReservationCommand(equipment7, reservation14, localDateTime24);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        app.ReservationStatus reservationStatus38 = null;
        app.Reservation reservation39 = new app.Reservation("Processing direct debit payment of $97.00. No extra fees.", localDateTime36, localDateTime37, reservationStatus38);
        app.CancelReservationCommand cancelReservationCommand40 = new app.CancelReservationCommand(reservation39);
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = reservation39.extendReservation(localDateTime41);
        reservation39.cancelReservation();
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = reservation39.extendReservation(localDateTime44);
        java.lang.String str46 = reservation39.getReservationId();
        app.ReservationStatus reservationStatus47 = reservation39.getStatus();
        app.Reservation reservation48 = new app.Reservation("Processing credit card payment of $-1.02 plus 2% processing fee.", localDateTime33, localDateTime34, reservationStatus47);
        app.Reservation reservation49 = new app.Reservation("PENDING_PICKUP", localDateTime30, localDateTime31, reservationStatus47);
        app.Reservation reservation50 = new app.Reservation("AVAILABLE", localDateTime27, localDateTime28, reservationStatus47);
        java.time.LocalDateTime localDateTime51 = null;
        app.ExtendReservationCommand extendReservationCommand52 = new app.ExtendReservationCommand(equipment7, reservation50, localDateTime51);
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        app.ModifyReservationCommand modifyReservationCommand55 = new app.ModifyReservationCommand(equipment3, reservation50, localDateTime53, localDateTime54);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str46, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertTrue("'" + reservationStatus47 + "' != '" + app.ReservationStatus.CANCELLED + "'", reservationStatus47.equals(app.ReservationStatus.CANCELLED));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        app.Equipment equipment3 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        app.ReservationStatus reservationStatus7 = null;
        app.Reservation reservation8 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime5, localDateTime6, reservationStatus7);
        app.CancelReservationCommand cancelReservationCommand9 = new app.CancelReservationCommand(reservation8);
        java.time.LocalDateTime localDateTime10 = reservation8.getStartTime();
        java.time.LocalDateTime localDateTime11 = null;
        app.ExtendReservationCommand extendReservationCommand12 = new app.ExtendReservationCommand(equipment3, reservation8, localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation8.getStartTime();
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservation8.extendReservation(localDateTime14);
        app.ReservationStatus reservationStatus16 = reservation8.getStatus();
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reservationStatus16);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        app.Equipment equipment3 = new app.Equipment("Deducting $100.00 from registered Research Grant funds.", "Processing direct debit payment of $-1.00. No extra fees.", "");
        app.Equipment equipment7 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        app.ReservationManager reservationManager8 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        app.ReservationStatus reservationStatus12 = null;
        app.Reservation reservation13 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime10, localDateTime11, reservationStatus12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation13.setStartTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        reservation13.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation13.setEndTime(localDateTime18);
        reservationManager8.addReservation(reservation13);
        java.time.LocalDateTime localDateTime21 = reservation13.getEndTime();
        java.time.LocalDateTime localDateTime22 = null;
        app.ExtendReservationCommand extendReservationCommand23 = new app.ExtendReservationCommand(equipment7, reservation13, localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        app.ReservationStatus reservationStatus27 = null;
        app.Reservation reservation28 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime25, localDateTime26, reservationStatus27);
        java.time.LocalDateTime localDateTime29 = null;
        reservation28.setStartTime(localDateTime29);
        java.time.LocalDateTime localDateTime31 = null;
        reservation28.setEndTime(localDateTime31);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        app.ModifyReservationCommand modifyReservationCommand35 = new app.ModifyReservationCommand(equipment7, reservation28, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime36 = reservation28.getStartTime();
        java.time.LocalDateTime localDateTime37 = null;
        app.ExtendReservationCommand extendReservationCommand38 = new app.ExtendReservationCommand(equipment3, reservation28, localDateTime37);
        app.Equipment equipment42 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        app.ReservationStatus reservationStatus46 = null;
        app.Reservation reservation47 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime44, localDateTime45, reservationStatus46);
        java.time.LocalDateTime localDateTime48 = null;
        reservation47.setStartTime(localDateTime48);
        java.time.LocalDateTime localDateTime50 = null;
        reservation47.setEndTime(localDateTime50);
        java.time.LocalDateTime localDateTime52 = null;
        reservation47.setEndTime(localDateTime52);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        app.ModifyReservationCommand modifyReservationCommand56 = new app.ModifyReservationCommand(equipment42, reservation47, localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        app.ReservationStatus reservationStatus60 = null;
        app.Reservation reservation61 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime58, localDateTime59, reservationStatus60);
        java.time.LocalDateTime localDateTime62 = null;
        reservation61.setStartTime(localDateTime62);
        java.time.LocalDateTime localDateTime64 = null;
        reservation61.setEndTime(localDateTime64);
        java.time.LocalDateTime localDateTime66 = reservation61.getEndTime();
        app.CancelReservationCommand cancelReservationCommand67 = new app.CancelReservationCommand(reservation61);
        java.time.LocalDateTime localDateTime68 = reservation61.getEndTime();
        java.time.LocalDateTime localDateTime69 = null;
        app.ExtendReservationCommand extendReservationCommand70 = new app.ExtendReservationCommand(equipment42, reservation61, localDateTime69);
        java.time.LocalDateTime localDateTime71 = reservation61.getEndTime();
        java.time.LocalDateTime localDateTime72 = null;
        reservation61.setStartTime(localDateTime72);
        java.time.LocalDateTime localDateTime74 = null;
        app.ExtendReservationCommand extendReservationCommand75 = new app.ExtendReservationCommand(equipment3, reservation61, localDateTime74);
        app.CancelReservationCommand cancelReservationCommand76 = new app.CancelReservationCommand(reservation61);
        app.ReservationStatus reservationStatus77 = reservation61.getStatus();
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime66);
        org.junit.Assert.assertNull(localDateTime68);
        org.junit.Assert.assertNull(localDateTime71);
        org.junit.Assert.assertNull(reservationStatus77);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Deducting $-1.00 from registered Research Grant funds.", 0.0d, localDateTime2);
        java.lang.String str4 = reservationforStatePattern3.getReservationId();
        java.lang.String str5 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime6 = reservationforStatePattern3.getStartTime();
        double double7 = reservationforStatePattern3.getDepositAmount();
        double double9 = reservationforStatePattern3.calculateFinalPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str4, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str5, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        app.ReservationStatus reservationStatus6 = null;
        app.Reservation reservation7 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime4, localDateTime5, reservationStatus6);
        app.CancelReservationCommand cancelReservationCommand8 = new app.CancelReservationCommand(reservation7);
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        reservation7.cancelReservation();
        app.ReservationStatus reservationStatus11 = reservation7.getStatus();
        app.Reservation reservation12 = new app.Reservation("Deducting $10.00 from registered Research Grant funds.", localDateTime1, localDateTime2, reservationStatus11);
        java.lang.String str13 = reservation12.getReservationId();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + reservationStatus11 + "' != '" + app.ReservationStatus.CANCELLED + "'", reservationStatus11.equals(app.ReservationStatus.CANCELLED));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str13, "Deducting $10.00 from registered Research Grant funds.");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) (-1L), localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) (short) 10);
        java.time.LocalDateTime localDateTime6 = null;
        reservationforStatePattern3.arrive(localDateTime6);
        double double9 = reservationforStatePattern3.calculateFinalPayment(35.0d);
        java.time.LocalDateTime localDateTime10 = null;
        reservationforStatePattern3.arrive(localDateTime10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        app.Equipment equipment3 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        app.ReservationManager reservationManager4 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        app.ReservationStatus reservationStatus8 = null;
        app.Reservation reservation9 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime6, localDateTime7, reservationStatus8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation9.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation9.setEndTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation9.setEndTime(localDateTime14);
        reservationManager4.addReservation(reservation9);
        java.time.LocalDateTime localDateTime17 = reservation9.getEndTime();
        java.time.LocalDateTime localDateTime18 = null;
        app.ExtendReservationCommand extendReservationCommand19 = new app.ExtendReservationCommand(equipment3, reservation9, localDateTime18);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        app.ReservationStatus reservationStatus23 = null;
        app.Reservation reservation24 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime21, localDateTime22, reservationStatus23);
        java.time.LocalDateTime localDateTime25 = null;
        reservation24.setStartTime(localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        reservation24.setEndTime(localDateTime27);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        app.ModifyReservationCommand modifyReservationCommand31 = new app.ModifyReservationCommand(equipment3, reservation24, localDateTime29, localDateTime30);
        app.ReservationStatus reservationStatus32 = reservation24.getStatus();
        java.time.LocalDateTime localDateTime33 = null;
        reservation24.setEndTime(localDateTime33);
        java.lang.String str35 = reservation24.getReservationId();
        java.time.LocalDateTime localDateTime36 = reservation24.getStartTime();
        app.ReservationStatus reservationStatus37 = reservation24.getStatus();
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(reservationStatus32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str35, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(reservationStatus37);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        app.AvailableState availableState0 = new app.AvailableState();
        java.lang.String str1 = availableState0.getStateName();
        app.DisabledState disabledState2 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern6 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern6.release();
        disabledState2.reserve(equipmentForStatePattern6);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState2.markMaintenance(equipmentForStatePattern12);
        availableState0.enable(equipmentForStatePattern12);
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern18.release();
        availableState0.disable(equipmentForStatePattern18);
        app.DisabledState disabledState21 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern25.disable();
        equipmentForStatePattern25.release();
        disabledState21.release(equipmentForStatePattern25);
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern32.disable();
        disabledState21.markMaintenance(equipmentForStatePattern32);
        app.DisabledState disabledState35 = new app.DisabledState();
        app.DisabledState disabledState36 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern40.disable();
        equipmentForStatePattern40.release();
        disabledState36.release(equipmentForStatePattern40);
        app.EquipmentForStatePattern equipmentForStatePattern47 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern47.disable();
        disabledState36.markMaintenance(equipmentForStatePattern47);
        disabledState35.reserve(equipmentForStatePattern47);
        disabledState21.finishMaintenance(equipmentForStatePattern47);
        availableState0.release(equipmentForStatePattern47);
        app.AvailableState availableState53 = new app.AvailableState();
        java.lang.String str54 = availableState53.getStateName();
        app.DisabledState disabledState55 = new app.DisabledState();
        app.DisabledState disabledState56 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern60 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern60.disable();
        equipmentForStatePattern60.release();
        disabledState56.release(equipmentForStatePattern60);
        disabledState55.enable(equipmentForStatePattern60);
        availableState53.disable(equipmentForStatePattern60);
        availableState0.enable(equipmentForStatePattern60);
        equipmentForStatePattern60.finishMaintenance();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AVAILABLE" + "'", str54, "AVAILABLE");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        app.BookingSystem bookingSystem0 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList1 = bookingSystem0.getReservations();
        app.ReservationManager reservationManager2 = new app.ReservationManager();
        app.Sensor sensor4 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager2.update(sensor4);
        app.UsageLogger usageLogger6 = new app.UsageLogger();
        java.util.List<java.lang.String> strList7 = usageLogger6.getLogs();
        sensor4.detach((app.Observer) usageLogger6);
        app.UsageLogger usageLogger9 = new app.UsageLogger();
        sensor4.attach((app.Observer) usageLogger9);
        app.ReservationManager reservationManager11 = new app.ReservationManager();
        app.Sensor sensor13 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager11.update(sensor13);
        app.UsageLogger usageLogger15 = new app.UsageLogger();
        java.util.List<java.lang.String> strList16 = usageLogger15.getLogs();
        sensor13.detach((app.Observer) usageLogger15);
        app.UsageLogger usageLogger18 = new app.UsageLogger();
        sensor13.attach((app.Observer) usageLogger18);
        sensor4.detach((app.Observer) usageLogger18);
        app.Sensor sensor22 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger18.update(sensor22);
        bookingSystem0.update(sensor22);
        app.Equipment equipment28 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        app.ReservationManager reservationManager29 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        app.ReservationStatus reservationStatus33 = null;
        app.Reservation reservation34 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime31, localDateTime32, reservationStatus33);
        java.time.LocalDateTime localDateTime35 = null;
        reservation34.setStartTime(localDateTime35);
        java.time.LocalDateTime localDateTime37 = null;
        reservation34.setEndTime(localDateTime37);
        java.time.LocalDateTime localDateTime39 = null;
        reservation34.setEndTime(localDateTime39);
        reservationManager29.addReservation(reservation34);
        java.time.LocalDateTime localDateTime42 = reservation34.getEndTime();
        java.time.LocalDateTime localDateTime43 = null;
        app.ExtendReservationCommand extendReservationCommand44 = new app.ExtendReservationCommand(equipment28, reservation34, localDateTime43);
        bookingSystem0.addReservation(reservation34);
        app.ReservationManager reservationManager46 = new app.ReservationManager();
        app.Sensor sensor48 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager46.update(sensor48);
        app.Sensor sensor51 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        boolean boolean52 = sensor51.isEquipmentActive();
        reservationManager46.update(sensor51);
        app.Sensor sensor55 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        sensor55.notifyObservers();
        reservationManager46.update(sensor55);
        bookingSystem0.update(sensor55);
        java.util.List<app.Reservation> reservationList59 = bookingSystem0.getReservations();
        java.util.List<app.Reservation> reservationList60 = bookingSystem0.getReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(reservationList59);
        org.junit.Assert.assertNotNull(reservationList60);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        app.Sensor sensor1 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        boolean boolean2 = sensor1.isEquipmentActive();
        sensor1.stopEquipment();
        app.ReservationManager reservationManager4 = new app.ReservationManager();
        app.Sensor sensor6 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager4.update(sensor6);
        app.UsageLogger usageLogger8 = new app.UsageLogger();
        java.util.List<java.lang.String> strList9 = usageLogger8.getLogs();
        sensor6.detach((app.Observer) usageLogger8);
        app.ReservationManager reservationManager11 = new app.ReservationManager();
        sensor6.detach((app.Observer) reservationManager11);
        java.util.List<app.Reservation> reservationList13 = reservationManager11.getReservations();
        app.Sensor sensor15 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        java.lang.String str16 = sensor15.getSensorId();
        boolean boolean17 = sensor15.isEquipmentActive();
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        app.Sensor sensor20 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager18.update(sensor20);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        java.util.List<java.lang.String> strList23 = usageLogger22.getLogs();
        sensor20.detach((app.Observer) usageLogger22);
        app.UsageLogger usageLogger25 = new app.UsageLogger();
        sensor20.attach((app.Observer) usageLogger25);
        sensor15.attach((app.Observer) usageLogger25);
        reservationManager11.update(sensor15);
        sensor1.attach((app.Observer) reservationManager11);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        app.ReservationStatus reservationStatus33 = null;
        app.Reservation reservation34 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime31, localDateTime32, reservationStatus33);
        app.CancelReservationCommand cancelReservationCommand35 = new app.CancelReservationCommand(reservation34);
        java.time.LocalDateTime localDateTime36 = reservation34.getStartTime();
        app.CancelReservationCommand cancelReservationCommand37 = new app.CancelReservationCommand(reservation34);
        app.CancelReservationCommand cancelReservationCommand38 = new app.CancelReservationCommand(reservation34);
        reservationManager11.addReservation(reservation34);
        app.ReservationManager reservationManager40 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        app.ReservationStatus reservationStatus44 = null;
        app.Reservation reservation45 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime42, localDateTime43, reservationStatus44);
        java.time.LocalDateTime localDateTime46 = null;
        reservation45.setStartTime(localDateTime46);
        java.time.LocalDateTime localDateTime48 = null;
        reservation45.setEndTime(localDateTime48);
        java.time.LocalDateTime localDateTime50 = null;
        reservation45.setEndTime(localDateTime50);
        reservationManager40.addReservation(reservation45);
        java.time.LocalDateTime localDateTime53 = reservation45.getEndTime();
        app.CancelReservationCommand cancelReservationCommand54 = new app.CancelReservationCommand(reservation45);
        java.time.LocalDateTime localDateTime55 = reservation45.getStartTime();
        app.CancelReservationCommand cancelReservationCommand56 = new app.CancelReservationCommand(reservation45);
        java.time.LocalDateTime localDateTime57 = null;
        reservation45.setStartTime(localDateTime57);
        java.time.LocalDateTime localDateTime59 = reservation45.getStartTime();
        reservationManager11.addReservation(reservation45);
        app.ReservationStatus reservationStatus61 = reservation45.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime53);
        org.junit.Assert.assertNull(localDateTime55);
        org.junit.Assert.assertNull(localDateTime59);
        org.junit.Assert.assertNull(reservationStatus61);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationStatus reservationStatus3 = null;
        app.Reservation reservation4 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime1, localDateTime2, reservationStatus3);
        java.time.LocalDateTime localDateTime5 = null;
        reservation4.setStartTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = null;
        reservation4.setEndTime(localDateTime7);
        app.CancelReservationCommand cancelReservationCommand9 = new app.CancelReservationCommand(reservation4);
        app.ReservationStatus reservationStatus10 = reservation4.getStatus();
        app.CancelReservationCommand cancelReservationCommand11 = new app.CancelReservationCommand(reservation4);
        java.time.LocalDateTime localDateTime12 = null;
        reservation4.setEndTime(localDateTime12);
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        app.Sensor sensor9 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager7.update(sensor9);
        app.UsageLogger usageLogger11 = new app.UsageLogger();
        java.util.List<java.lang.String> strList12 = usageLogger11.getLogs();
        sensor9.detach((app.Observer) usageLogger11);
        app.Sensor sensor15 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger11.update(sensor15);
        sensor2.detach((app.Observer) usageLogger11);
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        app.Sensor sensor20 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager18.update(sensor20);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        java.util.List<java.lang.String> strList23 = usageLogger22.getLogs();
        sensor20.detach((app.Observer) usageLogger22);
        app.ReservationManager reservationManager25 = new app.ReservationManager();
        app.Sensor sensor27 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager25.update(sensor27);
        app.UsageLogger usageLogger29 = new app.UsageLogger();
        java.util.List<java.lang.String> strList30 = usageLogger29.getLogs();
        sensor27.detach((app.Observer) usageLogger29);
        app.Sensor sensor33 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger29.update(sensor33);
        sensor20.detach((app.Observer) usageLogger29);
        sensor2.attach((app.Observer) usageLogger29);
        app.ReservationManager reservationManager37 = new app.ReservationManager();
        app.Sensor sensor39 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager37.update(sensor39);
        app.UsageLogger usageLogger41 = new app.UsageLogger();
        java.util.List<java.lang.String> strList42 = usageLogger41.getLogs();
        sensor39.detach((app.Observer) usageLogger41);
        app.UsageLogger usageLogger44 = new app.UsageLogger();
        sensor39.attach((app.Observer) usageLogger44);
        sensor2.attach((app.Observer) usageLogger44);
        sensor2.startEquipment();
        app.BookingSystem bookingSystem48 = new app.BookingSystem();
        app.ReservationManager reservationManager49 = new app.ReservationManager();
        app.Sensor sensor51 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager49.update(sensor51);
        app.UsageLogger usageLogger53 = new app.UsageLogger();
        java.util.List<java.lang.String> strList54 = usageLogger53.getLogs();
        sensor51.detach((app.Observer) usageLogger53);
        app.ReservationManager reservationManager56 = new app.ReservationManager();
        sensor51.detach((app.Observer) reservationManager56);
        bookingSystem48.update(sensor51);
        sensor2.detach((app.Observer) bookingSystem48);
        sensor2.notifyObservers();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str8 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        app.Equipment equipment3 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "Charging $30.00 to University Department Account. Pending Dean approval.", "AVAILABLE");
        app.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        app.ExtendReservationCommand extendReservationCommand6 = new app.ExtendReservationCommand(equipment3, reservation4, localDateTime5);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.ReservationManager reservationManager7 = new app.ReservationManager();
        sensor2.detach((app.Observer) reservationManager7);
        java.lang.String str9 = sensor2.getSensorId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str9, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        app.ReservationCommandInvoker reservationCommandInvoker0 = new app.ReservationCommandInvoker();
        app.Equipment equipment4 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        app.ReservationStatus reservationStatus8 = null;
        app.Reservation reservation9 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime6, localDateTime7, reservationStatus8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation9.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation9.setEndTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation9.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        app.ModifyReservationCommand modifyReservationCommand18 = new app.ModifyReservationCommand(equipment4, reservation9, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        app.ReservationStatus reservationStatus22 = null;
        app.Reservation reservation23 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime20, localDateTime21, reservationStatus22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation23.setStartTime(localDateTime24);
        java.time.LocalDateTime localDateTime26 = null;
        reservation23.setEndTime(localDateTime26);
        java.time.LocalDateTime localDateTime28 = reservation23.getEndTime();
        app.CancelReservationCommand cancelReservationCommand29 = new app.CancelReservationCommand(reservation23);
        java.time.LocalDateTime localDateTime30 = reservation23.getEndTime();
        java.time.LocalDateTime localDateTime31 = null;
        app.ExtendReservationCommand extendReservationCommand32 = new app.ExtendReservationCommand(equipment4, reservation23, localDateTime31);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        app.ReservationStatus reservationStatus36 = null;
        app.Reservation reservation37 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime34, localDateTime35, reservationStatus36);
        java.time.LocalDateTime localDateTime38 = null;
        reservation37.setStartTime(localDateTime38);
        java.time.LocalDateTime localDateTime40 = null;
        reservation37.setEndTime(localDateTime40);
        java.time.LocalDateTime localDateTime42 = reservation37.getEndTime();
        java.time.LocalDateTime localDateTime43 = reservation37.getStartTime();
        java.lang.String str44 = reservation37.getReservationId();
        java.time.LocalDateTime localDateTime45 = null;
        app.ExtendReservationCommand extendReservationCommand46 = new app.ExtendReservationCommand(equipment4, reservation37, localDateTime45);
        boolean boolean47 = reservationCommandInvoker0.submitCommand((app.Command) extendReservationCommand46);
        app.ReservationManager reservationManager48 = new app.ReservationManager();
        app.Sensor sensor50 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager48.update(sensor50);
        app.UsageLogger usageLogger52 = new app.UsageLogger();
        java.util.List<java.lang.String> strList53 = usageLogger52.getLogs();
        sensor50.detach((app.Observer) usageLogger52);
        app.ReservationManager reservationManager55 = new app.ReservationManager();
        sensor50.detach((app.Observer) reservationManager55);
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        app.ReservationStatus reservationStatus60 = null;
        app.Reservation reservation61 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime58, localDateTime59, reservationStatus60);
        java.time.LocalDateTime localDateTime62 = null;
        reservation61.setStartTime(localDateTime62);
        java.time.LocalDateTime localDateTime64 = null;
        reservation61.setEndTime(localDateTime64);
        java.time.LocalDateTime localDateTime66 = reservation61.getEndTime();
        reservationManager55.addReservation(reservation61);
        app.ReservationStatus reservationStatus68 = reservation61.getStatus();
        reservation61.cancelReservation();
        java.time.LocalDateTime localDateTime70 = null;
        reservation61.setStartTime(localDateTime70);
        app.CancelReservationCommand cancelReservationCommand72 = new app.CancelReservationCommand(reservation61);
        java.time.LocalDateTime localDateTime73 = reservation61.getEndTime();
        app.CancelReservationCommand cancelReservationCommand74 = new app.CancelReservationCommand(reservation61);
        boolean boolean75 = cancelReservationCommand74.execute();
        boolean boolean76 = reservationCommandInvoker0.submitCommand((app.Command) cancelReservationCommand74);
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        app.ReservationStatus reservationStatus80 = null;
        app.Reservation reservation81 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime78, localDateTime79, reservationStatus80);
        app.CancelReservationCommand cancelReservationCommand82 = new app.CancelReservationCommand(reservation81);
        reservation81.cancelReservation();
        app.CancelReservationCommand cancelReservationCommand84 = new app.CancelReservationCommand(reservation81);
        boolean boolean85 = reservationCommandInvoker0.submitCommand((app.Command) cancelReservationCommand84);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str44, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNull(localDateTime66);
        org.junit.Assert.assertNull(reservationStatus68);
        org.junit.Assert.assertNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        disabledState0.release(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.disable();
        disabledState0.markMaintenance(equipmentForStatePattern11);
        app.DisabledState disabledState14 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern18.disable();
        equipmentForStatePattern18.release();
        disabledState14.release(equipmentForStatePattern18);
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern25.disable();
        disabledState14.markMaintenance(equipmentForStatePattern25);
        disabledState0.finishMaintenance(equipmentForStatePattern25);
        app.DisabledState disabledState29 = new app.DisabledState();
        app.DisabledState disabledState30 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern34 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern34.release();
        disabledState30.reserve(equipmentForStatePattern34);
        disabledState29.release(equipmentForStatePattern34);
        disabledState0.disable(equipmentForStatePattern34);
        app.AvailableState availableState39 = new app.AvailableState();
        java.lang.String str40 = availableState39.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str45 = equipmentForStatePattern44.getId();
        availableState39.markMaintenance(equipmentForStatePattern44);
        disabledState0.reserve(equipmentForStatePattern44);
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str52 = equipmentForStatePattern51.getId();
        disabledState0.enable(equipmentForStatePattern51);
        app.EquipmentForStatePattern equipmentForStatePattern57 = new app.EquipmentForStatePattern("PENDING_PICKUP", "AVAILABLE", "");
        disabledState0.release(equipmentForStatePattern57);
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("Processing direct debit payment of $0.00. No extra fees.", "Charging $35.00 to University Department Account. Pending Dean approval.", "Deducting $10.00 from registered Research Grant funds.");
        equipmentForStatePattern62.confirmReservation();
        disabledState0.enable(equipmentForStatePattern62);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AVAILABLE" + "'", str40, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.release();
        disabledState0.reserve(equipmentForStatePattern4);
        java.lang.String str7 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.release();
        boolean boolean13 = equipmentForStatePattern11.isAvailable();
        disabledState0.disable(equipmentForStatePattern11);
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern18.release();
        boolean boolean20 = equipmentForStatePattern18.isAvailable();
        boolean boolean21 = equipmentForStatePattern18.isAvailable();
        equipmentForStatePattern18.release();
        disabledState0.finishMaintenance(equipmentForStatePattern18);
        app.DisabledState disabledState24 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern28.disable();
        equipmentForStatePattern28.release();
        disabledState24.release(equipmentForStatePattern28);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.disable();
        disabledState24.markMaintenance(equipmentForStatePattern35);
        app.DisabledState disabledState38 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern42.disable();
        equipmentForStatePattern42.release();
        disabledState38.release(equipmentForStatePattern42);
        app.EquipmentForStatePattern equipmentForStatePattern49 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern49.disable();
        disabledState38.markMaintenance(equipmentForStatePattern49);
        disabledState24.finishMaintenance(equipmentForStatePattern49);
        app.DisabledState disabledState53 = new app.DisabledState();
        app.DisabledState disabledState54 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern58 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern58.release();
        disabledState54.reserve(equipmentForStatePattern58);
        disabledState53.release(equipmentForStatePattern58);
        disabledState24.disable(equipmentForStatePattern58);
        app.AvailableState availableState63 = new app.AvailableState();
        java.lang.String str64 = availableState63.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern68 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str69 = equipmentForStatePattern68.getId();
        availableState63.markMaintenance(equipmentForStatePattern68);
        disabledState24.reserve(equipmentForStatePattern68);
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str76 = equipmentForStatePattern75.getId();
        disabledState24.enable(equipmentForStatePattern75);
        equipmentForStatePattern75.disable();
        disabledState0.release(equipmentForStatePattern75);
        java.lang.String str80 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern84 = new app.EquipmentForStatePattern("Processing credit card payment of $98.94 plus 2% processing fee.", "Processing direct debit payment of $100.00. No extra fees.", "Processing direct debit payment of $35.00. No extra fees.");
        disabledState0.enable(equipmentForStatePattern84);
        java.lang.String str86 = disabledState0.getStateName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DISABLED" + "'", str7, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "AVAILABLE" + "'", str64, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "DISABLED" + "'", str80, "DISABLED");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "DISABLED" + "'", str86, "DISABLED");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        disabledState0.release(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.disable();
        disabledState0.markMaintenance(equipmentForStatePattern11);
        equipmentForStatePattern11.finishMaintenance();
        boolean boolean15 = equipmentForStatePattern11.isAvailable();
        java.lang.String str16 = equipmentForStatePattern11.getStateName();
        equipmentForStatePattern11.reserve();
        equipmentForStatePattern11.release();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DISABLED" + "'", str16, "DISABLED");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Deducting $100.00 from registered Research Grant funds.", (double) 0L, localDateTime2);
        double double4 = reservationforStatePattern3.getDepositAmount();
        double double5 = reservationforStatePattern3.getDepositAmount();
        double double6 = reservationforStatePattern3.getDepositAmount();
        double double7 = reservationforStatePattern3.getDepositAmount();
        java.time.LocalDateTime localDateTime8 = reservationforStatePattern3.getStartTime();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        double double11 = studentPricing0.calculateRate();
        double double12 = studentPricing0.calculateRate();
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str4 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str8 = debitCardPayment0.processPayment(32.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str2, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str4, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.UsageLogger usageLogger7 = new app.UsageLogger();
        sensor2.attach((app.Observer) usageLogger7);
        sensor2.notifyObservers();
        sensor2.notifyObservers();
        app.ReservationManager reservationManager11 = new app.ReservationManager();
        app.Sensor sensor13 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager11.update(sensor13);
        app.UsageLogger usageLogger15 = new app.UsageLogger();
        java.util.List<java.lang.String> strList16 = usageLogger15.getLogs();
        sensor13.detach((app.Observer) usageLogger15);
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        sensor13.detach((app.Observer) reservationManager18);
        app.ReservationManager reservationManager20 = new app.ReservationManager();
        app.Sensor sensor22 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager20.update(sensor22);
        app.UsageLogger usageLogger24 = new app.UsageLogger();
        java.util.List<java.lang.String> strList25 = usageLogger24.getLogs();
        sensor22.detach((app.Observer) usageLogger24);
        app.Sensor sensor28 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger24.update(sensor28);
        sensor13.detach((app.Observer) usageLogger24);
        app.Sensor sensor32 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        java.lang.String str33 = sensor32.getSensorId();
        boolean boolean34 = sensor32.isEquipmentActive();
        usageLogger24.update(sensor32);
        java.util.List<java.lang.String> strList36 = usageLogger24.getLogs();
        sensor2.attach((app.Observer) usageLogger24);
        sensor2.notifyObservers();
        sensor2.stopEquipment();
        app.ReservationManager reservationManager40 = new app.ReservationManager();
        app.ReservationManager reservationManager41 = new app.ReservationManager();
        app.Sensor sensor43 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager41.update(sensor43);
        app.UsageLogger usageLogger45 = new app.UsageLogger();
        java.util.List<java.lang.String> strList46 = usageLogger45.getLogs();
        sensor43.detach((app.Observer) usageLogger45);
        app.Sensor sensor49 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger45.update(sensor49);
        app.BookingSystem bookingSystem51 = new app.BookingSystem();
        sensor49.detach((app.Observer) bookingSystem51);
        reservationManager40.update(sensor49);
        java.util.List<app.Reservation> reservationList54 = reservationManager40.getReservations();
        sensor2.attach((app.Observer) reservationManager40);
        java.util.List<app.Reservation> reservationList56 = reservationManager40.getReservations();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str33, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(reservationList54);
        org.junit.Assert.assertNotNull(reservationList56);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.DisabledState disabledState32 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern36 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern36.release();
        disabledState32.reserve(equipmentForStatePattern36);
        pendingPickupState0.reserve(equipmentForStatePattern36);
        app.EquipmentForStatePattern equipmentForStatePattern43 = new app.EquipmentForStatePattern("Processing direct debit payment of $0.00. No extra fees.", "Processing direct debit payment of $0.00. No extra fees.", "");
        pendingPickupState0.finishMaintenance(equipmentForStatePattern43);
        java.lang.String str45 = pendingPickupState0.getStateName();
        app.PendingPickupState pendingPickupState46 = new app.PendingPickupState();
        app.DisabledState disabledState47 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern51.disable();
        equipmentForStatePattern51.release();
        disabledState47.release(equipmentForStatePattern51);
        app.EquipmentForStatePattern equipmentForStatePattern58 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern58.disable();
        disabledState47.markMaintenance(equipmentForStatePattern58);
        app.DisabledState disabledState61 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern65 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern65.disable();
        equipmentForStatePattern65.release();
        disabledState61.release(equipmentForStatePattern65);
        app.EquipmentForStatePattern equipmentForStatePattern72 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern72.disable();
        disabledState61.markMaintenance(equipmentForStatePattern72);
        disabledState47.finishMaintenance(equipmentForStatePattern72);
        equipmentForStatePattern72.enable();
        pendingPickupState46.enable(equipmentForStatePattern72);
        app.AvailableState availableState78 = new app.AvailableState();
        java.lang.String str79 = availableState78.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern83 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str84 = equipmentForStatePattern83.getId();
        availableState78.markMaintenance(equipmentForStatePattern83);
        pendingPickupState46.finishMaintenance(equipmentForStatePattern83);
        app.DisabledState disabledState87 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern91 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern91.disable();
        equipmentForStatePattern91.release();
        disabledState87.release(equipmentForStatePattern91);
        pendingPickupState46.markMaintenance(equipmentForStatePattern91);
        pendingPickupState0.release(equipmentForStatePattern91);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PENDING_PICKUP" + "'", str45, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "AVAILABLE" + "'", str79, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        app.BookingSystem bookingSystem0 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList1 = bookingSystem0.getReservations();
        app.ReservationManager reservationManager2 = new app.ReservationManager();
        app.Sensor sensor4 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager2.update(sensor4);
        app.UsageLogger usageLogger6 = new app.UsageLogger();
        java.util.List<java.lang.String> strList7 = usageLogger6.getLogs();
        sensor4.detach((app.Observer) usageLogger6);
        app.UsageLogger usageLogger9 = new app.UsageLogger();
        sensor4.attach((app.Observer) usageLogger9);
        app.ReservationManager reservationManager11 = new app.ReservationManager();
        app.Sensor sensor13 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager11.update(sensor13);
        app.UsageLogger usageLogger15 = new app.UsageLogger();
        java.util.List<java.lang.String> strList16 = usageLogger15.getLogs();
        sensor13.detach((app.Observer) usageLogger15);
        app.UsageLogger usageLogger18 = new app.UsageLogger();
        sensor13.attach((app.Observer) usageLogger18);
        sensor4.detach((app.Observer) usageLogger18);
        app.Sensor sensor22 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger18.update(sensor22);
        bookingSystem0.update(sensor22);
        app.Equipment equipment28 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        app.ReservationStatus reservationStatus32 = null;
        app.Reservation reservation33 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime30, localDateTime31, reservationStatus32);
        java.time.LocalDateTime localDateTime34 = null;
        reservation33.setStartTime(localDateTime34);
        java.time.LocalDateTime localDateTime36 = null;
        reservation33.setEndTime(localDateTime36);
        java.time.LocalDateTime localDateTime38 = null;
        reservation33.setEndTime(localDateTime38);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        app.ModifyReservationCommand modifyReservationCommand42 = new app.ModifyReservationCommand(equipment28, reservation33, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        app.ReservationStatus reservationStatus46 = null;
        app.Reservation reservation47 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime44, localDateTime45, reservationStatus46);
        java.time.LocalDateTime localDateTime48 = null;
        reservation47.setStartTime(localDateTime48);
        java.time.LocalDateTime localDateTime50 = null;
        reservation47.setEndTime(localDateTime50);
        java.time.LocalDateTime localDateTime52 = reservation47.getEndTime();
        app.CancelReservationCommand cancelReservationCommand53 = new app.CancelReservationCommand(reservation47);
        java.time.LocalDateTime localDateTime54 = reservation47.getEndTime();
        java.time.LocalDateTime localDateTime55 = null;
        app.ExtendReservationCommand extendReservationCommand56 = new app.ExtendReservationCommand(equipment28, reservation47, localDateTime55);
        java.time.LocalDateTime localDateTime57 = reservation47.getEndTime();
        bookingSystem0.addReservation(reservation47);
        java.util.List<app.Reservation> reservationList59 = bookingSystem0.getReservations();
        app.ReservationManager reservationManager60 = new app.ReservationManager();
        app.Sensor sensor62 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager60.update(sensor62);
        app.UsageLogger usageLogger64 = new app.UsageLogger();
        java.util.List<java.lang.String> strList65 = usageLogger64.getLogs();
        sensor62.detach((app.Observer) usageLogger64);
        app.ReservationManager reservationManager67 = new app.ReservationManager();
        sensor62.detach((app.Observer) reservationManager67);
        app.ReservationManager reservationManager69 = new app.ReservationManager();
        app.Sensor sensor71 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager69.update(sensor71);
        app.UsageLogger usageLogger73 = new app.UsageLogger();
        java.util.List<java.lang.String> strList74 = usageLogger73.getLogs();
        sensor71.detach((app.Observer) usageLogger73);
        app.Sensor sensor77 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger73.update(sensor77);
        sensor62.detach((app.Observer) usageLogger73);
        sensor62.startEquipment();
        boolean boolean81 = sensor62.isEquipmentActive();
        boolean boolean82 = sensor62.isEquipmentActive();
        app.BookingSystem bookingSystem83 = new app.BookingSystem();
        app.Sensor sensor85 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem83.update(sensor85);
        java.util.List<app.Reservation> reservationList87 = bookingSystem83.getReservations();
        java.util.List<app.Reservation> reservationList88 = bookingSystem83.getReservations();
        sensor62.attach((app.Observer) bookingSystem83);
        bookingSystem0.update(sensor62);
        app.Sensor sensor91 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingSystem0.update(sensor91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"app.Sensor.isEquipmentActive()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(localDateTime52);
        org.junit.Assert.assertNull(localDateTime54);
        org.junit.Assert.assertNull(localDateTime57);
        org.junit.Assert.assertNotNull(reservationList59);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(reservationList87);
        org.junit.Assert.assertNotNull(reservationList88);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("", "", "Processing credit card payment of $30.60 plus 2% processing fee.");
        java.lang.String str4 = equipmentForStatePattern3.getDescription();
        java.lang.String str5 = equipmentForStatePattern3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        app.AvailableState availableState0 = new app.AvailableState();
        java.lang.String str1 = availableState0.getStateName();
        app.DisabledState disabledState2 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern6 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern6.release();
        disabledState2.reserve(equipmentForStatePattern6);
        availableState0.reserve(equipmentForStatePattern6);
        app.DisabledState disabledState10 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern14 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern14.release();
        disabledState10.reserve(equipmentForStatePattern14);
        java.lang.String str17 = disabledState10.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern21.release();
        boolean boolean23 = equipmentForStatePattern21.isAvailable();
        disabledState10.disable(equipmentForStatePattern21);
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern28.release();
        boolean boolean30 = equipmentForStatePattern28.isAvailable();
        boolean boolean31 = equipmentForStatePattern28.isAvailable();
        equipmentForStatePattern28.release();
        disabledState10.finishMaintenance(equipmentForStatePattern28);
        availableState0.finishMaintenance(equipmentForStatePattern28);
        app.AvailableState availableState35 = new app.AvailableState();
        java.lang.String str36 = availableState35.getStateName();
        app.DisabledState disabledState37 = new app.DisabledState();
        app.DisabledState disabledState38 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern42.disable();
        equipmentForStatePattern42.release();
        disabledState38.release(equipmentForStatePattern42);
        disabledState37.enable(equipmentForStatePattern42);
        availableState35.disable(equipmentForStatePattern42);
        equipmentForStatePattern42.release();
        availableState0.reserve(equipmentForStatePattern42);
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("", "hi!", "");
        availableState0.disable(equipmentForStatePattern53);
        app.EquipmentForStatePattern equipmentForStatePattern55 = null;
        availableState0.finishMaintenance(equipmentForStatePattern55);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DISABLED" + "'", str17, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AVAILABLE" + "'", str36, "AVAILABLE");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Deducting $35.00 from registered Research Grant funds.", (double) 10L, localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        reservationforStatePattern3.arrive(localDateTime4);
        java.time.LocalDateTime localDateTime6 = reservationforStatePattern3.getStartTime();
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.release();
        disabledState1.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState1.markMaintenance(equipmentForStatePattern11);
        disabledState0.enable(equipmentForStatePattern11);
        java.lang.String str14 = disabledState0.getStateName();
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.release();
        disabledState15.reserve(equipmentForStatePattern19);
        java.lang.String str22 = disabledState15.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.release();
        boolean boolean28 = equipmentForStatePattern26.isAvailable();
        disabledState15.disable(equipmentForStatePattern26);
        app.DisabledState disabledState30 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern34 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern34.disable();
        equipmentForStatePattern34.release();
        disabledState30.release(equipmentForStatePattern34);
        app.EquipmentForStatePattern equipmentForStatePattern41 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern41.disable();
        disabledState30.markMaintenance(equipmentForStatePattern41);
        equipmentForStatePattern41.finishMaintenance();
        java.lang.String str45 = equipmentForStatePattern41.getDescription();
        disabledState15.release(equipmentForStatePattern41);
        app.PendingPickupState pendingPickupState47 = new app.PendingPickupState();
        app.DisabledState disabledState48 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern52 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern52.disable();
        equipmentForStatePattern52.release();
        disabledState48.release(equipmentForStatePattern52);
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern59.disable();
        disabledState48.markMaintenance(equipmentForStatePattern59);
        app.DisabledState disabledState62 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern66 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern66.disable();
        equipmentForStatePattern66.release();
        disabledState62.release(equipmentForStatePattern66);
        app.EquipmentForStatePattern equipmentForStatePattern73 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern73.disable();
        disabledState62.markMaintenance(equipmentForStatePattern73);
        disabledState48.finishMaintenance(equipmentForStatePattern73);
        equipmentForStatePattern73.enable();
        pendingPickupState47.enable(equipmentForStatePattern73);
        app.AvailableState availableState79 = new app.AvailableState();
        java.lang.String str80 = availableState79.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern84 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str85 = equipmentForStatePattern84.getId();
        availableState79.markMaintenance(equipmentForStatePattern84);
        pendingPickupState47.finishMaintenance(equipmentForStatePattern84);
        app.EquipmentForStatePattern equipmentForStatePattern91 = new app.EquipmentForStatePattern("", "hi!", "");
        pendingPickupState47.disable(equipmentForStatePattern91);
        equipmentForStatePattern91.markPendingPickup();
        disabledState15.enable(equipmentForStatePattern91);
        java.lang.String str95 = equipmentForStatePattern91.getDescription();
        disabledState0.disable(equipmentForStatePattern91);
        java.lang.String str97 = disabledState0.getStateName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DISABLED" + "'", str14, "DISABLED");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DISABLED" + "'", str22, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "AVAILABLE" + "'", str80, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "DISABLED" + "'", str97, "DISABLED");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        reservationforStatePattern3.arrive(localDateTime4);
        java.lang.String str6 = reservationforStatePattern3.getReservationId();
        java.lang.String str7 = reservationforStatePattern3.getReservationId();
        double double8 = reservationforStatePattern3.getDepositAmount();
        double double10 = reservationforStatePattern3.calculateFinalPayment((double) (short) 0);
        reservationforStatePattern3.payDeposit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        app.Equipment equipment12 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        app.ReservationManager reservationManager13 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        app.ReservationStatus reservationStatus17 = null;
        app.Reservation reservation18 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime15, localDateTime16, reservationStatus17);
        java.time.LocalDateTime localDateTime19 = null;
        reservation18.setStartTime(localDateTime19);
        java.time.LocalDateTime localDateTime21 = null;
        reservation18.setEndTime(localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        reservation18.setEndTime(localDateTime23);
        reservationManager13.addReservation(reservation18);
        java.time.LocalDateTime localDateTime26 = reservation18.getEndTime();
        java.time.LocalDateTime localDateTime27 = null;
        app.ExtendReservationCommand extendReservationCommand28 = new app.ExtendReservationCommand(equipment12, reservation18, localDateTime27);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        app.ReservationStatus reservationStatus32 = null;
        app.Reservation reservation33 = new app.Reservation("Processing direct debit payment of $97.00. No extra fees.", localDateTime30, localDateTime31, reservationStatus32);
        app.CancelReservationCommand cancelReservationCommand34 = new app.CancelReservationCommand(reservation33);
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = reservation33.extendReservation(localDateTime35);
        reservation33.cancelReservation();
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = reservation33.extendReservation(localDateTime38);
        java.time.LocalDateTime localDateTime40 = null;
        app.ExtendReservationCommand extendReservationCommand41 = new app.ExtendReservationCommand(equipment12, reservation33, localDateTime40);
        app.ReservationStatus reservationStatus42 = reservation33.getStatus();
        app.Reservation reservation43 = new app.Reservation("Charging $32.00 to University Department Account. Pending Dean approval.", localDateTime7, localDateTime8, reservationStatus42);
        app.Reservation reservation44 = new app.Reservation("Processing credit card payment of $102.00 plus 2% processing fee.", localDateTime4, localDateTime5, reservationStatus42);
        app.Reservation reservation45 = new app.Reservation("Processing credit card payment of $30.60 plus 2% processing fee.", localDateTime1, localDateTime2, reservationStatus42);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + reservationStatus42 + "' != '" + app.ReservationStatus.CANCELLED + "'", reservationStatus42.equals(app.ReservationStatus.CANCELLED));
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.release();
        availableState0.finishMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern11.release();
        equipmentForStatePattern11.confirmReservation();
        availableState0.reserve(equipmentForStatePattern11);
        app.PendingPickupState pendingPickupState15 = new app.PendingPickupState();
        app.DisabledState disabledState16 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern20.disable();
        equipmentForStatePattern20.release();
        disabledState16.release(equipmentForStatePattern20);
        app.EquipmentForStatePattern equipmentForStatePattern27 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern27.disable();
        disabledState16.markMaintenance(equipmentForStatePattern27);
        app.DisabledState disabledState30 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern34 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern34.disable();
        equipmentForStatePattern34.release();
        disabledState30.release(equipmentForStatePattern34);
        app.EquipmentForStatePattern equipmentForStatePattern41 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern41.disable();
        disabledState30.markMaintenance(equipmentForStatePattern41);
        disabledState16.finishMaintenance(equipmentForStatePattern41);
        equipmentForStatePattern41.enable();
        pendingPickupState15.enable(equipmentForStatePattern41);
        app.EquipmentForStatePattern equipmentForStatePattern50 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern50.confirmReservation();
        pendingPickupState15.finishMaintenance(equipmentForStatePattern50);
        availableState0.enable(equipmentForStatePattern50);
        app.EquipmentForStatePattern equipmentForStatePattern57 = new app.EquipmentForStatePattern("Processing direct debit payment of $-1.00. No extra fees.", "Processing credit card payment of $10.20 plus 2% processing fee.", "Charging $100.00 to University Department Account. Pending Dean approval.");
        availableState0.markMaintenance(equipmentForStatePattern57);
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("Processing direct debit payment of $1.00. No extra fees.", "Processing direct debit payment of $1.00. No extra fees.", "Processing credit card payment of $10.20 plus 2% processing fee.");
        availableState0.disable(equipmentForStatePattern62);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        app.Equipment equipment3 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        app.ReservationStatus reservationStatus7 = null;
        app.Reservation reservation8 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime5, localDateTime6, reservationStatus7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation8.setStartTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation8.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation8.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        app.ModifyReservationCommand modifyReservationCommand17 = new app.ModifyReservationCommand(equipment3, reservation8, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        app.ReservationStatus reservationStatus21 = null;
        app.Reservation reservation22 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime19, localDateTime20, reservationStatus21);
        java.time.LocalDateTime localDateTime23 = null;
        reservation22.setStartTime(localDateTime23);
        java.time.LocalDateTime localDateTime25 = null;
        reservation22.setEndTime(localDateTime25);
        java.time.LocalDateTime localDateTime27 = reservation22.getEndTime();
        app.CancelReservationCommand cancelReservationCommand28 = new app.CancelReservationCommand(reservation22);
        java.time.LocalDateTime localDateTime29 = reservation22.getEndTime();
        java.time.LocalDateTime localDateTime30 = null;
        app.ExtendReservationCommand extendReservationCommand31 = new app.ExtendReservationCommand(equipment3, reservation22, localDateTime30);
        java.time.LocalDateTime localDateTime32 = reservation22.getStartTime();
        app.ReservationStatus reservationStatus33 = reservation22.getStatus();
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = reservation22.extendReservation(localDateTime34);
        java.time.LocalDateTime localDateTime36 = null;
        reservation22.setStartTime(localDateTime36);
        java.time.LocalDateTime localDateTime38 = null;
        reservation22.setEndTime(localDateTime38);
        java.time.LocalDateTime localDateTime40 = reservation22.getEndTime();
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(reservationStatus33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(localDateTime40);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        app.AvailableState availableState0 = new app.AvailableState();
        java.lang.String str1 = availableState0.getStateName();
        app.DisabledState disabledState2 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern6 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern6.release();
        disabledState2.reserve(equipmentForStatePattern6);
        availableState0.reserve(equipmentForStatePattern6);
        app.AvailableState availableState10 = new app.AvailableState();
        java.lang.String str11 = availableState10.getStateName();
        app.DisabledState disabledState12 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern16 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern16.release();
        disabledState12.reserve(equipmentForStatePattern16);
        app.EquipmentForStatePattern equipmentForStatePattern22 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState12.markMaintenance(equipmentForStatePattern22);
        availableState10.enable(equipmentForStatePattern22);
        app.DisabledState disabledState25 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern29 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern29.release();
        disabledState25.reserve(equipmentForStatePattern29);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState25.markMaintenance(equipmentForStatePattern35);
        app.DisabledState disabledState37 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern41 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern41.disable();
        equipmentForStatePattern41.release();
        disabledState37.release(equipmentForStatePattern41);
        app.EquipmentForStatePattern equipmentForStatePattern48 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern48.disable();
        disabledState37.markMaintenance(equipmentForStatePattern48);
        equipmentForStatePattern48.finishMaintenance();
        disabledState25.disable(equipmentForStatePattern48);
        availableState10.disable(equipmentForStatePattern48);
        equipmentForStatePattern48.release();
        availableState0.reserve(equipmentForStatePattern48);
        java.lang.String str56 = availableState0.getStateName();
        app.AvailableState availableState57 = new app.AvailableState();
        java.lang.String str58 = availableState57.getStateName();
        app.DisabledState disabledState59 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern63 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern63.release();
        disabledState59.reserve(equipmentForStatePattern63);
        app.EquipmentForStatePattern equipmentForStatePattern69 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState59.markMaintenance(equipmentForStatePattern69);
        availableState57.enable(equipmentForStatePattern69);
        equipmentForStatePattern69.enable();
        java.lang.String str73 = equipmentForStatePattern69.getStateName();
        availableState0.enable(equipmentForStatePattern69);
        app.EquipmentForStatePattern equipmentForStatePattern78 = new app.EquipmentForStatePattern("", "RESERVED", "Processing credit card payment of $30.60 plus 2% processing fee.");
        availableState0.disable(equipmentForStatePattern78);
        equipmentForStatePattern78.confirmReservation();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AVAILABLE" + "'", str1, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AVAILABLE" + "'", str11, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AVAILABLE" + "'", str56, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "AVAILABLE" + "'", str58, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "AVAILABLE" + "'", str73, "AVAILABLE");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        app.DisabledState disabledState30 = new app.DisabledState();
        app.DisabledState disabledState31 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.release();
        disabledState31.reserve(equipmentForStatePattern35);
        disabledState30.release(equipmentForStatePattern35);
        disabledState1.disable(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern43 = new app.EquipmentForStatePattern("Processing direct debit payment of $0.00. No extra fees.", "Processing direct debit payment of $0.00. No extra fees.", "");
        equipmentForStatePattern43.finishMaintenance();
        java.lang.String str45 = equipmentForStatePattern43.getDescription();
        disabledState1.enable(equipmentForStatePattern43);
        app.DisabledState disabledState47 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern51.disable();
        equipmentForStatePattern51.release();
        disabledState47.release(equipmentForStatePattern51);
        app.EquipmentForStatePattern equipmentForStatePattern58 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern58.disable();
        disabledState47.markMaintenance(equipmentForStatePattern58);
        app.DisabledState disabledState61 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern65 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern65.disable();
        equipmentForStatePattern65.release();
        disabledState61.release(equipmentForStatePattern65);
        app.EquipmentForStatePattern equipmentForStatePattern72 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern72.disable();
        disabledState61.markMaintenance(equipmentForStatePattern72);
        disabledState47.finishMaintenance(equipmentForStatePattern72);
        app.EquipmentForStatePattern equipmentForStatePattern79 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern79.disable();
        equipmentForStatePattern79.release();
        equipmentForStatePattern79.enable();
        disabledState47.disable(equipmentForStatePattern79);
        disabledState1.enable(equipmentForStatePattern79);
        java.lang.String str85 = equipmentForStatePattern79.getLocation();
        equipmentForStatePattern79.confirmReservation();
        pendingPickupState0.enable(equipmentForStatePattern79);
        java.lang.String str88 = equipmentForStatePattern79.getStateName();
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str45, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "RESERVED" + "'", str88, "RESERVED");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.UsageLogger usageLogger7 = new app.UsageLogger();
        sensor2.attach((app.Observer) usageLogger7);
        app.BookingSystem bookingSystem9 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList10 = bookingSystem9.getReservations();
        app.ReservationManager reservationManager11 = new app.ReservationManager();
        app.Sensor sensor13 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager11.update(sensor13);
        app.UsageLogger usageLogger15 = new app.UsageLogger();
        java.util.List<java.lang.String> strList16 = usageLogger15.getLogs();
        sensor13.detach((app.Observer) usageLogger15);
        app.UsageLogger usageLogger18 = new app.UsageLogger();
        sensor13.attach((app.Observer) usageLogger18);
        app.ReservationManager reservationManager20 = new app.ReservationManager();
        app.Sensor sensor22 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager20.update(sensor22);
        app.UsageLogger usageLogger24 = new app.UsageLogger();
        java.util.List<java.lang.String> strList25 = usageLogger24.getLogs();
        sensor22.detach((app.Observer) usageLogger24);
        app.UsageLogger usageLogger27 = new app.UsageLogger();
        sensor22.attach((app.Observer) usageLogger27);
        sensor13.detach((app.Observer) usageLogger27);
        app.Sensor sensor31 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger27.update(sensor31);
        bookingSystem9.update(sensor31);
        app.BookingSystem bookingSystem34 = new app.BookingSystem();
        java.util.List<app.Reservation> reservationList35 = bookingSystem34.getReservations();
        app.BookingSystem bookingSystem36 = new app.BookingSystem();
        app.Sensor sensor38 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        bookingSystem36.update(sensor38);
        bookingSystem34.update(sensor38);
        bookingSystem9.update(sensor38);
        usageLogger7.update(sensor38);
        java.util.List<java.lang.String> strList43 = usageLogger7.getLogs();
        java.util.List<java.lang.String> strList44 = usageLogger7.getLogs();
        java.util.List<java.lang.String> strList45 = usageLogger7.getLogs();
        app.Sensor sensor47 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        java.lang.String str48 = sensor47.getSensorId();
        boolean boolean49 = sensor47.isEquipmentActive();
        app.ReservationManager reservationManager50 = new app.ReservationManager();
        app.Sensor sensor52 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager50.update(sensor52);
        app.UsageLogger usageLogger54 = new app.UsageLogger();
        java.util.List<java.lang.String> strList55 = usageLogger54.getLogs();
        sensor52.detach((app.Observer) usageLogger54);
        app.UsageLogger usageLogger57 = new app.UsageLogger();
        sensor52.attach((app.Observer) usageLogger57);
        sensor47.attach((app.Observer) usageLogger57);
        app.ReservationManager reservationManager60 = new app.ReservationManager();
        app.Sensor sensor62 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager60.update(sensor62);
        app.UsageLogger usageLogger64 = new app.UsageLogger();
        java.util.List<java.lang.String> strList65 = usageLogger64.getLogs();
        sensor62.detach((app.Observer) usageLogger64);
        app.UsageLogger usageLogger67 = new app.UsageLogger();
        sensor62.attach((app.Observer) usageLogger67);
        usageLogger57.update(sensor62);
        usageLogger7.update(sensor62);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str48, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList65);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        app.Equipment equipment3 = new app.Equipment("", "Processing direct debit payment of $0.00. No extra fees.", "Deducting $100.00 from registered Research Grant funds.");
        app.ReservationManager reservationManager4 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        app.ReservationStatus reservationStatus8 = null;
        app.Reservation reservation9 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime6, localDateTime7, reservationStatus8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation9.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation9.setEndTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation9.setEndTime(localDateTime14);
        reservationManager4.addReservation(reservation9);
        java.time.LocalDateTime localDateTime17 = reservation9.getEndTime();
        java.time.LocalDateTime localDateTime18 = null;
        app.ExtendReservationCommand extendReservationCommand19 = new app.ExtendReservationCommand(equipment3, reservation9, localDateTime18);
        app.ReservationManager reservationManager20 = new app.ReservationManager();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        app.ReservationStatus reservationStatus24 = null;
        app.Reservation reservation25 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime22, localDateTime23, reservationStatus24);
        java.time.LocalDateTime localDateTime26 = null;
        reservation25.setStartTime(localDateTime26);
        java.time.LocalDateTime localDateTime28 = null;
        reservation25.setEndTime(localDateTime28);
        java.time.LocalDateTime localDateTime30 = null;
        reservation25.setEndTime(localDateTime30);
        reservationManager20.addReservation(reservation25);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        app.ModifyReservationCommand modifyReservationCommand35 = new app.ModifyReservationCommand(equipment3, reservation25, localDateTime33, localDateTime34);
        app.ReservationStatus reservationStatus36 = reservation25.getStatus();
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(reservationStatus36);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        app.Equipment equipment3 = new app.Equipment("Charging $1.00 to University Department Account. Pending Dean approval.", "AVAILABLE", "Deducting $100.00 from registered Research Grant funds.");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        app.ReservationStatus reservationStatus7 = null;
        app.Reservation reservation8 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime5, localDateTime6, reservationStatus7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation8.setStartTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation8.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation8.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        app.ModifyReservationCommand modifyReservationCommand17 = new app.ModifyReservationCommand(equipment3, reservation8, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        app.ReservationStatus reservationStatus21 = null;
        app.Reservation reservation22 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime19, localDateTime20, reservationStatus21);
        java.time.LocalDateTime localDateTime23 = null;
        reservation22.setStartTime(localDateTime23);
        java.time.LocalDateTime localDateTime25 = null;
        reservation22.setEndTime(localDateTime25);
        java.time.LocalDateTime localDateTime27 = reservation22.getEndTime();
        app.CancelReservationCommand cancelReservationCommand28 = new app.CancelReservationCommand(reservation22);
        java.time.LocalDateTime localDateTime29 = reservation22.getEndTime();
        java.time.LocalDateTime localDateTime30 = null;
        app.ExtendReservationCommand extendReservationCommand31 = new app.ExtendReservationCommand(equipment3, reservation22, localDateTime30);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        app.ReservationStatus reservationStatus35 = null;
        app.Reservation reservation36 = new app.Reservation("", localDateTime33, localDateTime34, reservationStatus35);
        java.time.LocalDateTime localDateTime37 = reservation36.getStartTime();
        java.time.LocalDateTime localDateTime38 = null;
        app.ExtendReservationCommand extendReservationCommand39 = new app.ExtendReservationCommand(equipment3, reservation36, localDateTime38);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        app.ReservationStatus reservationStatus43 = null;
        app.Reservation reservation44 = new app.Reservation("Deducting $100.00 from registered Research Grant funds.", localDateTime41, localDateTime42, reservationStatus43);
        app.ReservationStatus reservationStatus45 = reservation44.getStatus();
        java.time.LocalDateTime localDateTime46 = null;
        app.ExtendReservationCommand extendReservationCommand47 = new app.ExtendReservationCommand(equipment3, reservation44, localDateTime46);
        java.time.LocalDateTime localDateTime48 = reservation44.getStartTime();
        java.time.LocalDateTime localDateTime49 = null;
        reservation44.setEndTime(localDateTime49);
        java.time.LocalDateTime localDateTime51 = reservation44.getStartTime();
        java.time.LocalDateTime localDateTime52 = null;
        reservation44.setStartTime(localDateTime52);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(reservationStatus45);
        org.junit.Assert.assertNull(localDateTime48);
        org.junit.Assert.assertNull(localDateTime51);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        app.ReservationManager reservationManager0 = new app.ReservationManager();
        app.Sensor sensor2 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager0.update(sensor2);
        app.UsageLogger usageLogger4 = new app.UsageLogger();
        java.util.List<java.lang.String> strList5 = usageLogger4.getLogs();
        sensor2.detach((app.Observer) usageLogger4);
        app.UsageLogger usageLogger7 = new app.UsageLogger();
        sensor2.attach((app.Observer) usageLogger7);
        app.ReservationManager reservationManager9 = new app.ReservationManager();
        app.Sensor sensor11 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager9.update(sensor11);
        app.UsageLogger usageLogger13 = new app.UsageLogger();
        java.util.List<java.lang.String> strList14 = usageLogger13.getLogs();
        sensor11.detach((app.Observer) usageLogger13);
        app.ReservationManager reservationManager16 = new app.ReservationManager();
        sensor11.detach((app.Observer) reservationManager16);
        app.ReservationManager reservationManager18 = new app.ReservationManager();
        app.Sensor sensor20 = new app.Sensor("Processing direct debit payment of $0.00. No extra fees.");
        reservationManager18.update(sensor20);
        app.UsageLogger usageLogger22 = new app.UsageLogger();
        java.util.List<java.lang.String> strList23 = usageLogger22.getLogs();
        sensor20.detach((app.Observer) usageLogger22);
        app.Sensor sensor26 = new app.Sensor("Charging $1.00 to University Department Account. Pending Dean approval.");
        usageLogger22.update(sensor26);
        sensor11.detach((app.Observer) usageLogger22);
        sensor11.startEquipment();
        sensor11.notifyObservers();
        boolean boolean31 = sensor11.isEquipmentActive();
        java.lang.String str32 = sensor11.getSensorId();
        sensor11.notifyObservers();
        usageLogger7.update(sensor11);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str32, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern5.disable();
        equipmentForStatePattern5.release();
        disabledState1.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern12.disable();
        disabledState1.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.release();
        disabledState15.release(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern26.disable();
        disabledState15.markMaintenance(equipmentForStatePattern26);
        disabledState1.finishMaintenance(equipmentForStatePattern26);
        equipmentForStatePattern26.enable();
        pendingPickupState0.enable(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern35.disable();
        equipmentForStatePattern35.release();
        equipmentForStatePattern35.enable();
        java.lang.String str39 = equipmentForStatePattern35.getId();
        pendingPickupState0.disable(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern44.disable();
        equipmentForStatePattern44.release();
        equipmentForStatePattern44.enable();
        java.lang.String str48 = equipmentForStatePattern44.getId();
        pendingPickupState0.enable(equipmentForStatePattern44);
        java.lang.String str50 = pendingPickupState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern54 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str55 = equipmentForStatePattern54.getId();
        equipmentForStatePattern54.disable();
        pendingPickupState0.release(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("", "hi!", "");
        java.lang.String str62 = equipmentForStatePattern61.getId();
        pendingPickupState0.release(equipmentForStatePattern61);
        app.EquipmentForStatePattern equipmentForStatePattern67 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern67.release();
        equipmentForStatePattern67.confirmReservation();
        equipmentForStatePattern67.release();
        pendingPickupState0.finishMaintenance(equipmentForStatePattern67);
        app.DisabledState disabledState72 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern76.release();
        disabledState72.reserve(equipmentForStatePattern76);
        java.lang.String str79 = disabledState72.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern83 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern83.disable();
        equipmentForStatePattern83.release();
        equipmentForStatePattern83.enable();
        java.lang.String str87 = equipmentForStatePattern83.getId();
        equipmentForStatePattern83.markPendingPickup();
        disabledState72.release(equipmentForStatePattern83);
        pendingPickupState0.finishMaintenance(equipmentForStatePattern83);
        app.EquipmentForStatePattern equipmentForStatePattern94 = new app.EquipmentForStatePattern("Deducting $35.00 from registered Research Grant funds.", "Charging $35.00 to University Department Account. Pending Dean approval.", "AVAILABLE");
        pendingPickupState0.enable(equipmentForStatePattern94);
        java.lang.String str96 = pendingPickupState0.getStateName();
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PENDING_PICKUP" + "'", str50, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "DISABLED" + "'", str79, "DISABLED");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "PENDING_PICKUP" + "'", str96, "PENDING_PICKUP");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern4.release();
        disabledState0.reserve(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern10 = new app.EquipmentForStatePattern("", "hi!", "");
        disabledState0.markMaintenance(equipmentForStatePattern10);
        app.DisabledState disabledState12 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern16 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern16.disable();
        equipmentForStatePattern16.release();
        disabledState12.release(equipmentForStatePattern16);
        app.EquipmentForStatePattern equipmentForStatePattern23 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern23.disable();
        disabledState12.markMaintenance(equipmentForStatePattern23);
        equipmentForStatePattern23.finishMaintenance();
        disabledState0.disable(equipmentForStatePattern23);
        java.lang.String str28 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("Processing direct debit payment of $-1.00. No extra fees.", "Processing credit card payment of $10.20 plus 2% processing fee.", "Charging $100.00 to University Department Account. Pending Dean approval.");
        disabledState0.reserve(equipmentForStatePattern32);
        java.lang.String str34 = disabledState0.getStateName();
        app.AvailableState availableState35 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern39 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern39.disable();
        equipmentForStatePattern39.release();
        availableState35.finishMaintenance(equipmentForStatePattern39);
        app.DisabledState disabledState43 = new app.DisabledState();
        app.DisabledState disabledState44 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern48 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern48.disable();
        equipmentForStatePattern48.release();
        disabledState44.release(equipmentForStatePattern48);
        disabledState43.enable(equipmentForStatePattern48);
        availableState35.finishMaintenance(equipmentForStatePattern48);
        app.EquipmentForStatePattern equipmentForStatePattern57 = new app.EquipmentForStatePattern("Processing direct debit payment of $0.00. No extra fees.", "Processing direct debit payment of $0.00. No extra fees.", "");
        equipmentForStatePattern57.finishMaintenance();
        java.lang.String str59 = equipmentForStatePattern57.getDescription();
        availableState35.release(equipmentForStatePattern57);
        app.DisabledState disabledState61 = new app.DisabledState();
        app.DisabledState disabledState62 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern66 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern66.disable();
        equipmentForStatePattern66.release();
        disabledState62.release(equipmentForStatePattern66);
        app.EquipmentForStatePattern equipmentForStatePattern73 = new app.EquipmentForStatePattern("", "hi!", "");
        equipmentForStatePattern73.disable();
        disabledState62.markMaintenance(equipmentForStatePattern73);
        disabledState61.reserve(equipmentForStatePattern73);
        availableState35.markMaintenance(equipmentForStatePattern73);
        disabledState0.markMaintenance(equipmentForStatePattern73);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DISABLED" + "'", str28, "DISABLED");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "DISABLED" + "'", str34, "DISABLED");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str59, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("Processing direct debit payment of $97.00. No extra fees.", (double) (short) -1, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) (-1L));
        app.DepositState depositState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.setDepositState(depositState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"app.DepositState.getStateName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("Charging $0.00 to University Department Account. Pending Dean approval.", "DISABLED", "");
        equipmentForStatePattern3.enable();
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) 100L, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) '4');
        java.lang.String str6 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservationforStatePattern3.getStartTime();
        reservationforStatePattern3.payDeposit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
    }
}

