package src.test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3001");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-341", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-246");
        java.lang.String str4 = equipment3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        java.lang.String str6 = equipment3.getDescription();
        src.java.EquipmentStatus equipmentStatus7 = equipment3.getStatus();
// flaky "1) test3001(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3484" + "'", str4, "EQ-3484");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3002");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1887, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-760", "EQ-1637");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-258", "EQ-863", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus8 = equipment7.getStatus();
        microscope3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3003");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        double double12 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
// flaky "2) test3003(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3004");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3005");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "3) test3005(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3489, Name: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Description: Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-236, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3489, Name: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Description: Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-236, Status: AVAILABLE");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3006");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-41", "EQ-104", "");
        java.lang.String str4 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-41" + "'", str8, "EQ-41");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3007");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-382", "EQ-380");
        src.java.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        headLabCoordinator0.needsapproval = true;
        java.lang.String str20 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "COORD-001" + "'", str20, "COORD-001");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3008");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        double double6 = researcher3.getHourlyRate();
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3009");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.username;
        boolean boolean6 = guest3.isapproved;
        boolean boolean7 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3010");
        src.java.Guest guest3 = new src.java.Guest("EQ-1462", "Equipment ID: EQ-2614, Name: , Description: , Location: , Status: null", "");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3011");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-489";
        boolean boolean13 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-592", "Equipment ID: EQ-2489, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(labManager16);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3012");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-2459", "EQ-1162", "Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getEquipmentId();
// flaky "4) test3012(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3495" + "'", str4, "EQ-3495");
// flaky "1) test3012(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3495" + "'", str5, "EQ-3495");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3013");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1502", "", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3014");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-74", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.isapproved = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3015");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str11 = headLabCoordinator0.username;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3016");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        boolean boolean6 = researcher3.isapproved;
        researcher3.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        researcher3.needsapproval = false;
        java.lang.String str11 = researcher3.password;
        java.lang.String str12 = researcher3.getAccountType();
        java.lang.String str13 = researcher3.getRegistrationId();
        boolean boolean14 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3017");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1116", "Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-3029", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1116");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3018");
        src.java.Student student3 = new src.java.Student("EQ-221", "EQ-253", "EQ-242");
        boolean boolean4 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3019");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3020");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        boolean boolean11 = researcher3.needsapproval;
        researcher3.needsapproval = false;
        java.lang.String str14 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3021");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-3494", "EQ-1665", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3022");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "", "EQ-152");
        faculty3.username = "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        faculty3.needsapproval = true;
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3023");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE", "EQ-1446", "EQ-1808");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3024");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.username;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.username;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        java.lang.String str13 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-489" + "'", str13, "EQ-489");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3025");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-970, Name: , Description: , Location: , Status: null", "EQ-1572", "EQ-1543");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1543" + "'", str4, "EQ-1543");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3026");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getDescription();
        java.lang.String str6 = arduino3.toString();
        java.lang.String str7 = arduino3.getLocation();
// flaky "5) test3026(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3499" + "'", str4, "EQ-3499");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "2) test3026(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3499, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3499, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3027");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-2684", "EQ-257");
        java.lang.String str12 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3028");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = microscope3.getDescription();
        src.java.Arduino arduino11 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.Microscope microscope15 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus16 = null;
        microscope15.setStatus(equipmentStatus16);
        src.java.EquipmentStatus equipmentStatus18 = null;
        microscope15.setStatus(equipmentStatus18);
        java.lang.String str20 = microscope15.getName();
        java.lang.String str21 = microscope15.getName();
        java.lang.String str22 = microscope15.getName();
        src.java.Microscope microscope26 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus27 = null;
        microscope26.setStatus(equipmentStatus27);
        src.java.EquipmentStatus equipmentStatus29 = microscope26.getStatus();
        src.java.Microscope microscope33 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str34 = microscope33.getName();
        java.lang.String str35 = microscope33.getLocation();
        src.java.EquipmentStatus equipmentStatus36 = microscope33.getStatus();
        microscope26.setStatus(equipmentStatus36);
        microscope15.setStatus(equipmentStatus36);
        arduino11.setStatus(equipmentStatus36);
        microscope3.setStatus(equipmentStatus36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(equipmentStatus29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus36 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus36.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3029");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        double double4 = labManager3.getHourlyRate();
        java.lang.String str5 = labManager3.getRegistrationId();
        boolean boolean6 = labManager3.isapproved;
        boolean boolean7 = labManager3.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MANAGER-1023477660" + "'", str5, "MANAGER-1023477660");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3030");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.isapproved = false;
        java.lang.String str9 = faculty3.getRegistrationId();
        java.lang.String str10 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MasterAdmin123!" + "'", str9, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MasterAdmin123!" + "'", str10, "MasterAdmin123!");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3031");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-246", "EQ-1179");
        src.java.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("EQ-2128", "EQ-74");
        java.lang.String str18 = labManager17.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-489" + "'", str1, "EQ-489");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lab Manager" + "'", str18, "Lab Manager");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3032");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.password = "Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE";
        double double12 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3033");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1735, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3034");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        src.java.Arduino arduino12 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope16 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str17 = microscope16.getName();
        java.lang.String str18 = microscope16.getLocation();
        src.java.EquipmentStatus equipmentStatus19 = microscope16.getStatus();
        arduino12.setStatus(equipmentStatus19);
        microscope3.setStatus(equipmentStatus19);
        java.lang.String str22 = microscope3.getLocation();
        java.lang.String str23 = microscope3.toString();
        java.lang.String str24 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky "6) test3034(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equipment ID: EQ-3506, Name: , Description: , Location: , Status: AVAILABLE" + "'", str23, "Equipment ID: EQ-3506, Name: , Description: , Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3035");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3036");
        src.java.Faculty faculty3 = new src.java.Faculty("Head Lab Coordinator", "EQ-92", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3037");
        src.java.Equipment equipment3 = new src.java.Equipment("Guest", "EQ-946", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3038");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-970, Name: , Description: , Location: , Status: null", "EQ-1242", "Equipment ID: EQ-1645, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3039");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-2693, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3040");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        src.java.EquipmentStatus equipmentStatus18 = null;
        microscope3.setStatus(equipmentStatus18);
        java.lang.String str20 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "7) test3040(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-3512" + "'", str10, "EQ-3512");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3041");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1534", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-418626758");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3042");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str5 = labManager4.getRegistrationId();
        java.lang.String str6 = labManager4.password;
        labManager4.isapproved = false;
        labManager4.password = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MANAGER-66180900" + "'", str5, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3043");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1165", "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "");
        boolean boolean4 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3044");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-3484", "Equipment ID: EQ-3095, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-615", "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-3484");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3045");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-3484", "Equipment ID: EQ-1743, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE", "EQ-1218");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3046");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getRegistrationId();
        faculty3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3047");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-466", "Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-461");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3048");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-264", "Equipment ID: EQ-513, Name: , Description: , Location: , Status: null", "EQ-851");
        java.lang.String str4 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-851" + "'", str4, "EQ-851");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3049");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-1113", "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1215, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-2724, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-937, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2990, Name: , Description: , Location: , Status: null", "EQ-2789");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3050");
        src.java.Guest guest3 = new src.java.Guest("EQ-431", "EQ-344", "EQ-149");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        java.lang.String str6 = guest3.getAccountType();
        guest3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-344" + "'", str5, "EQ-344");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3051");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        faculty3.password = "EQ-615";
        faculty3.isapproved = false;
        boolean boolean8 = faculty3.isapproved;
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3052");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        guest3.needsapproval = true;
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3053");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-977");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3054");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("MANAGER-971154394", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1670", "EQ-3494");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: MANAGER-971154394");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3055");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        headLabCoordinator0.username = "";
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-2532");
        java.lang.String str14 = labManager13.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "8) test3055(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lab Manager" + "'", str14, "Lab Manager");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3056");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2175", "", "EQ-1927");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3057");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getEquipmentId();
        java.lang.String str6 = microscope3.toString();
        java.lang.String str7 = microscope3.getLocation();
        java.lang.String str8 = microscope3.toString();
        java.lang.String str9 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
// flaky "9) test3057(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3518" + "'", str5, "EQ-3518");
// flaky "3) test3057(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3518, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3518, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
// flaky "1) test3057(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-3518, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-3518, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3058");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null", "EQ-1832", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3059");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean15 = headLabCoordinator0.isapproved;
        headLabCoordinator0.password = "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        src.java.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("", "MANAGER-1326009150");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager20);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3060");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        boolean boolean10 = headLabCoordinator0.isapproved;
        java.lang.Class<?> wildcardClass11 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
