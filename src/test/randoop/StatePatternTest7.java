package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StatePatternTest7 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3501");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("DISABLED", 32.0d, localDateTime2);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3502");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("PENDING_PICKUP", (double) (short) 0, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) 0.0f);
        java.lang.String str6 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservationforStatePattern3.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservationforStatePattern3.getStartTime();
        double double10 = reservationforStatePattern3.calculateFinalPayment((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PENDING_PICKUP" + "'", str6, "PENDING_PICKUP");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3503");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str12 = equipmentForStatePattern11.getId();
        equipmentForStatePattern11.reserve();
        availableState0.finishMaintenance(equipmentForStatePattern11);
        app.EquipmentForStatePattern equipmentForStatePattern18 = new app.EquipmentForStatePattern("", "", "");
        availableState0.markMaintenance(equipmentForStatePattern18);
        app.DisabledState disabledState20 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern24 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern24.disable();
        equipmentForStatePattern24.markPendingPickup();
        disabledState20.markMaintenance(equipmentForStatePattern24);
        boolean boolean28 = equipmentForStatePattern24.isAvailable();
        equipmentForStatePattern24.markMaintenance();
        availableState0.enable(equipmentForStatePattern24);
        equipmentForStatePattern24.enable();
        equipmentForStatePattern24.confirmReservation();
        java.lang.String str33 = equipmentForStatePattern24.getId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3504");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern4.disable();
        equipmentForStatePattern4.markPendingPickup();
        disabledState0.markMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern11.disable();
        java.lang.String str13 = equipmentForStatePattern11.getDescription();
        java.lang.String str14 = equipmentForStatePattern11.getLocation();
        java.lang.String str15 = equipmentForStatePattern11.getLocation();
        disabledState0.enable(equipmentForStatePattern11);
        app.AvailableState availableState17 = new app.AvailableState();
        app.DisabledState disabledState18 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern22 = new app.EquipmentForStatePattern("", "", "");
        disabledState18.finishMaintenance(equipmentForStatePattern22);
        availableState17.reserve(equipmentForStatePattern22);
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str29 = equipmentForStatePattern28.getId();
        equipmentForStatePattern28.reserve();
        availableState17.finishMaintenance(equipmentForStatePattern28);
        app.EquipmentForStatePattern equipmentForStatePattern35 = new app.EquipmentForStatePattern("", "", "");
        availableState17.markMaintenance(equipmentForStatePattern35);
        app.EquipmentForStatePattern equipmentForStatePattern37 = null;
        availableState17.enable(equipmentForStatePattern37);
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern42.disable();
        java.lang.String str44 = equipmentForStatePattern42.getDescription();
        equipmentForStatePattern42.disable();
        availableState17.finishMaintenance(equipmentForStatePattern42);
        disabledState0.disable(equipmentForStatePattern42);
        app.DisabledState disabledState48 = new app.DisabledState();
        java.lang.String str49 = disabledState48.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str54 = equipmentForStatePattern53.getId();
        equipmentForStatePattern53.enable();
        disabledState48.release(equipmentForStatePattern53);
        app.AvailableState availableState57 = new app.AvailableState();
        app.DisabledState disabledState58 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("", "", "");
        disabledState58.finishMaintenance(equipmentForStatePattern62);
        availableState57.reserve(equipmentForStatePattern62);
        app.EquipmentForStatePattern equipmentForStatePattern68 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str69 = equipmentForStatePattern68.getId();
        equipmentForStatePattern68.reserve();
        availableState57.finishMaintenance(equipmentForStatePattern68);
        app.DisabledState disabledState72 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern76.disable();
        equipmentForStatePattern76.markPendingPickup();
        disabledState72.markMaintenance(equipmentForStatePattern76);
        equipmentForStatePattern76.markPendingPickup();
        availableState57.finishMaintenance(equipmentForStatePattern76);
        app.DisabledState disabledState82 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern86 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern86.disable();
        equipmentForStatePattern86.markPendingPickup();
        disabledState82.markMaintenance(equipmentForStatePattern86);
        availableState57.release(equipmentForStatePattern86);
        disabledState48.markMaintenance(equipmentForStatePattern86);
        equipmentForStatePattern86.markPendingPickup();
        equipmentForStatePattern86.markPendingPickup();
        java.lang.String str94 = equipmentForStatePattern86.getStateName();
        disabledState0.reserve(equipmentForStatePattern86);
        java.lang.String str96 = disabledState0.getStateName();
        java.lang.String str97 = disabledState0.getStateName();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "DISABLED" + "'", str49, "DISABLED");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "PENDING_PICKUP" + "'", str94, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "DISABLED" + "'", str96, "DISABLED");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "DISABLED" + "'", str97, "DISABLED");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3505");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("AVAILABLE", (double) (byte) 100, localDateTime2);
        double double4 = reservationforStatePattern3.getDepositAmount();
        reservationforStatePattern3.payDeposit();
        double double6 = reservationforStatePattern3.getDepositAmount();
        java.lang.String str7 = reservationforStatePattern3.getReservationId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AVAILABLE" + "'", str7, "AVAILABLE");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3506");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        java.lang.String str8 = availableState0.getStateName();
        app.DisabledState disabledState9 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("", "", "");
        disabledState9.finishMaintenance(equipmentForStatePattern13);
        java.lang.String str15 = equipmentForStatePattern13.getId();
        equipmentForStatePattern13.enable();
        equipmentForStatePattern13.confirmReservation();
        availableState0.release(equipmentForStatePattern13);
        app.EquipmentForStatePattern equipmentForStatePattern22 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str23 = equipmentForStatePattern22.getId();
        equipmentForStatePattern22.enable();
        equipmentForStatePattern22.finishMaintenance();
        equipmentForStatePattern22.markMaintenance();
        equipmentForStatePattern22.confirmReservation();
        equipmentForStatePattern22.finishMaintenance();
        equipmentForStatePattern22.finishMaintenance();
        availableState0.enable(equipmentForStatePattern22);
        app.DisabledState disabledState31 = new app.DisabledState();
        java.lang.String str32 = disabledState31.getStateName();
        app.AvailableState availableState33 = new app.AvailableState();
        app.DisabledState disabledState34 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern38 = new app.EquipmentForStatePattern("", "", "");
        disabledState34.finishMaintenance(equipmentForStatePattern38);
        availableState33.reserve(equipmentForStatePattern38);
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str45 = equipmentForStatePattern44.getId();
        equipmentForStatePattern44.reserve();
        availableState33.finishMaintenance(equipmentForStatePattern44);
        app.DisabledState disabledState48 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern52 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern52.disable();
        equipmentForStatePattern52.markPendingPickup();
        disabledState48.markMaintenance(equipmentForStatePattern52);
        equipmentForStatePattern52.markPendingPickup();
        availableState33.finishMaintenance(equipmentForStatePattern52);
        disabledState31.finishMaintenance(equipmentForStatePattern52);
        app.EquipmentForStatePattern equipmentForStatePattern62 = new app.EquipmentForStatePattern("", "MAINTENANCE", "AVAILABLE");
        java.lang.String str63 = equipmentForStatePattern62.getStateName();
        disabledState31.release(equipmentForStatePattern62);
        availableState0.finishMaintenance(equipmentForStatePattern62);
        app.EquipmentForStatePattern equipmentForStatePattern69 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern69.disable();
        java.lang.String str71 = equipmentForStatePattern69.getDescription();
        java.lang.String str72 = equipmentForStatePattern69.getLocation();
        java.lang.String str73 = equipmentForStatePattern69.getId();
        availableState0.markMaintenance(equipmentForStatePattern69);
        java.lang.String str75 = availableState0.getStateName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVAILABLE" + "'", str8, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DISABLED" + "'", str32, "DISABLED");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "AVAILABLE" + "'", str63, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "AVAILABLE" + "'", str75, "AVAILABLE");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3507");
        app.DisabledState disabledState0 = new app.DisabledState();
        java.lang.String str1 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str6 = equipmentForStatePattern5.getId();
        equipmentForStatePattern5.enable();
        disabledState0.release(equipmentForStatePattern5);
        app.AvailableState availableState9 = new app.AvailableState();
        app.DisabledState disabledState10 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern14 = new app.EquipmentForStatePattern("", "", "");
        disabledState10.finishMaintenance(equipmentForStatePattern14);
        availableState9.reserve(equipmentForStatePattern14);
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str21 = equipmentForStatePattern20.getId();
        equipmentForStatePattern20.reserve();
        availableState9.finishMaintenance(equipmentForStatePattern20);
        app.DisabledState disabledState24 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern28.disable();
        equipmentForStatePattern28.markPendingPickup();
        disabledState24.markMaintenance(equipmentForStatePattern28);
        equipmentForStatePattern28.markPendingPickup();
        availableState9.finishMaintenance(equipmentForStatePattern28);
        app.DisabledState disabledState34 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern38 = new app.EquipmentForStatePattern("", "", "");
        disabledState34.reserve(equipmentForStatePattern38);
        app.DisabledState disabledState40 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "", "");
        disabledState40.finishMaintenance(equipmentForStatePattern44);
        disabledState34.enable(equipmentForStatePattern44);
        app.DisabledState disabledState47 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern51.disable();
        java.lang.String str53 = equipmentForStatePattern51.getDescription();
        java.lang.String str54 = equipmentForStatePattern51.getLocation();
        disabledState47.release(equipmentForStatePattern51);
        java.lang.String str56 = equipmentForStatePattern51.getId();
        disabledState34.enable(equipmentForStatePattern51);
        equipmentForStatePattern51.finishMaintenance();
        availableState9.release(equipmentForStatePattern51);
        disabledState0.enable(equipmentForStatePattern51);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DISABLED" + "'", str1, "DISABLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3508");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "", "");
        disabledState0.finishMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern9 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern9.disable();
        java.lang.String str11 = equipmentForStatePattern9.getDescription();
        java.lang.String str12 = equipmentForStatePattern9.getLocation();
        java.lang.String str13 = equipmentForStatePattern9.getLocation();
        equipmentForStatePattern9.disable();
        equipmentForStatePattern9.markMaintenance();
        disabledState0.finishMaintenance(equipmentForStatePattern9);
        app.DisabledState disabledState17 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern21.disable();
        equipmentForStatePattern21.markPendingPickup();
        disabledState17.markMaintenance(equipmentForStatePattern21);
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern28.disable();
        java.lang.String str30 = equipmentForStatePattern28.getDescription();
        java.lang.String str31 = equipmentForStatePattern28.getLocation();
        java.lang.String str32 = equipmentForStatePattern28.getLocation();
        disabledState17.enable(equipmentForStatePattern28);
        app.EquipmentForStatePattern equipmentForStatePattern37 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern37.disable();
        java.lang.String str39 = equipmentForStatePattern37.getDescription();
        java.lang.String str40 = equipmentForStatePattern37.getLocation();
        java.lang.String str41 = equipmentForStatePattern37.getId();
        equipmentForStatePattern37.enable();
        disabledState17.finishMaintenance(equipmentForStatePattern37);
        app.DisabledState disabledState44 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern48 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern48.disable();
        java.lang.String str50 = equipmentForStatePattern48.getDescription();
        disabledState44.reserve(equipmentForStatePattern48);
        app.DisabledState disabledState52 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern56 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern56.disable();
        equipmentForStatePattern56.markPendingPickup();
        disabledState52.markMaintenance(equipmentForStatePattern56);
        app.EquipmentForStatePattern equipmentForStatePattern63 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern63.disable();
        java.lang.String str65 = equipmentForStatePattern63.getDescription();
        java.lang.String str66 = equipmentForStatePattern63.getLocation();
        java.lang.String str67 = equipmentForStatePattern63.getLocation();
        disabledState52.enable(equipmentForStatePattern63);
        disabledState44.reserve(equipmentForStatePattern63);
        disabledState17.markMaintenance(equipmentForStatePattern63);
        disabledState0.enable(equipmentForStatePattern63);
        java.lang.String str72 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str77 = equipmentForStatePattern76.getId();
        equipmentForStatePattern76.enable();
        equipmentForStatePattern76.confirmReservation();
        java.lang.String str80 = equipmentForStatePattern76.getDescription();
        equipmentForStatePattern76.reserve();
        disabledState0.release(equipmentForStatePattern76);
        app.EquipmentForStatePattern equipmentForStatePattern86 = new app.EquipmentForStatePattern("hi!", "PENDING_PICKUP", "hi!");
        disabledState0.release(equipmentForStatePattern86);
        app.EquipmentForStatePattern equipmentForStatePattern91 = new app.EquipmentForStatePattern("", "PENDING_PICKUP", "");
        disabledState0.finishMaintenance(equipmentForStatePattern91);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "DISABLED" + "'", str72, "DISABLED");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3509");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("hi!", (double) (byte) 10, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment((double) 0L);
        java.time.LocalDateTime localDateTime6 = null;
        reservationforStatePattern3.arrive(localDateTime6);
        reservationforStatePattern3.payDeposit();
        java.time.LocalDateTime localDateTime9 = reservationforStatePattern3.getStartTime();
        java.lang.String str10 = reservationforStatePattern3.getReservationId();
        java.lang.String str11 = reservationforStatePattern3.getReservationId();
        java.lang.Class<?> wildcardClass12 = reservationforStatePattern3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3510");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str12 = equipmentForStatePattern11.getId();
        equipmentForStatePattern11.reserve();
        availableState0.finishMaintenance(equipmentForStatePattern11);
        java.lang.String str15 = availableState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "hi!", "hi!");
        availableState0.release(equipmentForStatePattern19);
        app.DisabledState disabledState21 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern25 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern25.disable();
        equipmentForStatePattern25.markPendingPickup();
        disabledState21.markMaintenance(equipmentForStatePattern25);
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern32.disable();
        java.lang.String str34 = equipmentForStatePattern32.getDescription();
        java.lang.String str35 = equipmentForStatePattern32.getLocation();
        java.lang.String str36 = equipmentForStatePattern32.getLocation();
        disabledState21.enable(equipmentForStatePattern32);
        app.EquipmentForStatePattern equipmentForStatePattern41 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str42 = equipmentForStatePattern41.getId();
        equipmentForStatePattern41.enable();
        equipmentForStatePattern41.finishMaintenance();
        equipmentForStatePattern41.markMaintenance();
        disabledState21.disable(equipmentForStatePattern41);
        availableState0.markMaintenance(equipmentForStatePattern41);
        java.lang.String str48 = availableState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern52 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern52.disable();
        equipmentForStatePattern52.reserve();
        availableState0.disable(equipmentForStatePattern52);
        boolean boolean56 = equipmentForStatePattern52.isAvailable();
        equipmentForStatePattern52.disable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AVAILABLE" + "'", str15, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AVAILABLE" + "'", str48, "AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3511");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("", "PENDING_PICKUP", "PENDING_PICKUP");
        equipmentForStatePattern3.reserve();
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3512");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("", (double) '4', localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment(0.0d);
        double double7 = reservationforStatePattern3.calculateFinalPayment(100.0d);
        java.time.LocalDateTime localDateTime8 = null;
        reservationforStatePattern3.arrive(localDateTime8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3513");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("MAINTENANCE", (double) 1L, localDateTime2);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3514");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("RESERVED", 0.0d, localDateTime2);
        double double5 = reservationforStatePattern3.calculateFinalPayment(97.0d);
        double double7 = reservationforStatePattern3.calculateFinalPayment((double) 0.0f);
        double double8 = reservationforStatePattern3.getDepositAmount();
        double double9 = reservationforStatePattern3.getDepositAmount();
        java.lang.String str10 = reservationforStatePattern3.getReservationId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RESERVED" + "'", str10, "RESERVED");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3515");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str12 = equipmentForStatePattern11.getId();
        equipmentForStatePattern11.reserve();
        availableState0.finishMaintenance(equipmentForStatePattern11);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.markPendingPickup();
        disabledState15.markMaintenance(equipmentForStatePattern19);
        equipmentForStatePattern19.markPendingPickup();
        availableState0.finishMaintenance(equipmentForStatePattern19);
        app.DisabledState disabledState25 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern29 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern29.disable();
        equipmentForStatePattern29.markPendingPickup();
        disabledState25.markMaintenance(equipmentForStatePattern29);
        availableState0.release(equipmentForStatePattern29);
        java.lang.String str34 = equipmentForStatePattern29.getStateName();
        java.lang.String str35 = equipmentForStatePattern29.getStateName();
        java.lang.String str36 = equipmentForStatePattern29.getDescription();
        boolean boolean37 = equipmentForStatePattern29.isAvailable();
        equipmentForStatePattern29.release();
        java.lang.String str39 = equipmentForStatePattern29.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PENDING_PICKUP" + "'", str34, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PENDING_PICKUP" + "'", str35, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3516");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("MAINTENANCE", "AVAILABLE", "RESERVED");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3517");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "", "");
        disabledState0.finishMaintenance(equipmentForStatePattern4);
        app.AvailableState availableState6 = new app.AvailableState();
        app.DisabledState disabledState7 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        disabledState7.finishMaintenance(equipmentForStatePattern11);
        availableState6.reserve(equipmentForStatePattern11);
        app.EquipmentForStatePattern equipmentForStatePattern17 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str18 = equipmentForStatePattern17.getId();
        equipmentForStatePattern17.reserve();
        availableState6.finishMaintenance(equipmentForStatePattern17);
        java.lang.String str21 = availableState6.getStateName();
        app.AvailableState availableState22 = new app.AvailableState();
        app.DisabledState disabledState23 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern27 = new app.EquipmentForStatePattern("", "", "");
        disabledState23.finishMaintenance(equipmentForStatePattern27);
        availableState22.reserve(equipmentForStatePattern27);
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str34 = equipmentForStatePattern33.getId();
        equipmentForStatePattern33.reserve();
        availableState22.finishMaintenance(equipmentForStatePattern33);
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("", "", "");
        availableState22.markMaintenance(equipmentForStatePattern40);
        availableState6.enable(equipmentForStatePattern40);
        disabledState0.reserve(equipmentForStatePattern40);
        app.EquipmentForStatePattern equipmentForStatePattern47 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str48 = equipmentForStatePattern47.getId();
        equipmentForStatePattern47.reserve();
        disabledState0.reserve(equipmentForStatePattern47);
        app.DisabledState disabledState51 = new app.DisabledState();
        java.lang.String str52 = disabledState51.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern56 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str57 = equipmentForStatePattern56.getId();
        equipmentForStatePattern56.enable();
        disabledState51.release(equipmentForStatePattern56);
        app.EquipmentForStatePattern equipmentForStatePattern63 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern63.disable();
        java.lang.String str65 = equipmentForStatePattern63.getDescription();
        java.lang.String str66 = equipmentForStatePattern63.getLocation();
        disabledState51.markMaintenance(equipmentForStatePattern63);
        disabledState0.markMaintenance(equipmentForStatePattern63);
        app.EquipmentForStatePattern equipmentForStatePattern72 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern72.disable();
        java.lang.String str74 = equipmentForStatePattern72.getDescription();
        java.lang.String str75 = equipmentForStatePattern72.getLocation();
        java.lang.String str76 = equipmentForStatePattern72.getLocation();
        equipmentForStatePattern72.reserve();
        disabledState0.disable(equipmentForStatePattern72);
        app.DisabledState disabledState79 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern83 = new app.EquipmentForStatePattern("", "", "");
        disabledState79.finishMaintenance(equipmentForStatePattern83);
        java.lang.String str85 = equipmentForStatePattern83.getId();
        disabledState0.reserve(equipmentForStatePattern83);
        java.lang.String str87 = disabledState0.getStateName();
        java.lang.String str88 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern92 = new app.EquipmentForStatePattern("AVAILABLE", "hi!", "DISABLED");
        java.lang.String str93 = equipmentForStatePattern92.getDescription();
        disabledState0.reserve(equipmentForStatePattern92);
        equipmentForStatePattern92.markMaintenance();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AVAILABLE" + "'", str21, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DISABLED" + "'", str52, "DISABLED");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "DISABLED" + "'", str87, "DISABLED");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "DISABLED" + "'", str88, "DISABLED");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3518");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        app.DisabledState disabledState8 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern12.disable();
        equipmentForStatePattern12.markPendingPickup();
        disabledState8.markMaintenance(equipmentForStatePattern12);
        app.DisabledState disabledState16 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern20.disable();
        java.lang.String str22 = equipmentForStatePattern20.getDescription();
        disabledState16.reserve(equipmentForStatePattern20);
        disabledState8.finishMaintenance(equipmentForStatePattern20);
        app.AvailableState availableState25 = new app.AvailableState();
        app.DisabledState disabledState26 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern30 = new app.EquipmentForStatePattern("", "", "");
        disabledState26.finishMaintenance(equipmentForStatePattern30);
        availableState25.reserve(equipmentForStatePattern30);
        disabledState8.finishMaintenance(equipmentForStatePattern30);
        availableState0.finishMaintenance(equipmentForStatePattern30);
        equipmentForStatePattern30.confirmReservation();
        equipmentForStatePattern30.finishMaintenance();
        java.lang.String str37 = equipmentForStatePattern30.getDescription();
        boolean boolean38 = equipmentForStatePattern30.isAvailable();
        equipmentForStatePattern30.enable();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3519");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern11.disable();
        java.lang.String str13 = equipmentForStatePattern11.getDescription();
        java.lang.String str14 = equipmentForStatePattern11.getLocation();
        java.lang.String str15 = equipmentForStatePattern11.getLocation();
        equipmentForStatePattern11.disable();
        availableState0.reserve(equipmentForStatePattern11);
        app.EquipmentForStatePattern equipmentForStatePattern21 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str22 = equipmentForStatePattern21.getId();
        availableState0.finishMaintenance(equipmentForStatePattern21);
        app.DisabledState disabledState24 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern28 = new app.EquipmentForStatePattern("", "", "");
        disabledState24.reserve(equipmentForStatePattern28);
        app.DisabledState disabledState30 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern34 = new app.EquipmentForStatePattern("", "", "");
        disabledState30.finishMaintenance(equipmentForStatePattern34);
        disabledState24.enable(equipmentForStatePattern34);
        java.lang.String str37 = disabledState24.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern41 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str42 = equipmentForStatePattern41.getId();
        equipmentForStatePattern41.enable();
        equipmentForStatePattern41.finishMaintenance();
        equipmentForStatePattern41.markMaintenance();
        disabledState24.disable(equipmentForStatePattern41);
        availableState0.disable(equipmentForStatePattern41);
        app.AvailableState availableState48 = new app.AvailableState();
        app.DisabledState disabledState49 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern53 = new app.EquipmentForStatePattern("", "", "");
        disabledState49.finishMaintenance(equipmentForStatePattern53);
        availableState48.reserve(equipmentForStatePattern53);
        app.EquipmentForStatePattern equipmentForStatePattern59 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern59.disable();
        java.lang.String str61 = equipmentForStatePattern59.getDescription();
        java.lang.String str62 = equipmentForStatePattern59.getLocation();
        java.lang.String str63 = equipmentForStatePattern59.getLocation();
        equipmentForStatePattern59.disable();
        availableState48.reserve(equipmentForStatePattern59);
        java.lang.String str66 = equipmentForStatePattern59.getStateName();
        availableState0.markMaintenance(equipmentForStatePattern59);
        java.lang.String str68 = equipmentForStatePattern59.getId();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DISABLED" + "'", str37, "DISABLED");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "RESERVED" + "'", str66, "RESERVED");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3520");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "", "");
        disabledState0.finishMaintenance(equipmentForStatePattern4);
        app.AvailableState availableState6 = new app.AvailableState();
        app.DisabledState disabledState7 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        disabledState7.finishMaintenance(equipmentForStatePattern11);
        availableState6.reserve(equipmentForStatePattern11);
        app.EquipmentForStatePattern equipmentForStatePattern17 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str18 = equipmentForStatePattern17.getId();
        equipmentForStatePattern17.reserve();
        availableState6.finishMaintenance(equipmentForStatePattern17);
        java.lang.String str21 = availableState6.getStateName();
        app.AvailableState availableState22 = new app.AvailableState();
        app.DisabledState disabledState23 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern27 = new app.EquipmentForStatePattern("", "", "");
        disabledState23.finishMaintenance(equipmentForStatePattern27);
        availableState22.reserve(equipmentForStatePattern27);
        app.EquipmentForStatePattern equipmentForStatePattern33 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str34 = equipmentForStatePattern33.getId();
        equipmentForStatePattern33.reserve();
        availableState22.finishMaintenance(equipmentForStatePattern33);
        app.EquipmentForStatePattern equipmentForStatePattern40 = new app.EquipmentForStatePattern("", "", "");
        availableState22.markMaintenance(equipmentForStatePattern40);
        availableState6.enable(equipmentForStatePattern40);
        disabledState0.reserve(equipmentForStatePattern40);
        app.DisabledState disabledState44 = new app.DisabledState();
        java.lang.String str45 = disabledState44.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern49 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str50 = equipmentForStatePattern49.getId();
        equipmentForStatePattern49.enable();
        disabledState44.release(equipmentForStatePattern49);
        app.EquipmentForStatePattern equipmentForStatePattern56 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern56.disable();
        java.lang.String str58 = equipmentForStatePattern56.getDescription();
        java.lang.String str59 = equipmentForStatePattern56.getLocation();
        disabledState44.markMaintenance(equipmentForStatePattern56);
        app.EquipmentForStatePattern equipmentForStatePattern64 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str65 = equipmentForStatePattern64.getId();
        equipmentForStatePattern64.enable();
        equipmentForStatePattern64.finishMaintenance();
        equipmentForStatePattern64.markMaintenance();
        equipmentForStatePattern64.finishMaintenance();
        equipmentForStatePattern64.confirmReservation();
        disabledState44.reserve(equipmentForStatePattern64);
        disabledState0.reserve(equipmentForStatePattern64);
        app.EquipmentForStatePattern equipmentForStatePattern76 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern76.disable();
        java.lang.String str78 = equipmentForStatePattern76.getDescription();
        equipmentForStatePattern76.markPendingPickup();
        java.lang.String str80 = equipmentForStatePattern76.getStateName();
        equipmentForStatePattern76.reserve();
        disabledState0.disable(equipmentForStatePattern76);
        equipmentForStatePattern76.disable();
        boolean boolean84 = equipmentForStatePattern76.isAvailable();
        java.lang.String str85 = equipmentForStatePattern76.getLocation();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AVAILABLE" + "'", str21, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "DISABLED" + "'", str45, "DISABLED");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PENDING_PICKUP" + "'", str80, "PENDING_PICKUP");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3521");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("AVAILABLE", "", "");
        java.lang.String str4 = equipmentForStatePattern3.getLocation();
        equipmentForStatePattern3.enable();
        equipmentForStatePattern3.reserve();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3522");
        app.EquipmentForStatePattern equipmentForStatePattern3 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern3.disable();
        java.lang.String str5 = equipmentForStatePattern3.getDescription();
        java.lang.String str6 = equipmentForStatePattern3.getLocation();
        java.lang.String str7 = equipmentForStatePattern3.getLocation();
        equipmentForStatePattern3.reserve();
        equipmentForStatePattern3.disable();
        equipmentForStatePattern3.release();
        equipmentForStatePattern3.markPendingPickup();
        java.lang.String str12 = equipmentForStatePattern3.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3523");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern11 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str12 = equipmentForStatePattern11.getId();
        equipmentForStatePattern11.reserve();
        availableState0.finishMaintenance(equipmentForStatePattern11);
        app.DisabledState disabledState15 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern19 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern19.disable();
        equipmentForStatePattern19.markPendingPickup();
        disabledState15.markMaintenance(equipmentForStatePattern19);
        equipmentForStatePattern19.markPendingPickup();
        availableState0.finishMaintenance(equipmentForStatePattern19);
        app.DisabledState disabledState25 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern29 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern29.disable();
        equipmentForStatePattern29.markPendingPickup();
        disabledState25.markMaintenance(equipmentForStatePattern29);
        availableState0.release(equipmentForStatePattern29);
        java.lang.String str34 = availableState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern38 = new app.EquipmentForStatePattern("hi!", "DISABLED", "");
        availableState0.reserve(equipmentForStatePattern38);
        app.DisabledState disabledState40 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern44 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern44.disable();
        equipmentForStatePattern44.markPendingPickup();
        disabledState40.markMaintenance(equipmentForStatePattern44);
        app.EquipmentForStatePattern equipmentForStatePattern51 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern51.disable();
        java.lang.String str53 = equipmentForStatePattern51.getDescription();
        java.lang.String str54 = equipmentForStatePattern51.getLocation();
        java.lang.String str55 = equipmentForStatePattern51.getLocation();
        disabledState40.enable(equipmentForStatePattern51);
        java.lang.String str57 = disabledState40.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern61 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern61.disable();
        java.lang.String str63 = equipmentForStatePattern61.getDescription();
        equipmentForStatePattern61.markPendingPickup();
        java.lang.String str65 = equipmentForStatePattern61.getStateName();
        equipmentForStatePattern61.reserve();
        disabledState40.finishMaintenance(equipmentForStatePattern61);
        equipmentForStatePattern61.release();
        availableState0.markMaintenance(equipmentForStatePattern61);
        app.AvailableState availableState70 = new app.AvailableState();
        app.DisabledState disabledState71 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern75 = new app.EquipmentForStatePattern("", "", "");
        disabledState71.reserve(equipmentForStatePattern75);
        app.DisabledState disabledState77 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern81 = new app.EquipmentForStatePattern("", "", "");
        disabledState77.finishMaintenance(equipmentForStatePattern81);
        disabledState71.enable(equipmentForStatePattern81);
        app.DisabledState disabledState84 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern88 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern88.disable();
        java.lang.String str90 = equipmentForStatePattern88.getDescription();
        java.lang.String str91 = equipmentForStatePattern88.getLocation();
        disabledState84.release(equipmentForStatePattern88);
        java.lang.String str93 = equipmentForStatePattern88.getId();
        disabledState71.enable(equipmentForStatePattern88);
        equipmentForStatePattern88.finishMaintenance();
        availableState70.disable(equipmentForStatePattern88);
        equipmentForStatePattern88.markMaintenance();
        equipmentForStatePattern88.markMaintenance();
        availableState0.release(equipmentForStatePattern88);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AVAILABLE" + "'", str34, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "DISABLED" + "'", str57, "DISABLED");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PENDING_PICKUP" + "'", str65, "PENDING_PICKUP");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3524");
        app.DisabledState disabledState0 = new app.DisabledState();
        java.lang.String str1 = disabledState0.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str6 = equipmentForStatePattern5.getId();
        equipmentForStatePattern5.enable();
        disabledState0.release(equipmentForStatePattern5);
        app.EquipmentForStatePattern equipmentForStatePattern12 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern12.disable();
        java.lang.String str14 = equipmentForStatePattern12.getDescription();
        java.lang.String str15 = equipmentForStatePattern12.getLocation();
        disabledState0.markMaintenance(equipmentForStatePattern12);
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern20.disable();
        java.lang.String str22 = equipmentForStatePattern20.getDescription();
        equipmentForStatePattern20.disable();
        boolean boolean24 = equipmentForStatePattern20.isAvailable();
        disabledState0.release(equipmentForStatePattern20);
        java.lang.String str26 = disabledState0.getStateName();
        app.AvailableState availableState27 = new app.AvailableState();
        app.DisabledState disabledState28 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern32 = new app.EquipmentForStatePattern("", "", "");
        disabledState28.finishMaintenance(equipmentForStatePattern32);
        availableState27.reserve(equipmentForStatePattern32);
        java.lang.String str35 = availableState27.getStateName();
        java.lang.String str36 = availableState27.getStateName();
        java.lang.String str37 = availableState27.getStateName();
        app.DisabledState disabledState38 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern42 = new app.EquipmentForStatePattern("", "", "");
        disabledState38.reserve(equipmentForStatePattern42);
        app.DisabledState disabledState44 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern48 = new app.EquipmentForStatePattern("", "", "");
        disabledState44.finishMaintenance(equipmentForStatePattern48);
        disabledState38.enable(equipmentForStatePattern48);
        app.DisabledState disabledState51 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern55 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern55.disable();
        java.lang.String str57 = equipmentForStatePattern55.getDescription();
        java.lang.String str58 = equipmentForStatePattern55.getLocation();
        disabledState51.release(equipmentForStatePattern55);
        java.lang.String str60 = equipmentForStatePattern55.getId();
        disabledState38.enable(equipmentForStatePattern55);
        equipmentForStatePattern55.finishMaintenance();
        availableState27.reserve(equipmentForStatePattern55);
        equipmentForStatePattern55.finishMaintenance();
        java.lang.String str65 = equipmentForStatePattern55.getLocation();
        disabledState0.disable(equipmentForStatePattern55);
        app.DisabledState disabledState67 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern71 = new app.EquipmentForStatePattern("", "", "");
        disabledState67.finishMaintenance(equipmentForStatePattern71);
        equipmentForStatePattern71.markPendingPickup();
        equipmentForStatePattern71.confirmReservation();
        disabledState0.enable(equipmentForStatePattern71);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DISABLED" + "'", str1, "DISABLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DISABLED" + "'", str26, "DISABLED");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AVAILABLE" + "'", str35, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AVAILABLE" + "'", str36, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AVAILABLE" + "'", str37, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3525");
        app.AvailableState availableState0 = new app.AvailableState();
        app.DisabledState disabledState1 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern5 = new app.EquipmentForStatePattern("", "", "");
        disabledState1.finishMaintenance(equipmentForStatePattern5);
        availableState0.reserve(equipmentForStatePattern5);
        app.DisabledState disabledState8 = new app.DisabledState();
        java.lang.String str9 = disabledState8.getStateName();
        app.EquipmentForStatePattern equipmentForStatePattern13 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str14 = equipmentForStatePattern13.getId();
        equipmentForStatePattern13.enable();
        disabledState8.release(equipmentForStatePattern13);
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern20.disable();
        java.lang.String str22 = equipmentForStatePattern20.getDescription();
        java.lang.String str23 = equipmentForStatePattern20.getLocation();
        disabledState8.markMaintenance(equipmentForStatePattern20);
        availableState0.enable(equipmentForStatePattern20);
        app.EquipmentForStatePattern equipmentForStatePattern29 = new app.EquipmentForStatePattern("DISABLED", "MAINTENANCE", "PENDING_PICKUP");
        availableState0.disable(equipmentForStatePattern29);
        java.lang.String str31 = availableState0.getStateName();
        app.AvailableState availableState32 = new app.AvailableState();
        app.DisabledState disabledState33 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern37 = new app.EquipmentForStatePattern("", "", "");
        disabledState33.finishMaintenance(equipmentForStatePattern37);
        availableState32.reserve(equipmentForStatePattern37);
        app.EquipmentForStatePattern equipmentForStatePattern43 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str44 = equipmentForStatePattern43.getId();
        equipmentForStatePattern43.reserve();
        availableState32.finishMaintenance(equipmentForStatePattern43);
        app.EquipmentForStatePattern equipmentForStatePattern50 = new app.EquipmentForStatePattern("", "", "");
        availableState32.markMaintenance(equipmentForStatePattern50);
        app.EquipmentForStatePattern equipmentForStatePattern52 = null;
        availableState32.enable(equipmentForStatePattern52);
        app.EquipmentForStatePattern equipmentForStatePattern57 = new app.EquipmentForStatePattern("", "", "PENDING_PICKUP");
        availableState32.reserve(equipmentForStatePattern57);
        equipmentForStatePattern57.confirmReservation();
        java.lang.String str60 = equipmentForStatePattern57.getDescription();
        availableState0.release(equipmentForStatePattern57);
        app.EquipmentForStatePattern equipmentForStatePattern62 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipmentForStatePattern62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DISABLED" + "'", str9, "DISABLED");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AVAILABLE" + "'", str31, "AVAILABLE");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3526");
        java.time.LocalDateTime localDateTime2 = null;
        app.ReservationforStatePattern reservationforStatePattern3 = new app.ReservationforStatePattern("PENDING_PICKUP", (double) (short) 1, localDateTime2);
        double double4 = reservationforStatePattern3.getDepositAmount();
        double double5 = reservationforStatePattern3.getDepositAmount();
        java.lang.String str6 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservationforStatePattern3.getStartTime();
        java.lang.String str8 = reservationforStatePattern3.getReservationId();
        java.time.LocalDateTime localDateTime9 = null;
        reservationforStatePattern3.arrive(localDateTime9);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PENDING_PICKUP" + "'", str6, "PENDING_PICKUP");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PENDING_PICKUP" + "'", str8, "PENDING_PICKUP");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StatePatternTest7.test3527");
        app.DisabledState disabledState0 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern4 = new app.EquipmentForStatePattern("", "", "");
        disabledState0.finishMaintenance(equipmentForStatePattern4);
        app.EquipmentForStatePattern equipmentForStatePattern9 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern9.disable();
        java.lang.String str11 = equipmentForStatePattern9.getDescription();
        java.lang.String str12 = equipmentForStatePattern9.getLocation();
        java.lang.String str13 = equipmentForStatePattern9.getLocation();
        equipmentForStatePattern9.disable();
        equipmentForStatePattern9.markMaintenance();
        disabledState0.finishMaintenance(equipmentForStatePattern9);
        app.EquipmentForStatePattern equipmentForStatePattern20 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str21 = equipmentForStatePattern20.getId();
        java.lang.String str22 = equipmentForStatePattern20.getId();
        equipmentForStatePattern20.finishMaintenance();
        java.lang.String str24 = equipmentForStatePattern20.getId();
        disabledState0.reserve(equipmentForStatePattern20);
        app.DisabledState disabledState26 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern30 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern30.disable();
        equipmentForStatePattern30.markPendingPickup();
        disabledState26.markMaintenance(equipmentForStatePattern30);
        app.EquipmentForStatePattern equipmentForStatePattern37 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern37.disable();
        java.lang.String str39 = equipmentForStatePattern37.getDescription();
        java.lang.String str40 = equipmentForStatePattern37.getLocation();
        java.lang.String str41 = equipmentForStatePattern37.getLocation();
        disabledState26.enable(equipmentForStatePattern37);
        app.EquipmentForStatePattern equipmentForStatePattern46 = new app.EquipmentForStatePattern("", "", "");
        equipmentForStatePattern46.disable();
        java.lang.String str48 = equipmentForStatePattern46.getDescription();
        java.lang.String str49 = equipmentForStatePattern46.getLocation();
        java.lang.String str50 = equipmentForStatePattern46.getId();
        equipmentForStatePattern46.enable();
        disabledState26.finishMaintenance(equipmentForStatePattern46);
        app.AvailableState availableState53 = new app.AvailableState();
        app.DisabledState disabledState54 = new app.DisabledState();
        app.EquipmentForStatePattern equipmentForStatePattern58 = new app.EquipmentForStatePattern("", "", "");
        disabledState54.finishMaintenance(equipmentForStatePattern58);
        availableState53.reserve(equipmentForStatePattern58);
        app.EquipmentForStatePattern equipmentForStatePattern64 = new app.EquipmentForStatePattern("", "", "");
        java.lang.String str65 = equipmentForStatePattern64.getId();
        equipmentForStatePattern64.reserve();
        availableState53.finishMaintenance(equipmentForStatePattern64);
        app.EquipmentForStatePattern equipmentForStatePattern71 = new app.EquipmentForStatePattern("", "", "");
        availableState53.markMaintenance(equipmentForStatePattern71);
        app.EquipmentForStatePattern equipmentForStatePattern73 = null;
        availableState53.enable(equipmentForStatePattern73);
        app.EquipmentForStatePattern equipmentForStatePattern78 = new app.EquipmentForStatePattern("", "", "PENDING_PICKUP");
        availableState53.reserve(equipmentForStatePattern78);
        disabledState26.disable(equipmentForStatePattern78);
        equipmentForStatePattern78.reserve();
        java.lang.String str82 = equipmentForStatePattern78.getLocation();
        boolean boolean83 = equipmentForStatePattern78.isAvailable();
        equipmentForStatePattern78.markMaintenance();
        equipmentForStatePattern78.markMaintenance();
        disabledState0.release(equipmentForStatePattern78);
        equipmentForStatePattern78.markMaintenance();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "PENDING_PICKUP" + "'", str82, "PENDING_PICKUP");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }
}

