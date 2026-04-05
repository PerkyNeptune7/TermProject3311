package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4001");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        boolean boolean4 = labManager3.needsapproval;
        double double5 = labManager3.getHourlyRate();
        java.lang.String str6 = labManager3.getAccountType();
        java.lang.String str7 = labManager3.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lab Manager" + "'", str6, "Lab Manager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MANAGER-1023477660" + "'", str7, "MANAGER-1023477660");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4002");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        app.Microscope microscope10 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str11 = microscope10.getName();
        java.lang.String str12 = microscope10.getName();
        java.lang.String str13 = microscope10.getLocation();
        app.Equipment equipment17 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino21 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope25 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str26 = microscope25.getName();
        java.lang.String str27 = microscope25.getLocation();
        app.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        arduino21.setStatus(equipmentStatus28);
        equipment17.setStatus(equipmentStatus28);
        microscope10.setStatus(equipmentStatus28);
        microscope3.setStatus(equipmentStatus28);
        app.EquipmentStatus equipmentStatus33 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4003");
        app.Researcher researcher3 = new app.Researcher("EQ-1874", "EQ-3615", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4004");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getName();
        app.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-104" + "'", str5, "EQ-104");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-104" + "'", str7, "EQ-104");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4005");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2906", "EQ-982", "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-1166");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2906");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4006");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.lang.String str12 = microscope3.getLocation();
        java.lang.String str13 = microscope3.getLocation();
        java.lang.String str14 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "1) test4006(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4238, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-4238, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4007");
        app.Microscope microscope3 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        app.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        java.lang.String str8 = microscope3.getEquipmentId();
        app.Microscope microscope12 = new app.Microscope("", "hi!", "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE");
        app.Microscope microscope16 = new app.Microscope("EQ-99", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-325");
        app.EquipmentStatus equipmentStatus17 = microscope16.getStatus();
        microscope12.setStatus(equipmentStatus17);
        microscope3.setStatus(equipmentStatus17);
        java.lang.String str20 = microscope3.toString();
        java.lang.String str21 = microscope3.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
// flaky "2) test4007(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4239" + "'", str8, "EQ-4239");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
// flaky "1) test4007(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment ID: EQ-4239, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str20, "Equipment ID: EQ-4239, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4008");
        app.Arduino arduino3 = new app.Arduino("EQ-2273", "COORD-001", "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4009");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.username = "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null";
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-2906", "Equipment ID: EQ-3105, Name: EQ-778, Description: EQ-2498, Location: EQ-231, Status: AVAILABLE");
        java.lang.String str7 = labManager6.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "3) test4009(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab Manager" + "'", str7, "Lab Manager");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4010");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.password;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4011");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-368", "EQ-859");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-859" + "'", str4, "EQ-859");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4012");
        app.Arduino arduino3 = new app.Arduino("EQ-284", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Lab Manager");
        java.lang.Class<?> wildcardClass4 = arduino3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4013");
        app.Arduino arduino3 = new app.Arduino("EQ-3628", "EQ-558", "EQ-1419");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "4) test4013(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4244" + "'", str4, "EQ-4244");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4014");
        app.Faculty faculty3 = new app.Faculty("", "Equipment ID: EQ-2163, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2499, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4015");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-603");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4016");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-4001, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "", "EQ-2469");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4017");
        app.Microscope microscope3 = new app.Microscope("EQ-590", "EQ-684", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4018");
        app.Guest guest3 = new app.Guest("Head Lab Coordinator", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.password = "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        guest3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4019");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1098");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "5) test4019(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4246" + "'", str4, "EQ-4246");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4020");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.username = "EQ-1900";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4021");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        app.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4022");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-469", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-539", "EQ-344", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-387", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-1218", "EQ-2272", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-2142", "Equipment ID: EQ-1718, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-2755", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null", "EQ-2053");
        app.UserAccounts userAccounts35 = userFactory0.createUser("EQ-731", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1321");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts35);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4023");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        double double15 = headLabCoordinator0.getHourlyRate();
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        java.lang.String str17 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4024");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.password = "EQ-120";
        researcher3.username = "EQ-1050";
        java.lang.String str11 = researcher3.password;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-120" + "'", str11, "EQ-120");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4025");
        app.Guest guest3 = new app.Guest("EQ-1223", "EQ-2537", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4026");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        headLabCoordinator0.username = "";
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-2532");
        boolean boolean14 = labManager13.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4027");
        app.Equipment equipment3 = new app.Equipment("EQ-1543", "EQ-3238", "EQ-2591");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4028");
        app.Microscope microscope3 = new app.Microscope("EQ-2945", "Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null", "EQ-2137");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4029");
        app.Equipment equipment3 = new app.Equipment("EQ-264", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Guest");
        java.lang.String str4 = equipment3.getDescription();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4030");
        app.Researcher researcher3 = new app.Researcher("Head Lab Coordinator", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.isapproved = true;
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4031");
        app.Faculty faculty3 = new app.Faculty("EQ-389", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        faculty3.username = "EQ-427";
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4032");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.needsapproval = false;
        java.lang.String str12 = guest3.getAccountType();
        java.lang.String str13 = guest3.getRegistrationId();
        java.lang.String str14 = guest3.getAccountType();
        java.lang.String str15 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4033");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4034");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        double double4 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-1005");
        labManager9.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4035");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        student3.needsapproval = true;
        student3.username = "EQ-2299";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4036");
        app.Researcher researcher3 = new app.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.password = "Equipment ID: EQ-1632, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4037");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("EQ-665", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2167, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        app.UserAccounts userAccounts28 = userFactory0.createUser("Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-3669", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3779, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4038");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        app.EquipmentStatus equipmentStatus8 = null;
        microscope3.setStatus(equipmentStatus8);
        java.lang.String str10 = microscope3.getName();
        app.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        java.lang.String str12 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope3.isAvailable(localDateTime13, localDateTime14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4039");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2104", "Equipment ID: EQ-3243, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-3495");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4040");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-442", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-442" + "'", str4, "EQ-442");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4041");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-1102");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        app.Equipment equipment10 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str11 = equipment10.getLocation();
        java.lang.String str12 = equipment10.getName();
        app.EquipmentStatus equipmentStatus13 = equipment10.getStatus();
        equipment3.setStatus(equipmentStatus13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4042");
        app.Equipment equipment3 = new app.Equipment("EQ-843", "EQ-2915", "EQ-865");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4043");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1453", "Equipment ID: EQ-1448, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-931", "EQ-473");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1453");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4044");
        app.Researcher researcher3 = new app.Researcher("EQ-36", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Faculty");
        double double4 = researcher3.getHourlyRate();
        researcher3.password = "EQ-246";
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4045");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.Microscope microscope9 = new app.Microscope("EQ-446", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus10 = microscope9.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getDescription();
        app.Microscope microscope16 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus17 = null;
        microscope16.setStatus(equipmentStatus17);
        app.EquipmentStatus equipmentStatus19 = null;
        microscope16.setStatus(equipmentStatus19);
        java.lang.String str21 = microscope16.getName();
        java.lang.String str22 = microscope16.getName();
        java.lang.String str23 = microscope16.getName();
        app.Microscope microscope27 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus28 = null;
        microscope27.setStatus(equipmentStatus28);
        app.EquipmentStatus equipmentStatus30 = microscope27.getStatus();
        app.Microscope microscope34 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str35 = microscope34.getName();
        java.lang.String str36 = microscope34.getLocation();
        app.EquipmentStatus equipmentStatus37 = microscope34.getStatus();
        microscope27.setStatus(equipmentStatus37);
        microscope16.setStatus(equipmentStatus37);
        app.EquipmentStatus equipmentStatus40 = microscope16.getStatus();
        arduino3.setStatus(equipmentStatus40);
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(equipmentStatus30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus40 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus40.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4046");
        app.Guest guest3 = new app.Guest("EQ-2149", "EQ-1969", "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.password = "";
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4047");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getName();
        app.Microscope microscope11 = new app.Microscope("EQ-470", "EQ-431", "EQ-253");
        app.Microscope microscope15 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str16 = microscope15.getName();
        java.lang.String str17 = microscope15.getLocation();
        app.EquipmentStatus equipmentStatus18 = microscope15.getStatus();
        app.Arduino arduino22 = new app.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.Microscope microscope26 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str27 = microscope26.toString();
        java.lang.String str28 = microscope26.toString();
        app.EquipmentStatus equipmentStatus29 = null;
        microscope26.setStatus(equipmentStatus29);
        java.lang.String str31 = microscope26.getName();
        app.Microscope microscope35 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str36 = microscope35.getName();
        app.EquipmentStatus equipmentStatus37 = microscope35.getStatus();
        microscope26.setStatus(equipmentStatus37);
        app.Microscope microscope42 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str43 = microscope42.getName();
        java.lang.String str44 = microscope42.getLocation();
        java.lang.String str45 = microscope42.getName();
        java.lang.String str46 = microscope42.getName();
        app.Microscope microscope50 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus51 = null;
        microscope50.setStatus(equipmentStatus51);
        app.EquipmentStatus equipmentStatus53 = null;
        microscope50.setStatus(equipmentStatus53);
        java.lang.String str55 = microscope50.getName();
        app.Arduino arduino59 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope63 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str64 = microscope63.getName();
        java.lang.String str65 = microscope63.getLocation();
        app.EquipmentStatus equipmentStatus66 = microscope63.getStatus();
        arduino59.setStatus(equipmentStatus66);
        microscope50.setStatus(equipmentStatus66);
        microscope42.setStatus(equipmentStatus66);
        microscope26.setStatus(equipmentStatus66);
        arduino22.setStatus(equipmentStatus66);
        microscope15.setStatus(equipmentStatus66);
        microscope11.setStatus(equipmentStatus66);
        microscope3.setStatus(equipmentStatus66);
        java.lang.String str75 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
// flaky "6) test4047(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equipment ID: EQ-4268, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str27, "Equipment ID: EQ-4268, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "2) test4047(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equipment ID: EQ-4268, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str28, "Equipment ID: EQ-4268, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Head Lab Coordinator" + "'", str31, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Guest" + "'", str36, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus66 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus66.equals(app.EquipmentStatus.AVAILABLE));
// flaky "1) test4047(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "EQ-4264" + "'", str75, "EQ-4264");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4048");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4049");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str13 = labManager12.password;
        labManager12.needsapproval = false;
        labManager12.username = "EQ-361";
        labManager12.username = "EQ-503";
        labManager12.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4050");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = false;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        app.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-1784", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
        app.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager22 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4202, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-2682");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNotNull(labManager22);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4051");
        app.Faculty faculty3 = new app.Faculty("EQ-1396", "Equipment ID: EQ-2454, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        faculty3.username = "Equipment ID: EQ-3980, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4052");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-946", "EQ-1973", "Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-946");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4053");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2995", "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2299", "EQ-977");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2995");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4054");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-603");
        double double4 = researcher3.getHourlyRate();
        double double5 = researcher3.getHourlyRate();
        researcher3.isapproved = false;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4055");
        app.Guest guest3 = new app.Guest("MANAGER-1087176903", "EQ-92", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE");
        guest3.password = "Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4056");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "EQ-41", "EQ-149");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-41" + "'", str4, "EQ-41");
// flaky "7) test4056(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4275" + "'", str5, "EQ-4275");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4057");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-106", "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4058");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4059");
        app.Student student3 = new app.Student("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3095, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-3119");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4060");
        app.Microscope microscope3 = new app.Microscope("EQ-4190", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1808, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4061");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4062");
        app.Arduino arduino3 = new app.Arduino("MANAGER-214492645", "EQ-473", "EQ-640");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4063");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.username;
        java.lang.String str7 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4064");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3402, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-4043");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4065");
        app.Arduino arduino3 = new app.Arduino("EQ-1251", "EQ-1113", "EQ-565");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1113" + "'", str7, "EQ-1113");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4066");
        app.Guest guest3 = new app.Guest("EQ-361", "EQ-461", "EQ-466");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4067");
        app.Student student3 = new app.Student("EQ-3518", "Equipment ID: EQ-2446, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-4109");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4068");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3445", "Equipment ID: EQ-1685, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4069");
        app.Equipment equipment3 = new app.Equipment("EQ-114", "EQ-301", "EQ-94");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "8) test4069(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4280" + "'", str4, "EQ-4280");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4070");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        researcher3.password = "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4071");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
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
        java.lang.String str17 = arduino3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "9) test4071(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4281" + "'", str8, "EQ-4281");