// flaky "10) test3060(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3061");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-98");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "11) test3061(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3521" + "'", str4, "EQ-3521");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3062");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getRegistrationId();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3063");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        src.java.Microscope microscope7 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = null;
        microscope7.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope7.getName();
        java.lang.String str13 = microscope7.getName();
        java.lang.String str14 = microscope7.getName();
        src.java.Microscope microscope18 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus19 = null;
        microscope18.setStatus(equipmentStatus19);
        src.java.EquipmentStatus equipmentStatus21 = microscope18.getStatus();
        src.java.Microscope microscope25 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str26 = microscope25.getName();
        java.lang.String str27 = microscope25.getLocation();
        src.java.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        microscope18.setStatus(equipmentStatus28);
        microscope7.setStatus(equipmentStatus28);
        src.java.EquipmentStatus equipmentStatus31 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus31);
        java.lang.String str33 = arduino3.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipmentStatus21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "12) test3063(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Equipment ID: EQ-3522, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE" + "'", str33, "Equipment ID: EQ-3522, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3064");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null", "EQ-1102", "EQ-2475");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3065");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getRegistrationId();
        boolean boolean5 = faculty3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3066");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.username;
        java.lang.String str5 = guest3.getRegistrationId();
        guest3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3067");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        java.lang.String str13 = headLabCoordinator0.username;
        java.lang.String str14 = headLabCoordinator0.password;
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        double double16 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3068");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-470", "EQ-431", "EQ-253");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3069");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = microscope3.isAvailable(localDateTime10, localDateTime11);
// flaky "13) test3069(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3527, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3527, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "4) test3069(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3527, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3527, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3070");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("", "Researcher");
        headLabCoordinator0.isapproved = false;
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3071");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-427");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("EQ-616", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "EQ-1162", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts33 = userFactory0.createUser("Equipment ID: EQ-3385, Name: , Description: , Location: , Status: null", "EQ-685", "EQ-2945", "EQ-1874");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts33);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3072");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2081, Name: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2821");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3073");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2954", "EQ-2462", "EQ-278");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3074");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1928", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3075");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null", "EQ-98");
        src.java.Microscope microscope7 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str8 = microscope7.getDescription();
        java.lang.String str9 = microscope7.toString();
        src.java.Microscope microscope13 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus14 = null;
        microscope13.setStatus(equipmentStatus14);
        src.java.EquipmentStatus equipmentStatus16 = microscope13.getStatus();
        java.lang.String str17 = microscope13.getLocation();
        java.lang.String str18 = microscope13.getName();
        src.java.Microscope microscope22 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = microscope22.isAvailable(localDateTime23, localDateTime24);
        src.java.EquipmentStatus equipmentStatus26 = microscope22.getStatus();
        microscope13.setStatus(equipmentStatus26);
        microscope7.setStatus(equipmentStatus26);
        equipment3.setStatus(equipmentStatus26);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
// flaky "14) test3075(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3529, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-3529, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3076");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null", "EQ-539");
        student3.isapproved = true;
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3077");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus9 = microscope3.getStatus();
// flaky "15) test3077(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3533" + "'", str8, "EQ-3533");
        org.junit.Assert.assertNull(equipmentStatus9);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3078");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = arduino3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3079");
        src.java.Guest guest3 = new src.java.Guest("", "EQ-603", "Equipment ID: EQ-785, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3080");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        labManager3.password = "EQ-75";
        double double12 = labManager3.getHourlyRate();
        labManager3.isapproved = false;
        boolean boolean15 = labManager3.needsapproval;
        java.lang.String str16 = labManager3.password;
        boolean boolean17 = labManager3.isapproved;
        labManager3.password = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-75" + "'", str16, "EQ-75");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3081");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getEquipmentId();
        src.java.Equipment equipment9 = new src.java.Equipment("EQ-106", "hi!", "EQ-74");
        src.java.EquipmentStatus equipmentStatus10 = equipment9.getStatus();
        equipment3.setStatus(equipmentStatus10);
        src.java.Microscope microscope15 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str16 = microscope15.getName();
        java.lang.String str17 = microscope15.getLocation();
        java.lang.String str18 = microscope15.getName();
        java.lang.String str19 = microscope15.getName();
        src.java.Microscope microscope23 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus24 = null;
        microscope23.setStatus(equipmentStatus24);
        src.java.EquipmentStatus equipmentStatus26 = null;
        microscope23.setStatus(equipmentStatus26);
        java.lang.String str28 = microscope23.getName();
        src.java.Arduino arduino32 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope36 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str37 = microscope36.getName();
        java.lang.String str38 = microscope36.getLocation();
        src.java.EquipmentStatus equipmentStatus39 = microscope36.getStatus();
        arduino32.setStatus(equipmentStatus39);
        microscope23.setStatus(equipmentStatus39);
        microscope15.setStatus(equipmentStatus39);
        src.java.Arduino arduino46 = new src.java.Arduino("", "EQ-36", "EQ-92");
        src.java.Equipment equipment50 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str51 = equipment50.getEquipmentId();
        java.lang.String str52 = equipment50.getName();
        src.java.EquipmentStatus equipmentStatus53 = equipment50.getStatus();
        arduino46.setStatus(equipmentStatus53);
        microscope15.setStatus(equipmentStatus53);
        src.java.Equipment equipment59 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str60 = equipment59.getDescription();
        src.java.EquipmentStatus equipmentStatus61 = equipment59.getStatus();
        microscope15.setStatus(equipmentStatus61);
        equipment3.setStatus(equipmentStatus61);
// flaky "16) test3081(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3535" + "'", str4, "EQ-3535");
// flaky "5) test3081(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3535" + "'", str5, "EQ-3535");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus39 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus39.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "2) test3081(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EQ-3542" + "'", str51, "EQ-3542");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "EQ-94" + "'", str52, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus53 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus53.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "COORD-001" + "'", str60, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus61 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus61.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3082");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope3.setStatus(equipmentStatus8);
        java.lang.String str10 = microscope3.getName();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3083");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-301", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        src.java.Microscope microscope10 = new src.java.Microscope("Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1717, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1036, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus11 = microscope10.getStatus();
        equipment3.setStatus(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3084");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-978", "EQ-623");
        guest3.password = "Student";
        double double6 = guest3.getHourlyRate();
        double double7 = guest3.getHourlyRate();
        guest3.isapproved = false;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3085");
        src.java.Faculty faculty3 = new src.java.Faculty("", "", "EQ-75");
        faculty3.needsapproval = false;
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3086");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        boolean boolean1 = headLabCoordinator0.needsapproval;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3087");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-1113", "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1215, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-2364, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2486, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3088");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        labManager3.password = "EQ-75";
        boolean boolean12 = labManager3.needsapproval;
        labManager3.isapproved = false;
        java.lang.String str15 = labManager3.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MANAGER-103232" + "'", str15, "MANAGER-103232");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3089");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        boolean boolean9 = researcher3.isapproved;
        researcher3.username = "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str12 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3090");
        src.java.Arduino arduino3 = new src.java.Arduino("COORD-001", "Researcher", "COORD-001");
        java.lang.String str4 = arduino3.toString();
