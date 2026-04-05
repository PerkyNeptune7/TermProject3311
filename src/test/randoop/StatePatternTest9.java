package test.randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StatePatternTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4501");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("AVAILABLE", (double) 10, localDateTime2);
        double double4 = reservationforStatePattern3.getDepositAmount();
        java.time.LocalDateTime localDateTime5 = reservationforStatePattern3.getStartTime();
        reservationforStatePattern3.payDeposit();
        double double8 = reservationforStatePattern3.calculateFinalPayment((double) '4');
        java.time.LocalDateTime localDateTime9 = reservationforStatePattern3.getStartTime();
        double double10 = reservationforStatePattern3.getDepositAmount();
        java.lang.String str11 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime12 = reservationforStatePattern3.getStartTime();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AVAILABLE" + "'", str11, "AVAILABLE");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4502");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("AVAILABLE", (double) (byte) 100, localDateTime2);
        java.time.LocalDateTime localDateTime4 = reservationforStatePattern3.getStartTime();
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4503");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        availableState0.release(equipmentForStatePattern1);
        app.EquipmentForStatePattern equipmentForStatePattern6 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        java.lang.String str7 = equipmentForStatePattern6.getId();
        availableState0.enable(equipmentForStatePattern6);
        app.PendingPickupState pendingPickupState9 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState9.reserve(equipmentForStatePattern13);
        availableState0.disable(equipmentForStatePattern13);
        app.PendingPickupState pendingPickupState16 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern17 = null;
        pendingPickupState16.markMaintenance(equipmentForStatePattern17);
        app.EquipmentForStatePattern equipmentForStatePattern22 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState16.enable(equipmentForStatePattern22);
        app.PendingPickupState pendingPickupState24 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern25 = null;
        pendingPickupState24.markMaintenance(equipmentForStatePattern25);
        app.EquipmentForStatePattern equipmentForStatePattern30 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState24.enable(equipmentForStatePattern30);
        pendingPickupState16.enable(equipmentForStatePattern30);
        equipmentForStatePattern30.enable();
        availableState0.finishMaintenance(equipmentForStatePattern30);
        app.EquipmentForStatePattern equipmentForStatePattern35 = null;
        availableState0.finishMaintenance(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("DISABLED", "", "DISABLED");
        availableState0.reserve(equipmentForStatePattern40);
        app.EquipmentForStatePattern equipmentForStatePattern45 = new app.EquipmentForStatePattern("hi!", "RESERVED", "RESERVED");
        equipmentForStatePattern45.confirmReservation();
        boolean boolean47 = equipmentForStatePattern45.isAvailable();
        availableState0.markMaintenance(equipmentForStatePattern45);
        java.lang.String str49 = availableState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str54 = equipmentForStatePattern53.getDescription();
        java.lang.String str55 = equipmentForStatePattern53.getStateName();
        equipmentForStatePattern53.reserve();
        availableState0.disable(equipmentForStatePattern53);
        app.PendingPickupState pendingPickupState58 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState58.reserve(equipmentForStatePattern62);
        app.EquipmentForStatePattern equipmentForStatePattern67 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str68 = equipmentForStatePattern67.getDescription();
        java.lang.String str69 = equipmentForStatePattern67.getStateName();
        pendingPickupState58.disable(equipmentForStatePattern67);
        java.lang.String str71 = pendingPickupState58.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        java.lang.String str76 = equipmentForStatePattern75.getId();
        pendingPickupState58.disable(equipmentForStatePattern75);
        java.lang.String str78 = equipmentForStatePattern75.getLocation();
        equipmentForStatePattern75.disable();
        availableState0.markMaintenance(equipmentForStatePattern75);
        java.lang.String str81 = equipmentForStatePattern75.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AVAILABLE" + "'", str49, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "DISABLED" + "'", str54, "DISABLED");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "AVAILABLE" + "'", str55, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "DISABLED" + "'", str68, "DISABLED");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "AVAILABLE" + "'", str69, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PENDING_PICKUP" + "'", str71, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4504");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        availableState0.release(equipmentForStatePattern1);
        app.PendingPickupState pendingPickupState3 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = null;
        pendingPickupState3.markMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern6 = null;
        pendingPickupState3.reserve(equipmentForStatePattern6);
        app.DisabledState disabledState8 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern9 = null;
        disabledState8.reserve(equipmentForStatePattern9);
        app.EquipmentForStatePattern equipmentForStatePattern11 = null;
        disabledState8.release(equipmentForStatePattern11);
        app.EquipmentForStatePattern equipmentForStatePattern13 = null;
        disabledState8.markMaintenance(equipmentForStatePattern13);
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        disabledState8.disable(equipmentForStatePattern18);
        pendingPickupState3.enable(equipmentForStatePattern18);
        availableState0.enable(equipmentForStatePattern18);
        java.lang.String str22 = availableState0.getStateName();
        app.PendingPickupState pendingPickupState23 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern24 = null;
        pendingPickupState23.markMaintenance(equipmentForStatePattern24);
        app.EquipmentForStatePattern equipmentForStatePattern29 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState23.enable(equipmentForStatePattern29);
        boolean boolean31 = equipmentForStatePattern29.isAvailable();
        availableState0.disable(equipmentForStatePattern29);
        app.EquipmentForStatePattern equipmentForStatePattern33 = null;
        availableState0.release(equipmentForStatePattern33);
        app.PendingPickupState pendingPickupState35 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern36 = null;
        pendingPickupState35.markMaintenance(equipmentForStatePattern36);
        app.EquipmentForStatePattern equipmentForStatePattern41 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState35.enable(equipmentForStatePattern41);
        app.PendingPickupState pendingPickupState43 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern44 = null;
        pendingPickupState43.markMaintenance(equipmentForStatePattern44);
        app.EquipmentForStatePattern equipmentForStatePattern49 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState43.enable(equipmentForStatePattern49);
        pendingPickupState35.enable(equipmentForStatePattern49);
        java.lang.String str52 = equipmentForStatePattern49.getDescription();
        java.lang.String str53 = equipmentForStatePattern49.getLocation();
        java.lang.String str54 = equipmentForStatePattern49.getStateName();
        availableState0.markMaintenance(equipmentForStatePattern49);
        app.PendingPickupState pendingPickupState56 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern57 = null;
        pendingPickupState56.markMaintenance(equipmentForStatePattern57);
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState56.enable(equipmentForStatePattern62);
        boolean boolean64 = equipmentForStatePattern62.isAvailable();
        availableState0.reserve(equipmentForStatePattern62);
        java.lang.String str66 = availableState0.getStateName();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AVAILABLE" + "'", str22, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DISABLED" + "'", str52, "DISABLED");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AVAILABLE" + "'", str54, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "AVAILABLE" + "'", str66, "AVAILABLE");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4505");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState0.reserve(equipmentForStatePattern4);
        app.AvailableState availableState6 = new app.AvailableState();
        app.PendingPickupState pendingPickupState7 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern8 = null;
        pendingPickupState7.markMaintenance(equipmentForStatePattern8);
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState7.enable(equipmentForStatePattern13);
        app.PendingPickupState pendingPickupState15 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern16 = null;
        pendingPickupState15.markMaintenance(equipmentForStatePattern16);
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState15.enable(equipmentForStatePattern21);
        pendingPickupState7.enable(equipmentForStatePattern21);
        equipmentForStatePattern21.confirmReservation();
        availableState6.markMaintenance(equipmentForStatePattern21);
        app.DisabledState disabledState26 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern27 = null;
        disabledState26.reserve(equipmentForStatePattern27);
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str33 = equipmentForStatePattern32.getDescription();
        java.lang.String str34 = equipmentForStatePattern32.getStateName();
        disabledState26.markMaintenance(equipmentForStatePattern32);
        availableState6.disable(equipmentForStatePattern32);
        pendingPickupState0.reserve(equipmentForStatePattern32);
        java.lang.String str38 = pendingPickupState0.getStateName();
        app.PendingPickupState pendingPickupState39 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern40 = null;
        pendingPickupState39.markMaintenance(equipmentForStatePattern40);
        app.EquipmentForStatePattern equipmentForStatePattern45 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState39.enable(equipmentForStatePattern45);
        app.PendingPickupState pendingPickupState47 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern48 = null;
        pendingPickupState47.markMaintenance(equipmentForStatePattern48);
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState47.enable(equipmentForStatePattern53);
        pendingPickupState39.enable(equipmentForStatePattern53);
        equipmentForStatePattern53.disable();
        equipmentForStatePattern53.markPendingPickup();
        equipmentForStatePattern53.reserve();
        pendingPickupState0.disable(equipmentForStatePattern53);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DISABLED" + "'", str33, "DISABLED");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AVAILABLE" + "'", str34, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PENDING_PICKUP" + "'", str38, "PENDING_PICKUP");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4506");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("DISABLED", (double) 10L, localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        reservationforStatePattern3.arrive(localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservationforStatePattern3.arrive(localDateTime6);
        double double9 = reservationforStatePattern3.calculateFinalPayment((double) 10.0f);
        reservationforStatePattern3.payDeposit();
        java.time.LocalDateTime localDateTime11 = reservationforStatePattern3.getStartTime();
        java.time.LocalDateTime localDateTime12 = reservationforStatePattern3.getStartTime();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4507");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        availableState0.release(equipmentForStatePattern1);
        java.lang.String str3 = availableState0.getStateName();
        app.DisabledState disabledState4 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = null;
        disabledState4.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern10 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str11 = equipmentForStatePattern10.getDescription();
        java.lang.String str12 = equipmentForStatePattern10.getStateName();
        disabledState4.markMaintenance(equipmentForStatePattern10);
        app.PendingPickupState pendingPickupState14 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern15 = null;
        pendingPickupState14.markMaintenance(equipmentForStatePattern15);
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState14.enable(equipmentForStatePattern20);
        app.PendingPickupState pendingPickupState22 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern23 = null;
        pendingPickupState22.markMaintenance(equipmentForStatePattern23);
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState22.enable(equipmentForStatePattern28);
        pendingPickupState14.enable(equipmentForStatePattern28);
        equipmentForStatePattern28.enable();
        equipmentForStatePattern28.markPendingPickup();
        equipmentForStatePattern28.release();
        disabledState4.enable(equipmentForStatePattern28);
        equipmentForStatePattern28.reserve();
        availableState0.finishMaintenance(equipmentForStatePattern28);
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("hi!", "", "");
        availableState0.enable(equipmentForStatePattern40);
        java.lang.String str42 = availableState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern43 = null;
        availableState0.finishMaintenance(equipmentForStatePattern43);
        app.PendingPickupState pendingPickupState45 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern46 = null;
        pendingPickupState45.markMaintenance(equipmentForStatePattern46);
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState45.enable(equipmentForStatePattern51);
        app.PendingPickupState pendingPickupState53 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern54 = null;
        pendingPickupState53.markMaintenance(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState53.enable(equipmentForStatePattern59);
        pendingPickupState45.enable(equipmentForStatePattern59);
        equipmentForStatePattern59.disable();
        java.lang.String str63 = equipmentForStatePattern59.getLocation();
        java.lang.String str64 = equipmentForStatePattern59.getDescription();
        equipmentForStatePattern59.markMaintenance();
        java.lang.String str66 = equipmentForStatePattern59.getDescription();
        availableState0.release(equipmentForStatePattern59);
        equipmentForStatePattern59.markPendingPickup();
        boolean boolean69 = equipmentForStatePattern59.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AVAILABLE" + "'", str3, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DISABLED" + "'", str11, "DISABLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AVAILABLE" + "'", str12, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AVAILABLE" + "'", str42, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "DISABLED" + "'", str64, "DISABLED");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "DISABLED" + "'", str66, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4508");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("MAINTENANCE", (double) 1L, localDateTime2);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4509");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        disabledState0.reserve(equipmentForStatePattern1);
        app.PendingPickupState pendingPickupState3 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = null;
        pendingPickupState3.markMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern9 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState3.enable(equipmentForStatePattern9);
        app.PendingPickupState pendingPickupState11 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern12 = null;
        pendingPickupState11.markMaintenance(equipmentForStatePattern12);
        app.EquipmentForStatePattern equipmentForStatePattern17 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState11.enable(equipmentForStatePattern17);
        pendingPickupState3.enable(equipmentForStatePattern17);
        equipmentForStatePattern17.confirmReservation();
        disabledState0.release(equipmentForStatePattern17);
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "DISABLED", "");
        equipmentForStatePattern25.markMaintenance();
        disabledState0.release(equipmentForStatePattern25);
        app.PendingPickupState pendingPickupState28 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern29 = null;
        pendingPickupState28.markMaintenance(equipmentForStatePattern29);
        app.PendingPickupState pendingPickupState31 = new app.PendingPickupState();
        app.PendingPickupState pendingPickupState32 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern33 = null;
        pendingPickupState32.markMaintenance(equipmentForStatePattern33);
        app.EquipmentForStatePattern equipmentForStatePattern38 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState32.enable(equipmentForStatePattern38);
        app.PendingPickupState pendingPickupState40 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern41 = null;
        pendingPickupState40.markMaintenance(equipmentForStatePattern41);
        app.EquipmentForStatePattern equipmentForStatePattern46 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState40.enable(equipmentForStatePattern46);
        pendingPickupState32.enable(equipmentForStatePattern46);
        app.EquipmentForStatePattern equipmentForStatePattern52 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern52.markMaintenance();
        pendingPickupState32.markMaintenance(equipmentForStatePattern52);
        app.EquipmentForStatePattern equipmentForStatePattern58 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern58.markMaintenance();
        pendingPickupState32.enable(equipmentForStatePattern58);
        pendingPickupState31.finishMaintenance(equipmentForStatePattern58);
        pendingPickupState28.release(equipmentForStatePattern58);
        java.lang.String str63 = pendingPickupState28.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern67 = new app.EquipmentForStatePattern("hi!", "PENDING_PICKUP", "AVAILABLE");
        pendingPickupState28.enable(equipmentForStatePattern67);
        disabledState0.release(equipmentForStatePattern67);
        app.EquipmentForStatePattern equipmentForStatePattern73 = new app.EquipmentForStatePattern("hi!", "", "");
        boolean boolean74 = equipmentForStatePattern73.isAvailable();
        equipmentForStatePattern73.markPendingPickup();
        equipmentForStatePattern73.disable();
        disabledState0.enable(equipmentForStatePattern73);
        app.EquipmentForStatePattern equipmentForStatePattern81 = new app.EquipmentForStatePattern("hi!", "RESERVED", "hi!");
        equipmentForStatePattern81.reserve();
        disabledState0.enable(equipmentForStatePattern81);
        app.PendingPickupState pendingPickupState84 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern85 = null;
        pendingPickupState84.markMaintenance(equipmentForStatePattern85);
        app.EquipmentForStatePattern equipmentForStatePattern90 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState84.enable(equipmentForStatePattern90);
        app.EquipmentForStatePattern equipmentForStatePattern95 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        java.lang.String str96 = equipmentForStatePattern95.getId();
        pendingPickupState84.reserve(equipmentForStatePattern95);
        equipmentForStatePattern95.disable();
        disabledState0.release(equipmentForStatePattern95);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PENDING_PICKUP" + "'", str63, "PENDING_PICKUP");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4510");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("", (double) 0, localDateTime2);
        reservationforStatePattern3.payDeposit();
        reservationforStatePattern3.payDeposit();
        java.lang.String str6 = reservationforStatePattern3.getReservationId();
        reservationforStatePattern3.payDeposit();
        java.lang.String str8 = reservationforStatePattern3.getReservationId();
        double double10 = reservationforStatePattern3.calculateFinalPayment((double) 10.0f);
        app.DepositState depositState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationforStatePattern3.setDepositState(depositState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"app.DepositState.getStateName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4511");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState0.reserve(equipmentForStatePattern4);
        app.AvailableState availableState6 = new app.AvailableState();
        app.PendingPickupState pendingPickupState7 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern8 = null;
        pendingPickupState7.markMaintenance(equipmentForStatePattern8);
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState7.enable(equipmentForStatePattern13);
        app.PendingPickupState pendingPickupState15 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern16 = null;
        pendingPickupState15.markMaintenance(equipmentForStatePattern16);
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState15.enable(equipmentForStatePattern21);
        pendingPickupState7.enable(equipmentForStatePattern21);
        equipmentForStatePattern21.confirmReservation();
        availableState6.markMaintenance(equipmentForStatePattern21);
        app.DisabledState disabledState26 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern27 = null;
        disabledState26.reserve(equipmentForStatePattern27);
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str33 = equipmentForStatePattern32.getDescription();
        java.lang.String str34 = equipmentForStatePattern32.getStateName();
        disabledState26.markMaintenance(equipmentForStatePattern32);
        availableState6.disable(equipmentForStatePattern32);
        pendingPickupState0.reserve(equipmentForStatePattern32);
        app.PendingPickupState pendingPickupState38 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState38.reserve(equipmentForStatePattern42);
        app.DisabledState disabledState44 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern45 = null;
        disabledState44.reserve(equipmentForStatePattern45);
        app.PendingPickupState pendingPickupState47 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern48 = null;
        pendingPickupState47.markMaintenance(equipmentForStatePattern48);
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState47.enable(equipmentForStatePattern53);
        app.PendingPickupState pendingPickupState55 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern56 = null;
        pendingPickupState55.markMaintenance(equipmentForStatePattern56);
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState55.enable(equipmentForStatePattern61);
        pendingPickupState47.enable(equipmentForStatePattern61);
        equipmentForStatePattern61.confirmReservation();
        disabledState44.release(equipmentForStatePattern61);
        equipmentForStatePattern61.markMaintenance();
        pendingPickupState38.disable(equipmentForStatePattern61);
        equipmentForStatePattern61.reserve();
        equipmentForStatePattern61.release();
        pendingPickupState0.markMaintenance(equipmentForStatePattern61);
        app.EquipmentForStatePattern equipmentForStatePattern71 = null;
        pendingPickupState0.finishMaintenance(equipmentForStatePattern71);
        java.lang.String str73 = pendingPickupState0.getStateName();
        java.lang.String str74 = pendingPickupState0.getStateName();
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DISABLED" + "'", str33, "DISABLED");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AVAILABLE" + "'", str34, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PENDING_PICKUP" + "'", str73, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PENDING_PICKUP" + "'", str74, "PENDING_PICKUP");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4512");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("", "DISABLED", "");
        equipmentForStatePattern3.confirmReservation();
        boolean boolean5 = equipmentForStatePattern3.isAvailable();
        java.lang.String str6 = equipmentForStatePattern3.getDescription();
        equipmentForStatePattern3.markMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DISABLED" + "'", str6, "DISABLED");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4513");
        app.AvailableState availableState0 = new app.AvailableState();
        app.PendingPickupState pendingPickupState1 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern2 = null;
        pendingPickupState1.markMaintenance(equipmentForStatePattern2);
        app.EquipmentForStatePattern equipmentForStatePattern7 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState1.enable(equipmentForStatePattern7);
        app.PendingPickupState pendingPickupState9 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern10 = null;
        pendingPickupState9.markMaintenance(equipmentForStatePattern10);
        app.EquipmentForStatePattern equipmentForStatePattern15 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState9.enable(equipmentForStatePattern15);
        pendingPickupState1.enable(equipmentForStatePattern15);
        equipmentForStatePattern15.confirmReservation();
        availableState0.markMaintenance(equipmentForStatePattern15);
        app.DisabledState disabledState20 = new app.DisabledState();
        java.lang.String str21 = disabledState20.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str26 = equipmentForStatePattern25.getDescription();
        disabledState20.reserve(equipmentForStatePattern25);
        app.DisabledState disabledState28 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern29 = null;
        disabledState28.reserve(equipmentForStatePattern29);
        app.EquipmentForStatePattern equipmentForStatePattern34 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str35 = equipmentForStatePattern34.getDescription();
        java.lang.String str36 = equipmentForStatePattern34.getStateName();
        disabledState28.markMaintenance(equipmentForStatePattern34);
        app.DisabledState disabledState38 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern39 = null;
        disabledState38.reserve(equipmentForStatePattern39);
        app.EquipmentForStatePattern equipmentForStatePattern41 = null;
        disabledState38.release(equipmentForStatePattern41);
        app.EquipmentForStatePattern equipmentForStatePattern43 = null;
        disabledState38.markMaintenance(equipmentForStatePattern43);
        app.PendingPickupState pendingPickupState45 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern46 = null;
        pendingPickupState45.markMaintenance(equipmentForStatePattern46);
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState45.enable(equipmentForStatePattern51);
        app.PendingPickupState pendingPickupState53 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern54 = null;
        pendingPickupState53.markMaintenance(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState53.enable(equipmentForStatePattern59);
        pendingPickupState45.enable(equipmentForStatePattern59);
        app.EquipmentForStatePattern equipmentForStatePattern65 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern65.markMaintenance();
        pendingPickupState45.markMaintenance(equipmentForStatePattern65);
        disabledState38.reserve(equipmentForStatePattern65);
        disabledState28.finishMaintenance(equipmentForStatePattern65);
        disabledState20.release(equipmentForStatePattern65);
        availableState0.finishMaintenance(equipmentForStatePattern65);
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("DISABLED", "DISABLED", "PENDING_PICKUP");
        availableState0.markMaintenance(equipmentForStatePattern75);
        equipmentForStatePattern75.finishMaintenance();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DISABLED" + "'", str21, "DISABLED");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DISABLED" + "'", str26, "DISABLED");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DISABLED" + "'", str35, "DISABLED");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AVAILABLE" + "'", str36, "AVAILABLE");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4514");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        pendingPickupState0.markMaintenance(equipmentForStatePattern1);
        app.EquipmentForStatePattern equipmentForStatePattern6 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState0.enable(equipmentForStatePattern6);
        app.PendingPickupState pendingPickupState8 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern9 = null;
        pendingPickupState8.markMaintenance(equipmentForStatePattern9);
        app.EquipmentForStatePattern equipmentForStatePattern14 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState8.enable(equipmentForStatePattern14);
        pendingPickupState0.enable(equipmentForStatePattern14);
        java.lang.String str17 = pendingPickupState0.getStateName();
        app.DisabledState disabledState18 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = null;
        disabledState18.reserve(equipmentForStatePattern19);
        app.EquipmentForStatePattern equipmentForStatePattern21 = null;
        disabledState18.release(equipmentForStatePattern21);
        app.EquipmentForStatePattern equipmentForStatePattern23 = null;
        disabledState18.markMaintenance(equipmentForStatePattern23);
        app.PendingPickupState pendingPickupState25 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern26 = null;
        pendingPickupState25.markMaintenance(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern31 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState25.enable(equipmentForStatePattern31);
        app.PendingPickupState pendingPickupState33 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern34 = null;
        pendingPickupState33.markMaintenance(equipmentForStatePattern34);
        app.EquipmentForStatePattern equipmentForStatePattern39 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState33.enable(equipmentForStatePattern39);
        pendingPickupState25.enable(equipmentForStatePattern39);
        app.EquipmentForStatePattern equipmentForStatePattern45 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern45.markMaintenance();
        pendingPickupState25.markMaintenance(equipmentForStatePattern45);
        disabledState18.reserve(equipmentForStatePattern45);
        equipmentForStatePattern45.release();
        boolean boolean50 = equipmentForStatePattern45.isAvailable();
        pendingPickupState0.release(equipmentForStatePattern45);
        app.AvailableState availableState52 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern53 = null;
        availableState52.release(equipmentForStatePattern53);
        app.EquipmentForStatePattern equipmentForStatePattern58 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        java.lang.String str59 = equipmentForStatePattern58.getId();
        availableState52.enable(equipmentForStatePattern58);
        equipmentForStatePattern58.disable();
        equipmentForStatePattern58.disable();
        pendingPickupState0.reserve(equipmentForStatePattern58);
        boolean boolean64 = equipmentForStatePattern58.isAvailable();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PENDING_PICKUP" + "'", str17, "PENDING_PICKUP");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4515");
        app.PendingPickupState pendingPickupState0 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState0.reserve(equipmentForStatePattern4);
        app.PendingPickupState pendingPickupState6 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern7 = null;
        pendingPickupState6.markMaintenance(equipmentForStatePattern7);
        app.EquipmentForStatePattern equipmentForStatePattern9 = null;
        pendingPickupState6.reserve(equipmentForStatePattern9);
        app.DisabledState disabledState11 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern12 = null;
        disabledState11.reserve(equipmentForStatePattern12);
        app.EquipmentForStatePattern equipmentForStatePattern14 = null;
        disabledState11.release(equipmentForStatePattern14);
        app.EquipmentForStatePattern equipmentForStatePattern16 = null;
        disabledState11.markMaintenance(equipmentForStatePattern16);
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        disabledState11.disable(equipmentForStatePattern21);
        pendingPickupState6.enable(equipmentForStatePattern21);
        equipmentForStatePattern21.markMaintenance();
        pendingPickupState0.disable(equipmentForStatePattern21);
        equipmentForStatePattern21.finishMaintenance();
        equipmentForStatePattern21.reserve();
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4516");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        availableState0.release(equipmentForStatePattern1);
        app.PendingPickupState pendingPickupState3 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = null;
        pendingPickupState3.markMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern6 = null;
        pendingPickupState3.reserve(equipmentForStatePattern6);
        app.DisabledState disabledState8 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern9 = null;
        disabledState8.reserve(equipmentForStatePattern9);
        app.EquipmentForStatePattern equipmentForStatePattern11 = null;
        disabledState8.release(equipmentForStatePattern11);
        app.EquipmentForStatePattern equipmentForStatePattern13 = null;
        disabledState8.markMaintenance(equipmentForStatePattern13);
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        disabledState8.disable(equipmentForStatePattern18);
        pendingPickupState3.enable(equipmentForStatePattern18);
        availableState0.enable(equipmentForStatePattern18);
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern25.release();
        equipmentForStatePattern25.release();
        availableState0.reserve(equipmentForStatePattern25);
        java.lang.Class<?> wildcardClass29 = availableState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4517");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        disabledState0.reserve(equipmentForStatePattern1);
        app.PendingPickupState pendingPickupState3 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = null;
        pendingPickupState3.markMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern9 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState3.enable(equipmentForStatePattern9);
        app.PendingPickupState pendingPickupState11 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern12 = null;
        pendingPickupState11.markMaintenance(equipmentForStatePattern12);
        app.EquipmentForStatePattern equipmentForStatePattern17 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState11.enable(equipmentForStatePattern17);
        pendingPickupState3.enable(equipmentForStatePattern17);
        equipmentForStatePattern17.confirmReservation();
        disabledState0.release(equipmentForStatePattern17);
        app.DisabledState disabledState22 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern23 = null;
        disabledState22.reserve(equipmentForStatePattern23);
        app.PendingPickupState pendingPickupState25 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern26 = null;
        pendingPickupState25.markMaintenance(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern31 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState25.enable(equipmentForStatePattern31);
        app.PendingPickupState pendingPickupState33 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern34 = null;
        pendingPickupState33.markMaintenance(equipmentForStatePattern34);
        app.EquipmentForStatePattern equipmentForStatePattern39 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState33.enable(equipmentForStatePattern39);
        pendingPickupState25.enable(equipmentForStatePattern39);
        equipmentForStatePattern39.confirmReservation();
        disabledState22.release(equipmentForStatePattern39);
        disabledState0.enable(equipmentForStatePattern39);
        java.lang.String str45 = disabledState0.getStateName();
        app.AvailableState availableState46 = new app.AvailableState();
        app.DisabledState disabledState47 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern48 = null;
        disabledState47.reserve(equipmentForStatePattern48);
        app.EquipmentForStatePattern equipmentForStatePattern50 = null;
        disabledState47.release(equipmentForStatePattern50);
        app.EquipmentForStatePattern equipmentForStatePattern52 = null;
        disabledState47.markMaintenance(equipmentForStatePattern52);
        app.PendingPickupState pendingPickupState54 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern55 = null;
        pendingPickupState54.markMaintenance(equipmentForStatePattern55);
        app.EquipmentForStatePattern equipmentForStatePattern60 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState54.enable(equipmentForStatePattern60);
        app.PendingPickupState pendingPickupState62 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern63 = null;
        pendingPickupState62.markMaintenance(equipmentForStatePattern63);
        app.EquipmentForStatePattern equipmentForStatePattern68 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState62.enable(equipmentForStatePattern68);
        pendingPickupState54.enable(equipmentForStatePattern68);
        app.EquipmentForStatePattern equipmentForStatePattern74 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern74.markMaintenance();
        pendingPickupState54.markMaintenance(equipmentForStatePattern74);
        disabledState47.reserve(equipmentForStatePattern74);
        availableState46.reserve(equipmentForStatePattern74);
        java.lang.String str79 = equipmentForStatePattern74.getDescription();
        disabledState0.markMaintenance(equipmentForStatePattern74);
        app.EquipmentForStatePattern equipmentForStatePattern81 = null;
        disabledState0.reserve(equipmentForStatePattern81);
        java.lang.String str83 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern84 = null;
        disabledState0.release(equipmentForStatePattern84);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "DISABLED" + "'", str45, "DISABLED");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "DISABLED" + "'", str79, "DISABLED");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "DISABLED" + "'", str83, "DISABLED");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4518");
        app.DisabledState disabledState0 = new app.DisabledState();
        java.lang.String str1 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str6 = equipmentForStatePattern5.getDescription();
        disabledState0.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern11.disable();
        equipmentForStatePattern11.markMaintenance();
        disabledState0.release(equipmentForStatePattern11);
        java.lang.String str15 = disabledState0.getStateName();
        app.AvailableState availableState16 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern17 = null;
        availableState16.release(equipmentForStatePattern17);
        app.EquipmentForStatePattern equipmentForStatePattern22 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        java.lang.String str23 = equipmentForStatePattern22.getId();
        availableState16.enable(equipmentForStatePattern22);
        app.PendingPickupState pendingPickupState25 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern29 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState25.reserve(equipmentForStatePattern29);
        availableState16.disable(equipmentForStatePattern29);
        disabledState0.markMaintenance(equipmentForStatePattern29);
        java.lang.String str33 = disabledState0.getStateName();
        java.lang.String str34 = disabledState0.getStateName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DISABLED" + "'", str1, "DISABLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DISABLED" + "'", str6, "DISABLED");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DISABLED" + "'", str15, "DISABLED");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DISABLED" + "'", str33, "DISABLED");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "DISABLED" + "'", str34, "DISABLED");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4519");
        app.AvailableState availableState0 = new app.AvailableState();
        app.AvailableState availableState1 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern2 = null;
        availableState1.release(equipmentForStatePattern2);
        app.PendingPickupState pendingPickupState4 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = null;
        pendingPickupState4.markMaintenance(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern7 = null;
        pendingPickupState4.reserve(equipmentForStatePattern7);
        app.DisabledState disabledState9 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern10 = null;
        disabledState9.reserve(equipmentForStatePattern10);
        app.EquipmentForStatePattern equipmentForStatePattern12 = null;
        disabledState9.release(equipmentForStatePattern12);
        app.EquipmentForStatePattern equipmentForStatePattern14 = null;
        disabledState9.markMaintenance(equipmentForStatePattern14);
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        disabledState9.disable(equipmentForStatePattern19);
        pendingPickupState4.enable(equipmentForStatePattern19);
        availableState1.enable(equipmentForStatePattern19);
        app.DisabledState disabledState23 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern24 = null;
        disabledState23.reserve(equipmentForStatePattern24);
        app.EquipmentForStatePattern equipmentForStatePattern29 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str30 = equipmentForStatePattern29.getDescription();
        java.lang.String str31 = equipmentForStatePattern29.getStateName();
        disabledState23.markMaintenance(equipmentForStatePattern29);
        app.DisabledState disabledState33 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern34 = null;
        disabledState33.reserve(equipmentForStatePattern34);
        app.EquipmentForStatePattern equipmentForStatePattern36 = null;
        disabledState33.release(equipmentForStatePattern36);
        app.EquipmentForStatePattern equipmentForStatePattern38 = null;
        disabledState33.markMaintenance(equipmentForStatePattern38);
        app.PendingPickupState pendingPickupState40 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern41 = null;
        pendingPickupState40.markMaintenance(equipmentForStatePattern41);
        app.EquipmentForStatePattern equipmentForStatePattern46 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState40.enable(equipmentForStatePattern46);
        app.PendingPickupState pendingPickupState48 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern49 = null;
        pendingPickupState48.markMaintenance(equipmentForStatePattern49);
        app.EquipmentForStatePattern equipmentForStatePattern54 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState48.enable(equipmentForStatePattern54);
        pendingPickupState40.enable(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern60 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern60.markMaintenance();
        pendingPickupState40.markMaintenance(equipmentForStatePattern60);
        disabledState33.reserve(equipmentForStatePattern60);
        disabledState23.finishMaintenance(equipmentForStatePattern60);
        availableState1.markMaintenance(equipmentForStatePattern60);
        app.EquipmentForStatePattern equipmentForStatePattern69 = new app.EquipmentForStatePattern("hi!", "DISABLED", "hi!");
        availableState1.release(equipmentForStatePattern69);
        availableState0.disable(equipmentForStatePattern69);
        equipmentForStatePattern69.finishMaintenance();
        java.lang.String str73 = equipmentForStatePattern69.getLocation();
        equipmentForStatePattern69.release();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DISABLED" + "'", str30, "DISABLED");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AVAILABLE" + "'", str31, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4520");
        app.AvailableState availableState0 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        availableState0.release(equipmentForStatePattern1);
        app.EquipmentForStatePattern equipmentForStatePattern6 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        java.lang.String str7 = equipmentForStatePattern6.getId();
        availableState0.enable(equipmentForStatePattern6);
        app.PendingPickupState pendingPickupState9 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState9.reserve(equipmentForStatePattern13);
        availableState0.disable(equipmentForStatePattern13);
        app.PendingPickupState pendingPickupState16 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern17 = null;
        pendingPickupState16.markMaintenance(equipmentForStatePattern17);
        app.EquipmentForStatePattern equipmentForStatePattern22 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState16.enable(equipmentForStatePattern22);
        app.PendingPickupState pendingPickupState24 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern25 = null;
        pendingPickupState24.markMaintenance(equipmentForStatePattern25);
        app.EquipmentForStatePattern equipmentForStatePattern30 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState24.enable(equipmentForStatePattern30);
        pendingPickupState16.enable(equipmentForStatePattern30);
        equipmentForStatePattern30.enable();
        availableState0.finishMaintenance(equipmentForStatePattern30);
        app.EquipmentForStatePattern equipmentForStatePattern38 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        equipmentForStatePattern38.markPendingPickup();
        boolean boolean40 = equipmentForStatePattern38.isAvailable();
        availableState0.disable(equipmentForStatePattern38);
        app.AvailableState availableState42 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern43 = null;
        availableState42.release(equipmentForStatePattern43);
        app.EquipmentForStatePattern equipmentForStatePattern48 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        java.lang.String str49 = equipmentForStatePattern48.getId();
        availableState42.enable(equipmentForStatePattern48);
        app.PendingPickupState pendingPickupState51 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern55 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState51.reserve(equipmentForStatePattern55);
        availableState42.disable(equipmentForStatePattern55);
        app.PendingPickupState pendingPickupState58 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern59 = null;
        pendingPickupState58.markMaintenance(equipmentForStatePattern59);
        app.EquipmentForStatePattern equipmentForStatePattern64 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState58.enable(equipmentForStatePattern64);
        app.PendingPickupState pendingPickupState66 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern67 = null;
        pendingPickupState66.markMaintenance(equipmentForStatePattern67);
        app.EquipmentForStatePattern equipmentForStatePattern72 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState66.enable(equipmentForStatePattern72);
        pendingPickupState58.enable(equipmentForStatePattern72);
        equipmentForStatePattern72.disable();
        availableState42.reserve(equipmentForStatePattern72);
        availableState0.finishMaintenance(equipmentForStatePattern72);
        equipmentForStatePattern72.release();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4521");
        app.AvailableState availableState0 = new app.AvailableState();
        app.PendingPickupState pendingPickupState1 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern2 = null;
        pendingPickupState1.markMaintenance(equipmentForStatePattern2);
        app.EquipmentForStatePattern equipmentForStatePattern7 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState1.enable(equipmentForStatePattern7);
        app.PendingPickupState pendingPickupState9 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern10 = null;
        pendingPickupState9.markMaintenance(equipmentForStatePattern10);
        app.EquipmentForStatePattern equipmentForStatePattern15 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState9.enable(equipmentForStatePattern15);
        pendingPickupState1.enable(equipmentForStatePattern15);
        equipmentForStatePattern15.confirmReservation();
        availableState0.markMaintenance(equipmentForStatePattern15);
        app.DisabledState disabledState20 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern21 = null;
        disabledState20.reserve(equipmentForStatePattern21);
        app.EquipmentForStatePattern equipmentForStatePattern26 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str27 = equipmentForStatePattern26.getDescription();
        java.lang.String str28 = equipmentForStatePattern26.getStateName();
        disabledState20.markMaintenance(equipmentForStatePattern26);
        availableState0.disable(equipmentForStatePattern26);
        app.EquipmentForStatePattern equipmentForStatePattern34 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str35 = equipmentForStatePattern34.getDescription();
        equipmentForStatePattern34.confirmReservation();
        equipmentForStatePattern34.release();
        availableState0.finishMaintenance(equipmentForStatePattern34);
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("hi!", "", "");
        boolean boolean43 = equipmentForStatePattern42.isAvailable();
        availableState0.markMaintenance(equipmentForStatePattern42);
        app.PendingPickupState pendingPickupState45 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern46 = null;
        pendingPickupState45.markMaintenance(equipmentForStatePattern46);
        app.EquipmentForStatePattern equipmentForStatePattern48 = null;
        pendingPickupState45.reserve(equipmentForStatePattern48);
        app.DisabledState disabledState50 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern51 = null;
        disabledState50.reserve(equipmentForStatePattern51);
        app.EquipmentForStatePattern equipmentForStatePattern53 = null;
        disabledState50.release(equipmentForStatePattern53);
        app.EquipmentForStatePattern equipmentForStatePattern55 = null;
        disabledState50.markMaintenance(equipmentForStatePattern55);
        app.EquipmentForStatePattern equipmentForStatePattern60 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        disabledState50.disable(equipmentForStatePattern60);
        pendingPickupState45.enable(equipmentForStatePattern60);
        app.EquipmentForStatePattern equipmentForStatePattern66 = new app.EquipmentForStatePattern("hi!", "", "");
        boolean boolean67 = equipmentForStatePattern66.isAvailable();
        java.lang.String str68 = equipmentForStatePattern66.getLocation();
        pendingPickupState45.finishMaintenance(equipmentForStatePattern66);
        app.EquipmentForStatePattern equipmentForStatePattern73 = new app.EquipmentForStatePattern("AVAILABLE", "PENDING_PICKUP", "hi!");
        equipmentForStatePattern73.reserve();
        pendingPickupState45.release(equipmentForStatePattern73);
        java.lang.String str76 = equipmentForStatePattern73.getLocation();
        java.lang.String str77 = equipmentForStatePattern73.getId();
        equipmentForStatePattern73.confirmReservation();
        availableState0.reserve(equipmentForStatePattern73);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DISABLED" + "'", str27, "DISABLED");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AVAILABLE" + "'", str28, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DISABLED" + "'", str35, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "AVAILABLE" + "'", str77, "AVAILABLE");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4522");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("DISABLED", "RESERVED", "hi!");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4523");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.PendingPickupState pendingPickupState1 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern2 = null;
        pendingPickupState1.markMaintenance(equipmentForStatePattern2);
        app.EquipmentForStatePattern equipmentForStatePattern4 = null;
        pendingPickupState1.reserve(equipmentForStatePattern4);
        app.DisabledState disabledState6 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern7 = null;
        disabledState6.reserve(equipmentForStatePattern7);
        app.EquipmentForStatePattern equipmentForStatePattern9 = null;
        disabledState6.release(equipmentForStatePattern9);
        app.EquipmentForStatePattern equipmentForStatePattern11 = null;
        disabledState6.markMaintenance(equipmentForStatePattern11);
        app.PendingPickupState pendingPickupState13 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern14 = null;
        pendingPickupState13.markMaintenance(equipmentForStatePattern14);
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState13.enable(equipmentForStatePattern19);
        app.PendingPickupState pendingPickupState21 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern22 = null;
        pendingPickupState21.markMaintenance(equipmentForStatePattern22);
        app.EquipmentForStatePattern equipmentForStatePattern27 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState21.enable(equipmentForStatePattern27);
        pendingPickupState13.enable(equipmentForStatePattern27);
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern33.markMaintenance();
        pendingPickupState13.markMaintenance(equipmentForStatePattern33);
        disabledState6.reserve(equipmentForStatePattern33);
        app.DisabledState disabledState37 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern38 = null;
        disabledState37.reserve(equipmentForStatePattern38);
        app.EquipmentForStatePattern equipmentForStatePattern40 = null;
        disabledState37.release(equipmentForStatePattern40);
        app.EquipmentForStatePattern equipmentForStatePattern42 = null;
        disabledState37.markMaintenance(equipmentForStatePattern42);
        app.EquipmentForStatePattern equipmentForStatePattern47 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        disabledState37.disable(equipmentForStatePattern47);
        disabledState6.disable(equipmentForStatePattern47);
        pendingPickupState1.release(equipmentForStatePattern47);
        disabledState0.disable(equipmentForStatePattern47);
        equipmentForStatePattern47.reserve();
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4524");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern1 = null;
        disabledState0.reserve(equipmentForStatePattern1);
        app.EquipmentForStatePattern equipmentForStatePattern6 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str7 = equipmentForStatePattern6.getDescription();
        java.lang.String str8 = equipmentForStatePattern6.getStateName();
        disabledState0.markMaintenance(equipmentForStatePattern6);
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        java.lang.String str14 = equipmentForStatePattern13.getDescription();
        java.lang.String str15 = equipmentForStatePattern13.getStateName();
        equipmentForStatePattern13.reserve();
        disabledState0.enable(equipmentForStatePattern13);
        app.AvailableState availableState18 = new app.AvailableState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = null;
        availableState18.release(equipmentForStatePattern19);
        app.PendingPickupState pendingPickupState21 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern22 = null;
        pendingPickupState21.markMaintenance(equipmentForStatePattern22);
        app.EquipmentForStatePattern equipmentForStatePattern24 = null;
        pendingPickupState21.reserve(equipmentForStatePattern24);
        app.DisabledState disabledState26 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern27 = null;
        disabledState26.reserve(equipmentForStatePattern27);
        app.EquipmentForStatePattern equipmentForStatePattern29 = null;
        disabledState26.release(equipmentForStatePattern29);
        app.EquipmentForStatePattern equipmentForStatePattern31 = null;
        disabledState26.markMaintenance(equipmentForStatePattern31);
        app.EquipmentForStatePattern equipmentForStatePattern36 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        disabledState26.disable(equipmentForStatePattern36);
        pendingPickupState21.enable(equipmentForStatePattern36);
        availableState18.enable(equipmentForStatePattern36);
        app.EquipmentForStatePattern equipmentForStatePattern43 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        equipmentForStatePattern43.markPendingPickup();
        availableState18.markMaintenance(equipmentForStatePattern43);
        app.DisabledState disabledState46 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern47 = null;
        disabledState46.reserve(equipmentForStatePattern47);
        app.EquipmentForStatePattern equipmentForStatePattern49 = null;
        disabledState46.release(equipmentForStatePattern49);
        app.EquipmentForStatePattern equipmentForStatePattern51 = null;
        disabledState46.markMaintenance(equipmentForStatePattern51);
        app.PendingPickupState pendingPickupState53 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern54 = null;
        pendingPickupState53.markMaintenance(equipmentForStatePattern54);
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState53.enable(equipmentForStatePattern59);
        app.PendingPickupState pendingPickupState61 = new app.PendingPickupState();
        app.EquipmentForStatePattern equipmentForStatePattern62 = null;
        pendingPickupState61.markMaintenance(equipmentForStatePattern62);
        app.EquipmentForStatePattern equipmentForStatePattern67 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        pendingPickupState61.enable(equipmentForStatePattern67);
        pendingPickupState53.enable(equipmentForStatePattern67);
        app.EquipmentForStatePattern equipmentForStatePattern73 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        equipmentForStatePattern73.markMaintenance();
        pendingPickupState53.markMaintenance(equipmentForStatePattern73);
        disabledState46.reserve(equipmentForStatePattern73);
        availableState18.disable(equipmentForStatePattern73);
        equipmentForStatePattern73.enable();
        disabledState0.finishMaintenance(equipmentForStatePattern73);
        equipmentForStatePattern73.finishMaintenance();
        boolean boolean81 = equipmentForStatePattern73.isAvailable();
        equipmentForStatePattern73.enable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DISABLED" + "'", str7, "DISABLED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVAILABLE" + "'", str8, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DISABLED" + "'", str14, "DISABLED");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AVAILABLE" + "'", str15, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest9.test4525");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("DISABLED", (double) 10, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) 0.0f);
        reservationforStatePattern3.payDeposit();
        java.time.LocalDateTime localDateTime7 = reservationforStatePattern3.getStartTime();
        double double8 = reservationforStatePattern3.getDepositAmount();
        java.time.LocalDateTime localDateTime9 = reservationforStatePattern3.getStartTime();
        double double11 = reservationforStatePattern3.calculateFinalPayment((double) 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }
}