// flaky "3) test4071(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4281" + "'", str9, "EQ-4281");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4072");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        labManager5.isapproved = false;
        java.lang.String str10 = labManager5.getAccountType();
        double double11 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lab Manager" + "'", str10, "Lab Manager");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4073");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-923", "COORD-001");
        researcher3.isapproved = false;
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4074");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getName();
        app.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = equipment3.getDescription();
        app.EquipmentStatus equipmentStatus11 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4075");
        app.Student student3 = new app.Student("EQ-1179", "EQ-1000", "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1179" + "'", str4, "EQ-1179");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4076");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts21 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-1000", "EQ-627", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts30 = userFactory0.createUser("EQ-3954", "Equipment ID: EQ-3326, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "MANAGER-1326009150");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4077");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2533, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4078");
        app.Researcher researcher3 = new app.Researcher("EQ-1618", "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-2928, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        researcher3.password = "";
        researcher3.isapproved = false;
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4079");
        app.Student student3 = new app.Student("EQ-258", "EQ-92", "EQ-299");
        boolean boolean4 = student3.isapproved;
        java.lang.String str5 = student3.getAccountType();
        student3.isapproved = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4080");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str6, "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4081");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-3144", "EQ-3097", "EQ-3659", "Equipment ID: EQ-3806, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-3144");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4082");
        app.Faculty faculty3 = new app.Faculty("EQ-976", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3953, Name: EQ-104, Description: , Location: EQ-367, Status: AVAILABLE");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4083");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        app.UserAccounts userAccounts30 = userFactory0.createUser("EQ-1608", "EQ-4013", "Equipment ID: EQ-3693, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4084");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getRegistrationId();
        java.lang.String str8 = researcher3.getAccountType();
        double double9 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4085");
        app.Microscope microscope3 = new app.Microscope("", "Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4086");
        app.Student student3 = new app.Student("EQ-1534", "EQ-2399", "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4087");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2204, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4088");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null", "EQ-735", "EQ-3297");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4089");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "EQ-742");
        boolean boolean16 = labManager15.needsapproval;
        labManager15.username = "EQ-1811";
        java.lang.String str19 = labManager15.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ-1811" + "'", str19, "EQ-1811");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4090");
        app.Student student3 = new app.Student("EQ-3512", "EQ-3614", "EQ-1805");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4091");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        double double4 = headLabCoordinator0.getHourlyRate();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4092");
        app.Guest guest3 = new app.Guest("EQ-361", "EQ-461", "EQ-466");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4093");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4094");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-99");
        boolean boolean10 = headLabCoordinator0.isapproved;
        java.lang.String str11 = headLabCoordinator0.username;
        java.lang.String str12 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4095");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "EQ-281");
        app.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        app.Arduino arduino8 = new app.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str9 = arduino8.toString();
        app.EquipmentStatus equipmentStatus10 = arduino8.getStatus();
        microscope3.setStatus(equipmentStatus10);
        app.EquipmentStatus equipmentStatus12 = microscope3.getStatus();
        java.lang.String str13 = microscope3.getDescription();
        java.lang.String str14 = microscope3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "10) test4095(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4287, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-4287, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-507" + "'", str13, "EQ-507");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-507" + "'", str14, "EQ-507");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4096");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3912, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3445", "EQ-476");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4097");
        app.Student student3 = new app.Student("Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE", "Equipment ID: EQ-1671, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4098");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4099");
        app.Arduino arduino3 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getDescription();
        java.lang.String str13 = arduino3.getLocation();
        app.EquipmentStatus equipmentStatus14 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4100");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.username;
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.password;
        java.lang.String str10 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MasterAdmin123!" + "'", str10, "MasterAdmin123!");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4101");
        app.Faculty faculty3 = new app.Faculty("EQ-461", "EQ-304", "EQ-231");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4102");
        app.Student student3 = new app.Student("EQ-684", "Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4103");
        app.Faculty faculty3 = new app.Faculty("EQ-1878", "EQ-623", "");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4104");
        app.Student student3 = new app.Student("EQ-603", "COORD-001", "EQ-422");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4105");
        app.Equipment equipment3 = new app.Equipment("", "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4106");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4107");
        app.Student student3 = new app.Student("EQ-325", "EQ-4226", "EQ-2149");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4108");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus10 = microscope3.getStatus();
        app.Arduino arduino14 = new app.Arduino("EQ-389", "EQ-536", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        app.Equipment equipment18 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str19 = equipment18.getLocation();
        java.lang.String str20 = equipment18.getName();
        java.lang.String str21 = equipment18.getName();
        app.EquipmentStatus equipmentStatus22 = equipment18.getStatus();
        arduino14.setStatus(equipmentStatus22);
        microscope3.setStatus(equipmentStatus22);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str19, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str20, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4109");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2473, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-778, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-1261", "Equipment ID: EQ-1800, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2473, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4110");
        app.Student student3 = new app.Student("EQ-390", "EQ-446", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.username = "EQ-1056";
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4111");
        app.Microscope microscope3 = new app.Microscope("EQ-623", "EQ-1491", "Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4112");
        app.Guest guest3 = new app.Guest("MANAGER-971154394", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2163, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-971154394" + "'", str4, "MANAGER-971154394");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4113");
        app.Guest guest3 = new app.Guest("", "EQ-4280", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4114");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null", "EQ-1970", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.toString();
// flaky "11) test4114(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4297, Name: Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null, Description: EQ-1970, Location: Equipment ID: EQ-432, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4297, Name: Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null, Description: EQ-1970, Location: Equipment ID: EQ-432, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4115");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-719", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "EQ-367");
        app.UserAccounts userAccounts36 = userFactory0.createUser("Researcher", "EQ-361", "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts40 = userFactory0.createUser("EQ-2385", "EQ-1528", "Equipment ID: EQ-1887, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts45 = userFactory0.createUser("EQ-392", "EQ-3055", "EQ-3119", "Equipment ID: EQ-1502, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNotNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
        org.junit.Assert.assertNull(userAccounts45);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4116");
        app.Equipment equipment3 = new app.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        app.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        app.Equipment equipment10 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        app.Microscope microscope14 = new app.Microscope("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-92", "EQ-276");
        app.Microscope microscope18 = new app.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str19 = microscope18.getEquipmentId();
        app.Arduino arduino23 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope27 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus28 = null;
        microscope27.setStatus(equipmentStatus28);
        app.EquipmentStatus equipmentStatus30 = microscope27.getStatus();
        app.Microscope microscope34 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str35 = microscope34.getName();
        java.lang.String str36 = microscope34.getLocation();
        app.EquipmentStatus equipmentStatus37 = microscope34.getStatus();
        microscope27.setStatus(equipmentStatus37);
        arduino23.setStatus(equipmentStatus37);
        java.lang.String str40 = arduino23.getEquipmentId();
        app.Equipment equipment44 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str45 = equipment44.getEquipmentId();
        java.lang.String str46 = equipment44.getName();
        app.EquipmentStatus equipmentStatus47 = equipment44.getStatus();
        arduino23.setStatus(equipmentStatus47);
        microscope18.setStatus(equipmentStatus47);
        java.lang.String str50 = microscope18.getLocation();
        java.lang.String str51 = microscope18.getEquipmentId();
        java.lang.String str52 = microscope18.getEquipmentId();
        app.Equipment equipment56 = new app.Equipment("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str57 = equipment56.getLocation();
        app.EquipmentStatus equipmentStatus58 = equipment56.getStatus();
        microscope18.setStatus(equipmentStatus58);
        microscope14.setStatus(equipmentStatus58);
        equipment10.setStatus(equipmentStatus58);
        equipment3.setStatus(equipmentStatus58);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
// flaky "12) test4116(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ-4302" + "'", str19, "EQ-4302");
        org.junit.Assert.assertNull(equipmentStatus30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(app.EquipmentStatus.AVAILABLE));
// flaky "4) test4116(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EQ-4303" + "'", str40, "EQ-4303");
// flaky "2) test4116(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EQ-4306" + "'", str45, "EQ-4306");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EQ-94" + "'", str46, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
// flaky "1) test4116(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EQ-4302" + "'", str51, "EQ-4302");
// flaky "1) test4116(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "EQ-4302" + "'", str52, "EQ-4302");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus58 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus58.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4117");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3662", "EQ-3600");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4118");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts19 = userFactory0.createUser("EQ-114", "EQ-179", "EQ-104", "EQ-222");
        app.UserAccounts userAccounts23 = userFactory0.createUser("EQ-2264", "Equipment ID: EQ-2162, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-1572");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4119");
        app.Faculty faculty3 = new app.Faculty("EQ-811", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4120");
        app.Student student3 = new app.Student("Equipment ID: EQ-211, Name: , Description: , Location: , Status: null", "Guest", "EQ-299");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4121");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.password;
        boolean boolean12 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4122");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1784, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3641", "Equipment ID: EQ-3755, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4123");
        app.Arduino arduino3 = new app.Arduino("", "EQ-826", "EQ-814");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getLocation();
        java.lang.String str6 = arduino3.getDescription();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-814" + "'", str5, "EQ-814");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-826" + "'", str6, "EQ-826");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4124");
        app.Researcher researcher3 = new app.Researcher("EQ-4017", "", "Equipment ID: EQ-4136, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4125");
        app.Student student3 = new app.Student("EQ-384", "EQ-655", "EQ-41");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4126");
        app.Arduino arduino3 = new app.Arduino("EQ-257", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-355");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.toString();
        java.lang.String str6 = arduino3.getName();
        java.lang.String str7 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-257" + "'", str4, "EQ-257");
// flaky "13) test4126(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4311, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4311, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-257" + "'", str6, "EQ-257");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-257" + "'", str7, "EQ-257");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4127");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        app.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-99", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null");
        java.lang.String str17 = headLabCoordinator0.password;
        double double18 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager21 = headLabCoordinator0.autoGenerateLabManager("EQ-99", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str22 = labManager21.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EQ-99" + "'", str22, "EQ-99");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4128");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4129");
        app.Student student3 = new app.Student("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Faculty");
        boolean boolean4 = student3.isapproved;
        boolean boolean5 = student3.isapproved;
        double double6 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4130");
        app.Guest guest3 = new app.Guest("", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        boolean boolean4 = guest3.isapproved;
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4131");
        app.Student student3 = new app.Student("COORD-001", "EQ-74", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4132");
        app.Researcher researcher3 = new app.Researcher("", "Guest", "MasterAdmin123!");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4133");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        double double11 = userAccounts10.getHourlyRate();
        userAccounts10.needsapproval = false;
        userAccounts10.needsapproval = false;
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4134");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "EQ-156");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4135");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4136");
        app.Equipment equipment3 = new app.Equipment("EQ-2846", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2905, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4137");
        app.Equipment equipment3 = new app.Equipment("EQ-1543", "Equipment ID: EQ-1437, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "14) test4137(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4315" + "'", str4, "EQ-4315");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4138");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getRegistrationId();
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4139");
        app.Guest guest3 = new app.Guest("EQ-1411", "Equipment ID: EQ-1685, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-104");
        java.lang.String str4 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-104" + "'", str4, "EQ-104");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4140");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        userAccounts27.isapproved = false;
        java.lang.String str30 = userAccounts27.getAccountType();
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Faculty" + "'", str30, "Faculty");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4141");
        app.Equipment equipment3 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.toString();
// flaky "15) test4141(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4316" + "'", str4, "EQ-4316");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
// flaky "5) test4141(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4316, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4316, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4142");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-211, Name: , Description: , Location: , Status: null", "EQ-344");
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        app.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3628");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4143");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getDescription();
        java.lang.String str6 = arduino3.toString();
        app.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "16) test4143(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4317, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4317, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4144");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1390, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE", "Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-565");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "17) test4144(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4318" + "'", str4, "EQ-4318");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4145");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        userAccounts16.isapproved = true;
        boolean boolean19 = userAccounts16.isapproved;
        double double20 = userAccounts16.getHourlyRate();
        userAccounts16.isapproved = false;
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4146");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts21 = userFactory0.createUser("EQ-299", "EQ-275", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4147");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1165", "Equipment ID: EQ-3356, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1165");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4148");
        app.Guest guest3 = new app.Guest("EQ-1670", "", "EQ-938");
        java.lang.String str4 = guest3.password;
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4149");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2566, Name: Equipment ID: EQ-232, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-193", "EQ-3349");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4150");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.username;
        headLabCoordinator0.password = "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3894, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2737");
        boolean boolean12 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4151");
        app.Faculty faculty3 = new app.Faculty("EQ-2873", "EQ-276", "Equipment ID: EQ-2892, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4152");
        app.Researcher researcher3 = new app.Researcher("EQ-2753", "EQ-569", "Equipment ID: EQ-2473, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4153");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        double double6 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4154");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-3358", "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4155");
        app.Microscope microscope3 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
// flaky "18) test4155(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4319" + "'", str5, "EQ-4319");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4156");
        app.Equipment equipment3 = new app.Equipment("EQ-1856", "EQ-1530", "EQ-976");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1856" + "'", str4, "EQ-1856");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4157");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-36", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-3806, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4158");
        app.Faculty faculty3 = new app.Faculty("Head Lab Coordinator", "EQ-92", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.isapproved = true;
        faculty3.password = "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        faculty3.password = "EQ-923";
        faculty3.password = "EQ-2354";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4159");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-296", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1432, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str19 = labManager18.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MANAGER-597445801" + "'", str19, "MANAGER-597445801");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4160");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3777", "Equipment ID: EQ-4001, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-814");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4161");
        app.Arduino arduino3 = new app.Arduino("EQ-355", "EQ-384", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.Class<?> wildcardClass5 = equipmentStatus4.getClass();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4162");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.toString();
        app.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "19) test4162(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4322, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4322, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4163");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4164");
        app.Guest guest3 = new app.Guest("EQ-2020", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1942, Name: EQ-826, Description: Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        boolean boolean4 = guest3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4165");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        java.lang.String str18 = microscope3.toString();
        app.Microscope microscope22 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus23 = null;
        microscope22.setStatus(equipmentStatus23);
        app.EquipmentStatus equipmentStatus25 = null;
        microscope22.setStatus(equipmentStatus25);
        java.lang.String str27 = microscope22.getName();
        app.Arduino arduino31 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope35 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str36 = microscope35.getName();
        java.lang.String str37 = microscope35.getLocation();
        app.EquipmentStatus equipmentStatus38 = microscope35.getStatus();
        arduino31.setStatus(equipmentStatus38);
        microscope22.setStatus(equipmentStatus38);
        java.lang.String str41 = microscope22.getLocation();
        app.EquipmentStatus equipmentStatus42 = microscope22.getStatus();
        microscope3.setStatus(equipmentStatus42);
        java.lang.Class<?> wildcardClass44 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "20) test4165(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4323, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-4323, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "6) test4165(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-4323, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-4323, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus42 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus42.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4166");
        app.Arduino arduino3 = new app.Arduino("Head Lab Coordinator", "COORD-001", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4167");
        app.Researcher researcher3 = new app.Researcher("EQ-36", "Student", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4168");
        app.Arduino arduino3 = new app.Arduino("", "EQ-36", "EQ-92");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        app.Microscope microscope8 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus9 = null;
        microscope8.setStatus(equipmentStatus9);
        app.EquipmentStatus equipmentStatus11 = microscope8.getStatus();
        java.lang.String str12 = microscope8.getLocation();
        java.lang.String str13 = microscope8.getName();
        app.Microscope microscope17 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope17.isAvailable(localDateTime18, localDateTime19);
        app.EquipmentStatus equipmentStatus21 = microscope17.getStatus();
        microscope8.setStatus(equipmentStatus21);
        app.EquipmentStatus equipmentStatus23 = microscope8.getStatus();
        app.EquipmentStatus equipmentStatus24 = microscope8.getStatus();
        arduino3.setStatus(equipmentStatus24);
        java.lang.Class<?> wildcardClass26 = equipmentStatus24.getClass();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4169");
        app.Student student3 = new app.Student("EQ-2378", "Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2206, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4170");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-435");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-473", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-205");
        app.UserAccounts userAccounts13 = userFactory0.createUser("EQ-773", "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2905, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4171");
        app.Arduino arduino3 = new app.Arduino("hi!", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.String str5 = arduino3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4172");
        app.Faculty faculty3 = new app.Faculty("", "Equipment ID: EQ-2489, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4173");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1942, Name: EQ-826, Description: Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-4109, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1080, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4174");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        headLabCoordinator0.username = "EQ-1592";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4175");
        app.Guest guest3 = new app.Guest("EQ-1313", "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-713, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4176");
        app.Student student3 = new app.Student("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE", "EQ-1618");
        boolean boolean4 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4177");
        app.Researcher researcher3 = new app.Researcher("EQ-2273", "Equipment ID: EQ-2546, Name: EQ-92, Description: EQ-1476, Location: Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4178");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1524", "Lab Manager", "EQ-4007");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4179");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-259", "EQ-4281", "Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1310");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-259");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4180");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "EQ-665", "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4181");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        app.Equipment equipment10 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str11 = equipment10.getDescription();
        java.lang.String str12 = equipment10.getDescription();
        app.Arduino arduino16 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope20 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus21 = null;
        microscope20.setStatus(equipmentStatus21);
        app.EquipmentStatus equipmentStatus23 = microscope20.getStatus();
        app.Microscope microscope27 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str28 = microscope27.getName();
        java.lang.String str29 = microscope27.getLocation();
        app.EquipmentStatus equipmentStatus30 = microscope27.getStatus();
        microscope20.setStatus(equipmentStatus30);
        arduino16.setStatus(equipmentStatus30);
        java.lang.String str33 = arduino16.getEquipmentId();
        app.Equipment equipment37 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str38 = equipment37.getEquipmentId();
        java.lang.String str39 = equipment37.getName();
        app.EquipmentStatus equipmentStatus40 = equipment37.getStatus();
        arduino16.setStatus(equipmentStatus40);
        equipment10.setStatus(equipmentStatus40);
        app.Microscope microscope46 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus47 = null;
        microscope46.setStatus(equipmentStatus47);
        app.EquipmentStatus equipmentStatus49 = null;
        microscope46.setStatus(equipmentStatus49);
        java.lang.String str51 = microscope46.getName();
        java.lang.String str52 = microscope46.getName();
        java.lang.String str53 = microscope46.getName();
        app.Microscope microscope57 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus58 = null;
        microscope57.setStatus(equipmentStatus58);
        app.EquipmentStatus equipmentStatus60 = microscope57.getStatus();
        app.Microscope microscope64 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str65 = microscope64.getName();
        java.lang.String str66 = microscope64.getLocation();
        app.EquipmentStatus equipmentStatus67 = microscope64.getStatus();
        microscope57.setStatus(equipmentStatus67);
        microscope46.setStatus(equipmentStatus67);
        app.EquipmentStatus equipmentStatus70 = microscope46.getStatus();
        equipment10.setStatus(equipmentStatus70);
        microscope3.setStatus(equipmentStatus70);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MasterAdmin123!" + "'", str11, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MasterAdmin123!" + "'", str12, "MasterAdmin123!");
        org.junit.Assert.assertNull(equipmentStatus23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus30 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus30.equals(app.EquipmentStatus.AVAILABLE));
// flaky "21) test4181(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EQ-4336" + "'", str33, "EQ-4336");
// flaky "7) test4181(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EQ-4339" + "'", str38, "EQ-4339");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EQ-94" + "'", str39, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus40 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus40.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(equipmentStatus60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus67 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus67.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus70 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus70.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4182");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2847, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "22) test4182(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4343" + "'", str4, "EQ-4343");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4183");
        app.Microscope microscope3 = new app.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str4 = microscope3.getEquipmentId();
        app.Arduino arduino8 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope12 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus13 = null;
        microscope12.setStatus(equipmentStatus13);
        app.EquipmentStatus equipmentStatus15 = microscope12.getStatus();
        app.Microscope microscope19 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str20 = microscope19.getName();
        java.lang.String str21 = microscope19.getLocation();
        app.EquipmentStatus equipmentStatus22 = microscope19.getStatus();
        microscope12.setStatus(equipmentStatus22);
        arduino8.setStatus(equipmentStatus22);
        java.lang.String str25 = arduino8.getEquipmentId();
        app.Equipment equipment29 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str30 = equipment29.getEquipmentId();
        java.lang.String str31 = equipment29.getName();
        app.EquipmentStatus equipmentStatus32 = equipment29.getStatus();
        arduino8.setStatus(equipmentStatus32);
        microscope3.setStatus(equipmentStatus32);
        java.lang.String str35 = microscope3.getLocation();
        app.Microscope microscope39 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus40 = null;
        microscope39.setStatus(equipmentStatus40);
        app.EquipmentStatus equipmentStatus42 = microscope39.getStatus();
        app.EquipmentStatus equipmentStatus43 = null;
        microscope39.setStatus(equipmentStatus43);
        java.lang.String str45 = microscope39.getName();
        java.lang.String str46 = microscope39.getEquipmentId();
        java.lang.String str47 = microscope39.getLocation();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = microscope39.isAvailable(localDateTime48, localDateTime49);
        app.Microscope microscope54 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str55 = microscope54.getName();
        java.lang.String str56 = microscope54.getLocation();
        app.EquipmentStatus equipmentStatus57 = microscope54.getStatus();
        microscope39.setStatus(equipmentStatus57);
        microscope3.setStatus(equipmentStatus57);
        app.EquipmentStatus equipmentStatus60 = null;
        microscope3.setStatus(equipmentStatus60);
// flaky "23) test4183(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4344" + "'", str4, "EQ-4344");
        org.junit.Assert.assertNull(equipmentStatus15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(app.EquipmentStatus.AVAILABLE));
// flaky "8) test4183(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EQ-4345" + "'", str25, "EQ-4345");
// flaky "3) test4183(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EQ-4348" + "'", str30, "EQ-4348");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-94" + "'", str31, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus32 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus32.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(equipmentStatus42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
// flaky "2) test4183(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EQ-4349" + "'", str46, "EQ-4349");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus57 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus57.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4184");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        app.EquipmentStatus equipmentStatus9 = microscope3.getStatus();
        java.lang.String str10 = microscope3.getDescription();
        app.Microscope microscope14 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope14.isAvailable(localDateTime15, localDateTime16);
        app.EquipmentStatus equipmentStatus18 = microscope14.getStatus();
        app.Equipment equipment22 = new app.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str23 = equipment22.getDescription();
        app.EquipmentStatus equipmentStatus24 = equipment22.getStatus();
        microscope14.setStatus(equipmentStatus24);
        microscope3.setStatus(equipmentStatus24);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "24) test4184(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4351, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-4351, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(equipmentStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "COORD-001" + "'", str23, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4185");
        app.Arduino arduino3 = new app.Arduino("EQ-2483", "", "EQ-257");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4186");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        guest3.isapproved = false;
        boolean boolean7 = guest3.isapproved;
        guest3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4187");
        app.Researcher researcher3 = new app.Researcher("EQ-2272", "Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-1058");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4188");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-427");
        app.UserAccounts userAccounts28 = userFactory0.createUser("EQ-616", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "EQ-1162", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "EQ-489", "EQ-461");
        app.UserAccounts userAccounts37 = userFactory0.createUser("Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Student", "EQ-2423", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        app.UserAccounts userAccounts42 = userFactory0.createUser("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-98", "EQ-3078");
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
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4189");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-937, Name: , Description: , Location: , Status: null", "", "EQ-1826");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4190");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        faculty3.isapproved = true;
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4191");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1242, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-3764, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-2465");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4192");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Faculty", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-152", "EQ-74");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-1419", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1632, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts13 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4193");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "COORD-001", "EQ-39");
        java.lang.String str4 = arduino3.getEquipmentId();
        app.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
// flaky "25) test4193(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4355" + "'", str4, "EQ-4355");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4194");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.password;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str8 = headLabCoordinator0.username;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        double double10 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(labManager7);
// flaky "26) test4194(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-2249, Name: Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE, Description: Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Location: Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-2249, Name: Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE, Description: Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Location: Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4195");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Student", "EQ-344");
        boolean boolean4 = guest3.needsapproval;
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4196");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-253");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-284", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null", "EQ-3775", "EQ-3556", "EQ-1707");
        app.UserAccounts userAccounts40 = userFactory0.createUser("Equipment ID: EQ-3698, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2305, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null");
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
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4197");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4198");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3579", "");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4199");
        app.Student student3 = new app.Student("EQ-2475", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4200");
        app.Student student3 = new app.Student("EQ-734", "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1179");
        student3.username = "Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE";
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4201");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-120", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts30 = userFactory0.createUser("EQ-2562", "EQ-3072", "Equipment ID: EQ-2388, Name: EQ-509, Description: Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-489, Status: AVAILABLE", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts35 = userFactory0.createUser("EQ-435", "EQ-3829", "Equipment ID: EQ-3177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2501, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts30);
        org.junit.Assert.assertNull(userAccounts35);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4202");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1412, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "EQ-473");
        java.lang.String str4 = arduino3.getEquipmentId();
        app.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
// flaky "27) test4202(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4358" + "'", str4, "EQ-4358");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4203");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-304", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4204");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.password = "EQ-382";
        java.lang.String str15 = guest3.getAccountType();
        java.lang.String str16 = guest3.getAccountType();
        java.lang.Class<?> wildcardClass17 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4205");
        app.Microscope microscope3 = new app.Microscope("EQ-1476", "EQ-1900", "MANAGER-597445801");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4206");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-866");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-3916", "Equipment ID: EQ-3078, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2958");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4207");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.Equipment equipment7 = new app.Equipment("EQ-335", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-851");
        app.EquipmentStatus equipmentStatus8 = equipment7.getStatus();
        arduino3.setStatus(equipmentStatus8);
        java.lang.String str10 = arduino3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(app.EquipmentStatus.AVAILABLE));
// flaky "28) test4207(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4360, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-4360, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4208");
        app.Microscope microscope3 = new app.Microscope("", "EQ-592", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getName();
// flaky "29) test4208(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4362" + "'", str4, "EQ-4362");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4209");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3651, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4210");
        app.Student student3 = new app.Student("EQ-1113", "Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-2143");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4211");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-2446, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "30) test4211(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4212");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "EQ-39", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
// flaky "31) test4212(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4364, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4364, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4213");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        boolean boolean9 = faculty3.needsapproval;
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4214");
        app.Guest guest3 = new app.Guest("EQ-4176", "Equipment ID: EQ-1475, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-4316, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4215");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.getAccountType();
        student3.password = "EQ-628";
        student3.username = "EQ-1742";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4216");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.password;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "EQ-2212");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-94", "Equipment ID: EQ-1282, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "32) test4216(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "9) test4216(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4217");
        app.Equipment equipment3 = new app.Equipment("Student", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-99" + "'", str5, "EQ-99");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4218");
        app.Guest guest3 = new app.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4219");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1251", "Equipment ID: EQ-4297, Name: Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null, Description: EQ-1970, Location: Equipment ID: EQ-432, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-4097, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-2499");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1251");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4220");
        app.Microscope microscope3 = new app.Microscope("EQ-1163", "EQ-1162", "Head Lab Coordinator");
        app.Microscope microscope7 = new app.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino11 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope15 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str16 = microscope15.getName();
        java.lang.String str17 = microscope15.getLocation();
        app.EquipmentStatus equipmentStatus18 = microscope15.getStatus();
        arduino11.setStatus(equipmentStatus18);
        microscope7.setStatus(equipmentStatus18);
        app.Equipment equipment24 = new app.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str25 = equipment24.getEquipmentId();
        java.lang.String str26 = equipment24.getDescription();
        app.Equipment equipment30 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str31 = equipment30.getEquipmentId();
        app.Equipment equipment35 = new app.Equipment("EQ-152", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-193");
        app.Equipment equipment39 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        app.Equipment equipment43 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino47 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope51 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str52 = microscope51.getName();
        java.lang.String str53 = microscope51.getLocation();
        app.EquipmentStatus equipmentStatus54 = microscope51.getStatus();
        arduino47.setStatus(equipmentStatus54);
        equipment43.setStatus(equipmentStatus54);
        equipment39.setStatus(equipmentStatus54);
        equipment35.setStatus(equipmentStatus54);
        equipment30.setStatus(equipmentStatus54);
        equipment24.setStatus(equipmentStatus54);
        microscope7.setStatus(equipmentStatus54);
        microscope3.setStatus(equipmentStatus54);
        java.lang.String str63 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
// flaky "33) test4220(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EQ-4373" + "'", str25, "EQ-4373");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
// flaky "10) test4220(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-4374" + "'", str31, "EQ-4374");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus54 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus54.equals(app.EquipmentStatus.AVAILABLE));
// flaky "4) test4220(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "EQ-4369" + "'", str63, "EQ-4369");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4221");
        app.Student student3 = new app.Student("EQ-1192", "EQ-655", "EQ-615");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4222");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-866");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-4302", "EQ-811");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-131", "EQ-2020");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4223");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-461", "EQ-442", "Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-981");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1928", "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null", "EQ-2466");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-3297", "Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE", "EQ-118");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4224");
        app.Student student3 = new app.Student("Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null", "EQ-1435", "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        student3.username = "EQ-2142";
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4225");
        app.Researcher researcher3 = new app.Researcher("EQ-2156", "EQ-862", "EQ-627");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4226");
        app.Arduino arduino3 = new app.Arduino("EQ-333", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = arduino3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4227");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        headLabCoordinator0.username = "COORD-001";
        java.lang.String str5 = headLabCoordinator0.username;
        boolean boolean6 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.username = "Equipment ID: EQ-2249, Name: Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE, Description: Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Location: Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE";
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
// flaky "34) test4227(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE" + "'", str2, "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4228");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1000");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4229");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        double double7 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.password = "EQ-3804";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4230");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3499, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-446", "Equipment ID: EQ-2265, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4231");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-2591", "Equipment ID: EQ-4155, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4232");
        app.Equipment equipment3 = new app.Equipment("EQ-684", "EQ-1102", "EQ-628");
        java.lang.String str4 = equipment3.toString();
// flaky "35) test4232(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4383, Name: EQ-684, Description: EQ-1102, Location: EQ-628, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4383, Name: EQ-684, Description: EQ-1102, Location: EQ-628, Status: AVAILABLE");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4233");
        app.Equipment equipment3 = new app.Equipment("EQ-3500", "Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3500" + "'", str4, "EQ-3500");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4234");
        app.Equipment equipment3 = new app.Equipment("EQ-863", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4235");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        java.lang.String str17 = microscope3.toString();
        java.lang.String str18 = microscope3.getEquipmentId();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "36) test4235(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4386" + "'", str10, "EQ-4386");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(equipmentStatus16);
// flaky "11) test4235(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-4386, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-4386, Name: , Description: , Location: , Status: null");
// flaky "5) test4235(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-4386" + "'", str18, "EQ-4386");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4236");
        app.Student student3 = new app.Student("EQ-2519", "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4237");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-3097, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4238");
        app.Arduino arduino3 = new app.Arduino("EQ-2579", "EQ-361", "EQ-1973");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "37) test4238(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4388" + "'", str4, "EQ-4388");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4239");
        app.Equipment equipment3 = new app.Equipment("EQ-2906", "Equipment ID: EQ-2968, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
        app.Arduino arduino7 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus8 = null;
        arduino7.setStatus(equipmentStatus8);
        app.Microscope microscope13 = new app.Microscope("EQ-446", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus14 = microscope13.getStatus();
        arduino7.setStatus(equipmentStatus14);
        equipment3.setStatus(equipmentStatus14);
        app.EquipmentStatus equipmentStatus17 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4240");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str11 = labManager10.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4241");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-478, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-1909");
        researcher3.needsapproval = true;
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4242");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4243");
        app.Student student3 = new app.Student("Equipment ID: EQ-684, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4244");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        boolean boolean9 = labManager3.needsapproval;
        labManager3.username = "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null";
        labManager3.isapproved = false;
        labManager3.username = "Equipment ID: EQ-943, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        labManager3.password = "";
        java.lang.String str18 = labManager3.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lab Manager" + "'", str18, "Lab Manager");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4245");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-765", "EQ-3659", "EQ-2416", "EQ-2819");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-765");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4246");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        guest3.isapproved = true;
        java.lang.String str9 = guest3.password;
        java.lang.String str10 = guest3.username;
        java.lang.String str11 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-36" + "'", str9, "EQ-36");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4247");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        double double11 = userAccounts10.getHourlyRate();
        userAccounts10.needsapproval = false;
        java.lang.String str14 = userAccounts10.username;
        java.lang.String str15 = userAccounts10.getRegistrationId();
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-63" + "'", str14, "EQ-63");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str15, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4248");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        headLabCoordinator0.password = "";
        java.lang.String str11 = headLabCoordinator0.password;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4249");
        app.Guest guest3 = new app.Guest("EQ-615", "EQ-497", "EQ-866");
        java.lang.String str4 = guest3.getAccountType();
        double double5 = guest3.getHourlyRate();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4250");
        app.Guest guest3 = new app.Guest("EQ-476", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-335");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str5, "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4251");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass5 = microscope3.getClass();
// flaky "38) test4251(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4393" + "'", str4, "EQ-4393");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4252");
        app.Student student3 = new app.Student("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1098", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-4316, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4253");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "39) test4253(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4394, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-4394, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4254");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        java.lang.String str11 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus12 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope3.isAvailable(localDateTime13, localDateTime14);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "40) test4254(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4395, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-4395, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(equipmentStatus12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4255");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2871, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null", "EQ-3533");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4256");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getName();
        java.lang.String str6 = microscope3.getLocation();
        java.lang.String str7 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(app.EquipmentStatus.AVAILABLE));
// flaky "41) test4256(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4396, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-4396, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4257");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = labManager9.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4258");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getEquipmentId();
        app.EquipmentStatus equipmentStatus10 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "42) test4258(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4397" + "'", str9, "EQ-4397");
        org.junit.Assert.assertNull(equipmentStatus10);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4259");
        app.Equipment equipment3 = new app.Equipment("EQ-98", "EQ-120", "EQ-106");
        java.lang.String str4 = equipment3.getDescription();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-120" + "'", str4, "EQ-120");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
// flaky "43) test4259(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-4398" + "'", str6, "EQ-4398");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4260");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        app.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        java.lang.String str8 = arduino3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertNull(equipmentStatus7);
// flaky "44) test4260(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-4399, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str8, "Equipment ID: EQ-4399, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4261");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        double double7 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4262");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.password;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-39", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager14.password = "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4263");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-2407, Name: , Description: , Location: , Status: null", "EQ-3320");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4264");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        boolean boolean11 = researcher3.needsapproval;
        researcher3.needsapproval = false;
        researcher3.username = "EQ-1805";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4265");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "EQ-281");
        app.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        app.Arduino arduino8 = new app.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str9 = arduino8.toString();
        app.EquipmentStatus equipmentStatus10 = arduino8.getStatus();
        microscope3.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope3.getLocation();
        java.lang.String str13 = microscope3.getName();
        java.lang.String str14 = microscope3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "45) test4265(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4403, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-4403, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-281" + "'", str12, "EQ-281");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str13, "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