// flaky "17) test3090(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3549, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3549, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3091");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getRegistrationId();
        faculty3.username = "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3092");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getRegistrationId();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-41" + "'", str9, "EQ-41");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-41" + "'", str11, "EQ-41");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3093");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        labManager11.password = "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null";
        java.lang.String str14 = labManager11.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "18) test3093(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3094");
        src.java.Guest guest3 = new src.java.Guest("EQ-361", "EQ-461", "EQ-466");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        boolean boolean6 = guest3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3095");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-946", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3096");
        src.java.Student student3 = new src.java.Student("EQ-2024", "EQ-3152", "Equipment ID: EQ-3104, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3097");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.password;
        java.lang.String str9 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3098");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-75", "EQ-114");
        faculty3.needsapproval = false;
        boolean boolean6 = faculty3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3099");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-811", "Guest");
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null", "EQ-1763");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-2499");
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3100");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-862", "EQ-862");
        boolean boolean4 = faculty3.needsapproval;
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3101");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.username;
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3102");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getRegistrationId();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.password = "EQ-1341";
        faculty3.username = "EQ-758";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3103");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = microscope3.getLocation();
        java.lang.String str16 = microscope3.getLocation();
        java.lang.String str17 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "19) test3103(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-3556" + "'", str10, "EQ-3556");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3104");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        guest3.password = "EQ-131";
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3105");
        src.java.Equipment equipment3 = new src.java.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.toString();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime6, localDateTime7);
        src.java.Arduino arduino12 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = arduino12.isAvailable(localDateTime13, localDateTime14);
        java.lang.String str16 = arduino12.getDescription();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = arduino12.isAvailable(localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = arduino12.isAvailable(localDateTime20, localDateTime21);
        src.java.EquipmentStatus equipmentStatus23 = arduino12.getStatus();
        equipment3.setStatus(equipmentStatus23);
        src.java.Arduino arduino28 = new src.java.Arduino("Lab Manager", "EQ-209", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus29 = arduino28.getStatus();
        equipment3.setStatus(equipmentStatus29);
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "20) test3105(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3558, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3558, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MasterAdmin123!" + "'", str16, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus29 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus29.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3106");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = false;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-1784", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
        double double17 = labManager16.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3107");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-382", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "EQ-156");
        double double4 = faculty3.getHourlyRate();
        faculty3.password = "EQ-982";
        java.lang.String str7 = faculty3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-156" + "'", str7, "EQ-156");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3108");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1261", "EQ-1583", "EQ-1911", "Equipment ID: EQ-3003, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1261");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3109");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-3043, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-758", "EQ-2986");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3110");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        java.lang.Class<?> wildcardClass6 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3111");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-615", "EQ-623", "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null");
        faculty3.password = "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3112");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-981", "EQ-221");
        headLabCoordinator0.isapproved = false;
        src.java.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("EQ-1665", "Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3113");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2753, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2905, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3114");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        userAccounts16.isapproved = true;
        boolean boolean19 = userAccounts16.isapproved;
        double double20 = userAccounts16.getHourlyRate();
        userAccounts16.password = "EQ-2684";
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3115");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        double double6 = researcher3.getHourlyRate();
        researcher3.needsapproval = false;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3116");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.password;
        java.lang.String str5 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3117");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-565", "EQ-1900", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3118");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.username;
        boolean boolean6 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-991", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3119");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3120");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-301", "", "EQ-451");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3121");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        java.lang.String str13 = labManager12.getRegistrationId();
        java.lang.String str14 = labManager12.getRegistrationId();
        java.lang.String str15 = labManager12.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MANAGER-1711025779" + "'", str13, "MANAGER-1711025779");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MANAGER-1711025779" + "'", str14, "MANAGER-1711025779");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3122");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-630", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2742, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2195");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-630");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3123");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-284", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3124");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-2475", "EQ-539", "EQ-991");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3125");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-118");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3126");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-508", "Equipment ID: EQ-1121, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3127");
        src.java.Microscope microscope3 = new src.java.Microscope("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getEquipmentId();
        java.lang.String str8 = microscope3.getEquipmentId();
// flaky "21) test3127(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3566" + "'", str4, "EQ-3566");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
// flaky "6) test3127(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-3566" + "'", str7, "EQ-3566");
// flaky "3) test3127(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3566" + "'", str8, "EQ-3566");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3128");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.getRegistrationId();
        faculty3.needsapproval = false;
        faculty3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MasterAdmin123!" + "'", str6, "MasterAdmin123!");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3129");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        java.lang.String str11 = microscope3.getLocation();
        java.lang.String str12 = microscope3.toString();
        java.lang.String str13 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "22) test3129(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-3567, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-3567, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3130");
        src.java.Guest guest3 = new src.java.Guest("Guest", "COORD-001", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        guest3.isapproved = true;
        guest3.needsapproval = true;
        java.lang.String str8 = guest3.password;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3131");
        src.java.Student student3 = new src.java.Student("EQ-2945", "EQ-627", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3132");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3133");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2364, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-3516, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-592");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2364, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3134");
        src.java.Guest guest3 = new src.java.Guest("EQ-778", "", "EQ-760");
        guest3.needsapproval = true;
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3135");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2465, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2914, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3136");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2052", "EQ-2228", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3137");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-99", "EQ-104");
        java.lang.String str4 = researcher3.password;
        java.lang.Class<?> wildcardClass5 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-99" + "'", str4, "EQ-99");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3138");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-2684", "Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-1904");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3139");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-616", "EQ-1543");
        java.lang.String str13 = labManager12.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MANAGER-2051610682" + "'", str13, "MANAGER-2051610682");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3140");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "COORD-001", "EQ-2449");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3141");
        src.java.Guest guest3 = new src.java.Guest("EQ-3198", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-2605");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3142");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2249, Name: Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE, Description: Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Location: Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "", "EQ-1238");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2249, Name: Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE, Description: Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Location: Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3143");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.isapproved = false;
        boolean boolean15 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3144");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-690", "EQ-253", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-253" + "'", str5, "EQ-253");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3145");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        java.lang.String str18 = microscope3.getName();
        java.lang.String str19 = microscope3.getDescription();
        java.lang.String str20 = microscope3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "23) test3145(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-3575" + "'", str10, "EQ-3575");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3146");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-814");
        java.lang.Class<?> wildcardClass4 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3147");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3148");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-209", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.toString();
        java.lang.Class<?> wildcardClass5 = arduino3.getClass();
// flaky "24) test3148(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3576, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3576, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3149");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.password = "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        guest3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3150");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-688", "Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3151");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        java.lang.String str6 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus7);
        org.junit.Assert.assertNull(equipmentStatus8);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3152");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-2381, Name: , Description: , Location: , Status: null", "EQ-2898");
        faculty3.needsapproval = false;
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3153");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-698", "Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-735", "EQ-1618");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-698");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3154");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "EQ-981", "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3155");
        src.java.Student student3 = new src.java.Student("EQ-2519", "EQ-2498", "EQ-2416");
        java.lang.String str4 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2498" + "'", str4, "EQ-2498");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3156");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3001");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3157");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3158");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        src.java.Microscope microscope10 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope10.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = microscope10.getStatus();
        microscope3.setStatus(equipmentStatus14);
        src.java.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus17 = microscope3.getStatus();
        java.lang.String str18 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3159");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.username = "EQ-63";
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3160");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "25) test3160(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3161");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        double double9 = labManager3.getHourlyRate();
        java.lang.String str10 = labManager3.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lab Manager" + "'", str10, "Lab Manager");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3162");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3566");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3163");
        src.java.Student student3 = new src.java.Student("COORD-001", "EQ-74", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = true;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3164");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-179", "Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "EQ-687");
        java.lang.String str4 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-687" + "'", str4, "EQ-687");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3165");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1589", "EQ-3512", "EQ-131");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3166");
        src.java.Guest guest3 = new src.java.Guest("EQ-1021", "EQ-39", "EQ-1468");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3167");
        src.java.Guest guest3 = new src.java.Guest("EQ-275", "Equipment ID: EQ-2652, Name: Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-920, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-513, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-257");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3168");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        double double9 = labManager3.getHourlyRate();
        boolean boolean10 = labManager3.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3169");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-253", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getDescription();
        src.java.Equipment equipment9 = new src.java.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.lang.String str10 = equipment9.getDescription();
        src.java.Microscope microscope14 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str15 = microscope14.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = microscope14.isAvailable(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = microscope14.isAvailable(localDateTime19, localDateTime20);
        src.java.EquipmentStatus equipmentStatus22 = microscope14.getStatus();
        src.java.EquipmentStatus equipmentStatus23 = microscope14.getStatus();
        equipment9.setStatus(equipmentStatus23);
        arduino3.setStatus(equipmentStatus23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = arduino3.isAvailable(localDateTime26, localDateTime27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-253" + "'", str4, "EQ-253");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3170");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1718, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-2599");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3171");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null", "EQ-1310", "Equipment ID: EQ-942, Name: , Description: , Location: , Status: null");
        src.java.Arduino arduino7 = new src.java.Arduino("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-242", "EQ-246");
        src.java.EquipmentStatus equipmentStatus8 = arduino7.getStatus();
        equipment3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3172");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-94", "EQ-99");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getDescription();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = arduino3.isAvailable(localDateTime8, localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-94" + "'", str7, "EQ-94");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3173");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-94", "EQ-99");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getDescription();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-94" + "'", str7, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3174");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        labManager3.needsapproval = false;
        labManager3.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3175");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3176");
        src.java.Student student3 = new src.java.Student("EQ-1174", "EQ-1583", "EQ-3083");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3177");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        java.lang.String str11 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "26) test3177(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3178");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-236", "EQ-602");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3179");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        java.lang.String str4 = student3.username;
        student3.isapproved = true;
        java.lang.String str7 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3180");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getName();
        java.lang.String str6 = microscope3.getLocation();
        src.java.Equipment equipment10 = new src.java.Equipment("EQ-98", "EQ-120", "EQ-106");
        java.lang.String str11 = equipment10.getDescription();
        src.java.EquipmentStatus equipmentStatus12 = equipment10.getStatus();
        microscope3.setStatus(equipmentStatus12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-120" + "'", str11, "EQ-120");
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3181");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        double double9 = labManager3.getHourlyRate();
        double double10 = labManager3.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3182");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-637", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-507");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3183");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.lang.String str12 = microscope3.getName();
        java.lang.String str13 = microscope3.toString();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = microscope3.isAvailable(localDateTime14, localDateTime15);
        java.lang.String str17 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope3.isAvailable(localDateTime18, localDateTime19);
        java.lang.String str21 = microscope3.getName();
        java.lang.String str22 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = microscope3.isAvailable(localDateTime23, localDateTime24);
        src.java.EquipmentStatus equipmentStatus26 = microscope3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "27) test3183(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3613, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3613, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "7) test3183(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-3613, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-3613, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(equipmentStatus26);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3184");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        headLabCoordinator0.username = "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3185");
        src.java.Student student3 = new src.java.Student("", "EQ-361", "Equipment ID: EQ-829, Name: , Description: , Location: , Status: null");
        student3.username = "EQ-387";
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3186");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3187");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-1121, Name: , Description: , Location: , Status: null", "EQ-2020", "Guest");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3188");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-590", "EQ-684", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str8 = equipment7.getName();
        src.java.EquipmentStatus equipmentStatus9 = equipment7.getStatus();
        microscope3.setStatus(equipmentStatus9);
        src.java.Equipment equipment14 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str15 = equipment14.getLocation();
        java.lang.String str16 = equipment14.getName();
        src.java.EquipmentStatus equipmentStatus17 = equipment14.getStatus();
        microscope3.setStatus(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-71" + "'", str8, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str15, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str16, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3189");
        src.java.Student student3 = new src.java.Student("EQ-222", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        boolean boolean4 = student3.needsapproval;
        java.lang.String str5 = student3.username;
        java.lang.String str6 = student3.getRegistrationId();
        student3.username = "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-222" + "'", str5, "EQ-222");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3190");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        double double5 = student3.getHourlyRate();
        student3.username = "EQ-643";
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3191");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-627", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3192");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-98");
        java.lang.String str4 = guest3.password;
        java.lang.String str5 = guest3.username;
        guest3.needsapproval = true;
        java.lang.String str8 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3193");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-1341", "EQ-1042");
        faculty3.password = "EQ-799";
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3194");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-296", "EQ-367", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3195");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        boolean boolean7 = headLabCoordinator0.needsapproval;
        double double8 = headLabCoordinator0.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3196");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-94", "EQ-99");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getDescription();
        java.lang.String str6 = arduino3.getDescription();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-94" + "'", str4, "EQ-94");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-94" + "'", str6, "EQ-94");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3197");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3198");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getRegistrationId();
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3199");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-368", "EQ-118", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = equipment3.getLocation();
        src.java.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        src.java.Arduino arduino9 = new src.java.Arduino("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus10 = arduino9.getStatus();
        src.java.EquipmentStatus equipmentStatus11 = arduino9.getStatus();
        equipment3.setStatus(equipmentStatus11);
        java.lang.String str13 = equipment3.getName();
        java.lang.String str14 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str4, "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-368" + "'", str13, "EQ-368");
