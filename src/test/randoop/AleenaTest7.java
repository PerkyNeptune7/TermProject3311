package src.test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest7 {

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
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3501");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-0", "EQ-152", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-152" + "'", str4, "EQ-152");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3502");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.needsapproval = false;
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3503");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-592");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-221", "EQ-684", "EQ-863");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-781");
        src.java.UserAccounts userAccounts34 = userFactory0.createUser("Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "EQ-688", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1080, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts39 = userFactory0.createUser("Equipment ID: EQ-2994, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE", "EQ-665", "Equipment ID: EQ-3693, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1165");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
        org.junit.Assert.assertNull(userAccounts34);
        org.junit.Assert.assertNull(userAccounts39);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3504");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-3232", "EQ-205", "Equipment ID: EQ-3321, Name: EQ-36, Description: MANAGER-0, Location: , Status: AVAILABLE");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3505");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-2473, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-3144", "EQ-2996", "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3820, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3506");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-539", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "EQ-1223");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1223" + "'", str5, "EQ-1223");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3507");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-865", "Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE", "");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3508");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1320", "EQ-3641", "Equipment ID: EQ-2575, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-602");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1320");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3509");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        src.java.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "EQ-1162");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-1945, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-3377", "EQ-496", "Equipment ID: EQ-2059, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3510");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-36", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        double double5 = guest3.getHourlyRate();
        guest3.needsapproval = false;
        boolean boolean8 = guest3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3511");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.password;
        boolean boolean6 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3512");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1743, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE", "EQ-2906", "EQ-3059", "EQ-735");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1743, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3513");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2486, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3514");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.username;
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3515");
        src.java.Guest guest3 = new src.java.Guest("Guest", "COORD-001", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        guest3.isapproved = true;
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3516");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.username;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3516, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str9 = labManager8.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "1) test3516(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str3, "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
// flaky "1) test3516(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3517");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-814");
        researcher3.password = "EQ-3668";
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3518");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        boolean boolean7 = student3.needsapproval;
        java.lang.String str8 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3519");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-1180", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
        java.lang.String str12 = labManager11.getAccountType();
        labManager11.username = "EQ-1808";
        java.lang.String str15 = labManager11.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lab Manager" + "'", str12, "Lab Manager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MANAGER-824727143" + "'", str15, "MANAGER-824727143");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3520");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-820", "");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-3231", "EQ-3438");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3521");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-387", "EQ-419", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-431", "EQ-2013", "EQ-2143");
        src.java.UserAccounts userAccounts30 = userFactory0.createUser("Equipment ID: EQ-3877, Name: , Description: , Location: , Status: null", "EQ-2101", "EQ-569");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3522");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3523");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1526", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-382");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3524");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1036, Name: , Description: , Location: , Status: null", "");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "2) test3524(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3525");
        src.java.Guest guest3 = new src.java.Guest("EQ-497", "Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null", "EQ-3499");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3526");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.Microscope microscope7 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        java.lang.String str11 = microscope7.toString();
        src.java.EquipmentStatus equipmentStatus12 = microscope7.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope7.isAvailable(localDateTime13, localDateTime14);
        src.java.Microscope microscope19 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = microscope19.isAvailable(localDateTime20, localDateTime21);
        src.java.EquipmentStatus equipmentStatus23 = microscope19.getStatus();
        src.java.Equipment equipment27 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str28 = equipment27.getDescription();
        src.java.EquipmentStatus equipmentStatus29 = equipment27.getStatus();
        microscope19.setStatus(equipmentStatus29);
        microscope7.setStatus(equipmentStatus29);
        arduino3.setStatus(equipmentStatus29);
        org.junit.Assert.assertNull(equipmentStatus10);
// flaky "3) test3526(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-3886, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-3886, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "COORD-001" + "'", str28, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus29 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus29.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3527");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getDescription();
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "4) test3527(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3889, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-3889, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3528");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.password = "Equipment ID: EQ-3243, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE";
        faculty3.username = "Equipment ID: EQ-1503, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3529");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2765", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-427");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-427" + "'", str4, "EQ-427");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3530");
        src.java.Student student3 = new src.java.Student("EQ-118", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "EQ-751");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        student3.username = "Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null";
        student3.password = "EQ-2149";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-118" + "'", str5, "EQ-118");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3531");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = arduino3.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3532");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        labManager5.isapproved = false;
        labManager5.isapproved = false;
        java.lang.String str12 = labManager5.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lab Manager" + "'", str12, "Lab Manager");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3533");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3534");
        src.java.Microscope microscope3 = new src.java.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.toString();
// flaky "5) test3534(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3892, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3892, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3535");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        boolean boolean6 = researcher3.isapproved;
        java.lang.String str7 = researcher3.username;
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        researcher3.isapproved = false;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3536");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        headLabCoordinator0.username = "";
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-814", "EQ-387");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "6) test3536(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3537");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!");
        boolean boolean4 = headLabCoordinator0.isapproved;
        headLabCoordinator0.password = "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3538");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-209", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getEquipmentId();