// flaky "12) test4265(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-4402" + "'", str14, "EQ-4402");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4266");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.isapproved = true;
        double double7 = researcher3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4267");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-106");
        researcher3.password = "EQ-361";
        researcher3.password = "EQ-1910";
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4268");
        app.Microscope microscope3 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.toString();
        java.lang.String str7 = microscope3.getEquipmentId();
        app.Equipment equipment11 = new app.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str12 = equipment11.getDescription();
        app.EquipmentStatus equipmentStatus13 = equipment11.getStatus();
        microscope3.setStatus(equipmentStatus13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
// flaky "46) test4268(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4404, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4404, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
// flaky "13) test4268(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-4404" + "'", str7, "EQ-4404");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4269");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-603");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4270");
        app.Faculty faculty3 = new app.Faculty("EQ-2906", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-4306");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4271");
        app.Arduino arduino3 = new app.Arduino("EQ-1050", "Equipment ID: EQ-2894, Name: Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1767, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4272");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-640");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-211, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1678, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-614, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1632, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("EQ-977", "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-991, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-1863804858");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-4388", "Equipment ID: EQ-2847, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4273");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        app.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4274");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        double double12 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.isapproved = true;
        boolean boolean17 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4275");
        app.Microscope microscope3 = new app.Microscope("EQ-3201", "Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE", "EQ-427");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4276");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2073, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-1080", "Equipment ID: EQ-2206, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4277");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-2388, Name: EQ-509, Description: Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-489, Status: AVAILABLE", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-326");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4278");
        app.Student student3 = new app.Student("EQ-263", "EQ-4008", "EQ-36");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4279");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        java.lang.String str17 = microscope3.toString();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope3.isAvailable(localDateTime18, localDateTime19);
        java.lang.String str21 = microscope3.getDescription();
        java.lang.String str22 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "47) test4279(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4410" + "'", str10, "EQ-4410");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(equipmentStatus16);