// flaky "28) test3199(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-3628" + "'", str14, "EQ-3628");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3200");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1280", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null", "EQ-209");
        faculty3.needsapproval = false;
        java.lang.String str6 = faculty3.getRegistrationId();
        java.lang.String str7 = faculty3.getAccountType();
        boolean boolean8 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-209" + "'", str6, "EQ-209");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3201");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "EQ-120", "EQ-264");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        equipment3.setStatus(equipmentStatus10);
        java.lang.String str12 = equipment3.toString();
        java.lang.String str13 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "29) test3201(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-3633, Name: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Description: EQ-120, Location: EQ-264, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-3633, Name: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Description: EQ-120, Location: EQ-264, Status: AVAILABLE");
// flaky "8) test3201(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-3633" + "'", str13, "EQ-3633");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3202");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-835", "EQ-278", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.Microscope microscope7 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str8 = microscope7.getLocation();
        src.java.Microscope microscope12 = new src.java.Microscope("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "EQ-39", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus13 = microscope12.getStatus();
        microscope7.setStatus(equipmentStatus13);
        arduino3.setStatus(equipmentStatus13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3203");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        boolean boolean6 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3204");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-259", "EQ-628", "EQ-386");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-259" + "'", str4, "EQ-259");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3205");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        guest3.password = "EQ-131";
        double double9 = guest3.getHourlyRate();
        double double10 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3206");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-3060, Name: , Description: , Location: , Status: null", "EQ-2821", "EQ-2228");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3207");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-427", "", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3208");
        src.java.Guest guest3 = new src.java.Guest("Guest", "COORD-001", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        guest3.isapproved = true;
        guest3.needsapproval = true;
        guest3.username = "Equipment ID: EQ-2546, Name: EQ-92, Description: EQ-1476, Location: Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3209");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-389", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-74");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-156", "EQ-559", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-826");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-2381, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2438, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3210");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.password = "EQ-120";
        java.lang.String str9 = researcher3.getAccountType();
        boolean boolean10 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3211");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3212");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "", "EQ-152");
        java.lang.String str4 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3213");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-785, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.toString();
// flaky "30) test3213(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3639, Name: Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-785, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3639, Name: Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-785, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3214");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-2212", "Equipment ID: EQ-991, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3215");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1493", "EQ-2594");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3216");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.toString();
        java.lang.String str12 = microscope3.getEquipmentId();
        src.java.Arduino arduino16 = new src.java.Arduino("", "EQ-36", "EQ-92");
        java.lang.String str17 = arduino16.toString();
        java.lang.String str18 = arduino16.getEquipmentId();
        src.java.Microscope microscope22 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str23 = microscope22.getDescription();
        java.lang.String str24 = microscope22.getLocation();
        src.java.Equipment equipment28 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        src.java.Equipment equipment32 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino36 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope40 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str41 = microscope40.getName();
        java.lang.String str42 = microscope40.getLocation();
        src.java.EquipmentStatus equipmentStatus43 = microscope40.getStatus();
        arduino36.setStatus(equipmentStatus43);
        equipment32.setStatus(equipmentStatus43);
        equipment28.setStatus(equipmentStatus43);
        microscope22.setStatus(equipmentStatus43);
        arduino16.setStatus(equipmentStatus43);
        microscope3.setStatus(equipmentStatus43);
// flaky "31) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "9) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "4) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str9, "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "1) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "1) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str11, "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "1) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-3641" + "'", str12, "EQ-3641");
// flaky "1) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-3642, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE" + "'", str17, "Equipment ID: EQ-3642, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
// flaky "1) test3216(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-3642" + "'", str18, "EQ-3642");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "COORD-001" + "'", str23, "COORD-001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str24, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus43 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus43.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3217");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1762", "Equipment ID: EQ-1306, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1699, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3218");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2905, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str14 = labManager13.password;
        labManager13.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null" + "'", str14, "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3219");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        java.lang.String str8 = headLabCoordinator0.password;
        headLabCoordinator0.username = "Equipment ID: EQ-944, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str14 = labManager13.username;
        java.lang.String str15 = labManager13.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MANAGER-0" + "'", str14, "MANAGER-0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null" + "'", str15, "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3220");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Researcher";
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        java.lang.String str13 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Equipment ID: EQ-944, Name: , Description: , Location: , Status: null" + "'", str2, "Equipment ID: EQ-944, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3221");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1176", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3222");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.toString();
        java.lang.String str7 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
// flaky "32) test3222(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3651, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3651, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
// flaky "10) test3222(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3651, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-3651, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3223");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.password;
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3224");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-2670, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.toString();
// flaky "33) test3224(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3652, Name: Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-2670, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3652, Name: Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-2670, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3225");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-299", "EQ-344");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3226");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1243", "EQ-528", "EQ-1891");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3227");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "", "EQ-547");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "34) test3227(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3654" + "'", str4, "EQ-3654");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3228");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.username;
        researcher3.password = "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3229");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("", "EQ-684", "Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-932");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-2592, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1390, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3230");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        labManager13.username = "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE";
        boolean boolean16 = labManager13.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3231");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Student", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3232");
        src.java.Guest guest3 = new src.java.Guest("EQ-3600", "EQ-2519", "EQ-552");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3233");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-152", "EQ-149");
        double double4 = researcher3.getHourlyRate();
        researcher3.isapproved = false;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3234");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        labManager11.password = "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null";
        java.lang.Class<?> wildcardClass14 = labManager11.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "35) test3234(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3235");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-1437", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3095, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3236");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        double double12 = labManager11.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3237");
        src.java.Student student3 = new src.java.Student("EQ-3542", "Equipment ID: EQ-3416, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3238");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-937, Name: , Description: , Location: , Status: null", "EQ-1763", "EQ-1113");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3239");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1736", "EQ-3575", "EQ-637", "EQ-2501");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1736");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3240");
        src.java.Guest guest3 = new src.java.Guest("EQ-3232", "EQ-2898", "EQ-859");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3241");
        src.java.Guest guest3 = new src.java.Guest("EQ-392", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-392" + "'", str5, "EQ-392");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3242");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.needsapproval;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        student3.username = "Equipment ID: EQ-1526, Name: , Description: , Location: , Status: null";
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3243");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getDescription();
        src.java.Microscope microscope9 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus10 = null;
        microscope9.setStatus(equipmentStatus10);
        src.java.EquipmentStatus equipmentStatus12 = microscope9.getStatus();
        java.lang.String str13 = microscope9.getLocation();
        src.java.Microscope microscope17 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str18 = microscope17.getDescription();
        java.lang.String str19 = microscope17.getLocation();
        java.lang.String str20 = microscope17.getName();
        src.java.Microscope microscope24 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = microscope24.isAvailable(localDateTime25, localDateTime26);
        src.java.EquipmentStatus equipmentStatus28 = microscope24.getStatus();
        microscope17.setStatus(equipmentStatus28);
        microscope9.setStatus(equipmentStatus28);
        arduino3.setStatus(equipmentStatus28);
// flaky "36) test3243(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3664" + "'", str4, "EQ-3664");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(equipmentStatus12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "COORD-001" + "'", str18, "COORD-001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str19, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3244");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2708", "");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3245");
        src.java.Student student3 = new src.java.Student("EQ-3072", "EQ-3654", "Equipment ID: EQ-2364, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3246");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = equipment3.isAvailable(localDateTime8, localDateTime9);
        src.java.Microscope microscope14 = new src.java.Microscope("EQ-489", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str15 = microscope14.getName();
        java.lang.String str16 = microscope14.getName();
        src.java.Arduino arduino20 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = arduino20.isAvailable(localDateTime21, localDateTime22);
        src.java.EquipmentStatus equipmentStatus24 = arduino20.getStatus();
        microscope14.setStatus(equipmentStatus24);
        equipment3.setStatus(equipmentStatus24);
// flaky "37) test3246(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3671" + "'", str4, "EQ-3671");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-489" + "'", str15, "EQ-489");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-489" + "'", str16, "EQ-489");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3247");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-1624", "EQ-1007");
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3248");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-98", "EQ-120", "EQ-106");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        src.java.Microscope microscope8 = new src.java.Microscope("EQ-71", "EQ-222", "EQ-179");
        src.java.Arduino arduino12 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.Microscope microscope16 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str17 = microscope16.getName();
        java.lang.String str18 = microscope16.getLocation();
        src.java.EquipmentStatus equipmentStatus19 = microscope16.getStatus();
        arduino12.setStatus(equipmentStatus19);
        microscope8.setStatus(equipmentStatus19);
        equipment3.setStatus(equipmentStatus19);
        java.lang.String str23 = equipment3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EQ-98" + "'", str23, "EQ-98");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3249");
        src.java.Guest guest3 = new src.java.Guest("EQ-1280", "EQ-1479", "EQ-442");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1280" + "'", str4, "EQ-1280");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3250");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        researcher3.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        boolean boolean11 = researcher3.needsapproval;
        java.lang.String str12 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3251");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.password = "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getRegistrationId();
        java.lang.Class<?> wildcardClass8 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3252");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        student3.password = "EQ-2623";
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3253");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1876", "EQ-1476", "EQ-799");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3254");
        src.java.Student student3 = new src.java.Student("EQ-566", "EQ-371", "EQ-760");
        boolean boolean4 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3255");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2595, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "EQ-627");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3256");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-2090", "EQ-446", "MANAGER-66181089");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("EQ-1430", "Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-2499, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3257");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-3495", "EQ-684", "EQ-992");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3258");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = microscope3.getName();
        src.java.EquipmentStatus equipmentStatus9 = microscope3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3259");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-558", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-41");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3260");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3261");
        src.java.Arduino arduino3 = new src.java.Arduino("COORD-001", "Researcher", "COORD-001");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getName();
        java.lang.String str8 = arduino3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