// flaky "7) test3538(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3894, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3894, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
// flaky "2) test3538(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3894" + "'", str5, "EQ-3894");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3539");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        guest3.needsapproval = true;
        guest3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3540");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.username;
        boolean boolean11 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3541");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1166", "Equipment ID: EQ-943, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1792, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3542");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-99", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null");
        java.lang.String str17 = headLabCoordinator0.password;
        double double18 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager21 = headLabCoordinator0.autoGenerateLabManager("EQ-99", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str22 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str17, "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Head Lab Coordinator" + "'", str22, "Head Lab Coordinator");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3543");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        boolean boolean6 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = true;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-473", "EQ-2680");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-3566", "Equipment ID: EQ-2294, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str1, "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3544");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.password = "EQ-209";
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3545");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1906", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-3708");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3546");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3547");
        src.java.Student student3 = new src.java.Student("Student", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-296");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str7 = student3.getRegistrationId();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-296" + "'", str7, "EQ-296");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3548");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-1826", "EQ-3628");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3549");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-590", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2614, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3550");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-231", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("EQ-1165", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-3722", "EQ-1890", "EQ-384");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3551");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getDescription();
        src.java.Microscope microscope9 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus10 = null;
        microscope9.setStatus(equipmentStatus10);
        src.java.EquipmentStatus equipmentStatus12 = microscope9.getStatus();
        src.java.EquipmentStatus equipmentStatus13 = null;
        microscope9.setStatus(equipmentStatus13);
        java.lang.String str15 = microscope9.getName();
        java.lang.String str16 = microscope9.getEquipmentId();
        java.lang.String str17 = microscope9.getLocation();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope9.isAvailable(localDateTime18, localDateTime19);
        src.java.Microscope microscope24 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str25 = microscope24.getName();
        java.lang.String str26 = microscope24.getLocation();
        src.java.EquipmentStatus equipmentStatus27 = microscope24.getStatus();
        microscope9.setStatus(equipmentStatus27);
        arduino3.setStatus(equipmentStatus27);
        java.lang.String str30 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNull(equipmentStatus12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "8) test3551(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-3900" + "'", str16, "EQ-3900");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str30, "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3552");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-257", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-355");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getEquipmentId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = arduino3.isAvailable(localDateTime8, localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "9) test3552(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-3902" + "'", str7, "EQ-3902");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3553");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1965, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-3475", "EQ-1113");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3554");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-861", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1050");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3555");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2836", "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null", "EQ-2492", "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2836");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3556");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3557");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getRegistrationId();
        student3.isapproved = true;
        java.lang.String str9 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3558");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.getDescription();
        java.lang.String str11 = microscope3.getDescription();
        java.lang.String str12 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "10) test3558(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-3903" + "'", str9, "EQ-3903");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3559");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1645, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE", "EQ-3445", "Equipment ID: EQ-2533, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3560");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        src.java.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("EQ-3839", "EQ-2052");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager17);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3561");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getRegistrationId();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getRegistrationId();
        java.lang.String str11 = researcher3.username;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3562");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-156", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3563");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getName();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.toString();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "11) test3563(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3906" + "'", str6, "EQ-3906");
// flaky "3) test3563(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3906, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-3906, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3564");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        headLabCoordinator0.username = "";
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-2532");
        java.lang.String str14 = labManager13.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MANAGER-1244835102" + "'", str14, "MANAGER-1244835102");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3565");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-558", "EQ-559");
        boolean boolean7 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-2532", "Equipment ID: EQ-1526, Name: , Description: , Location: , Status: null");
        boolean boolean11 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3566");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-685", "hi!", "EQ-1454");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.password;
        java.lang.String str7 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1454" + "'", str7, "EQ-1454");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3567");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-156", "", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-156" + "'", str4, "EQ-156");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3568");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-156");
        researcher3.password = "Equipment ID: EQ-992, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        researcher3.needsapproval = true;
        java.lang.String str8 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-156" + "'", str8, "EQ-156");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3569");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-3575", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3570");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.password;
        researcher3.username = "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3571");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null", "EQ-301", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("EQ-552", "EQ-978", "EQ-1219");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-1098", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts40 = userFactory0.createUser("EQ-389", "EQ-615", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3572");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime6, localDateTime7);
        src.java.Arduino arduino12 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope16 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str17 = microscope16.getName();
        java.lang.String str18 = microscope16.getLocation();
        src.java.EquipmentStatus equipmentStatus19 = microscope16.getStatus();
        arduino12.setStatus(equipmentStatus19);
        java.lang.String str21 = arduino12.toString();
        java.lang.String str22 = arduino12.getDescription();
        src.java.EquipmentStatus equipmentStatus23 = arduino12.getStatus();
        equipment3.setStatus(equipmentStatus23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
// flaky "12) test3572(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3908" + "'", str5, "EQ-3908");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "4) test3572(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-3909, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str21, "Equipment ID: EQ-3909, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3573");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-731", "EQ-3668");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str8, "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3574");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2343, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3575");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.password = "EQ-120";
        researcher3.username = "EQ-2895";
        boolean boolean11 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3576");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        java.lang.String str9 = arduino3.getLocation();
        java.lang.String str10 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus11 = null;
        arduino3.setStatus(equipmentStatus11);
        java.lang.String str13 = arduino3.getLocation();
        src.java.Microscope microscope17 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str18 = microscope17.toString();
        java.lang.String str19 = microscope17.toString();
        src.java.EquipmentStatus equipmentStatus20 = null;
        microscope17.setStatus(equipmentStatus20);
        java.lang.String str22 = microscope17.getName();
        src.java.Microscope microscope26 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str27 = microscope26.getName();
        src.java.EquipmentStatus equipmentStatus28 = microscope26.getStatus();
        microscope17.setStatus(equipmentStatus28);
        arduino3.setStatus(equipmentStatus28);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
// flaky "13) test3576(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-3912, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str18, "Equipment ID: EQ-3912, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "5) test3576(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-3912, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str19, "Equipment ID: EQ-3912, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Head Lab Coordinator" + "'", str22, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Guest" + "'", str27, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3577");
        src.java.Microscope microscope3 = new src.java.Microscope("", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-1125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.Arduino arduino7 = new src.java.Arduino("EQ-1116", "EQ-1528", "EQ-1943");
        src.java.Microscope microscope11 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope11.isAvailable(localDateTime12, localDateTime13);
        src.java.EquipmentStatus equipmentStatus15 = microscope11.getStatus();
        java.lang.String str16 = microscope11.getEquipmentId();
        src.java.Microscope microscope20 = new src.java.Microscope("", "hi!", "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE");
        src.java.Microscope microscope24 = new src.java.Microscope("EQ-99", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-325");
        src.java.EquipmentStatus equipmentStatus25 = microscope24.getStatus();
        microscope20.setStatus(equipmentStatus25);
        microscope11.setStatus(equipmentStatus25);
        arduino7.setStatus(equipmentStatus25);
        microscope3.setStatus(equipmentStatus25);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = microscope3.isAvailable(localDateTime30, localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "14) test3577(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-3916" + "'", str16, "EQ-3916");
        org.junit.Assert.assertTrue("'" + equipmentStatus25 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus25.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3578");
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
        java.lang.String str20 = microscope3.getEquipmentId();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "15) test3578(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-3919" + "'", str10, "EQ-3919");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "6) test3578(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-3919" + "'", str20, "EQ-3919");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3579");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-684", "EQ-1102", "EQ-628");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1102" + "'", str4, "EQ-1102");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3580");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.Microscope microscope10 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str11 = microscope10.getName();
        java.lang.String str12 = microscope10.getLocation();
        src.java.EquipmentStatus equipmentStatus13 = microscope10.getStatus();
        microscope3.setStatus(equipmentStatus13);
        java.lang.String str15 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3581");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("hi!", "EQ-1163");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-1554", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3582");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "16) test3582(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3923, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3923, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3583");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1360", "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2385");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3584");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipmentStatus8);
// flaky "17) test3584(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3925, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-3925, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3585");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1166", "Equipment ID: EQ-3177, Name: , Description: , Location: , Status: null", "EQ-2459");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3586");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "EQ-92", "EQ-118");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3587");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        headLabCoordinator0.password = "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null";
        boolean boolean18 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3588");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-971", "EQ-859", "EQ-1476");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3589");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2914, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE");
        faculty3.password = "EQ-3342";
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3590");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.username;
        researcher3.isapproved = true;
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3591");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        java.lang.String str6 = arduino3.getName();
        java.lang.String str7 = arduino3.getLocation();
        src.java.Microscope microscope11 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus12 = null;
        microscope11.setStatus(equipmentStatus12);
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        java.lang.String str15 = microscope11.getLocation();
        java.lang.String str16 = microscope11.getName();
        src.java.Microscope microscope20 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = microscope20.isAvailable(localDateTime21, localDateTime22);
        src.java.EquipmentStatus equipmentStatus24 = microscope20.getStatus();
        microscope11.setStatus(equipmentStatus24);
        src.java.EquipmentStatus equipmentStatus26 = microscope11.getStatus();
        arduino3.setStatus(equipmentStatus26);
        java.lang.String str28 = arduino3.getLocation();
        java.lang.String str29 = arduino3.getDescription();
        src.java.Microscope microscope33 = new src.java.Microscope("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "EQ-281");
        src.java.EquipmentStatus equipmentStatus34 = microscope33.getStatus();
        src.java.Arduino arduino38 = new src.java.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str39 = arduino38.toString();
        src.java.EquipmentStatus equipmentStatus40 = arduino38.getStatus();
        microscope33.setStatus(equipmentStatus40);
        src.java.EquipmentStatus equipmentStatus42 = microscope33.getStatus();
        arduino3.setStatus(equipmentStatus42);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str29, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus34 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus34.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "18) test3591(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equipment ID: EQ-3941, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str39, "Equipment ID: EQ-3941, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus40 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus40.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus42 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus42.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3592");
        src.java.Researcher researcher3 = new src.java.Researcher("MANAGER-0", "EQ-264", "");
        boolean boolean4 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3593");
        src.java.Student student3 = new src.java.Student("EQ-2836", "Equipment ID: EQ-1769, Name: EQ-368, Description: EQ-118, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-39");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3594");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "";
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        java.lang.String str13 = headLabCoordinator0.password;
        java.lang.String str14 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COORD-001" + "'", str14, "COORD-001");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3595");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3131, Name: Faculty, Description: Equipment ID: EQ-829, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-3055, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3596");
        src.java.Arduino arduino3 = new src.java.Arduino("Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
// flaky "19) test3596(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3943" + "'", str4, "EQ-3943");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3597");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str10 = guest3.password;
        java.lang.String str11 = guest3.getAccountType();
        guest3.isapproved = false;
        java.lang.String str14 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3598");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-3366", "EQ-3380", "EQ-2409");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3599");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3600");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        faculty3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3601");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null", "EQ-3328", "EQ-3025");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3602");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        boolean boolean8 = guest3.isapproved;
        guest3.needsapproval = true;
        java.lang.String str11 = guest3.getAccountType();
        java.lang.String str12 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3603");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-765, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1099");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3604");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-686", "EQ-504");
        headLabCoordinator0.password = "EQ-550";
        headLabCoordinator0.isapproved = true;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3605");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        double double11 = labManager10.getHourlyRate();
        double double12 = labManager10.getHourlyRate();
        java.lang.String str13 = labManager10.getRegistrationId();
        labManager10.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MANAGER-66180900" + "'", str13, "MANAGER-66180900");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3606");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        boolean boolean12 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean16 = labManager15.needsapproval;
        boolean boolean17 = labManager15.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3607");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        src.java.Equipment equipment7 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino11 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope15 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str16 = microscope15.getName();
        java.lang.String str17 = microscope15.getLocation();
        src.java.EquipmentStatus equipmentStatus18 = microscope15.getStatus();
        arduino11.setStatus(equipmentStatus18);
        equipment7.setStatus(equipmentStatus18);
        equipment3.setStatus(equipmentStatus18);
        src.java.EquipmentStatus equipmentStatus22 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3608");
        src.java.Faculty faculty3 = new src.java.Faculty("Lab Manager", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3609");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-451", "EQ-3943", "EQ-1082");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3610");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = equipment3.isAvailable(localDateTime8, localDateTime9);
        java.lang.Class<?> wildcardClass11 = equipment3.getClass();
// flaky "20) test3610(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3950" + "'", str4, "EQ-3950");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3611");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("EQ-264", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-838");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-1887, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-2138", "EQ-1453", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3612");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-2163, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-3748, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3613");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2628", "Equipment ID: EQ-3777, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3614");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3615");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236", "MANAGER-66180900");
        java.lang.String str4 = faculty3.username;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getRegistrationId();
        java.lang.String str7 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MANAGER-66180900" + "'", str6, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MANAGER-66180900" + "'", str7, "MANAGER-66180900");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3616");
        src.java.Guest guest3 = new src.java.Guest("Guest", "COORD-001", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        guest3.isapproved = true;
        boolean boolean6 = guest3.isapproved;
        java.lang.String str7 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3617");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getRegistrationId();
        faculty3.username = "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null";
        java.lang.String str7 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3618");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-104", "", "EQ-367");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "21) test3618(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3953, Name: EQ-104, Description: , Location: EQ-367, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3953, Name: EQ-104, Description: , Location: EQ-367, Status: AVAILABLE");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3619");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2680", "EQ-735", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-665");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2680");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3620");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.toString();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-71" + "'", str4, "EQ-71");
// flaky "22) test3620(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3954, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3954, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE");
// flaky "7) test3620(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3954" + "'", str6, "EQ-3954");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3621");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-253");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-284", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts35 = userFactory0.createUser("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-118");
        src.java.UserAccounts userAccounts39 = userFactory0.createUser("Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-742", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts44 = userFactory0.createUser("EQ-1021", "EQ-1479", "Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts35);
        org.junit.Assert.assertNull(userAccounts39);
        org.junit.Assert.assertNull(userAccounts44);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3622");
        src.java.Student student3 = new src.java.Student("EQ-2711", "EQ-3087", "Equipment ID: EQ-1685, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3623");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = microscope3.isAvailable(localDateTime6, localDateTime7);
        src.java.EquipmentStatus equipmentStatus9 = microscope3.getStatus();
// flaky "23) test3623(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3955, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3955, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "8) test3623(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3955, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3955, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3624");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-392", "EQ-325", "EQ-461");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2381, Name: , Description: , Location: , Status: null", "", "");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3625");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2678");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3626");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-335", "EQ-431");
        guest3.needsapproval = false;
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3627");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        faculty3.needsapproval = false;
        boolean boolean6 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3628");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("", "EQ-685", "EQ-355", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3629");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
// flaky "24) test3629(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Researcher" + "'", str2, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3630");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1056", "EQ-931", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-931" + "'", str4, "EQ-931");
// flaky "25) test3630(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3968" + "'", str5, "EQ-3968");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3631");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3632");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = false;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3250, Name: Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3633");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3634");
        src.java.Faculty faculty3 = new src.java.Faculty("MANAGER-1087176903", "EQ-431", "EQ-1763");
        faculty3.isapproved = true;
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3635");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        boolean boolean6 = student3.needsapproval;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3636");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.username;
        headLabCoordinator0.username = "Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3637");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1616", "Equipment ID: EQ-2836, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-778, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3638");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2616, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-3522, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3639");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.lang.String str4 = arduino3.toString();
        src.java.Microscope microscope8 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope8.isAvailable(localDateTime9, localDateTime10);
        src.java.EquipmentStatus equipmentStatus12 = microscope8.getStatus();
        src.java.Equipment equipment16 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str17 = equipment16.getDescription();
        src.java.EquipmentStatus equipmentStatus18 = equipment16.getStatus();
        microscope8.setStatus(equipmentStatus18);
        arduino3.setStatus(equipmentStatus18);
        java.lang.String str21 = arduino3.getName();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = arduino3.isAvailable(localDateTime22, localDateTime23);
        java.lang.String str25 = arduino3.getLocation();