// flaky "14) test4279(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-4410, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-4410, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4280");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "MANAGER-66180900", "Equipment ID: EQ-3688, Name: EQ-469, Description: EQ-981, Location: EQ-773, Status: AVAILABLE");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4281");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-2695, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2813, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE", "EQ-2011");
        java.lang.String str4 = microscope3.toString();
// flaky "48) test4281(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4411, Name: Equipment ID: EQ-2695, Name: hi!, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2813, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE, Location: EQ-2011, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4411, Name: Equipment ID: EQ-2695, Name: hi!, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2813, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE, Location: EQ-2011, Status: AVAILABLE");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4282");
        app.Student student3 = new app.Student("Equipment ID: EQ-3529, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3900", "EQ-3579");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4283");
        app.Equipment equipment3 = new app.Equipment("EQ-754", "EQ-74", "Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-754" + "'", str4, "EQ-754");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4284");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        java.lang.String str11 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4285");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-2592, Name: , Description: , Location: , Status: null", "EQ-2519", "Equipment ID: EQ-4351, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4286");
        app.Equipment equipment3 = new app.Equipment("MANAGER-973294640", "EQ-2528", "");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4287");
        app.Arduino arduino3 = new app.Arduino("Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getEquipmentId();
        app.Arduino arduino9 = new app.Arduino("EQ-99", "EQ-74", "Researcher");
        app.EquipmentStatus equipmentStatus10 = arduino9.getStatus();
        app.Microscope microscope14 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str15 = microscope14.getName();
        java.lang.String str16 = microscope14.getLocation();
        java.lang.String str17 = microscope14.getName();
        java.lang.String str18 = microscope14.getName();
        app.Microscope microscope22 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus23 = null;
        microscope22.setStatus(equipmentStatus23);
        app.EquipmentStatus equipmentStatus25 = null;
        microscope22.setStatus(equipmentStatus25);
        java.lang.String str27 = microscope22.getName();
        app.Arduino arduino31 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope35 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str36 = microscope35.getName();
        java.lang.String str37 = microscope35.getLocation();
        app.EquipmentStatus equipmentStatus38 = microscope35.getStatus();
        arduino31.setStatus(equipmentStatus38);
        microscope22.setStatus(equipmentStatus38);
        microscope14.setStatus(equipmentStatus38);
        arduino9.setStatus(equipmentStatus38);
        arduino3.setStatus(equipmentStatus38);
        java.lang.String str44 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
// flaky "49) test4287(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4415" + "'", str5, "EQ-4415");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str44, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4288");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getRegistrationId();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4289");
        app.Arduino arduino3 = new app.Arduino("EQ-2595", "Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "50) test4289(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4421" + "'", str4, "EQ-4421");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4290");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        researcher3.isapproved = false;
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4291");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getRegistrationId();
        boolean boolean6 = researcher3.isapproved;
        researcher3.needsapproval = true;
        java.lang.String str9 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4292");
        app.Equipment equipment3 = new app.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
// flaky "51) test4292(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-4422" + "'", str6, "EQ-4422");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4293");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        boolean boolean13 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2381, Name: , Description: , Location: , Status: null", "EQ-1811");
        java.lang.String str19 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Head Lab Coordinator" + "'", str19, "Head Lab Coordinator");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4294");
        app.Microscope microscope3 = new app.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        java.lang.String str10 = microscope7.getName();
        java.lang.String str11 = microscope7.getName();
        app.Microscope microscope15 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus16 = null;
        microscope15.setStatus(equipmentStatus16);
        app.EquipmentStatus equipmentStatus18 = null;
        microscope15.setStatus(equipmentStatus18);
        java.lang.String str20 = microscope15.getName();
        app.Arduino arduino24 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope28 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str29 = microscope28.getName();
        java.lang.String str30 = microscope28.getLocation();
        app.EquipmentStatus equipmentStatus31 = microscope28.getStatus();
        arduino24.setStatus(equipmentStatus31);
        microscope15.setStatus(equipmentStatus31);
        microscope7.setStatus(equipmentStatus31);
        microscope3.setStatus(equipmentStatus31);
        java.lang.String str36 = microscope3.toString();
        java.lang.String str37 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
// flaky "52) test4294(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equipment ID: EQ-4423, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str36, "Equipment ID: EQ-4423, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str37, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4295");
        app.Student student3 = new app.Student("EQ-1662", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4296");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-3894", "Equipment ID: EQ-4106, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4297");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.password = "EQ-120";
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.username;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4298");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.password;
        java.lang.String str11 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4299");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-791", "EQ-2683", "EQ-3829", "EQ-2623");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-791");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4300");
        app.Equipment equipment3 = new app.Equipment("EQ-3500", "Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null", "EQ-2459");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4301");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.isapproved = true;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        boolean boolean13 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4302");
        app.Guest guest3 = new app.Guest("EQ-3342", "EQ-630", "EQ-4349");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4303");
        app.Student student3 = new app.Student("Equipment ID: EQ-2772, Name: , Description: , Location: , Status: null", "EQ-1434", "EQ-3777");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4304");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getLocation();
        java.lang.String str8 = equipment3.toString();
        java.lang.String str9 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "53) test4304(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-4431, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-4431, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