// flaky "38) test3261(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-3683, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-3683, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3262");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1501", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1150");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = microscope3.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1150" + "'", str7, "EQ-1150");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3263");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2501", "EQ-851", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3264");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-466");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3265");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2799", "EQ-1392", "EQ-566");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3266");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-106", "hi!", "EQ-74");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3267");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-469", "EQ-981", "EQ-773");
        java.lang.String str4 = equipment3.toString();
// flaky "39) test3267(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3688, Name: EQ-469, Description: EQ-981, Location: EQ-773, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3688, Name: EQ-469, Description: EQ-981, Location: EQ-773, Status: AVAILABLE");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3268");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.username;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3269");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1841", "EQ-2143", "EQ-1000");
        researcher3.password = "EQ-1007";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1000" + "'", str7, "EQ-1000");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3270");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3271");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3272");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3385, Name: , Description: , Location: , Status: null", "EQ-156", "EQ-3035", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3385, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3273");
        src.java.Student student3 = new src.java.Student("EQ-390", "EQ-446", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.username = "EQ-1056";
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3274");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
// flaky "40) test3274(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3690, Name: Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3690, Name: Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3275");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-1962, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3276");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = false;
        java.lang.String str13 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.username = "EQ-2114";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COORD-001" + "'", str13, "COORD-001");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3277");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getLocation();
        java.lang.String str8 = arduino3.getEquipmentId();
        java.lang.String str9 = arduino3.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = arduino3.isAvailable(localDateTime10, localDateTime11);
        java.lang.String str13 = arduino3.getDescription();
        java.lang.String str14 = arduino3.getEquipmentId();
        java.lang.String str15 = arduino3.getEquipmentId();
        java.lang.String str16 = arduino3.getName();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "41) test3277(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3692" + "'", str8, "EQ-3692");
// flaky "11) test3277(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-3692" + "'", str9, "EQ-3692");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
// flaky "5) test3277(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-3692" + "'", str14, "EQ-3692");
// flaky "2) test3277(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-3692" + "'", str15, "EQ-3692");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3278");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-3260", "Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-3119");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3279");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getDescription();
        java.lang.String str6 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
// flaky "42) test3279(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3693, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3693, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3280");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.String str5 = arduino3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "43) test3280(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3694" + "'", str5, "EQ-3694");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3281");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-263", "EQ-259", "");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE", "EQ-2552", "Equipment ID: EQ-2265, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3282");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1501, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-764", "");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3283");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getLocation();
        java.lang.String str8 = arduino3.getEquipmentId();
        java.lang.String str9 = arduino3.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = arduino3.isAvailable(localDateTime10, localDateTime11);
        java.lang.String str13 = arduino3.getDescription();
        java.lang.String str14 = arduino3.getName();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = arduino3.isAvailable(localDateTime15, localDateTime16);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "44) test3283(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3696" + "'", str8, "EQ-3696");
// flaky "12) test3283(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-3696" + "'", str9, "EQ-3696");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3284");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-299", "EQ-275", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1218");
        src.java.UserAccounts userAccounts30 = userFactory0.createUser("Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-299", "Equipment ID: EQ-1671, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-2693, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3285");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-489", "EQ-236", "EQ-451");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-236" + "'", str4, "EQ-236");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-489" + "'", str5, "EQ-489");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3286");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-640");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("EQ-466", "EQ-1163", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-2137", "EQ-1969", "EQ-257");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-2693, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1056", "EQ-2562");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3287");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1570", "EQ-2192", "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3288");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-278", "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3289");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-94", "COORD-001", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("MasterAdmin123!", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-222", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-1062", "EQ-2469", "EQ-971");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3290");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-333", "EQ-2399");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3291");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "MANAGER-103232", "EQ-569");
        boolean boolean4 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3292");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-2473, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-2459", "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE", "Equipment ID: EQ-3003, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3293");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-299", "EQ-275", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1218");
        src.java.UserAccounts userAccounts30 = userFactory0.createUser("EQ-1028", "EQ-734", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-2903");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3294");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1767, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3295");
        src.java.Guest guest3 = new src.java.Guest("EQ-1940", "EQ-598", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3296");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2325", "EQ-1832", "EQ-1454");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3297");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.username = "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3298");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3579", "Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3299");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        labManager5.isapproved = false;
        labManager5.isapproved = false;
        double double12 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3300");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-299", "EQ-344");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.getRegistrationId();
        boolean boolean16 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COORD-001" + "'", str15, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3301");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Guest", "EQ-751");
        student3.isapproved = false;
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3302");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-623", "EQ-114", "EQ-992");
        boolean boolean4 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3303");
        src.java.Guest guest3 = new src.java.Guest("EQ-431", "EQ-344", "EQ-149");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        java.lang.String str6 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-344" + "'", str5, "EQ-344");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-149" + "'", str6, "EQ-149");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3304");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3305");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        src.java.Microscope microscope7 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        src.java.Microscope microscope14 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str15 = microscope14.getName();
        java.lang.String str16 = microscope14.getLocation();
        src.java.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        microscope7.setStatus(equipmentStatus17);
        arduino3.setStatus(equipmentStatus17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = arduino3.isAvailable(localDateTime20, localDateTime21);
        java.lang.String str23 = arduino3.getLocation();
        java.lang.String str24 = arduino3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Head Lab Coordinator" + "'", str23, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3306");
        src.java.Equipment equipment3 = new src.java.Equipment("", "EQ-1446", "Equipment ID: EQ-2265, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3307");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-558", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "45) test3307(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3717" + "'", str4, "EQ-3717");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3308");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2303, Name: , Description: , Location: , Status: null", "EQ-2553", "EQ-688");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3309");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.username = "EQ-63";
        java.lang.String str10 = researcher3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3310");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.username;
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3311");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-114", "Researcher", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-1242", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-1340");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-2904", "EQ-2808", "Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3312");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-507", "EQ-242", "EQ-193");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "46) test3312(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3718" + "'", str4, "EQ-3718");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3313");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-257", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-1876");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3314");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-63", "EQ-335", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        src.java.Arduino arduino7 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus8 = arduino7.getStatus();
        arduino3.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = arduino3.getStatus();
        java.lang.String str11 = arduino3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-63" + "'", str11, "EQ-63");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3315");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-3119", "Equipment ID: EQ-3651, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2585", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-3119");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3316");
        src.java.Student student3 = new src.java.Student("EQ-1238", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3317");
        src.java.Student student3 = new src.java.Student("EQ-2376", "Equipment ID: EQ-937, Name: , Description: , Location: , Status: null", "EQ-2190");
        student3.needsapproval = false;
        student3.password = "EQ-1616";
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3318");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1121, Name: , Description: , Location: , Status: null", "EQ-1192");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3319");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        java.lang.String str12 = guest3.getAccountType();
        boolean boolean13 = guest3.isapproved;
        java.lang.String str14 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3320");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-2601, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-1534", "Equipment ID: EQ-2438, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3321");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-937", "EQ-71");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3322");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-765", "EQ-179", "EQ-1468");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3323");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        java.lang.String str4 = student3.username;
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3324");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-3060, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3325");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = microscope3.getLocation();
        src.java.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        java.lang.String str17 = microscope3.getName();
        java.lang.String str18 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "47) test3325(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-3730" + "'", str10, "EQ-3730");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky "13) test3325(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-3730, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-3730, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3326");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-1794", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1747", "Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3327");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-156", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        faculty3.isapproved = true;
        java.lang.String str6 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3328");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-253");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-284", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-603", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-205", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts41 = userFactory0.createUser("EQ-1434", "EQ-578", "EQ-120", "EQ-862");
        src.java.UserAccounts userAccounts45 = userFactory0.createUser("EQ-3289", "Equipment ID: EQ-684, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-2462");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts41);
        org.junit.Assert.assertNull(userAccounts45);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3329");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-2625, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3664", "Equipment ID: EQ-2073, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3330");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "48) test3330(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "14) test3330(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
// flaky "6) test3330(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3331");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-489", "EQ-3321", "Equipment ID: EQ-1390, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3332");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        headLabCoordinator0.password = "EQ-1229";
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3333");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-2381, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-1918");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3334");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.getName();
        java.lang.String str12 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "49) test3334(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-3746" + "'", str12, "EQ-3746");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3335");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str9 = labManager8.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MANAGER-973294640" + "'", str9, "MANAGER-973294640");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3336");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.username = "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        researcher3.username = "EQ-603";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3337");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-1229" + "'", str1, "EQ-1229");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3338");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.username;
        double double16 = headLabCoordinator0.getHourlyRate();
        java.lang.String str17 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-1229" + "'", str8, "EQ-1229");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3339");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-2167, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3340");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getDescription();
        java.lang.String str13 = arduino3.toString();
        java.lang.String str14 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "50) test3340(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-3748, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-3748, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3341");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("Lab Manager", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-341");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1906");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3342");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-982", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3343");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getLocation();
        java.lang.String str8 = arduino3.getEquipmentId();
        java.lang.String str9 = arduino3.getEquipmentId();
        java.lang.String str10 = arduino3.getDescription();
        java.lang.String str11 = arduino3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "51) test3343(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3750" + "'", str8, "EQ-3750");