// flaky "26) test3639(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3971, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3971, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "COORD-001" + "'", str17, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str21, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EQ-75" + "'", str25, "EQ-75");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3640");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-566", "", "EQ-3426");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3641");
        src.java.Student student3 = new src.java.Student("EQ-773", "", "Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3642");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-3954, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE", "EQ-2347", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3643");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-565", "EQ-1940");
        labManager7.password = "EQ-1900";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "27) test3643(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3644");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-253");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-284", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-799", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "");
        src.java.UserAccounts userAccounts40 = userFactory0.createUser("EQ-594", "Equipment ID: EQ-2704, Name: , Description: , Location: , Status: null", "EQ-547");
        src.java.UserAccounts userAccounts45 = userFactory0.createUser("Equipment ID: EQ-2817, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1344", "EQ-3722", "EQ-1032");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
        org.junit.Assert.assertNull(userAccounts45);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3645");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-152" + "'", str4, "EQ-152");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-36" + "'", str5, "EQ-36");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3646");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-3694", "EQ-550", "Equipment ID: EQ-3971, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1878");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-3694");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3647");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-257", "EQ-514", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.username = "EQ-1468";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3648");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-489";
        boolean boolean13 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
// flaky "28) test3648(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3649");
        src.java.Student student3 = new src.java.Student("Guest", "EQ-1434", "");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3650");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-99");
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3651");
        src.java.Guest guest3 = new src.java.Guest("", "EQ-193", "EQ-473");
        guest3.password = "";
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3652");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        boolean boolean7 = researcher3.isapproved;
        java.lang.String str8 = researcher3.getRegistrationId();
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3653");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-1007", "EQ-3718", "EQ-2142");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3654");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getLocation();
        src.java.Equipment equipment8 = new src.java.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus9 = equipment8.getStatus();
        microscope3.setStatus(equipmentStatus9);
        src.java.Arduino arduino14 = new src.java.Arduino("EQ-63", "EQ-335", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        src.java.Arduino arduino18 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus19 = arduino18.getStatus();
        arduino14.setStatus(equipmentStatus19);
        microscope3.setStatus(equipmentStatus19);
        java.lang.String str22 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "29) test3654(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equipment ID: EQ-3980, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str22, "Equipment ID: EQ-3980, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3655");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        java.lang.String str4 = student3.username;
        student3.username = "Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE";
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3656");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2616, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-2972", "EQ-687", "EQ-3495");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2616, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3657");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2886, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2996", "Equipment ID: EQ-3462, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2886, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3658");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getRegistrationId();
        boolean boolean5 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3659");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-628", "EQ-74", "Equipment ID: EQ-2206, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3660");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-1113", "EQ-628");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3661");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3662");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-586", "EQ-834", "EQ-1050");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getEquipmentId();
// flaky "30) test3662(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3985" + "'", str4, "EQ-3985");
// flaky "9) test3662(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3985" + "'", str5, "EQ-3985");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3663");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-614, Name: , Description: , Location: , Status: null", "EQ-3376", "Equipment ID: EQ-3886, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3664");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2059, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null", "EQ-2340");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3665");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        src.java.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus9 = microscope3.getStatus();
        java.lang.String str10 = microscope3.getLocation();
        src.java.Equipment equipment14 = new src.java.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null", "EQ-98");
        src.java.Arduino arduino18 = new src.java.Arduino("Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str19 = arduino18.getLocation();
        src.java.Arduino arduino23 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str24 = arduino23.getEquipmentId();
        src.java.Microscope microscope28 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str29 = microscope28.getName();
        java.lang.String str30 = microscope28.getDescription();
        src.java.EquipmentStatus equipmentStatus31 = null;
        microscope28.setStatus(equipmentStatus31);
        src.java.EquipmentStatus equipmentStatus33 = null;
        microscope28.setStatus(equipmentStatus33);
        java.lang.String str35 = microscope28.toString();
        src.java.Microscope microscope39 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = microscope39.isAvailable(localDateTime40, localDateTime41);
        src.java.EquipmentStatus equipmentStatus43 = microscope39.getStatus();
        src.java.Arduino arduino47 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = arduino47.isAvailable(localDateTime48, localDateTime49);
        java.lang.String str51 = arduino47.getDescription();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean54 = arduino47.isAvailable(localDateTime52, localDateTime53);
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        boolean boolean57 = arduino47.isAvailable(localDateTime55, localDateTime56);
        src.java.EquipmentStatus equipmentStatus58 = arduino47.getStatus();
        microscope39.setStatus(equipmentStatus58);
        microscope28.setStatus(equipmentStatus58);
        arduino23.setStatus(equipmentStatus58);
        arduino18.setStatus(equipmentStatus58);
        equipment14.setStatus(equipmentStatus58);
        microscope3.setStatus(equipmentStatus58);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertNull(equipmentStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str19, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
// flaky "31) test3665(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EQ-3989" + "'", str24, "EQ-3989");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky "10) test3665(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Equipment ID: EQ-3990, Name: hi!, Description: , Location: hi!, Status: null" + "'", str35, "Equipment ID: EQ-3990, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus43 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus43.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MasterAdmin123!" + "'", str51, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus58 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus58.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3666");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-978", "EQ-623");
        guest3.isapproved = true;
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3667");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getAccountType();
        double double7 = student3.getHourlyRate();
        student3.password = "Equipment ID: EQ-1282, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE";
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3668");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1678, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE", "EQ-3346", "Equipment ID: EQ-3529, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1678, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3669");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getEquipmentId();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
// flaky "32) test3669(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3993" + "'", str5, "EQ-3993");
// flaky "11) test3669(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3993" + "'", str6, "EQ-3993");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3670");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getRegistrationId();
        faculty3.password = "EQ-1736";
        faculty3.password = "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-41" + "'", str9, "EQ-41");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3671");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getLocation();
        java.lang.String str8 = microscope3.getEquipmentId();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "33) test3671(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3994" + "'", str8, "EQ-3994");
// flaky "12) test3671(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3994, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-3994, Name: , Description: , Location: , Status: null");
// flaky "1) test3671(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-3994, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-3994, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3672");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getRegistrationId();
        double double9 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3673");
        src.java.Student student3 = new src.java.Student("", "Student", "Student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3674");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-690", "Faculty", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3675");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2322", "EQ-2625", "Equipment ID: EQ-2693, Name: , Description: , Location: , Status: null", "EQ-2605");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2322");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3676");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-2519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-976");
        java.lang.String str4 = equipment3.toString();
// flaky "34) test3676(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3995, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-2519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-976, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3995, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-2519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-976, Status: AVAILABLE");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3677");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "EQ-99", "EQ-92");
        faculty3.isapproved = false;
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3678");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.username;
        headLabCoordinator0.password = "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        double double9 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-489" + "'", str1, "EQ-489");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3679");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1900", "EQ-2080", "Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3680");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "EQ-281");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        src.java.Arduino arduino8 = new src.java.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str9 = arduino8.toString();
        src.java.EquipmentStatus equipmentStatus10 = arduino8.getStatus();
        microscope3.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope3.getLocation();
        java.lang.String str13 = microscope3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "35) test3680(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4001, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-4001, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-281" + "'", str12, "EQ-281");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-507" + "'", str13, "EQ-507");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3681");
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
        java.lang.String str26 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-253" + "'", str4, "EQ-253");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3682");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "", "EQ-152");
        faculty3.password = "EQ-422";
        faculty3.isapproved = true;
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3683");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-299", "EQ-275", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-790, Name: , Description: , Location: , Status: null", "EQ-1116", "EQ-92", "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-565", "Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null", "EQ-814", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-1434", "EQ-665", "", "Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts40 = userFactory0.createUser("EQ-547", "", "EQ-1909");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3684");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2248, Name: EQ-368, Description: EQ-118, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3685");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2765", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-427");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "36) test3685(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4013" + "'", str4, "EQ-4013");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3686");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-3993", "EQ-275", "EQ-1000", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-3993");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3687");
        src.java.Student student3 = new src.java.Student("EQ-1192", "EQ-655", "EQ-615");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3688");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-509", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3689");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-120", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-41");
        java.lang.String str4 = researcher3.username;
        boolean boolean5 = researcher3.isapproved;
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-120" + "'", str4, "EQ-120");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3690");
        src.java.Guest guest3 = new src.java.Guest("EQ-851", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null", "EQ-690");
        java.lang.String str4 = guest3.getAccountType();
        guest3.needsapproval = false;
        boolean boolean7 = guest3.isapproved;
        guest3.username = "EQ-1965";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3691");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-3518", "Equipment ID: EQ-3567, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-2715");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3692");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.password;
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str6, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3693");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1502, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1943", "EQ-1855");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3694");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3695");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getName();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        java.lang.String str9 = arduino3.toString();
        java.lang.String str10 = arduino3.getEquipmentId();
        java.lang.String str11 = arduino3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipmentStatus8);