// flaky "15) test4304(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4431, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-4431, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4305");
        app.Guest guest3 = new app.Guest("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-156");
        java.lang.String str4 = guest3.getAccountType();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4306");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        researcher3.username = "EQ-1872";
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4307");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Lab Manager");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lab Manager" + "'", str4, "Lab Manager");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4308");
        app.Arduino arduino3 = new app.Arduino("EQ-1248", "EQ-4062", "EQ-866");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4309");
        app.Arduino arduino3 = new app.Arduino("", "EQ-1161", "Equipment ID: EQ-3760, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4310");
        app.Researcher researcher3 = new app.Researcher("", "EQ-92", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.username = "";
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-92" + "'", str6, "EQ-92");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4311");
        app.Student student3 = new app.Student("EQ-1454", "EQ-1396", "EQ-569");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4312");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.isapproved = true;
        researcher3.username = "Equipment ID: EQ-3085, Name: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: EQ-1911, Location: Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE";
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4313");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4229, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "EQ-449");
        labManager11.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4314");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.username;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4315");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1826", "EQ-2906", "EQ-4315", "EQ-4137");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1826");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4316");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-222", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-583", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-104");
        app.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-3962, Name: hi!, Description: , Location: hi!, Status: null", "EQ-4190", "Equipment ID: EQ-1717, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4317");
        app.Guest guest3 = new app.Guest("EQ-221", "EQ-615", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4318");
        app.Researcher researcher3 = new app.Researcher("EQ-765", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2807, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4319");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4320");
        app.Student student3 = new app.Student("EQ-2623", "EQ-1062", "Equipment ID: EQ-1121, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4321");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "EQ-156");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        app.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("MANAGER-1863804858", "Equipment ID: EQ-1867, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4322");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-734");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4323");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-811", "Guest");
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null", "EQ-1763");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        boolean boolean10 = headLabCoordinator0.isapproved;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-1102", "EQ-3518");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4324");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "EQ-784", "EQ-550");
        guest3.needsapproval = false;
        java.lang.String str6 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-550" + "'", str6, "EQ-550");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4325");
        app.Faculty faculty3 = new app.Faculty("EQ-431", "EQ-2053", "EQ-640");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4326");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-719", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "EQ-367");
        app.UserAccounts userAccounts36 = userFactory0.createUser("Researcher", "EQ-361", "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts40 = userFactory0.createUser("EQ-2385", "EQ-1528", "Equipment ID: EQ-1887, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts44 = userFactory0.createUser("Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "", "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts49 = userFactory0.createUser("Equipment ID: EQ-4067, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-4102, Name: Equipment ID: EQ-551, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-36");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNotNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
        org.junit.Assert.assertNull(userAccounts44);
        org.junit.Assert.assertNull(userAccounts49);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4327");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("EQ-63", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-371", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts23 = userFactory0.createUser("EQ-361", "EQ-92", "", "");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4328");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = arduino3.toString();
        java.lang.String str11 = arduino3.getName();
        java.lang.String str12 = arduino3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "54) test4328(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4444, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str10, "Equipment ID: EQ-4444, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "16) test4328(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-4444, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str12, "Equipment ID: EQ-4444, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4329");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getLocation();
        java.lang.String str8 = equipment3.toString();
        app.Microscope microscope12 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str13 = microscope12.getName();
        java.lang.String str14 = microscope12.getLocation();
        app.EquipmentStatus equipmentStatus15 = microscope12.getStatus();
        app.Arduino arduino19 = new app.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.Microscope microscope23 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str24 = microscope23.toString();
        java.lang.String str25 = microscope23.toString();
        app.EquipmentStatus equipmentStatus26 = null;
        microscope23.setStatus(equipmentStatus26);
        java.lang.String str28 = microscope23.getName();
        app.Microscope microscope32 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str33 = microscope32.getName();
        app.EquipmentStatus equipmentStatus34 = microscope32.getStatus();
        microscope23.setStatus(equipmentStatus34);
        app.Microscope microscope39 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str40 = microscope39.getName();
        java.lang.String str41 = microscope39.getLocation();
        java.lang.String str42 = microscope39.getName();
        java.lang.String str43 = microscope39.getName();
        app.Microscope microscope47 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus48 = null;
        microscope47.setStatus(equipmentStatus48);
        app.EquipmentStatus equipmentStatus50 = null;
        microscope47.setStatus(equipmentStatus50);
        java.lang.String str52 = microscope47.getName();
        app.Arduino arduino56 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope60 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str61 = microscope60.getName();
        java.lang.String str62 = microscope60.getLocation();
        app.EquipmentStatus equipmentStatus63 = microscope60.getStatus();
        arduino56.setStatus(equipmentStatus63);
        microscope47.setStatus(equipmentStatus63);
        microscope39.setStatus(equipmentStatus63);
        microscope23.setStatus(equipmentStatus63);
        arduino19.setStatus(equipmentStatus63);
        microscope12.setStatus(equipmentStatus63);
        equipment3.setStatus(equipmentStatus63);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "55) test4329(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-4445, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-4445, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(app.EquipmentStatus.AVAILABLE));
// flaky "17) test4329(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment ID: EQ-4448, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str24, "Equipment ID: EQ-4448, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "6) test4329(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment ID: EQ-4448, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str25, "Equipment ID: EQ-4448, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Head Lab Coordinator" + "'", str28, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Guest" + "'", str33, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus34 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus34.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus63 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus63.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4330");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-466, Name: , Description: , Location: , Status: null", "EQ-2527");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4331");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts28 = userFactory0.createUser("EQ-1454", "EQ-74", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-1341");
        app.UserAccounts userAccounts33 = userFactory0.createUser("Equipment ID: EQ-3105, Name: EQ-778, Description: EQ-2498, Location: EQ-231, Status: AVAILABLE", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "EQ-118", "EQ-3232");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts33);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4332");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        boolean boolean9 = labManager3.needsapproval;
        labManager3.username = "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null";
        labManager3.isapproved = false;
        boolean boolean14 = labManager3.isapproved;
        labManager3.needsapproval = true;
        boolean boolean17 = labManager3.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4333");
        app.Arduino arduino3 = new app.Arduino("EQ-2342", "Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-851");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4334");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty", "COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts19 = userFactory0.createUser("EQ-98", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts24 = userFactory0.createUser("Student", "EQ-578", "EQ-275", "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str25 = userAccounts24.getRegistrationId();
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNotNull(userAccounts24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null" + "'", str25, "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4335");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "EQ-758";
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4336");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-3506, Name: , Description: , Location: , Status: AVAILABLE", "EQ-3816", "EQ-278");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4337");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-427");
        app.UserAccounts userAccounts28 = userFactory0.createUser("EQ-616", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "EQ-1162", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "EQ-489", "EQ-461");
        app.UserAccounts userAccounts37 = userFactory0.createUser("Equipment ID: EQ-1991, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1161", "EQ-3231");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts37);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4338");
        app.Student student3 = new app.Student("Researcher", "EQ-41", "EQ-39");
        boolean boolean4 = student3.isapproved;
        student3.username = "EQ-1218";
        java.lang.String str7 = student3.password;
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-41" + "'", str7, "EQ-41");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4339");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null", "EQ-104");
        java.lang.String str4 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-104" + "'", str4, "EQ-104");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4340");
        app.Equipment equipment3 = new app.Equipment("EQ-41", "", "Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4341");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-596", "EQ-637", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-276");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-509", "EQ-536", "", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = userAccounts36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4342");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-970, Name: , Description: , Location: , Status: null", "EQ-1032", "EQ-3804");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4343");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.toString();