// flaky "15) test3343(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-3750" + "'", str9, "EQ-3750");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
// flaky "7) test3343(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-3750, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str11, "Equipment ID: EQ-3750, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3344");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-3731, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-843", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3345");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3346");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        java.lang.String str7 = student3.getRegistrationId();
        student3.password = "EQ-1427";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3347");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.getRegistrationId();
        faculty3.needsapproval = false;
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MasterAdmin123!" + "'", str6, "MasterAdmin123!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3348");
        src.java.Guest guest3 = new src.java.Guest("", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2001");
        guest3.username = "EQ-1102";
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3349");
        src.java.Guest guest3 = new src.java.Guest("EQ-2715", "Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2562");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3350");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "EQ-98");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3351");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-3698, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-507", "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3352");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "EQ-131", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3353");
        src.java.Guest guest3 = new src.java.Guest("EQ-442", "EQ-476", "");
        java.lang.String str4 = guest3.getAccountType();
        guest3.needsapproval = false;
        java.lang.String str7 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-476" + "'", str7, "EQ-476");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3354");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getLocation();
        src.java.Microscope microscope9 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str10 = microscope9.getName();
        src.java.EquipmentStatus equipmentStatus11 = microscope9.getStatus();
        arduino3.setStatus(equipmentStatus11);
        java.lang.String str13 = arduino3.toString();
        java.lang.String str14 = arduino3.toString();
        java.lang.String str15 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-152" + "'", str4, "EQ-152");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "52) test3354(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-3755, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-3755, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
// flaky "16) test3354(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-3755, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str14, "Equipment ID: EQ-3755, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str15, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3355");
        src.java.Microscope microscope3 = new src.java.Microscope("", "EQ-3566", "EQ-3310");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3356");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.getLocation();
        java.lang.String str11 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3357");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.password;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.password;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1229" + "'", str9, "EQ-1229");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-1229" + "'", str11, "EQ-1229");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3358");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-992", "EQ-2915");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3359");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1745, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-1179");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3360");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        src.java.Arduino arduino12 = new src.java.Arduino("", "EQ-36", "EQ-92");
        src.java.EquipmentStatus equipmentStatus13 = arduino12.getStatus();
        microscope3.setStatus(equipmentStatus13);
        src.java.EquipmentStatus equipmentStatus15 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = microscope3.isAvailable(localDateTime16, localDateTime17);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "53) test3360(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3760, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3760, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3361");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = arduino3.getDescription();
        java.lang.Class<?> wildcardClass11 = arduino3.getClass();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3362");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-1341");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3363");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-98", "EQ-120", "EQ-106");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.toString();
        java.lang.String str6 = equipment3.getLocation();
        java.lang.String str7 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "54) test3363(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3763, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3763, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-106" + "'", str6, "EQ-106");
// flaky "17) test3363(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3763, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-3763, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3364");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino7 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope11 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        arduino7.setStatus(equipmentStatus14);
        equipment3.setStatus(equipmentStatus14);
        java.lang.String str17 = equipment3.getEquipmentId();
        java.lang.String str18 = equipment3.getName();
        java.lang.String str19 = equipment3.toString();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = equipment3.isAvailable(localDateTime20, localDateTime21);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "55) test3364(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EQ-3764" + "'", str17, "EQ-3764");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
// flaky "18) test3364(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-3764, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE" + "'", str19, "Equipment ID: EQ-3764, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3365");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-2607, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1979, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3366");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        headLabCoordinator0.password = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-1229" + "'", str1, "EQ-1229");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3367");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236", "MANAGER-66180900");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3368");
        src.java.Guest guest3 = new src.java.Guest("EQ-1340", "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.password;
        java.lang.String str5 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3369");
        src.java.Student student3 = new src.java.Student("EQ-1476", "EQ-446", "EQ-981");
        java.lang.String str4 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-981" + "'", str4, "EQ-981");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3370");
        src.java.Faculty faculty3 = new src.java.Faculty("", "", "EQ-75");
        faculty3.isapproved = true;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3371");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        guest3.needsapproval = true;
        boolean boolean6 = guest3.needsapproval;
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3372");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-242", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.toString();
        java.lang.String str5 = equipment3.getLocation();
// flaky "56) test3372(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3772, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3772, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3373");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3374");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        java.lang.String str18 = microscope3.getName();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = microscope3.isAvailable(localDateTime19, localDateTime20);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "57) test3374(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-3775" + "'", str10, "EQ-3775");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3375");
        src.java.Guest guest3 = new src.java.Guest("EQ-452", "EQ-386", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3376");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-547", "Researcher", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getDescription();
        java.lang.String str10 = microscope7.getLocation();
        java.lang.String str11 = microscope7.getEquipmentId();
        java.lang.String str12 = microscope7.toString();
        src.java.Microscope microscope16 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str17 = microscope16.getName();
        java.lang.String str18 = microscope16.getName();
        java.lang.String str19 = microscope16.getLocation();
        java.lang.String str20 = microscope16.getLocation();
        src.java.EquipmentStatus equipmentStatus21 = microscope16.getStatus();
        microscope7.setStatus(equipmentStatus21);
        equipment3.setStatus(equipmentStatus21);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "58) test3376(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-3777" + "'", str11, "EQ-3777");
// flaky "19) test3376(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-3777, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-3777, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3377");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "EQ-535";
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.password = "EQ-1163";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3378");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.toString();
        java.lang.String str7 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "59) test3378(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3779, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3779, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3379");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-335", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "Student");
        faculty3.username = "EQ-778";
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3380");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-586", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-1557", "EQ-3642");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3381");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-3735, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2566, Name: Equipment ID: EQ-232, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3382");
        src.java.Guest guest3 = new src.java.Guest("EQ-281", "EQ-3518", "EQ-2708");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3383");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1739", "EQ-2423", "EQ-341");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3384");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        src.java.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        src.java.EquipmentStatus equipmentStatus18 = microscope3.getStatus();
        java.lang.String str19 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "60) test3384(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(equipmentStatus18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3385");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.toString();
        java.lang.String str12 = microscope3.toString();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope3.isAvailable(localDateTime13, localDateTime14);
        java.lang.String str16 = microscope3.getEquipmentId();