// flaky "37) test3695(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4017, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str9, "Equipment ID: EQ-4017, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
// flaky "13) test3695(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4017" + "'", str10, "EQ-4017");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3696");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3697");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        guest3.isapproved = true;
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3698");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1056", "Equipment ID: EQ-3971, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-236");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3699");
        src.java.Student student3 = new src.java.Student("EQ-2466", "EQ-570", "EQ-1007");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3700");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str15 = headLabCoordinator0.getRegistrationId();
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("EQ-2409", "Equipment ID: EQ-2556, Name: Equipment ID: EQ-696, Name: , Description: , Location: , Status: null, Description: EQ-627, Location: EQ-1174, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COORD-001" + "'", str15, "COORD-001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3701");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-970, Name: , Description: , Location: , Status: null", "EQ-1572", "EQ-1543");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1572" + "'", str4, "EQ-1572");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3702");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-866");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2924, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2846", "EQ-1435");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("EQ-3600", "EQ-1530", "EQ-3968", "Equipment ID: EQ-1239, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3703");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.Microscope microscope10 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str11 = microscope10.getName();
        java.lang.String str12 = microscope10.getLocation();
        src.java.EquipmentStatus equipmentStatus13 = microscope10.getStatus();
        microscope3.setStatus(equipmentStatus13);
        src.java.EquipmentStatus equipmentStatus15 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3704");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-684, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-71", "MANAGER-214492645");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-214492645" + "'", str4, "MANAGER-214492645");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3705");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-281", "EQ-63");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3706");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1767, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-1922", "Equipment ID: EQ-1432, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.isapproved = false;
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3707");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.username;
        java.lang.Class<?> wildcardClass10 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3708");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getName();
// flaky "38) test3708(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4024" + "'", str4, "EQ-4024");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-94" + "'", str7, "EQ-94");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3709");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-1344", "Equipment ID: EQ-696, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3710");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2465, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3711");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1219", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3712");
        src.java.Guest guest3 = new src.java.Guest("EQ-851", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null", "EQ-690");
        java.lang.String str4 = guest3.password;
        boolean boolean5 = guest3.needsapproval;
        guest3.needsapproval = true;
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3713");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null", "EQ-284", "EQ-2846");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3714");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1229");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3715");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-509", "EQ-3902", "EQ-2904");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3716");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1942, Name: EQ-826, Description: Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str11 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3717");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3718");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        guest3.password = "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null";
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3719");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-152", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-193");
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
        equipment3.setStatus(equipmentStatus22);
        java.lang.String str27 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "39) test3719(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EQ-4033" + "'", str27, "EQ-4033");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3720");
        src.java.Student student3 = new src.java.Student("EQ-390", "EQ-446", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-446" + "'", str5, "EQ-446");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3721");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        java.lang.String str4 = student3.username;
        student3.username = "Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE";
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3722");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-719", "EQ-39", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-719" + "'", str4, "EQ-719");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3723");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-264", "Student", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3724");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        boolean boolean10 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3725");
        src.java.Guest guest3 = new src.java.Guest("EQ-851", "EQ-1763", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = guest3.isapproved;
        java.lang.String str5 = guest3.password;
        guest3.username = "Equipment ID: EQ-3167, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1763" + "'", str5, "EQ-1763");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3726");
        src.java.Student student3 = new src.java.Student("EQ-390", "EQ-446", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.username = "Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null";
        boolean boolean7 = student3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3727");
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
        src.java.EquipmentStatus equipmentStatus18 = microscope3.getStatus();
        java.lang.String str19 = microscope3.getEquipmentId();
        java.lang.String str20 = microscope3.getName();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "40) test3727(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4044" + "'", str10, "EQ-4044");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(equipmentStatus18);
// flaky "14) test3727(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ-4044" + "'", str19, "EQ-4044");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3728");
        src.java.Researcher researcher3 = new src.java.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "hi!");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3729");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2883", "EQ-1163", "EQ-304");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3730");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.toString();
// flaky "41) test3730(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "15) test3730(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3731");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        boolean boolean12 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-304", "EQ-209");
        src.java.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "42) test3731(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "16) test3731(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3732");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.isapproved = true;
        java.lang.String str11 = faculty3.username;
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3733");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-684, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-71", "MANAGER-214492645");
        src.java.Equipment equipment7 = new src.java.Equipment("Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null", "");
        src.java.Microscope microscope11 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus12 = null;
        microscope11.setStatus(equipmentStatus12);
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        src.java.EquipmentStatus equipmentStatus15 = null;
        microscope11.setStatus(equipmentStatus15);
        java.lang.String str17 = microscope11.getName();
        java.lang.String str18 = microscope11.getEquipmentId();
        java.lang.String str19 = microscope11.getLocation();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = microscope11.isAvailable(localDateTime20, localDateTime21);
        java.lang.String str23 = microscope11.getLocation();
        java.lang.String str24 = microscope11.getLocation();
        java.lang.String str25 = microscope11.toString();
        java.lang.String str26 = microscope11.getLocation();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = microscope11.isAvailable(localDateTime27, localDateTime28);
        java.lang.String str30 = microscope11.getEquipmentId();
        src.java.Microscope microscope34 = new src.java.Microscope("EQ-446", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus35 = microscope34.getStatus();
        microscope11.setStatus(equipmentStatus35);
        equipment7.setStatus(equipmentStatus35);
        equipment3.setStatus(equipmentStatus35);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky "43) test3733(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-4049" + "'", str18, "EQ-4049");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
// flaky "17) test3733(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment ID: EQ-4049, Name: , Description: , Location: , Status: null" + "'", str25, "Equipment ID: EQ-4049, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky "2) test3733(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EQ-4049" + "'", str30, "EQ-4049");
        org.junit.Assert.assertTrue("'" + equipmentStatus35 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus35.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3734");
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
        src.java.EquipmentStatus equipmentStatus36 = microscope3.getStatus();
        java.lang.String str37 = microscope3.getLocation();
        java.lang.String str38 = microscope3.toString();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = microscope3.isAvailable(localDateTime39, localDateTime40);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus36 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus36.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str37, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
// flaky "44) test3734(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Equipment ID: EQ-4051, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str38, "Equipment ID: EQ-4051, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3735");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-698", "EQ-507", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getRegistrationId();
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3736");
        src.java.Guest guest3 = new src.java.Guest("EQ-431", "EQ-344", "EQ-149");
        guest3.needsapproval = true;
        guest3.username = "Equipment ID: EQ-2073, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE";
        java.lang.String str8 = guest3.password;
        double double9 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-344" + "'", str8, "EQ-344");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3737");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1082", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-156");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3738");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1446", "EQ-615", "EQ-3659", "EQ-1251");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1446");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3739");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-427");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("EQ-616", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "EQ-1162", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "EQ-489", "EQ-461");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3820, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2162, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3740");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager14.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3741");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        boolean boolean13 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3742");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-1360";
        java.lang.String str11 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3743");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-3078, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3744");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