// flaky "56) test4343(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4344");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        app.Microscope microscope8 = new app.Microscope("EQ-390", "EQ-731", "EQ-114");
        app.EquipmentStatus equipmentStatus9 = microscope8.getStatus();
        arduino3.setStatus(equipmentStatus9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = arduino3.isAvailable(localDateTime11, localDateTime12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4345");
        app.Researcher researcher3 = new app.Researcher("EQ-131", "Researcher", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.username;
        boolean boolean8 = researcher3.isapproved;
        researcher3.isapproved = true;
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-131" + "'", str4, "EQ-131");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str6, "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-131" + "'", str7, "EQ-131");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4346");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-719", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "EQ-367");
        app.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-1239, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-4303", "Equipment ID: EQ-3779, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4347");
        app.Researcher researcher3 = new app.Researcher("EQ-1742", "EQ-1981", "Equipment ID: EQ-3529, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4348");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getEquipmentId();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "57) test4348(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-4461" + "'", str7, "EQ-4461");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4349");
        app.Student student3 = new app.Student("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Lab Manager", "EQ-384");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        student3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4350");
        app.Student student3 = new app.Student("Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null", "EQ-4386", "Equipment ID: EQ-4103, Name: EQ-1050, Description: Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-1058, Status: AVAILABLE");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4351");
        app.Microscope microscope3 = new app.Microscope("EQ-2552", "Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null", "EQ-1176");
        app.Microscope microscope7 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str8 = microscope7.getLocation();
        app.Microscope microscope12 = new app.Microscope("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "EQ-39", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus13 = microscope12.getStatus();
        microscope7.setStatus(equipmentStatus13);
        app.EquipmentStatus equipmentStatus15 = microscope7.getStatus();
        app.Microscope microscope19 = new app.Microscope("hi!", "", "hi!");
        app.EquipmentStatus equipmentStatus20 = microscope19.getStatus();
        microscope7.setStatus(equipmentStatus20);
        microscope3.setStatus(equipmentStatus20);
        java.lang.String str23 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus20 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus20.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EQ-1176" + "'", str23, "EQ-1176");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4352");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str11 = labManager10.password;
        boolean boolean12 = labManager10.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str11, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4353");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        headLabCoordinator0.username = "EQ-476";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4354");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty", "COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-94", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("EQ-2375", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-4316");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4355");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        boolean boolean6 = guest3.needsapproval;
        guest3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4356");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.username;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3516, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1769, Name: EQ-368, Description: EQ-118, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
// flaky "58) test4356(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "18) test4356(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "7) test4356(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4357");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1630, Name: , Description: , Location: , Status: null", "EQ-2808", "EQ-253");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4358");
        app.Equipment equipment3 = new app.Equipment("EQ-1479", "EQ-304", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "59) test4358(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4466" + "'", str4, "EQ-4466");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4359");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "EQ-592");
        boolean boolean4 = guest3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4360");
        app.Student student3 = new app.Student("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = student3.password;
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4361");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3134, Name: , Description: , Location: , Status: null", "EQ-1917");
        guest3.username = "Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null";
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4362");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.password;
        researcher3.username = "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        researcher3.password = "EQ-685";
        researcher3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4363");
        app.Researcher researcher3 = new app.Researcher("EQ-2462", "EQ-2322", "");
        researcher3.password = "EQ-1927";
        researcher3.password = "EQ-301";
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4364");
        app.Student student3 = new app.Student("EQ-784", "EQ-3221", "EQ-2347");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4365");
        app.Guest guest3 = new app.Guest("EQ-253", "EQ-284", "");
        guest3.password = "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getRegistrationId();
        guest3.password = "EQ-1808";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4366");
        app.Arduino arduino3 = new app.Arduino("", "EQ-826", "EQ-814");
        java.lang.String str4 = arduino3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4367");
        app.Equipment equipment3 = new app.Equipment("EQ-970", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "60) test4367(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4468" + "'", str4, "EQ-4468");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4368");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-862", "EQ-862");
        boolean boolean4 = faculty3.needsapproval;
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.password;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-862" + "'", str6, "EQ-862");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4369");
        app.Student student3 = new app.Student("Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-275", "EQ-99");
        java.lang.String str4 = student3.getRegistrationId();
        java.lang.String str5 = student3.username;
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-99" + "'", str4, "EQ-99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4370");
        app.Equipment equipment3 = new app.Equipment("EQ-586", "EQ-834", "EQ-1050");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.getName();