// flaky "61) test3385(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "20) test3385(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "8) test3385(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str9, "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "3) test3385(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "2) test3385(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str11, "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "2) test3385(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str12, "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "2) test3385(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-3783" + "'", str16, "EQ-3783");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3386");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-3149", "EQ-3097", "Equipment ID: EQ-713, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3387");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-3201", "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3388");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3389");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-259", "EQ-514", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-684", "EQ-489");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-2533, Name: , Description: , Location: , Status: null", "EQ-2562", "EQ-535", "Equipment ID: EQ-2497, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("", "Equipment ID: EQ-992, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1113");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "EQ-1446", "EQ-791", "EQ-281");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3390");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str11 = labManager10.getAccountType();
        double double12 = labManager10.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab Manager" + "'", str11, "Lab Manager");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3391");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = labManager9.password;
        boolean boolean11 = labManager9.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3392");
        src.java.Guest guest3 = new src.java.Guest("EQ-851", "EQ-1763", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = guest3.isapproved;
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3393");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.Class<?> wildcardClass4 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3394");
        src.java.Guest guest3 = new src.java.Guest("", "EQ-3145", "EQ-3542");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3395");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        double double8 = researcher3.getHourlyRate();
        researcher3.isapproved = false;
        researcher3.username = "EQ-486";
        java.lang.String str13 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3396");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-3416, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3397");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-3097", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3398");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        faculty3.needsapproval = false;
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3399");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("", "EQ-413");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3400");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-422", "EQ-281", "EQ-1113");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1113" + "'", str4, "EQ-1113");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3401");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null", "EQ-2498", "EQ-1969");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3402");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-427");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("EQ-616", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "EQ-1162", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "EQ-489", "EQ-461");
        src.java.UserAccounts userAccounts37 = userFactory0.createUser("Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Student", "EQ-2423", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts42 = userFactory0.createUser("EQ-820", "EQ-978", "Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts37);
        org.junit.Assert.assertNull(userAccounts42);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3403");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-590", "EQ-684", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        src.java.Microscope microscope7 = new src.java.Microscope("Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236");
        src.java.EquipmentStatus equipmentStatus8 = microscope7.getStatus();
        microscope3.setStatus(equipmentStatus8);
        java.lang.String str10 = microscope3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-590" + "'", str10, "EQ-590");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3404");
        src.java.Student student3 = new src.java.Student("", "Equipment ID: EQ-1699, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE", "EQ-1039");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3405");
        src.java.Student student3 = new src.java.Student("EQ-92", "EQ-578", "EQ-258");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3406");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-2636, Name: Equipment ID: EQ-1965, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE, Description: EQ-1919, Location: Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-284");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3407");
        src.java.Student student3 = new src.java.Student("EQ-3119", "EQ-509", "EQ-2499");
        boolean boolean4 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3408");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-2737", "Equipment ID: EQ-2367, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2383, Name: EQ-547, Description: Researcher, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3409");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-489", "EQ-838", "EQ-814");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3410");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2980", "", "Equipment ID: EQ-3107, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3411");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-1341", "EQ-1042");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3412");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        double double10 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.password = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3413");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        boolean boolean9 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "");
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3414");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.username;
        double double9 = student3.getHourlyRate();
        student3.username = "EQ-3383";
        java.lang.String str12 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MasterAdmin123!" + "'", str12, "MasterAdmin123!");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3415");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-118", "EQ-99");
        headLabCoordinator0.isapproved = true;
        boolean boolean18 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager21 = headLabCoordinator0.autoGenerateLabManager("EQ-3289", "EQ-1082");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(labManager21);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3416");
        src.java.Student student3 = new src.java.Student("EQ-371", "COORD-001", "EQ-435");
        student3.password = "EQ-419";
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3417");
        src.java.Microscope microscope3 = new src.java.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        java.lang.String str10 = microscope7.getName();
        java.lang.String str11 = microscope7.getName();
        src.java.Microscope microscope15 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus16 = null;
        microscope15.setStatus(equipmentStatus16);
        src.java.EquipmentStatus equipmentStatus18 = null;
        microscope15.setStatus(equipmentStatus18);
        java.lang.String str20 = microscope15.getName();
        src.java.Arduino arduino24 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope28 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str29 = microscope28.getName();
        java.lang.String str30 = microscope28.getLocation();
        src.java.EquipmentStatus equipmentStatus31 = microscope28.getStatus();
        arduino24.setStatus(equipmentStatus31);
        microscope15.setStatus(equipmentStatus31);
        microscope7.setStatus(equipmentStatus31);
        microscope3.setStatus(equipmentStatus31);
        java.lang.String str36 = microscope3.getLocation();
        src.java.EquipmentStatus equipmentStatus37 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str36, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3418");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.toString();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = microscope3.isAvailable(localDateTime6, localDateTime7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
// flaky "62) test3418(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3797, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3797, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3419");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-304", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-304" + "'", str4, "EQ-304");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3420");
        src.java.Student student3 = new src.java.Student("EQ-596", "EQ-1045", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3421");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.password = "EQ-2799";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3422");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str14 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3423");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3424");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        double double12 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.isapproved = true;
        java.lang.String str17 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3425");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1280", "EQ-861", "Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3426");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.toString();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass9 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
// flaky "63) test3426(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3804, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3804, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
// flaky "21) test3426(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3804, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-3804, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
// flaky "9) test3426(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3804" + "'", str8, "EQ-3804");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3427");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-63", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "");
        java.lang.String str4 = microscope3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