// flaky "45) test3744(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3745");
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
        java.lang.String str14 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3746");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1979, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3747");
        src.java.Arduino arduino3 = new src.java.Arduino("", "EQ-1007", "EQ-2906");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3748");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-811", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-982");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-811" + "'", str4, "EQ-811");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3749");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        boolean boolean13 = headLabCoordinator0.needsapproval;
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
// flaky "46) test3749(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3750");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-2115, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-751");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3751");
        src.java.Equipment equipment3 = new src.java.Equipment("", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "MANAGER-66181089");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        src.java.Arduino arduino10 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = arduino10.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = arduino10.getStatus();
        src.java.Arduino arduino18 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus19 = null;
        arduino18.setStatus(equipmentStatus19);
        src.java.EquipmentStatus equipmentStatus21 = arduino18.getStatus();
        java.lang.String str22 = arduino18.getLocation();
        java.lang.String str23 = arduino18.getEquipmentId();
        java.lang.String str24 = arduino18.getEquipmentId();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = arduino18.isAvailable(localDateTime25, localDateTime26);
        java.lang.String str28 = arduino18.getLocation();
        java.lang.String str29 = arduino18.getLocation();
        src.java.Microscope microscope33 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str34 = microscope33.getDescription();
        java.lang.String str35 = microscope33.toString();
        src.java.Microscope microscope39 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus40 = null;
        microscope39.setStatus(equipmentStatus40);
        src.java.EquipmentStatus equipmentStatus42 = microscope39.getStatus();
        java.lang.String str43 = microscope39.getLocation();
        java.lang.String str44 = microscope39.getName();
        src.java.Microscope microscope48 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = microscope48.isAvailable(localDateTime49, localDateTime50);
        src.java.EquipmentStatus equipmentStatus52 = microscope48.getStatus();
        microscope39.setStatus(equipmentStatus52);
        microscope33.setStatus(equipmentStatus52);
        arduino18.setStatus(equipmentStatus52);
        arduino10.setStatus(equipmentStatus52);
        equipment3.setStatus(equipmentStatus52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentStatus21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Researcher" + "'", str22, "Researcher");
// flaky "47) test3751(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EQ-4062" + "'", str23, "EQ-4062");
// flaky "18) test3751(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EQ-4062" + "'", str24, "EQ-4062");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str34, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
// flaky "3) test3751(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Equipment ID: EQ-4063, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str35, "Equipment ID: EQ-4063, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(equipmentStatus42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus52 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus52.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3752");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-2894, Name: Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1080, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-970, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-970, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-970, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3753");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1099", "EQ-120", "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE");
        researcher3.username = "Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3754");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1530", "EQ-4043", "EQ-2972", "EQ-94");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1530");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3755");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-75", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3756");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-470", "EQ-489");
        student3.password = "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = student3.getAccountType();
        student3.username = "EQ-193";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3757");
        src.java.Student student3 = new src.java.Student("", "Equipment ID: EQ-943, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2711");
        boolean boolean4 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3758");
        src.java.Guest guest3 = new src.java.Guest("EQ-390", "EQ-514", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3759");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getDescription();
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.getName();
        java.lang.String str12 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "48) test3759(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-4070" + "'", str12, "EQ-4070");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3760");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "COORD-001", "EQ-39");
        src.java.Arduino arduino7 = new src.java.Arduino("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus8 = arduino7.getStatus();
        arduino3.setStatus(equipmentStatus8);
        java.lang.Class<?> wildcardClass10 = equipmentStatus8.getClass();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3761");
        src.java.Student student3 = new src.java.Student("EQ-4024", "EQ-3533", "EQ-1430");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3762");
        src.java.Student student3 = new src.java.Student("EQ-94", "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-977");
        student3.isapproved = true;
        boolean boolean6 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3763");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-103232", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        src.java.Equipment equipment8 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getName();
        src.java.EquipmentStatus equipmentStatus11 = equipment8.getStatus();
        equipment3.setStatus(equipmentStatus11);
        src.java.Arduino arduino16 = new src.java.Arduino("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.Microscope microscope20 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus21 = null;
        microscope20.setStatus(equipmentStatus21);
        src.java.EquipmentStatus equipmentStatus23 = null;
        microscope20.setStatus(equipmentStatus23);
        java.lang.String str25 = microscope20.getName();
        src.java.Arduino arduino29 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope33 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str34 = microscope33.getName();
        java.lang.String str35 = microscope33.getLocation();
        src.java.EquipmentStatus equipmentStatus36 = microscope33.getStatus();
        arduino29.setStatus(equipmentStatus36);
        microscope20.setStatus(equipmentStatus36);
        java.lang.String str39 = microscope20.getLocation();
        src.java.EquipmentStatus equipmentStatus40 = microscope20.getStatus();
        arduino16.setStatus(equipmentStatus40);
        equipment3.setStatus(equipmentStatus40);
        src.java.Arduino arduino46 = new src.java.Arduino("EQ-99", "EQ-74", "Researcher");
        src.java.EquipmentStatus equipmentStatus47 = arduino46.getStatus();
        src.java.Microscope microscope51 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str52 = microscope51.getName();
        java.lang.String str53 = microscope51.getLocation();
        java.lang.String str54 = microscope51.getName();
        java.lang.String str55 = microscope51.getName();
        src.java.Microscope microscope59 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus60 = null;
        microscope59.setStatus(equipmentStatus60);
        src.java.EquipmentStatus equipmentStatus62 = null;
        microscope59.setStatus(equipmentStatus62);
        java.lang.String str64 = microscope59.getName();
        src.java.Arduino arduino68 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope72 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str73 = microscope72.getName();
        java.lang.String str74 = microscope72.getLocation();
        src.java.EquipmentStatus equipmentStatus75 = microscope72.getStatus();
        arduino68.setStatus(equipmentStatus75);
        microscope59.setStatus(equipmentStatus75);
        microscope51.setStatus(equipmentStatus75);
        arduino46.setStatus(equipmentStatus75);
        equipment3.setStatus(equipmentStatus75);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus36 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus36.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus40 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus40.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus75 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus75.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3764");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3765");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-131", "Researcher", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.username;
        researcher3.isapproved = true;
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.username = "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        researcher3.username = "EQ-685";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-131" + "'", str4, "EQ-131");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3766");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-931", "EQ-1042");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3767");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-3516, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2294, Name: hi!, Description: , Location: hi!, Status: null", "EQ-3152");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3768");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1248", "EQ-1501", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        faculty3.password = "Equipment ID: EQ-2805, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3769");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.isapproved = false;
        java.lang.String str15 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3770");
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
        src.java.Microscope microscope23 = new src.java.Microscope("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-278", "EQ-205");
        src.java.EquipmentStatus equipmentStatus24 = microscope23.getStatus();
        microscope3.setStatus(equipmentStatus24);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "49) test3770(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4086" + "'", str10, "EQ-4086");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3771");
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
        src.java.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-2625, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.LabManager labManager23 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-781");
        java.lang.Class<?> wildcardClass24 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "50) test3771(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