// flaky "61) test4370(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4470" + "'", str4, "EQ-4470");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1050" + "'", str5, "EQ-1050");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-586" + "'", str6, "EQ-586");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4371");
        app.Student student3 = new app.Student("EQ-1739", "Equipment ID: EQ-3250, Name: Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "MANAGER-824727143");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4372");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3923, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-4360, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-2958");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4373");
        app.Microscope microscope3 = new app.Microscope("EQ-978", "Equipment ID: EQ-4317, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE", "EQ-2271");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4374");
        app.Researcher researcher3 = new app.Researcher("EQ-758", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.isapproved = true;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.Class<?> wildcardClass8 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4375");
        app.Faculty faculty3 = new app.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        faculty3.isapproved = true;
        double double6 = faculty3.getHourlyRate();
        faculty3.username = "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4376");
        app.Faculty faculty3 = new app.Faculty("EQ-382", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "EQ-156");
        double double4 = faculty3.getHourlyRate();
        boolean boolean5 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4377");
        app.Faculty faculty3 = new app.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        faculty3.username = "EQ-104";
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4378");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = microscope3.getName();
        app.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus17 = microscope3.getStatus();
        java.lang.String str18 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "62) test4378(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4473" + "'", str10, "EQ-4473");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertNull(equipmentStatus17);
// flaky "19) test4378(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-4473, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-4473, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4379");
        app.Arduino arduino3 = new app.Arduino("EQ-253", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getDescription();
        java.lang.String str6 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-253" + "'", str4, "EQ-253");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4380");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-2212", "EQ-3152");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4381");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-594", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double7 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4382");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = microscope3.isAvailable(localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = microscope3.isAvailable(localDateTime20, localDateTime21);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "63) test4382(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4475" + "'", str10, "EQ-4475");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4383");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        app.UserAccounts userAccounts13 = userFactory0.createUser("", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3683, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4384");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        boolean boolean10 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "64) test4384(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4385");
        app.Equipment equipment3 = new app.Equipment("EQ-4137", "Equipment ID: EQ-3595, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-2271");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4386");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.username;
        boolean boolean6 = headLabCoordinator0.isapproved;
        java.lang.Class<?> wildcardClass7 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
// flaky "65) test4386(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4387");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1554", "EQ-3059", "EQ-2999", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1554");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4388");
        app.Equipment equipment3 = new app.Equipment("EQ-2149", "MANAGER-1087176903", "Equipment ID: EQ-3690, Name: Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4389");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-209", "EQ-71");
        java.lang.String str4 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        java.lang.String str6 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-71" + "'", str4, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-209" + "'", str6, "EQ-209");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4390");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-106", "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4391");
        app.Student student3 = new app.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        boolean boolean6 = student3.isapproved;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4392");
        app.Arduino arduino3 = new app.Arduino("EQ-4013", "EQ-507", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4393");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4394");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope7 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        app.Microscope microscope14 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str15 = microscope14.getName();
        java.lang.String str16 = microscope14.getLocation();
        app.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        microscope7.setStatus(equipmentStatus17);
        arduino3.setStatus(equipmentStatus17);
        java.lang.String str20 = arduino3.getEquipmentId();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = arduino3.isAvailable(localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = arduino3.isAvailable(localDateTime24, localDateTime25);
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
// flaky "66) test4394(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-4482" + "'", str20, "EQ-4482");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4395");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null", "EQ-2569", "EQ-4355");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4396");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-3950", "Equipment ID: EQ-2485, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4397");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        boolean boolean5 = faculty3.isapproved;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4398");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.password;
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4399");
        app.Microscope microscope3 = new app.Microscope("EQ-862", "EQ-2678", "EQ-4201");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4400");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-596", "EQ-637", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-276");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-509", "EQ-536", "", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
        app.UserAccounts userAccounts40 = userFactory0.createUser("Equipment ID: EQ-2805, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null", "EQ-390");
        app.UserAccounts userAccounts44 = userFactory0.createUser("EQ-1747", "Equipment ID: EQ-2709, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "EQ-1879");
        app.UserAccounts userAccounts48 = userFactory0.createUser("EQ-382", "Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3851");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
        org.junit.Assert.assertNull(userAccounts44);
        org.junit.Assert.assertNull(userAccounts48);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4401");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        double double10 = headLabCoordinator0.getHourlyRate();
        double double11 = headLabCoordinator0.getHourlyRate();
        double double12 = headLabCoordinator0.getHourlyRate();
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4402");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.username = "";
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-1903", "Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.username = "";
        java.lang.String str18 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Head Lab Coordinator" + "'", str18, "Head Lab Coordinator");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4403");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        app.Microscope microscope14 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus15 = null;
        microscope14.setStatus(equipmentStatus15);
        app.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        app.Microscope microscope21 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str22 = microscope21.getName();
        java.lang.String str23 = microscope21.getLocation();
        app.EquipmentStatus equipmentStatus24 = microscope21.getStatus();
        microscope14.setStatus(equipmentStatus24);
        microscope3.setStatus(equipmentStatus24);
        app.EquipmentStatus equipmentStatus27 = microscope3.getStatus();
        java.lang.String str28 = microscope3.getDescription();
        java.lang.String str29 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus30 = microscope3.getStatus();
        java.lang.Class<?> wildcardClass31 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus30 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus30.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4404");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.needsapproval = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4405");
        app.Student student3 = new app.Student("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = student3.getRegistrationId();
        boolean boolean5 = student3.needsapproval;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4406");
        app.Faculty faculty3 = new app.Faculty("EQ-461", "Equipment ID: EQ-970, Name: , Description: , Location: , Status: null", "EQ-263");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4407");
        app.Arduino arduino3 = new app.Arduino("EQ-120", "EQ-118", "EQ-75");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-120" + "'", str4, "EQ-120");
// flaky "67) test4407(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4491" + "'", str5, "EQ-4491");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4408");
        app.Faculty faculty3 = new app.Faculty("EQ-791", "Equipment ID: EQ-2709, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "EQ-390");
        java.lang.String str4 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2709, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2709, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4409");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "EQ-231", "Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4410");
        app.Student student3 = new app.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        java.lang.String str6 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-3426, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4411");
        app.Researcher researcher3 = new app.Researcher("EQ-1313", "EQ-284", "EQ-2945");
        researcher3.password = "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4412");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4413");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts28 = userFactory0.createUser("EQ-1454", "EQ-74", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-1341");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-790, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-2228", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-685");
        app.UserAccounts userAccounts40 = userFactory0.createUser("EQ-851", "Equipment ID: EQ-2940, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1000");
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
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4414");
        app.Student student3 = new app.Student("EQ-2489", "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null", "EQ-3297");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4415");
        app.Microscope microscope3 = new app.Microscope("EQ-422", "EQ-74", "EQ-2342");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-422" + "'", str4, "EQ-422");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4416");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.password;
        java.lang.String str8 = guest3.password;
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4417");
        app.Guest guest3 = new app.Guest("EQ-627", "EQ-333", "");
        guest3.username = "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        guest3.needsapproval = true;
        java.lang.String str8 = guest3.username;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4418");
        app.Faculty faculty3 = new app.Faculty("EQ-1900", "EQ-1493", "EQ-3518");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4419");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
// flaky "68) test4419(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4493, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4493, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4420");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        guest3.needsapproval = true;
        java.lang.String str6 = guest3.getAccountType();
        guest3.needsapproval = false;
        java.lang.String str9 = guest3.password;
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        guest3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4421");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1735, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4422");
        app.Microscope microscope3 = new app.Microscope("EQ-3631", "Equipment ID: EQ-3064, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-982");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4423");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4122, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-419", "EQ-4122");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4424");
        app.Arduino arduino3 = new app.Arduino("", "EQ-558", "EQ-2821");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4425");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        labManager10.needsapproval = true;
        labManager10.needsapproval = true;
        java.lang.String str15 = labManager10.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lab Manager" + "'", str15, "Lab Manager");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4426");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope7 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        app.Microscope microscope14 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str15 = microscope14.getName();
        java.lang.String str16 = microscope14.getLocation();
        app.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        microscope7.setStatus(equipmentStatus17);
        arduino3.setStatus(equipmentStatus17);
        java.lang.String str20 = arduino3.getEquipmentId();
        app.Equipment equipment24 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str25 = equipment24.getEquipmentId();
        java.lang.String str26 = equipment24.getName();
        app.EquipmentStatus equipmentStatus27 = equipment24.getStatus();
        arduino3.setStatus(equipmentStatus27);
        java.lang.String str29 = arduino3.toString();
        java.lang.String str30 = arduino3.getLocation();
        java.lang.String str31 = arduino3.toString();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
// flaky "69) test4426(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-4498" + "'", str20, "EQ-4498");
// flaky "20) test4426(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EQ-4501" + "'", str25, "EQ-4501");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-94" + "'", str26, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(app.EquipmentStatus.AVAILABLE));
// flaky "8) test4426(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment ID: EQ-4498, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE" + "'", str29, "Equipment ID: EQ-4498, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Head Lab Coordinator" + "'", str30, "Head Lab Coordinator");
// flaky "3) test4426(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment ID: EQ-4498, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE" + "'", str31, "Equipment ID: EQ-4498, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4427");
        app.Arduino arduino3 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        app.Equipment equipment15 = new app.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str16 = equipment15.getDescription();
        app.EquipmentStatus equipmentStatus17 = equipment15.getStatus();
        arduino3.setStatus(equipmentStatus17);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = arduino3.isAvailable(localDateTime19, localDateTime20);
        java.lang.String str22 = arduino3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "COORD-001" + "'", str16, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "70) test4427(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equipment ID: EQ-4502, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE" + "'", str22, "Equipment ID: EQ-4502, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4428");
        app.Student student3 = new app.Student("Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1780", "EQ-3043");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4429");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        java.lang.String str4 = arduino3.toString();
        app.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