// flaky "64) test3427(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3806, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3806, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3428");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.username = "EQ-120";
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-3535", "EQ-3696");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3429");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3430");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getDescription();
        java.lang.String str8 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "65) test3430(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3807" + "'", str8, "EQ-3807");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3431");
        src.java.Guest guest3 = new src.java.Guest("EQ-590", "EQ-152", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3432");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1670", "EQ-686", "Equipment ID: EQ-2503, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3433");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3698, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-179", "EQ-422");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-179" + "'", str4, "EQ-179");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3434");
        src.java.Student student3 = new src.java.Student("", "Student", "Student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isapproved;
        java.lang.String str7 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3435");
        src.java.Equipment equipment3 = new src.java.Equipment("", "", "Equipment ID: EQ-2566, Name: Equipment ID: EQ-232, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3436");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-387", "EQ-236");
        boolean boolean4 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3437");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getDescription();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = arduino3.isAvailable(localDateTime6, localDateTime7);
        src.java.Equipment equipment12 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str13 = equipment12.getName();
        src.java.EquipmentStatus equipmentStatus14 = equipment12.getStatus();
        arduino3.setStatus(equipmentStatus14);
        src.java.EquipmentStatus equipmentStatus16 = arduino3.getStatus();
        java.lang.String str17 = arduino3.getLocation();
// flaky "66) test3437(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3816" + "'", str4, "EQ-3816");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-71" + "'", str13, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3438");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = faculty3.username;
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3439");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-3134, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-3633, Name: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Description: EQ-120, Location: EQ-264, Status: AVAILABLE");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3440");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "");
        researcher3.isapproved = true;
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3441");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.needsapproval = false;
        java.lang.String str9 = researcher3.password;
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3442");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-1839", "EQ-1928");
        java.lang.String str10 = headLabCoordinator0.username;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3443");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Student", "EQ-344");
        boolean boolean4 = guest3.needsapproval;
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3444");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-971", "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.String str5 = arduino3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3445");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-104");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-3678", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3446");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2967, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2967, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3447");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-75");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3448");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-791", "EQ-552", "EQ-981");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-643", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "EQ-802");
        src.java.UserAccounts userAccounts41 = userFactory0.createUser("EQ-2670", "EQ-1341", "Equipment ID: EQ-1945, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts41);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3449");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-1543", "EQ-1476");
        java.lang.String str4 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3450");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        guest3.username = "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3451");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null", "EQ-508", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.getLocation();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3452");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        boolean boolean1 = headLabCoordinator0.needsapproval;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-1058", "EQ-1747");
        java.lang.String str8 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3453");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "", "EQ-152");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3454");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-2407, Name: , Description: , Location: , Status: null", "EQ-205", "Equipment ID: EQ-3656, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3455");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1176", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getDescription();
        java.lang.String str6 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "67) test3455(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3829" + "'", str6, "EQ-3829");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3456");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null", "EQ-1528", "Equipment ID: EQ-3797, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3457");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-284", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-114", "EQ-466", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts30 = userFactory0.createUser("EQ-236", "Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null", "EQ-2271");
        src.java.UserAccounts userAccounts35 = userFactory0.createUser("EQ-2473", "EQ-536", "EQ-1780", "Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts30);
        org.junit.Assert.assertNull(userAccounts35);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3458");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3459");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-539", "EQ-131", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        src.java.Equipment equipment11 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino15 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope19 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str20 = microscope19.getName();
        java.lang.String str21 = microscope19.getLocation();
        src.java.EquipmentStatus equipmentStatus22 = microscope19.getStatus();
        arduino15.setStatus(equipmentStatus22);
        equipment11.setStatus(equipmentStatus22);
        equipment7.setStatus(equipmentStatus22);
        microscope3.setStatus(equipmentStatus22);
        src.java.EquipmentStatus equipmentStatus27 = microscope3.getStatus();
        java.lang.String str28 = microscope3.getName();
        src.java.EquipmentStatus equipmentStatus29 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EQ-539" + "'", str28, "EQ-539");
        org.junit.Assert.assertTrue("'" + equipmentStatus29 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus29.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3460");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-1023477660", "EQ-569", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3461");
        src.java.Faculty faculty3 = new src.java.Faculty("MANAGER-214492645", "EQ-1425", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3462");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3463");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-257", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-355");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getName();
        java.lang.String str8 = arduino3.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-257" + "'", str7, "EQ-257");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-257" + "'", str8, "EQ-257");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3464");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getLocation();
        java.lang.String str7 = microscope3.getEquipmentId();
        src.java.Microscope microscope11 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus12 = null;
        microscope11.setStatus(equipmentStatus12);
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        java.lang.String str15 = microscope11.getLocation();
        src.java.Microscope microscope19 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str20 = microscope19.getDescription();
        java.lang.String str21 = microscope19.getLocation();
        java.lang.String str22 = microscope19.getName();
        src.java.Microscope microscope26 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = microscope26.isAvailable(localDateTime27, localDateTime28);
        src.java.EquipmentStatus equipmentStatus30 = microscope26.getStatus();
        microscope19.setStatus(equipmentStatus30);
        microscope11.setStatus(equipmentStatus30);
        microscope3.setStatus(equipmentStatus30);
        java.lang.String str34 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus35 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "68) test3464(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-3839" + "'", str7, "EQ-3839");
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "COORD-001" + "'", str20, "COORD-001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus30 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus30.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "22) test3464(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str34, "Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus35 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus35.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3465");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE", "EQ-834", "EQ-602");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3466");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getRegistrationId();
        java.lang.Class<?> wildcardClass8 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3467");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-2850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3468");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3469");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2293", "Equipment ID: EQ-829, Name: , Description: , Location: , Status: null", "Lab Manager");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3470");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-221", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "69) test3470(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3845" + "'", str4, "EQ-3845");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3471");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-942, Name: , Description: , Location: , Status: null", "EQ-2876", "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.Microscope microscope7 = new src.java.Microscope("EQ-590", "EQ-684", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        src.java.Equipment equipment11 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str12 = equipment11.getName();
        src.java.EquipmentStatus equipmentStatus13 = equipment11.getStatus();
        microscope7.setStatus(equipmentStatus13);
        microscope3.setStatus(equipmentStatus13);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-71" + "'", str12, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3472");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null", "EQ-977", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3473");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-104", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3181, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1028");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3474");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "EQ-742");
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3475");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        boolean boolean12 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("", "EQ-2149");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3476");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        src.java.Microscope microscope18 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str19 = microscope18.getName();
        java.lang.String str20 = microscope18.getLocation();
        src.java.EquipmentStatus equipmentStatus21 = microscope18.getStatus();
        microscope3.setStatus(equipmentStatus21);
        src.java.EquipmentStatus equipmentStatus23 = microscope3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "70) test3476(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-3849" + "'", str10, "EQ-3849");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3477");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getName();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.getLocation();
        java.lang.String str8 = microscope3.getLocation();
        java.lang.String str9 = microscope3.getName();
        src.java.Arduino arduino13 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.Microscope microscope17 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus18 = null;
        microscope17.setStatus(equipmentStatus18);
        src.java.EquipmentStatus equipmentStatus20 = null;
        microscope17.setStatus(equipmentStatus20);
        java.lang.String str22 = microscope17.getName();
        java.lang.String str23 = microscope17.getName();
        java.lang.String str24 = microscope17.getName();
        src.java.Microscope microscope28 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus29 = null;
        microscope28.setStatus(equipmentStatus29);
        src.java.EquipmentStatus equipmentStatus31 = microscope28.getStatus();
        src.java.Microscope microscope35 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str36 = microscope35.getName();
        java.lang.String str37 = microscope35.getLocation();
        src.java.EquipmentStatus equipmentStatus38 = microscope35.getStatus();
        microscope28.setStatus(equipmentStatus38);
        microscope17.setStatus(equipmentStatus38);
        arduino13.setStatus(equipmentStatus38);
        microscope3.setStatus(equipmentStatus38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "71) test3477(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3851" + "'", str6, "EQ-3851");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(equipmentStatus31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3478");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1420, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1420, Name: hi!, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-1420, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3479");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        java.lang.String str7 = student3.getRegistrationId();
        java.lang.String str8 = student3.getAccountType();
        student3.username = "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3480");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-179", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        double double10 = headLabCoordinator0.getHourlyRate();
        java.lang.String str11 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3481");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-1341", "EQ-1042");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3482");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-3845", "EQ-3718", "EQ-2623");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3483");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-473", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1624");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3484");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-382", "EQ-380");
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str19 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "EQ-259";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Head Lab Coordinator" + "'", str19, "Head Lab Coordinator");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3485");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2873", "", "EQ-2423");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3486");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getLocation();
        src.java.Equipment equipment9 = new src.java.Equipment("Guest", "EQ-36", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = equipment9.getDescription();
        src.java.Microscope microscope14 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str15 = microscope14.getName();
        java.lang.String str16 = microscope14.getLocation();
        src.java.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        src.java.Arduino arduino21 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.Microscope microscope25 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str26 = microscope25.toString();
        java.lang.String str27 = microscope25.toString();
        src.java.EquipmentStatus equipmentStatus28 = null;
        microscope25.setStatus(equipmentStatus28);
        java.lang.String str30 = microscope25.getName();
        src.java.Microscope microscope34 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str35 = microscope34.getName();
        src.java.EquipmentStatus equipmentStatus36 = microscope34.getStatus();
        microscope25.setStatus(equipmentStatus36);
        src.java.Microscope microscope41 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str42 = microscope41.getName();
        java.lang.String str43 = microscope41.getLocation();
        java.lang.String str44 = microscope41.getName();
        java.lang.String str45 = microscope41.getName();
        src.java.Microscope microscope49 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus50 = null;
        microscope49.setStatus(equipmentStatus50);
        src.java.EquipmentStatus equipmentStatus52 = null;
        microscope49.setStatus(equipmentStatus52);
        java.lang.String str54 = microscope49.getName();
        src.java.Arduino arduino58 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope62 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str63 = microscope62.getName();
        java.lang.String str64 = microscope62.getLocation();
        src.java.EquipmentStatus equipmentStatus65 = microscope62.getStatus();
        arduino58.setStatus(equipmentStatus65);
        microscope49.setStatus(equipmentStatus65);
        microscope41.setStatus(equipmentStatus65);
        microscope25.setStatus(equipmentStatus65);
        arduino21.setStatus(equipmentStatus65);
        microscope14.setStatus(equipmentStatus65);
        src.java.EquipmentStatus equipmentStatus72 = microscope14.getStatus();
        equipment9.setStatus(equipmentStatus72);
        arduino3.setStatus(equipmentStatus72);
        java.lang.String str75 = arduino3.getDescription();
// flaky "72) test3486(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-36" + "'", str10, "EQ-36");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "23) test3486(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equipment ID: EQ-3866, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str26, "Equipment ID: EQ-3866, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "10) test3486(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment ID: EQ-3866, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str27, "Equipment ID: EQ-3866, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Head Lab Coordinator" + "'", str30, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Guest" + "'", str35, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus36 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus36.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus65 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus65.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus72 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus72.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "EQ-71" + "'", str75, "EQ-71");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3487");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus8 = equipment3.getStatus();
        java.lang.Class<?> wildcardClass9 = equipmentStatus8.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "73) test3487(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-3872" + "'", str7, "EQ-3872");
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3488");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-603", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1218");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3489");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3490");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "74) test3490(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3491");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-368", "EQ-118", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-368" + "'", str4, "EQ-368");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3492");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1841", "EQ-2143", "EQ-1000");
        researcher3.password = "EQ-1007";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3493");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-3060, Name: , Description: , Location: , Status: null");
        java.lang.String str20 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "75) test3493(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Head Lab Coordinator" + "'", str20, "Head Lab Coordinator");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3494");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        src.java.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        java.lang.String str18 = microscope3.getDescription();
        java.lang.String str19 = microscope3.getName();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = microscope3.isAvailable(localDateTime20, localDateTime21);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "76) test3494(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3877, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-3877, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3495");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1685, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null", "EQ-1874");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3496");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.isapproved = false;
        double double15 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "77) test3496(src.test.randoop.AleenaTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3497");
        src.java.Guest guest3 = new src.java.Guest("EQ-1192", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-473");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3498");
        src.java.Guest guest3 = new src.java.Guest("EQ-301", "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3499");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.password;
        student3.isapproved = true;
        java.lang.String str11 = student3.password;
        student3.username = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest6.test3500");
        src.java.Student student3 = new src.java.Student("EQ-514", "EQ-616", "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        boolean boolean7 = student3.isapproved;
        boolean boolean8 = student3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }
}