// flaky "19) test3771(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3772");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.password = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3773");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getName();
        src.java.Microscope microscope11 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus12 = null;
        microscope11.setStatus(equipmentStatus12);
        src.java.EquipmentStatus equipmentStatus14 = null;
        microscope11.setStatus(equipmentStatus14);
        java.lang.String str16 = microscope11.getName();
        src.java.Arduino arduino20 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope24 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str25 = microscope24.getName();
        java.lang.String str26 = microscope24.getLocation();
        src.java.EquipmentStatus equipmentStatus27 = microscope24.getStatus();
        arduino20.setStatus(equipmentStatus27);
        microscope11.setStatus(equipmentStatus27);
        microscope3.setStatus(equipmentStatus27);
        src.java.Arduino arduino34 = new src.java.Arduino("", "EQ-36", "EQ-92");
        src.java.Equipment equipment38 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str39 = equipment38.getEquipmentId();
        java.lang.String str40 = equipment38.getName();
        src.java.EquipmentStatus equipmentStatus41 = equipment38.getStatus();
        arduino34.setStatus(equipmentStatus41);
        microscope3.setStatus(equipmentStatus41);
        src.java.Equipment equipment47 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str48 = equipment47.getDescription();
        src.java.EquipmentStatus equipmentStatus49 = equipment47.getStatus();
        microscope3.setStatus(equipmentStatus49);
        java.lang.String str51 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "51) test3773(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EQ-4093" + "'", str39, "EQ-4093");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EQ-94" + "'", str40, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus41 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus41.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "COORD-001" + "'", str48, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus49 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus49.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3774");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        researcher3.username = "Equipment ID: EQ-3095, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3775");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getLocation();
        src.java.Microscope microscope9 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str10 = microscope9.getName();
        src.java.EquipmentStatus equipmentStatus11 = microscope9.getStatus();
        arduino3.setStatus(equipmentStatus11);
        java.lang.String str13 = arduino3.toString();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = arduino3.isAvailable(localDateTime14, localDateTime15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-152" + "'", str4, "EQ-152");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "52) test3775(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-4097, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-4097, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3776");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null", "EQ-560");
        headLabCoordinator0.username = "EQ-3149";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3777");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getRegistrationId();
        boolean boolean6 = researcher3.isapproved;
        double double7 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3778");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1475, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1823, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3779");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-4086", "EQ-690", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3780");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("MANAGER-1244835102", "Equipment ID: EQ-2575, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
// flaky "53) test3780(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3781");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-2499", "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "54) test3781(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3782");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-3025", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2303, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3783");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3784");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-551, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-496");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-496" + "'", str4, "EQ-496");
// flaky "55) test3784(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4102, Name: Equipment ID: EQ-551, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-496, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4102, Name: Equipment ID: EQ-551, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-496, Status: AVAILABLE");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3785");
        src.java.Guest guest3 = new src.java.Guest("EQ-442", "EQ-598", "MANAGER-1863804858");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3786");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str10 = guest3.username;
        guest3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3787");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1050", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1058");
        java.lang.String str4 = arduino3.toString();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
// flaky "56) test3787(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4103, Name: EQ-1050, Description: Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-1058, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4103, Name: EQ-1050, Description: Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-1058, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3788");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-981", "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null", "EQ-2017");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3789");
        src.java.Faculty faculty3 = new src.java.Faculty("", "EQ-2265", "EQ-2013");
        faculty3.needsapproval = true;
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3790");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-2423");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3791");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-63");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getLocation();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-63" + "'", str5, "EQ-63");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3792");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
// flaky "57) test3792(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4106, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4106, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3793");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-152", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        faculty3.needsapproval = false;
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3794");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.password;
        researcher3.username = "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str11 = researcher3.getAccountType();
        java.lang.String str12 = researcher3.getAccountType();
        java.lang.String str13 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3795");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-3043", "Equipment ID: EQ-3113, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "58) test3795(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3796");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-991", "EQ-1163", "EQ-982");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3797");
        src.java.Researcher researcher3 = new src.java.Researcher("Head Lab Coordinator", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double4 = researcher3.getHourlyRate();
        researcher3.isapproved = true;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3798");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getEquipmentId();
// flaky "59) test3798(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4108" + "'", str4, "EQ-4108");
// flaky "20) test3798(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4108" + "'", str5, "EQ-4108");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3799");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str10 = guest3.password;
        java.lang.String str11 = guest3.password;
        java.lang.String str12 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3800");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3801");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3802");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        src.java.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "EQ-1162");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-2249, Name: Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE, Description: Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Location: Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-2317", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-731");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3803");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.needsapproval = false;
        java.lang.String str12 = guest3.getAccountType();
        java.lang.String str13 = guest3.getAccountType();
        guest3.password = "Equipment ID: EQ-661, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3804");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null", "EQ-4013", "EQ-684");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3805");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3806");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-99");
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3181, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "60) test3806(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3807");
        src.java.Guest guest3 = new src.java.Guest("EQ-2271", "EQ-2737", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3808");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-3440", "Equipment ID: EQ-3107, Name: , Description: , Location: , Status: null", "EQ-3043");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3809");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.needsapproval;
        student3.isapproved = false;
        boolean boolean11 = student3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3810");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null", "EQ-977", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        researcher3.password = "EQ-1874";
        boolean boolean6 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3811");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1502, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2972", "EQ-1927");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3812");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3321", "Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-758");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3813");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.username = "MasterAdmin123!";
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3814");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-814", "EQ-209", "EQ-2322");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3815");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1344", "Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE", "EQ-1174");
        boolean boolean4 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3816");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-684", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        double double9 = headLabCoordinator0.getHourlyRate();
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
// flaky "61) test3816(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3817");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.username;
        faculty3.isapproved = true;
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3818");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.needsapproval = false;
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3819");
        src.java.Arduino arduino3 = new src.java.Arduino("Lab Manager", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.lang.String str8 = equipment7.getDescription();
        src.java.Microscope microscope12 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str13 = microscope12.getDescription();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = microscope12.isAvailable(localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = microscope12.isAvailable(localDateTime17, localDateTime18);
        src.java.EquipmentStatus equipmentStatus20 = microscope12.getStatus();
        src.java.EquipmentStatus equipmentStatus21 = microscope12.getStatus();
        equipment7.setStatus(equipmentStatus21);
        arduino3.setStatus(equipmentStatus21);
        java.lang.String str24 = arduino3.getLocation();
        java.lang.String str25 = arduino3.getName();
        java.lang.Class<?> wildcardClass26 = arduino3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus20 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus20.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE" + "'", str24, "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lab Manager" + "'", str25, "Lab Manager");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3820");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1608", "", "Equipment ID: EQ-3962, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3821");
        src.java.Guest guest3 = new src.java.Guest("EQ-1166", "EQ-3807", "EQ-3059");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3822");
        src.java.Guest guest3 = new src.java.Guest("EQ-835", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-2562");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3823");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-368", "EQ-156", "EQ-63");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-2398, Name: , Description: , Location: , Status: null", "EQ-2146", "EQ-2667");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3824");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1992, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3825");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "EQ-361";
        faculty3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3826");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1616", "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-106", "hi!", "EQ-74");
        src.java.EquipmentStatus equipmentStatus8 = equipment7.getStatus();
        microscope3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3827");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str4 = arduino3.getEquipmentId();
        src.java.Microscope microscope8 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str9 = microscope8.getName();
        java.lang.String str10 = microscope8.getDescription();
        src.java.EquipmentStatus equipmentStatus11 = null;
        microscope8.setStatus(equipmentStatus11);
        src.java.EquipmentStatus equipmentStatus13 = null;
        microscope8.setStatus(equipmentStatus13);
        java.lang.String str15 = microscope8.toString();
        src.java.Microscope microscope19 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = microscope19.isAvailable(localDateTime20, localDateTime21);
        src.java.EquipmentStatus equipmentStatus23 = microscope19.getStatus();
        src.java.Arduino arduino27 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = arduino27.isAvailable(localDateTime28, localDateTime29);
        java.lang.String str31 = arduino27.getDescription();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = arduino27.isAvailable(localDateTime32, localDateTime33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = arduino27.isAvailable(localDateTime35, localDateTime36);
        src.java.EquipmentStatus equipmentStatus38 = arduino27.getStatus();
        microscope19.setStatus(equipmentStatus38);
        microscope8.setStatus(equipmentStatus38);
        arduino3.setStatus(equipmentStatus38);
        java.lang.String str42 = arduino3.toString();
// flaky "62) test3827(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4122" + "'", str4, "EQ-4122");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "21) test3827(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-4123, Name: hi!, Description: , Location: hi!, Status: null" + "'", str15, "Equipment ID: EQ-4123, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MasterAdmin123!" + "'", str31, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "4) test3827(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment ID: EQ-4122, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE" + "'", str42, "Equipment ID: EQ-4122, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3828");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3829");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        faculty3.isapproved = true;
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.password;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3830");
        src.java.Student student3 = new src.java.Student("Student", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-296");
        java.lang.String str4 = student3.password;
        java.lang.String str5 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3831");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1448, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-2317", "EQ-1618");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3832");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-539", "EQ-131", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.Arduino arduino7 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str8 = arduino7.getEquipmentId();
        src.java.Microscope microscope12 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str13 = microscope12.getName();
        java.lang.String str14 = microscope12.getDescription();
        src.java.EquipmentStatus equipmentStatus15 = null;
        microscope12.setStatus(equipmentStatus15);
        src.java.EquipmentStatus equipmentStatus17 = null;
        microscope12.setStatus(equipmentStatus17);
        java.lang.String str19 = microscope12.toString();
        src.java.Microscope microscope23 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = microscope23.isAvailable(localDateTime24, localDateTime25);
        src.java.EquipmentStatus equipmentStatus27 = microscope23.getStatus();
        src.java.Arduino arduino31 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = arduino31.isAvailable(localDateTime32, localDateTime33);
        java.lang.String str35 = arduino31.getDescription();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = arduino31.isAvailable(localDateTime36, localDateTime37);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = arduino31.isAvailable(localDateTime39, localDateTime40);
        src.java.EquipmentStatus equipmentStatus42 = arduino31.getStatus();
        microscope23.setStatus(equipmentStatus42);
        microscope12.setStatus(equipmentStatus42);
        arduino7.setStatus(equipmentStatus42);
        microscope3.setStatus(equipmentStatus42);
        src.java.EquipmentStatus equipmentStatus47 = microscope3.getStatus();
// flaky "63) test3832(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4127" + "'", str8, "EQ-4127");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "22) test3832(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-4128, Name: hi!, Description: , Location: hi!, Status: null" + "'", str19, "Equipment ID: EQ-4128, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MasterAdmin123!" + "'", str35, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus42 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus42.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3833");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Lab Manager", "EQ-384");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3834");
        src.java.Equipment equipment3 = new src.java.Equipment("", "Equipment ID: EQ-3218, Name: , Description: EQ-1736, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Status: AVAILABLE", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3835");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-296", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        labManager15.needsapproval = false;
        labManager15.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3836");
        src.java.Researcher researcher3 = new src.java.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        researcher3.username = "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.username = "Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null";
        researcher3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3837");
        src.java.Student student3 = new src.java.Student("EQ-3119", "EQ-509", "EQ-2499");
        java.lang.String str4 = student3.username;
        java.lang.String str5 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3119" + "'", str4, "EQ-3119");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-2499" + "'", str5, "EQ-2499");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3838");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-341", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2071, Name: , Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
        faculty3.needsapproval = false;
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3839");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2772, Name: , Description: , Location: , Status: null", "EQ-1443");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3840");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
// flaky "64) test3840(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4132" + "'", str4, "EQ-4132");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3841");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1437, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3842");
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
        src.java.LabManager labManager21 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1171, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager24 = headLabCoordinator0.autoGenerateLabManager("EQ-596", "EQ-1918");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertNotNull(labManager24);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3843");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.password;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean8 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3844");
        src.java.Guest guest3 = new src.java.Guest("EQ-3445", "Equipment ID: EQ-4102, Name: Equipment ID: EQ-551, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-496, Status: AVAILABLE", "EQ-3444");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3845");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2552", "EQ-2623", "EQ-41", "Equipment ID: EQ-3527, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2552");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3846");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        guest3.isapproved = false;
        java.lang.String str7 = guest3.password;
        java.lang.String str8 = guest3.password;
        java.lang.String str9 = guest3.getRegistrationId();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-36" + "'", str7, "EQ-36");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-36" + "'", str8, "EQ-36");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3847");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Student", "EQ-344");
        boolean boolean4 = guest3.isapproved;
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3848");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-4109", "Equipment ID: EQ-1992, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-94");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3849");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-3246, Name: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Description: EQ-120, Location: EQ-264, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3763, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3850");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getDescription();
        src.java.Arduino arduino9 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        src.java.Microscope microscope13 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus14 = null;
        microscope13.setStatus(equipmentStatus14);
        src.java.EquipmentStatus equipmentStatus16 = microscope13.getStatus();
        src.java.Microscope microscope20 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str21 = microscope20.getName();
        java.lang.String str22 = microscope20.getLocation();
        src.java.EquipmentStatus equipmentStatus23 = microscope20.getStatus();
        microscope13.setStatus(equipmentStatus23);
        arduino9.setStatus(equipmentStatus23);
        java.lang.String str26 = arduino9.getEquipmentId();
        src.java.Equipment equipment30 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str31 = equipment30.getEquipmentId();
        java.lang.String str32 = equipment30.getName();
        src.java.EquipmentStatus equipmentStatus33 = equipment30.getStatus();
        arduino9.setStatus(equipmentStatus33);
        equipment3.setStatus(equipmentStatus33);
        java.lang.String str36 = equipment3.toString();
        src.java.Arduino arduino40 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope44 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str45 = microscope44.getName();
        java.lang.String str46 = microscope44.getLocation();
        src.java.EquipmentStatus equipmentStatus47 = microscope44.getStatus();
        arduino40.setStatus(equipmentStatus47);
        equipment3.setStatus(equipmentStatus47);
        java.lang.String str50 = equipment3.getEquipmentId();
        src.java.Microscope microscope54 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str55 = microscope54.getDescription();
        java.lang.String str56 = microscope54.getLocation();
        java.lang.String str57 = microscope54.getName();
        src.java.Microscope microscope61 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        boolean boolean64 = microscope61.isAvailable(localDateTime62, localDateTime63);
        src.java.EquipmentStatus equipmentStatus65 = microscope61.getStatus();
        microscope54.setStatus(equipmentStatus65);
        src.java.EquipmentStatus equipmentStatus67 = microscope54.getStatus();
        src.java.EquipmentStatus equipmentStatus68 = microscope54.getStatus();
        src.java.EquipmentStatus equipmentStatus69 = microscope54.getStatus();
        equipment3.setStatus(equipmentStatus69);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "65) test3850(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-4137" + "'", str26, "EQ-4137");