// flaky "71) test4429(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4505, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4505, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4430");
        app.Faculty faculty3 = new app.Faculty("EQ-389", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isapproved;
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4431");
        app.Arduino arduino3 = new app.Arduino("EQ-452", "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2279, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4432");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null", "EQ-1062");
        faculty3.needsapproval = false;
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4433");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2367, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2146");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4434");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.needsapproval = false;
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "EQ-1223";
        headLabCoordinator0.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4435");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-99", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = labManager9.getRegistrationId();
        java.lang.String str11 = labManager9.getAccountType();
        java.lang.String str12 = labManager9.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EQ-1223" + "'", str2, "EQ-1223");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MANAGER-66181089" + "'", str10, "MANAGER-66181089");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab Manager" + "'", str11, "Lab Manager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lab Manager" + "'", str12, "Lab Manager");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4436");
        app.Microscope microscope3 = new app.Microscope("EQ-1479", "Equipment ID: EQ-2486, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-696, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4437");
        app.Arduino arduino3 = new app.Arduino("EQ-3297", "EQ-1747", "EQ-1981");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1747" + "'", str4, "EQ-1747");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4438");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-4322, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-3296", "EQ-4316");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4439");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "EQ-1543";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4440");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        guest3.password = "EQ-131";
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4441");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.isapproved = false;
        java.lang.String str15 = guest3.getAccountType();
        guest3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4442");
        app.Student student3 = new app.Student("Equipment ID: EQ-3456, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE", "Equipment ID: EQ-943, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4443");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        double double6 = researcher3.getHourlyRate();
        researcher3.needsapproval = false;
        java.lang.String str9 = researcher3.password;
        researcher3.username = "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4444");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        app.UserAccounts userAccounts15 = userFactory0.createUser("Lab Manager", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-341");
        app.UserAccounts userAccounts20 = userFactory0.createUser("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "EQ-118", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts25 = userFactory0.createUser("EQ-1028", "Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-754");
        app.UserAccounts userAccounts29 = userFactory0.createUser("EQ-2138", "EQ-74", "EQ-1841");
        app.UserAccounts userAccounts34 = userFactory0.createUser("EQ-63", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "EQ-3029", "EQ-4349");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
        org.junit.Assert.assertNull(userAccounts34);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4445");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-943, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-276");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4446");
        app.Faculty faculty3 = new app.Faculty("", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-41");
        faculty3.password = "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str6 = faculty3.getAccountType();
        boolean boolean7 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4447");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.username;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        boolean boolean13 = labManager12.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1223" + "'", str9, "EQ-1223");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4448");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        java.lang.String str8 = headLabCoordinator0.username;
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        boolean boolean11 = headLabCoordinator0.isapproved;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-1223" + "'", str8, "EQ-1223");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4449");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.isapproved = true;
        java.lang.String str6 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4450");
        app.Student student3 = new app.Student("EQ-3366", "EQ-2416", "Equipment ID: EQ-2317, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4451");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-4298, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3889, Name: , Description: , Location: , Status: null", "EQ-1572", "Equipment ID: EQ-3656, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-4298, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4452");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.isapproved = true;
        researcher3.username = "Equipment ID: EQ-3085, Name: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: EQ-1911, Location: Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE";
        researcher3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4453");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4386, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2886, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4454");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        double double7 = researcher3.getHourlyRate();
        researcher3.password = "Equipment ID: EQ-2871, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4455");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.getName();
        java.lang.String str12 = microscope3.toString();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope3.isAvailable(localDateTime13, localDateTime14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "72) test4455(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-4512, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-4512, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4456");
        app.Student student3 = new app.Student("EQ-1425", "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2271, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        student3.isapproved = true;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4457");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = false;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "MANAGER-207281291");
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-686");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4458");
        app.Researcher researcher3 = new app.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.username;
        researcher3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4459");
        app.Student student3 = new app.Student("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "EQ-98");
        java.lang.String str4 = student3.getRegistrationId();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-98" + "'", str4, "EQ-98");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4460");
        app.Guest guest3 = new app.Guest("EQ-431", "EQ-344", "EQ-149");
        guest3.username = "EQ-1411";
        guest3.password = "Equipment ID: EQ-1480, Name: , Description: , Location: , Status: AVAILABLE";
        java.lang.String str8 = guest3.password;
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-1480, Name: , Description: , Location: , Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-1480, Name: , Description: , Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4461");
        app.Faculty faculty3 = new app.Faculty("hi!", "Student", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.password;
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4462");
        app.Student student3 = new app.Student("EQ-1811", "EQ-3798", "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4463");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-4097, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-3764", "EQ-1927");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4464");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "EQ-281");
        app.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        app.Arduino arduino8 = new app.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str9 = arduino8.toString();
        app.EquipmentStatus equipmentStatus10 = arduino8.getStatus();
        microscope3.setStatus(equipmentStatus10);
        app.EquipmentStatus equipmentStatus12 = microscope3.getStatus();
        app.Arduino arduino16 = new app.Arduino("EQ-476", "EQ-540", "EQ-496");
        app.Arduino arduino20 = new app.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.Microscope microscope24 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str25 = microscope24.toString();
        java.lang.String str26 = microscope24.toString();
        app.EquipmentStatus equipmentStatus27 = null;
        microscope24.setStatus(equipmentStatus27);
        java.lang.String str29 = microscope24.getName();
        app.Microscope microscope33 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str34 = microscope33.getName();
        app.EquipmentStatus equipmentStatus35 = microscope33.getStatus();
        microscope24.setStatus(equipmentStatus35);
        app.Microscope microscope40 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str41 = microscope40.getName();
        java.lang.String str42 = microscope40.getLocation();
        java.lang.String str43 = microscope40.getName();
        java.lang.String str44 = microscope40.getName();
        app.Microscope microscope48 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus49 = null;
        microscope48.setStatus(equipmentStatus49);
        app.EquipmentStatus equipmentStatus51 = null;
        microscope48.setStatus(equipmentStatus51);
        java.lang.String str53 = microscope48.getName();
        app.Arduino arduino57 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope61 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str62 = microscope61.getName();
        java.lang.String str63 = microscope61.getLocation();
        app.EquipmentStatus equipmentStatus64 = microscope61.getStatus();
        arduino57.setStatus(equipmentStatus64);
        microscope48.setStatus(equipmentStatus64);
        microscope40.setStatus(equipmentStatus64);
        microscope24.setStatus(equipmentStatus64);
        arduino20.setStatus(equipmentStatus64);
        arduino16.setStatus(equipmentStatus64);
        microscope3.setStatus(equipmentStatus64);
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "73) test4464(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4516, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-4516, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(app.EquipmentStatus.AVAILABLE));
// flaky "21) test4464(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment ID: EQ-4519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str25, "Equipment ID: EQ-4519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "9) test4464(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equipment ID: EQ-4519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str26, "Equipment ID: EQ-4519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Head Lab Coordinator" + "'", str29, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Guest" + "'", str34, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus35 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus35.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus64 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus64.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4465");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getAccountType();
        boolean boolean5 = faculty3.isapproved;
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4466");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null", "");
        app.Microscope microscope7 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        app.EquipmentStatus equipmentStatus11 = null;
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
        app.Microscope microscope30 = new app.Microscope("EQ-446", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus31 = microscope30.getStatus();
        microscope7.setStatus(equipmentStatus31);
        equipment3.setStatus(equipmentStatus31);
        java.lang.String str34 = equipment3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "74) test4466(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-4526" + "'", str14, "EQ-4526");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky "22) test4466(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-4526, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-4526, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "10) test4466(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-4526" + "'", str26, "EQ-4526");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null" + "'", str34, "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4467");
        app.Arduino arduino3 = new app.Arduino("EQ-615", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.toString();
// flaky "75) test4467(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4528, Name: EQ-615, Description: Equipment ID: EQ-315, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4528, Name: EQ-615, Description: Equipment ID: EQ-315, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4468");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str11 = labManager10.getAccountType();
        boolean boolean12 = labManager10.isapproved;
        java.lang.String str13 = labManager10.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab Manager" + "'", str11, "Lab Manager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-36" + "'", str13, "EQ-36");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4469");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236", "MANAGER-66180900");
        faculty3.needsapproval = false;
        java.lang.String str6 = faculty3.username;
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str6, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4470");
        app.Student student3 = new app.Student("COORD-001", "MasterAdmin123!", "hi!");
        java.lang.String str4 = student3.getRegistrationId();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4471");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-114", "Researcher", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-1242", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-1340");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-4303", "EQ-4156", "EQ-1762");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4472");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.isapproved = true;
        researcher3.isapproved = true;
        researcher3.password = "Equipment ID: EQ-3201, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4473");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2871, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-4062", "EQ-859");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4474");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        researcher3.password = "";
        java.lang.String str12 = researcher3.getAccountType();
        java.lang.String str13 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4475");
        app.Equipment equipment3 = new app.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = equipment3.getEquipmentId();
        java.lang.String str9 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "76) test4475(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4530" + "'", str8, "EQ-4530");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4476");
        app.Equipment equipment3 = new app.Equipment("EQ-1805", "EQ-2506", "EQ-1878");
        java.lang.String str4 = equipment3.getLocation();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1878" + "'", str4, "EQ-1878");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4477");
        app.Researcher researcher3 = new app.Researcher("EQ-547", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-4358");
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4478");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4479");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean13 = headLabCoordinator0.needsapproval;
        double double14 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4480");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getEquipmentId();
        java.lang.String str6 = microscope3.getLocation();
        java.lang.String str7 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
// flaky "77) test4480(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4533" + "'", str5, "EQ-4533");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
// flaky "23) test4480(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4533, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-4533, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4481");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.username = "EQ-275";
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4482");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        java.lang.String str17 = userAccounts16.getAccountType();
        double double18 = userAccounts16.getHourlyRate();
        java.lang.String str19 = userAccounts16.getAccountType();
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4483");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        app.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(equipmentStatus8);
// flaky "78) test4483(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4534" + "'", str9, "EQ-4534");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4484");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.username;
        guest3.needsapproval = false;
        java.lang.String str12 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4485");
        app.Arduino arduino3 = new app.Arduino("EQ-2121", "EQ-1878", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4486");
        app.Researcher researcher3 = new app.Researcher("", "Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2342");
        java.lang.Class<?> wildcardClass4 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4487");
        app.Arduino arduino3 = new app.Arduino("EQ-596", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.getLocation();
        java.lang.String str7 = arduino3.getLocation();
        java.lang.String str8 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-596" + "'", str4, "EQ-596");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-596" + "'", str5, "EQ-596");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4488");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-497", "Equipment ID: EQ-2501, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-4008");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4489");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1229");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4490");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.password;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.password = "";
        faculty3.needsapproval = true;
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4491");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        java.lang.String str12 = guest3.getRegistrationId();
        guest3.isapproved = false;
        java.lang.String str15 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4492");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "", "EQ-152");
        faculty3.password = "EQ-422";
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4493");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-98");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4494");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-106", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4495");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty", "COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-94", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts24 = userFactory0.createUser("EQ-2466", "EQ-4468", "Equipment ID: EQ-4505, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-4152, Name: Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Location: EQ-367, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4496");
        app.Researcher researcher3 = new app.Researcher("EQ-508", "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4497");
        app.Student student3 = new app.Student("Equipment ID: EQ-3802, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-3652, Name: Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-2670, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4498");
        app.Student student3 = new app.Student("Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-594", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4499");
        app.Student student3 = new app.Student("EQ-276", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest8.test4500");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.toString();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        app.Arduino arduino17 = new app.Arduino("EQ-296", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "EQ-106");
        java.lang.String str18 = arduino17.getEquipmentId();
        app.EquipmentStatus equipmentStatus19 = arduino17.getStatus();
        microscope3.setStatus(equipmentStatus19);
// flaky "79) test4500(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "24) test4500(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "11) test4500(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str9, "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "4) test4500(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-4553, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "2) test4500(src.test.randoop.AleenaTest8)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-4554" + "'", str18, "EQ-4554");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(app.EquipmentStatus.AVAILABLE));
    }
}