// flaky "23) test3850(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-4140" + "'", str31, "EQ-4140");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EQ-94" + "'", str32, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "5) test3850(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equipment ID: EQ-4136, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str36, "Equipment ID: EQ-4136, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "1) test3850(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EQ-4136" + "'", str50, "EQ-4136");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "COORD-001" + "'", str55, "COORD-001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str56, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Guest" + "'", str57, "Guest");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus65 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus65.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus67 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus67.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus68 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus68.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus69 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus69.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3851");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-114", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Faculty");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Faculty", "MANAGER-66180900", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-39");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3416, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-389", "EQ-114");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNotNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3852");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3853");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        labManager10.password = "EQ-301";
        java.lang.String str13 = labManager10.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-301" + "'", str13, "EQ-301");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3854");
        src.java.Student student3 = new src.java.Student("EQ-1192", "EQ-655", "EQ-615");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = true;
        boolean boolean7 = student3.needsapproval;
        double double8 = student3.getHourlyRate();
        student3.username = "Equipment ID: EQ-2527, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3855");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236", "MANAGER-66180900");
        java.lang.String str4 = faculty3.username;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getRegistrationId();
        faculty3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MANAGER-66180900" + "'", str6, "MANAGER-66180900");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3856");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty", "COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("EQ-98", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("Student", "EQ-578", "EQ-275", "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("EQ-461", "EQ-859", "Equipment ID: EQ-3106, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-2113");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNotNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3857");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("MANAGER-103232", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1534", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("EQ-496", "Equipment ID: EQ-1769, Name: EQ-368, Description: EQ-118, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-1412, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-382");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-603", "EQ-869", "Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3858");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Researcher", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getLocation();
        java.lang.String str6 = arduino3.toString();
// flaky "66) test3858(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4147" + "'", str4, "EQ-4147");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
// flaky "24) test3858(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4147, Name: , Description: Researcher, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4147, Name: , Description: Researcher, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3859");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-3978, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "", "EQ-4070");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3860");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        headLabCoordinator0.password = "EQ-355";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-2112", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3861");
        src.java.Student student3 = new src.java.Student("EQ-152", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-758");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3862");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.username;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3863");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("Lab Manager", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-341");
        src.java.UserAccounts userAccounts20 = userFactory0.createUser("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "", "EQ-1874", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3864");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3865");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-698", "EQ-507", "");
        java.lang.String str4 = faculty3.getAccountType();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3866");
        src.java.Guest guest3 = new src.java.Guest("EQ-442", "EQ-476", "");
        java.lang.String str4 = guest3.username;
        java.lang.String str5 = guest3.username;
        java.lang.String str6 = guest3.username;
        java.lang.String str7 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-442" + "'", str4, "EQ-442");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-442" + "'", str5, "EQ-442");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-442" + "'", str6, "EQ-442");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-442" + "'", str7, "EQ-442");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3867");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.isapproved = false;
        java.lang.String str11 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3868");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-367");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "67) test3868(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4152, Name: Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Location: EQ-367, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-4152, Name: Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Location: EQ-367, Status: AVAILABLE");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3869");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.isapproved = true;
        java.lang.String str12 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-355" + "'", str12, "EQ-355");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3870");
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
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3871");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        boolean boolean6 = researcher3.isapproved;
        researcher3.needsapproval = false;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3872");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("EQ-253", "EQ-835", "EQ-1739", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        src.java.UserAccounts userAccounts20 = userFactory0.createUser("Equipment ID: EQ-3957, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1412, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-3105, Name: EQ-778, Description: EQ-2498, Location: EQ-231, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3873");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass10 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-355" + "'", str1, "EQ-355");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3874");
        src.java.Student student3 = new src.java.Student("EQ-4140", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3875");
        src.java.Student student3 = new src.java.Student("EQ-1419", "EQ-2819", "Equipment ID: EQ-1079, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3876");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str11 = labManager10.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-36" + "'", str11, "EQ-36");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3877");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-253");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-284", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null", "EQ-3775", "EQ-3556", "EQ-1707");
        src.java.UserAccounts userAccounts40 = userFactory0.createUser("Equipment ID: EQ-3156, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3962, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3878");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2497, Name: , Description: , Location: , Status: null", "EQ-1794", "EQ-1911");
        researcher3.needsapproval = true;
        researcher3.isapproved = false;
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3879");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2101", "EQ-1430", "");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3880");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1121, Name: , Description: , Location: , Status: null");
        researcher3.needsapproval = true;
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3881");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null", "EQ-735", "EQ-2562", "Equipment ID: EQ-2903, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3882");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.password = "EQ-1150";
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3883");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        labManager3.needsapproval = false;
        labManager3.username = "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        boolean boolean11 = labManager3.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3884");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isapproved;
        java.lang.String str7 = faculty3.password;
        java.lang.String str8 = faculty3.password;
        java.lang.String str9 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-193" + "'", str4, "EQ-193");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-99" + "'", str9, "EQ-99");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3885");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-392", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str8 = equipment7.getDescription();
        java.lang.String str9 = equipment7.getDescription();
        src.java.Arduino arduino13 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        src.java.Microscope microscope17 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus18 = null;
        microscope17.setStatus(equipmentStatus18);
        src.java.EquipmentStatus equipmentStatus20 = microscope17.getStatus();
        src.java.Microscope microscope24 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str25 = microscope24.getName();
        java.lang.String str26 = microscope24.getLocation();
        src.java.EquipmentStatus equipmentStatus27 = microscope24.getStatus();
        microscope17.setStatus(equipmentStatus27);
        arduino13.setStatus(equipmentStatus27);
        java.lang.String str30 = arduino13.getEquipmentId();
        src.java.Equipment equipment34 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str35 = equipment34.getEquipmentId();
        java.lang.String str36 = equipment34.getName();
        src.java.EquipmentStatus equipmentStatus37 = equipment34.getStatus();
        arduino13.setStatus(equipmentStatus37);
        equipment7.setStatus(equipmentStatus37);
        java.lang.String str40 = equipment7.toString();
        src.java.Arduino arduino44 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope48 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str49 = microscope48.getName();
        java.lang.String str50 = microscope48.getLocation();
        src.java.EquipmentStatus equipmentStatus51 = microscope48.getStatus();
        arduino44.setStatus(equipmentStatus51);
        equipment7.setStatus(equipmentStatus51);
        microscope3.setStatus(equipmentStatus51);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MasterAdmin123!" + "'", str8, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MasterAdmin123!" + "'", str9, "MasterAdmin123!");
        org.junit.Assert.assertNull(equipmentStatus20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "68) test3885(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EQ-4156" + "'", str30, "EQ-4156");
// flaky "25) test3885(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EQ-4159" + "'", str35, "EQ-4159");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EQ-94" + "'", str36, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "6) test3885(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equipment ID: EQ-4155, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str40, "Equipment ID: EQ-4155, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus51 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus51.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3886");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-616", "EQ-361", "EQ-1501");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3887");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1341");
        guest3.username = "EQ-4099";
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3888");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = labManager9.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lab Manager" + "'", str10, "Lab Manager");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3889");
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
        src.java.EquipmentStatus equipmentStatus23 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3890");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        java.lang.String str10 = guest3.username;
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3891");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2104", "EQ-1922");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3892");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1909", "Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null", "EQ-1313");
        java.lang.String str4 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1313" + "'", str4, "EQ-1313");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3893");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-586", "EQ-2532", "Equipment ID: EQ-1887, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        researcher3.isapproved = true;
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3894");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.lang.String str12 = microscope3.toString();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope3.isAvailable(localDateTime13, localDateTime14);
        java.lang.Class<?> wildcardClass16 = microscope3.getClass();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "69) test3894(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4167, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-4167, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "26) test3894(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-4167, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-4167, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3895");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        double double6 = headLabCoordinator0.getHourlyRate();
        boolean boolean7 = headLabCoordinator0.isapproved;
        boolean boolean8 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3896");
        src.java.Equipment equipment3 = new src.java.Equipment("Student", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-246");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3897");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-603", "Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null", "MANAGER-824727143");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3898");
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
        headLabCoordinator0.username = "EQ-120";
        java.lang.String str22 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Researcher" + "'", str2, "Researcher");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Head Lab Coordinator" + "'", str19, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "COORD-001" + "'", str22, "COORD-001");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3899");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        headLabCoordinator0.password = "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null";
        java.lang.String str18 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3900");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-489", "EQ-602", "EQ-419");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3901");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.isapproved = true;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        student3.isapproved = false;
        boolean boolean13 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3902");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1419", "EQ-3943");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3903");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.password;
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3904");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2894, Name: Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Status: AVAILABLE", "EQ-2527", "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3905");
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
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope3.isAvailable(localDateTime18, localDateTime19);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "70) test3905(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4175, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-4175, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3906");
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
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = arduino3.isAvailable(localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = arduino3.isAvailable(localDateTime17, localDateTime18);
        java.lang.String str20 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus21 = arduino3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "71) test3906(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4176" + "'", str8, "EQ-4176");
// flaky "27) test3906(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4176" + "'", str9, "EQ-4176");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus21);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3907");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-814");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.username;
        java.lang.Class<?> wildcardClass6 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3908");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        labManager3.username = "EQ-104";
        java.lang.String str6 = labManager3.username;
        java.lang.String str7 = labManager3.getAccountType();
        labManager3.username = "Equipment ID: EQ-1242, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-104" + "'", str6, "EQ-104");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab Manager" + "'", str7, "Lab Manager");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3909");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3516, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-4156");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3910");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        boolean boolean7 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str11 = labManager10.getAccountType();
        labManager10.password = "Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null";
        labManager10.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab Manager" + "'", str11, "Lab Manager");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3911");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getLocation();
        java.lang.String str6 = arduino3.toString();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "72) test3911(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4177, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4177, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3912");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = arduino3.toString();
        java.lang.String str11 = arduino3.getName();
        java.lang.String str12 = arduino3.getName();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "73) test3912(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4178, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str10, "Equipment ID: EQ-4178, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3913");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean6 = labManager5.needsapproval;
        labManager5.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3914");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2347", "EQ-2409", "Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2347");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3915");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2052", "EQ-2228", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
        faculty3.needsapproval = true;
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3916");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-862", "EQ-862");
        java.lang.String str4 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-862" + "'", str4, "EQ-862");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3917");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-528", "EQ-413", "Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3918");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-3456, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-1475, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1826");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3919");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str15 = headLabCoordinator0.password;
        java.lang.Class<?> wildcardClass16 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3920");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3921");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-596", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = arduino3.isAvailable(localDateTime8, localDateTime9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-596" + "'", str4, "EQ-596");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-596" + "'", str5, "EQ-596");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3922");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.lang.String str12 = microscope3.getEquipmentId();
        java.lang.String str13 = microscope3.getEquipmentId();
        java.lang.String str14 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "74) test3922(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-4190" + "'", str12, "EQ-4190");
// flaky "28) test3922(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-4190" + "'", str13, "EQ-4190");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3923");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2416", "EQ-3321", "EQ-3614");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3924");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        headLabCoordinator0.isapproved = false;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "MANAGER-214492645");
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3925");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getRegistrationId();
        guest3.needsapproval = true;
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3926");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-1163", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1163" + "'", str4, "EQ-1163");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1163" + "'", str5, "EQ-1163");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3927");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getDescription();
        java.lang.String str6 = equipment3.getDescription();
        src.java.EquipmentStatus equipmentStatus7 = equipment3.getStatus();
        src.java.Arduino arduino11 = new src.java.Arduino("EQ-99", "EQ-74", "Researcher");
        src.java.EquipmentStatus equipmentStatus12 = arduino11.getStatus();
        src.java.Microscope microscope16 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str17 = microscope16.getName();
        java.lang.String str18 = microscope16.getLocation();
        java.lang.String str19 = microscope16.getName();
        java.lang.String str20 = microscope16.getName();
        src.java.Microscope microscope24 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus25 = null;
        microscope24.setStatus(equipmentStatus25);
        src.java.EquipmentStatus equipmentStatus27 = null;
        microscope24.setStatus(equipmentStatus27);
        java.lang.String str29 = microscope24.getName();
        src.java.Arduino arduino33 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope37 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str38 = microscope37.getName();
        java.lang.String str39 = microscope37.getLocation();
        src.java.EquipmentStatus equipmentStatus40 = microscope37.getStatus();
        arduino33.setStatus(equipmentStatus40);
        microscope24.setStatus(equipmentStatus40);
        microscope16.setStatus(equipmentStatus40);
        arduino11.setStatus(equipmentStatus40);
        equipment3.setStatus(equipmentStatus40);
// flaky "75) test3927(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4193" + "'", str4, "EQ-4193");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus40 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus40.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3928");
        src.java.Student student3 = new src.java.Student("EQ-2473", "Equipment ID: EQ-3036, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3929");
        src.java.Guest guest3 = new src.java.Guest("EQ-431", "EQ-344", "EQ-149");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        java.lang.Class<?> wildcardClass6 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-344" + "'", str5, "EQ-344");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3930");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2399", "EQ-2399", "EQ-1665");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3931");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = userAccounts5.password;
        java.lang.String str7 = userAccounts5.getAccountType();
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3932");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        java.lang.String str4 = headLabCoordinator0.username;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean8 = labManager7.needsapproval;
        labManager7.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3933");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        faculty3.needsapproval = false;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3934");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        java.lang.String str11 = microscope3.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3935");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1420, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "76) test3935(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4201" + "'", str4, "EQ-4201");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3936");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-413", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean16 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
// flaky "77) test3936(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3937");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = equipment3.toString();
        java.lang.String str5 = equipment3.getName();
// flaky "78) test3937(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4202, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4202, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3938");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-778", "Equipment ID: EQ-2914, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1310");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3939");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.getLocation();
        java.lang.String str11 = microscope3.getLocation();
// flaky "79) test3939(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4203, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4203, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "29) test3939(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4203, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4203, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3940");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-259", "EQ-514", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "EQ-242", "EQ-149");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-2683, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null", "EQ-1965", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3941");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getDescription();
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.getName();
        java.lang.String str12 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3942");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null", "", "EQ-2836");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3943");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-120", "EQ-1891", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3944");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.username;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3516, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-4017, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Researcher" + "'", str3, "Researcher");
// flaky "80) test3944(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3945");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-2558, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3946");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        double double7 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-3310", "MANAGER-103232");
        java.lang.String str11 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3947");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-4167, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3948");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.getDescription();
// flaky "81) test3948(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4208" + "'", str4, "EQ-4208");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str6, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3949");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-179", "EQ-764");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3950");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-760", "Equipment ID: EQ-713, Name: , Description: , Location: , Status: null", "EQ-3080");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3951");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-114", "Researcher", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-1242", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-1340");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-3527, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-1413, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3952");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getRegistrationId();
        boolean boolean10 = faculty3.needsapproval;
        faculty3.password = "EQ-3750";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-41" + "'", str9, "EQ-41");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3953");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3954");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "EQ-281");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        java.lang.String str6 = microscope3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-507" + "'", str6, "EQ-507");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3955");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3956");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getRegistrationId();
        researcher3.needsapproval = false;
        researcher3.username = "EQ-390";
        double double13 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3957");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("EQ-2808", "EQ-253");
        src.java.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("EQ-2915", "EQ-3145");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNotNull(labManager20);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3958");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-719", "EQ-120", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-3145", "Equipment ID: EQ-2817, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-640", "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-687", "EQ-1762", "EQ-1899", "EQ-3029");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3959");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-389", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        faculty3.username = "EQ-427";
        faculty3.isapproved = true;
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3960");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-685", "EQ-435");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-685" + "'", str4, "EQ-685");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3961");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-3177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2485, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3962");
        src.java.Equipment equipment3 = new src.java.Equipment("COORD-001", "EQ-193", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        src.java.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-193" + "'", str4, "EQ-193");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3963");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.username;
        boolean boolean4 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3326, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
// flaky "82) test3963(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3964");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        src.java.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "EQ-1162");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("EQ-2149", "Equipment ID: EQ-2742, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2931, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-4033");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3965");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        java.lang.String str13 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = true;
        src.java.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("EQ-565", "Equipment ID: EQ-2813, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "83) test3965(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
// flaky "30) test3965(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "7) test3965(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3966");
        src.java.Guest guest3 = new src.java.Guest("EQ-1526", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3043, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3967");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean13 = labManager12.isapproved;
        java.lang.Class<?> wildcardClass14 = labManager12.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3968");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        boolean boolean4 = guest3.isapproved;
        guest3.username = "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        guest3.username = "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null";
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3969");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3970");
        src.java.Student student3 = new src.java.Student("EQ-1192", "EQ-655", "EQ-615");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = true;
        boolean boolean7 = student3.needsapproval;
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3971");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.Class<?> wildcardClass6 = microscope3.getClass();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3972");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        java.lang.String str9 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3973");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        java.lang.String str6 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "84) test3973(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
// flaky "31) test3973(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3974");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE", "EQ-2536", "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3975");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-826", "EQ-1163", "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3976");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-2317");
        labManager12.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3977");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.getName();
        src.java.Equipment equipment15 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str16 = equipment15.getName();
        src.java.EquipmentStatus equipmentStatus17 = equipment15.getStatus();
        microscope3.setStatus(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-71" + "'", str16, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3978");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null", "EQ-2423", "Equipment ID: EQ-1945, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3979");
        src.java.Student student3 = new src.java.Student("EQ-514", "EQ-616", "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        boolean boolean7 = student3.isapproved;
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3980");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3201, Name: , Description: , Location: , Status: null", "EQ-550");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3981");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-222", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-583", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-104");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-1637", "EQ-863", "EQ-1162");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-1572", "Equipment ID: EQ-2967, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-3522, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-4109, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3982");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1973", "EQ-859", "EQ-1583", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1973");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3983");
        src.java.Faculty faculty3 = new src.java.Faculty("MANAGER-66180900", "", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.password = "Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3984");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str16 = headLabCoordinator0.username;
        boolean boolean17 = headLabCoordinator0.isapproved;
        boolean boolean18 = headLabCoordinator0.needsapproval;
        double double19 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3985");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3986");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3987");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-4043", "", "EQ-2708");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3988");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null", "");
        src.java.Microscope microscope7 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        src.java.EquipmentStatus equipmentStatus11 = null;
        microscope7.setStatus(equipmentStatus11);
        java.lang.String str13 = microscope7.getName();
        java.lang.String str14 = microscope7.getEquipmentId();
        java.lang.String str15 = microscope7.getLocation();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = microscope7.isAvailable(localDateTime16, localDateTime17);
        java.lang.String str19 = microscope7.getLocation();
        java.lang.String str20 = microscope7.getLocation();
        java.lang.String str21 = microscope7.toString();
        java.lang.String str22 = microscope7.getLocation();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = microscope7.isAvailable(localDateTime23, localDateTime24);
        java.lang.String str26 = microscope7.getEquipmentId();
        src.java.Microscope microscope30 = new src.java.Microscope("EQ-446", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus31 = microscope30.getStatus();
        microscope7.setStatus(equipmentStatus31);
        equipment3.setStatus(equipmentStatus31);
        java.lang.String str34 = equipment3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "85) test3988(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-4226" + "'", str14, "EQ-4226");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky "32) test3988(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-4226, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-4226, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "8) test3988(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-4226" + "'", str26, "EQ-4226");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3989");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str4 = arduino3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3990");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3991");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null", "", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-3132", "EQ-390");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3992");
        src.java.Guest guest3 = new src.java.Guest("EQ-1910", "EQ-4044", "Equipment ID: EQ-1501, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3993");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.password;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double8 = labManager7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3994");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-1493", "Equipment ID: EQ-3104, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3995");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1919", "EQ-1899", "EQ-2020", "EQ-1476");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1919");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3996");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-2497, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null", "EQ-2861");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3997");
        src.java.Faculty faculty3 = new src.java.Faculty("", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-41");
        faculty3.password = "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str6 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3998");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        labManager10.password = "EQ-301";
        boolean boolean13 = labManager10.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test3999");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str10 = guest3.password;
        java.lang.String str11 = guest3.getAccountType();
        guest3.isapproved = false;
        guest3.needsapproval = false;
        java.lang.String str16 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str16, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest7.test4000");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null", "EQ-1557");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "86) test4000(src.test.randoop.AleenaTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4231" + "'", str4, "EQ-4231");
    }
}
