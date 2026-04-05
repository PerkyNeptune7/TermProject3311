package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4501");
        app.Student student3 = new app.Student("COORD-001", "EQ-74", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4502");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4503");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null", "EQ-380", "EQ-3730");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4504");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        app.UserAccounts userAccounts23 = userFactory0.createUser("MANAGER-103232", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1534", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts32 = userFactory0.createUser("EQ-496", "Equipment ID: EQ-1769, Name: EQ-368, Description: EQ-118, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-1412, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-382");
        app.UserAccounts userAccounts37 = userFactory0.createUser("EQ-2198", "Equipment ID: EQ-2964, Name: EQ-284, Description: EQ-1261, Location: Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-1427", "Equipment ID: EQ-3181, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts37);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4505");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-389", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-74");
        app.UserAccounts userAccounts21 = userFactory0.createUser("EQ-586", "Equipment ID: EQ-3456, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-1390, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE", "Equipment ID: EQ-2504, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-2059, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.UserAccounts userAccounts29 = userFactory0.createUser("EQ-258", "EQ-2954", "EQ-1742");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4506");
        app.Student student3 = new app.Student("Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null", "EQ-643", "Equipment ID: EQ-1755, Name: EQ-118, Description: EQ-75, Location: MANAGER-66180900, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4507");
        app.Researcher researcher3 = new app.Researcher("EQ-735", "EQ-859", "");
        java.lang.String str4 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4508");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts19 = userFactory0.createUser("EQ-114", "EQ-179", "EQ-104", "EQ-222");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-275");
        app.UserAccounts userAccounts27 = userFactory0.createUser("", "EQ-355", "EQ-1192");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "", "EQ-390");
        app.UserAccounts userAccounts37 = userFactory0.createUser("", "EQ-326", "EQ-3485", "EQ-2915");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts37);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4509");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2531, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2819", "EQ-565");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4510");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.password = "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4511");
        app.Equipment equipment3 = new app.Equipment("COORD-001", "EQ-193", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.getName();
// flaky "1) test4511(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4557" + "'", str4, "EQ-4557");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4512");
        app.Guest guest3 = new app.Guest("EQ-558", "EQ-2499", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4513");
        app.Arduino arduino3 = new app.Arduino("EQ-507", "EQ-242", "EQ-193");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-507" + "'", str4, "EQ-507");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-193" + "'", str5, "EQ-193");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4514");
        app.Student student3 = new app.Student("EQ-1557", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4515");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getRegistrationId();
        boolean boolean9 = researcher3.isapproved;
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4516");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        boolean boolean4 = guest3.isapproved;
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4517");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-231", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-3296, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3980, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4518");
        app.Faculty faculty3 = new app.Faculty("Head Lab Coordinator", "Equipment ID: EQ-2807, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4519");
        app.Equipment equipment3 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        app.Microscope microscope7 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope7.isAvailable(localDateTime8, localDateTime9);
        app.EquipmentStatus equipmentStatus11 = microscope7.getStatus();
        app.Arduino arduino15 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = arduino15.isAvailable(localDateTime16, localDateTime17);
        java.lang.String str19 = arduino15.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = arduino15.isAvailable(localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = arduino15.isAvailable(localDateTime23, localDateTime24);
        app.EquipmentStatus equipmentStatus26 = arduino15.getStatus();
        microscope7.setStatus(equipmentStatus26);
        equipment3.setStatus(equipmentStatus26);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MasterAdmin123!" + "'", str19, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4520");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4521");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "";
        boolean boolean11 = headLabCoordinator0.isapproved;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2379, Name: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Description: EQ-63, Location: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3476, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str15 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4522");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        boolean boolean11 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4523");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1616", "Equipment ID: EQ-2379, Name: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Description: EQ-63, Location: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-4287, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1616");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4524");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-684", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3764, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-1735, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        boolean boolean12 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-3809, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4525");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino7 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope11 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        app.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        arduino7.setStatus(equipmentStatus14);
        microscope3.setStatus(equipmentStatus14);
        java.lang.String str17 = microscope3.getName();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope3.isAvailable(localDateTime18, localDateTime19);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str17, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4526");
        app.Guest guest3 = new app.Guest("EQ-476", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-335");
        boolean boolean4 = guest3.isapproved;
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4527");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1179", "EQ-3083", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1179");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4528");
        app.Microscope microscope3 = new app.Microscope("EQ-284", "EQ-1261", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4529");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.password = "EQ-3777";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4530");
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
        app.Arduino arduino16 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.Microscope microscope20 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str21 = microscope20.getName();
        java.lang.String str22 = microscope20.getLocation();
        app.EquipmentStatus equipmentStatus23 = microscope20.getStatus();
        arduino16.setStatus(equipmentStatus23);
        microscope3.setStatus(equipmentStatus23);
        app.Microscope microscope29 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = microscope29.isAvailable(localDateTime30, localDateTime31);
        app.EquipmentStatus equipmentStatus33 = microscope29.getStatus();
        app.Equipment equipment37 = new app.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str38 = equipment37.getDescription();
        app.EquipmentStatus equipmentStatus39 = equipment37.getStatus();
        microscope29.setStatus(equipmentStatus39);
        java.lang.String str41 = microscope29.getName();
        app.Microscope microscope45 = new app.Microscope("EQ-539", "EQ-131", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        app.Equipment equipment49 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        app.Equipment equipment53 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino57 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope61 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str62 = microscope61.getName();
        java.lang.String str63 = microscope61.getLocation();
        app.EquipmentStatus equipmentStatus64 = microscope61.getStatus();
        arduino57.setStatus(equipmentStatus64);
        equipment53.setStatus(equipmentStatus64);
        equipment49.setStatus(equipmentStatus64);
        microscope45.setStatus(equipmentStatus64);
        microscope29.setStatus(equipmentStatus64);
        microscope3.setStatus(equipmentStatus64);
        java.lang.String str71 = microscope3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "2) test4530(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4567, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-4567, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "COORD-001" + "'", str38, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus39 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus39.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Guest" + "'", str41, "Guest");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus64 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus64.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4531");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-862", "EQ-1502");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4532");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-970, Name: , Description: , Location: , Status: null", "EQ-3535", "Equipment ID: EQ-4039, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4533");
        app.Arduino arduino3 = new app.Arduino("EQ-36", "Equipment ID: EQ-2196, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3321, Name: EQ-36, Description: MANAGER-0, Location: , Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4534");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4535");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3925, Name: , Description: , Location: , Status: null", "");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4536");
        app.Student student3 = new app.Student("EQ-3614", "EQ-4533", "EQ-1346");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4537");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        double double13 = headLabCoordinator0.getHourlyRate();
        java.lang.String str14 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4538");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-387", "EQ-419", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts26 = userFactory0.createUser("", "Equipment ID: EQ-661, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-1665");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4539");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.password;
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4540");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-627", "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null");
        headLabCoordinator0.password = "EQ-1321";
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4541");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        labManager13.username = "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE";
        java.lang.String str16 = labManager13.username;
        java.lang.String str17 = labManager13.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE" + "'", str16, "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE" + "'", str17, "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4542");
        app.Arduino arduino3 = new app.Arduino("EQ-36", "MANAGER-0", "");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
// flaky "3) test4542(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4580" + "'", str4, "EQ-4580");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4543");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1951, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Lab Manager", "");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4544");
        app.Student student3 = new app.Student("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "EQ-98");
        java.lang.String str4 = student3.getRegistrationId();
        java.lang.String str5 = student3.getAccountType();
        student3.username = "EQ-1174";
        student3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-98" + "'", str4, "EQ-98");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4545");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-558", "EQ-559");
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1962, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str10 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-1321" + "'", str10, "EQ-1321");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4546");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-558", "EQ-559");
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1962, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        labManager9.password = "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4547");
        app.Student student3 = new app.Student("EQ-1099", "EQ-1412", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4548");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        labManager11.username = "Equipment ID: EQ-1671, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE";
        boolean boolean14 = labManager11.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-1321" + "'", str8, "EQ-1321");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4549");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4550");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4551");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4552");
        app.Faculty faculty3 = new app.Faculty("", "EQ-4530", "EQ-335");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4553");
        app.Student student3 = new app.Student("EQ-539", "EQ-569", "EQ-392");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "EQ-507";
        java.lang.String str7 = student3.password;
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-507" + "'", str7, "EQ-507");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4554");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        researcher3.password = "Equipment ID: EQ-1317, Name: , Description: , Location: , Status: null";
        java.lang.String str12 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4555");
        app.Guest guest3 = new app.Guest("EQ-2712", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-341");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2712" + "'", str4, "EQ-2712");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4556");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-36", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        guest3.password = "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        boolean boolean7 = guest3.needsapproval;
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4557");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4106, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-838");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-1321" + "'", str1, "EQ-1321");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4558");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.username = "";
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-1903", "Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4559");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-539", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = microscope3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4560");
        app.Student student3 = new app.Student("EQ-539", "EQ-569", "EQ-392");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "EQ-507";
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4561");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        headLabCoordinator0.password = "EQ-4526";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4562");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null";
        student3.username = "Equipment ID: EQ-1837, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE";
        java.lang.String str12 = student3.getAccountType();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4563");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("", "Equipment ID: EQ-551, Name: , Description: , Location: , Status: null", "", "EQ-281");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4564");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-535");
        java.lang.String str8 = labManager7.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lab Manager" + "'", str8, "Lab Manager");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4565");
        app.Guest guest3 = new app.Guest("", "Equipment ID: EQ-2680, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "Equipment ID: EQ-4041, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4566");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2928, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-3402, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4423, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2146");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2928, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4567");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-299", "EQ-344");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        java.lang.String str17 = headLabCoordinator0.password;
        java.lang.String str18 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EQ-4526" + "'", str17, "EQ-4526");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4568");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2175", "EQ-3900");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4569");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-866");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2924, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2846", "EQ-1435");
        app.UserAccounts userAccounts23 = userFactory0.createUser("EQ-1707", "MANAGER-1244835102", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4570");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4571");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4572");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        double double4 = labManager3.getHourlyRate();
        labManager3.isapproved = true;
        boolean boolean7 = labManager3.isapproved;
        boolean boolean8 = labManager3.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4573");
        app.Microscope microscope3 = new app.Microscope("EQ-811", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-982");
        java.lang.String str4 = microscope3.toString();
// flaky "4) test4573(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4584, Name: EQ-811, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: EQ-982, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4584, Name: EQ-811, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: EQ-982, Status: AVAILABLE");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4574");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        guest3.isapproved = true;
        java.lang.String str9 = guest3.getRegistrationId();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4575");
        app.Guest guest3 = new app.Guest("EQ-1103", "Equipment ID: EQ-3894, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4576");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.needsapproval = true;
        boolean boolean10 = labManager3.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4577");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-2595, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1973");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4578");
        app.Equipment equipment3 = new app.Equipment("EQ-1437", "", "Equipment ID: EQ-1685, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4579");
        app.Researcher researcher3 = new app.Researcher("Student", "EQ-586", "EQ-281");
        java.lang.String str4 = researcher3.username;
        researcher3.username = "EQ-3659";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4580");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = false;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        boolean boolean14 = headLabCoordinator0.needsapproval;
        boolean boolean15 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4581");
        app.Arduino arduino3 = new app.Arduino("EQ-489", "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4582");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-242", "Lab Manager");
        java.lang.String str4 = researcher3.getAccountType();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab Manager" + "'", str7, "Lab Manager");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4583");
        app.Guest guest3 = new app.Guest("EQ-368", "", "EQ-735");
        java.lang.String str4 = guest3.username;
        guest3.password = "EQ-503";
        guest3.username = "EQ-4013";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-368" + "'", str4, "EQ-368");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4584");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        labManager12.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4585");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-257", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.password;
        boolean boolean5 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-257" + "'", str4, "EQ-257");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4586");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "COORD-001", "EQ-39");
        java.lang.String str4 = arduino3.getEquipmentId();
        app.Microscope microscope8 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus9 = null;
        microscope8.setStatus(equipmentStatus9);
        app.EquipmentStatus equipmentStatus11 = microscope8.getStatus();
        java.lang.String str12 = microscope8.toString();
        java.lang.String str13 = microscope8.getName();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = microscope8.isAvailable(localDateTime14, localDateTime15);
        java.lang.String str17 = microscope8.getLocation();
        app.Arduino arduino21 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.Microscope microscope25 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str26 = microscope25.getName();
        java.lang.String str27 = microscope25.getLocation();
        app.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        arduino21.setStatus(equipmentStatus28);
        microscope8.setStatus(equipmentStatus28);
        app.EquipmentStatus equipmentStatus31 = microscope8.getStatus();
        arduino3.setStatus(equipmentStatus31);
// flaky "5) test4586(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4590" + "'", str4, "EQ-4590");
        org.junit.Assert.assertNull(equipmentStatus11);
// flaky "1) test4586(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-4591, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-4591, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4587");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1780", "EQ-504", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-2409");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1780");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4588");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "Equipment ID: EQ-3613, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4589");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-120", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts30 = userFactory0.createUser("EQ-690", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Guest", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts35 = userFactory0.createUser("EQ-3366", "EQ-92", "Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE");
        app.UserAccounts userAccounts40 = userFactory0.createUser("Equipment ID: EQ-4584, Name: EQ-811, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: EQ-982, Status: AVAILABLE", "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null", "EQ-2013", "Equipment ID: EQ-1501, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts30);
        org.junit.Assert.assertNull(userAccounts35);
        org.junit.Assert.assertNull(userAccounts40);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4590");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        app.UserAccounts userAccounts24 = userFactory0.createUser("Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1745");
        app.UserAccounts userAccounts28 = userFactory0.createUser("Equipment ID: EQ-3113, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE", "EQ-92", "EQ-4044");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts28);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4591");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-106", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4592");
        app.Arduino arduino3 = new app.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.Microscope microscope7 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        app.EquipmentStatus equipmentStatus10 = null;
        microscope7.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope7.getName();
        java.lang.String str13 = microscope7.getName();
        java.lang.String str14 = microscope7.getName();
        app.Microscope microscope18 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus19 = null;
        microscope18.setStatus(equipmentStatus19);
        app.EquipmentStatus equipmentStatus21 = microscope18.getStatus();
        app.Microscope microscope25 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str26 = microscope25.getName();
        java.lang.String str27 = microscope25.getLocation();
        app.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        microscope18.setStatus(equipmentStatus28);
        microscope7.setStatus(equipmentStatus28);
        arduino3.setStatus(equipmentStatus28);
        java.lang.String str32 = arduino3.getName();
        java.lang.String str33 = arduino3.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipmentStatus21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EQ-75" + "'", str32, "EQ-75");
// flaky "6) test4592(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Equipment ID: EQ-4594, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str33, "Equipment ID: EQ-4594, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4593");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null";
        java.lang.String str11 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str11, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4594");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "EQ-486", "EQ-628");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4595");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.needsapproval;
        boolean boolean10 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4596");
        app.Microscope microscope3 = new app.Microscope("EQ-3678", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null", "EQ-1242");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "7) test4596(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4599" + "'", str4, "EQ-4599");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4597");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1239, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-1313");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4598");
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
        java.lang.String str14 = arduino3.getEquipmentId();
        java.lang.String str15 = arduino3.getEquipmentId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = arduino3.isAvailable(localDateTime16, localDateTime17);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "8) test4598(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4601" + "'", str8, "EQ-4601");
// flaky "2) test4598(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4601" + "'", str9, "EQ-4601");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
// flaky "1) test4598(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-4601" + "'", str14, "EQ-4601");
// flaky "1) test4598(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-4601" + "'", str15, "EQ-4601");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4599");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        userAccounts27.isapproved = false;
        java.lang.String str30 = userAccounts27.getRegistrationId();
        userAccounts27.password = "EQ-4534";
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str30, "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4600");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-4013", "");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4601");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
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
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4602");
        app.Equipment equipment3 = new app.Equipment("COORD-001", "EQ-193", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-193" + "'", str4, "EQ-193");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
// flaky "9) test4602(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-4603" + "'", str6, "EQ-4603");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4603");
        app.Researcher researcher3 = new app.Researcher("EQ-2755", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4604");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.isapproved = true;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        student3.isapproved = false;
        java.lang.String str13 = student3.username;
        student3.needsapproval = true;
        boolean boolean16 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4605");
        app.Microscope microscope3 = new app.Microscope("EQ-2114", "EQ-368", "EQ-236");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-368" + "'", str4, "EQ-368");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4606");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-4103, Name: EQ-1050, Description: Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-1058, Status: AVAILABLE", "Equipment ID: EQ-2206, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4607");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4608");
        app.Arduino arduino3 = new app.Arduino("EQ-3642", "EQ-2475", "EQ-1392");
        app.Microscope microscope7 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str8 = microscope7.getEquipmentId();
        java.lang.String str9 = microscope7.getDescription();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
// flaky "10) test4608(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4606" + "'", str8, "EQ-4606");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4609");
        app.Equipment equipment3 = new app.Equipment("EQ-1501", "Equipment ID: EQ-2556, Name: Equipment ID: EQ-696, Name: , Description: , Location: , Status: null, Description: EQ-627, Location: EQ-1174, Status: AVAILABLE", "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4610");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getLocation();
        java.lang.String str7 = microscope3.getEquipmentId();
        java.lang.String str8 = microscope3.toString();
        app.Microscope microscope12 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str13 = microscope12.getName();
        java.lang.String str14 = microscope12.getName();
        java.lang.String str15 = microscope12.getLocation();
        java.lang.String str16 = microscope12.getLocation();
        app.EquipmentStatus equipmentStatus17 = microscope12.getStatus();
        microscope3.setStatus(equipmentStatus17);
        app.EquipmentStatus equipmentStatus19 = microscope3.getStatus();
        java.lang.String str20 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "11) test4610(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-4608" + "'", str7, "EQ-4608");
// flaky "3) test4610(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-4608, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-4608, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4611");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4612");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-590", "EQ-382");
        app.UserAccounts userAccounts8 = userFactory0.createUser("EQ-734", "Equipment ID: EQ-1800, Name: , Description: , Location: , Status: null", "EQ-2417");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4613");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1412", "Equipment ID: EQ-4567, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2465, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4614");
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
        java.lang.String str33 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(app.EquipmentStatus.AVAILABLE));
// flaky "12) test4614(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EQ-4610" + "'", str33, "EQ-4610");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4615");
        app.Microscope microscope3 = new app.Microscope("", "Equipment ID: EQ-2546, Name: EQ-92, Description: EQ-1476, Location: Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2861");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4616");
        app.Researcher researcher3 = new app.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.isapproved = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4617");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
// flaky "13) test4617(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4616, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4616, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4618");
        app.Microscope microscope3 = new app.Microscope("EQ-3201", "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2940, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4619");
        app.Equipment equipment3 = new app.Equipment("EQ-4498", "EQ-3919", "EQ-4415");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4620");
        app.Guest guest3 = new app.Guest("EQ-851", "EQ-1763", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.username = "EQ-735";
        guest3.password = "Equipment ID: EQ-3297, Name: hi!, Description: , Location: hi!, Status: null";
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4621");
        app.Faculty faculty3 = new app.Faculty("EQ-719", "Equipment ID: EQ-1526, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4622");
        app.Researcher researcher3 = new app.Researcher("EQ-2012", "EQ-1879", "EQ-3696");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4623");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-1739", "Equipment ID: EQ-1282, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4624");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-99");
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4625");
        app.Equipment equipment3 = new app.Equipment("EQ-284", "EQ-296", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getEquipmentId();
        java.lang.String str6 = equipment3.getEquipmentId();
        app.EquipmentStatus equipmentStatus7 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-296" + "'", str4, "EQ-296");
// flaky "14) test4625(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4619" + "'", str5, "EQ-4619");
// flaky "4) test4625(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-4619" + "'", str6, "EQ-4619");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4626");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-2940, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1021", "EQ-2121", "Equipment ID: EQ-3516, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4627");
        app.Student student3 = new app.Student("Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE", "Equipment ID: EQ-4445, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4628");
        app.Arduino arduino3 = new app.Arduino("EQ-257", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-355");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getEquipmentId();
        app.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        java.lang.String str9 = arduino3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "15) test4628(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-4620" + "'", str7, "EQ-4620");
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(app.EquipmentStatus.AVAILABLE));
// flaky "5) test4628(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4620" + "'", str9, "EQ-4620");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4629");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.isapproved = false;
        java.lang.String str8 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4630");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1306, Name: , Description: , Location: , Status: null", "EQ-392", "MANAGER-0");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4631");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "EQ-778", "EQ-389");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4632");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1437, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4633");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-106", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = labManager5.username;
        labManager5.needsapproval = true;
        java.lang.String str9 = labManager5.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-106" + "'", str6, "EQ-106");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MANAGER-2051605846" + "'", str9, "MANAGER-2051605846");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4634");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.username;
        headLabCoordinator0.password = "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str9 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4635");
        app.Student student3 = new app.Student("Equipment ID: EQ-2987, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-1050", "EQ-3456");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4636");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("", "Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Lab Manager", "Equipment ID: EQ-4505, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4637");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = false;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.password = "Equipment ID: EQ-1502, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4638");
        app.Student student3 = new app.Student("EQ-4461", "EQ-4470", "Equipment ID: EQ-4203, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4639");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts19 = userFactory0.createUser("EQ-114", "EQ-179", "EQ-104", "EQ-222");
        app.UserAccounts userAccounts24 = userFactory0.createUser("EQ-380", "EQ-296", "EQ-74", "EQ-99");
        app.UserAccounts userAccounts29 = userFactory0.createUser("EQ-3750", "EQ-389", "EQ-3961", "EQ-263");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4640");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-380");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "16) test4640(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4622" + "'", str4, "EQ-4622");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4641");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2701, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-3698, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4642");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        boolean boolean6 = researcher3.isapproved;
        researcher3.needsapproval = true;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4643");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        boolean boolean6 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4644");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2115, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-2459", "EQ-616");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4645");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3079", "EQ-4374");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4646");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "MANAGER-214492645", "Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4647");
        app.Arduino arduino3 = new app.Arduino("EQ-811", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-627");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "17) test4647(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4625" + "'", str4, "EQ-4625");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4648");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null", "EQ-2605", "EQ-413");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4649");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-435");
        app.UserAccounts userAccounts8 = userFactory0.createUser("EQ-1917", "EQ-3708", "");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4650");
        app.Microscope microscope3 = new app.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4651");
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
        java.lang.String str35 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass36 = microscope3.getClass();
// flaky "18) test4651(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4627" + "'", str4, "EQ-4627");
        org.junit.Assert.assertNull(equipmentStatus15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(app.EquipmentStatus.AVAILABLE));
// flaky "6) test4651(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EQ-4628" + "'", str25, "EQ-4628");
// flaky "2) test4651(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EQ-4631" + "'", str30, "EQ-4631");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-94" + "'", str31, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus32 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus32.equals(app.EquipmentStatus.AVAILABLE));
// flaky "2) test4651(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EQ-4627" + "'", str35, "EQ-4627");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4652");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null", "EQ-1502");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4653");
        app.Faculty faculty3 = new app.Faculty("EQ-1243", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4526, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4654");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-489";
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-1238", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2196, Name: , Description: , Location: , Status: null");
        labManager18.username = "EQ-547";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4655");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-489" + "'", str8, "EQ-489");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4656");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-627", "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null");
        headLabCoordinator0.password = "EQ-1321";
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4657");
        app.Researcher researcher3 = new app.Researcher("COORD-001", "MasterAdmin123!", "MasterAdmin123!");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.username = "";
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4658");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-114", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Faculty");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Faculty", "MANAGER-66180900", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-39");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2504, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1313");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNotNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4659");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-3903", "Equipment ID: EQ-3990, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4660");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-2317");
        headLabCoordinator0.password = "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4661");
        app.Faculty faculty3 = new app.Faculty("Lab Manager", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.password = "EQ-2995";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4662");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = labManager9.password;
        labManager9.username = "Equipment ID: EQ-2601, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE";
        boolean boolean13 = labManager9.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4663");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-104");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1945, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-1855");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        java.lang.String str14 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4664");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.password;
        student3.password = "EQ-2113";
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4665");
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
        java.lang.String str14 = arduino3.getDescription();
        java.lang.String str15 = arduino3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "19) test4665(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4633" + "'", str8, "EQ-4633");
// flaky "7) test4665(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4633" + "'", str9, "EQ-4633");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
// flaky "3) test4665(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-4633, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str15, "Equipment ID: EQ-4633, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4666");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.getRegistrationId();
        boolean boolean7 = faculty3.isapproved;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MasterAdmin123!" + "'", str6, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4667");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = false;
        java.lang.String str13 = headLabCoordinator0.getRegistrationId();
        boolean boolean14 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COORD-001" + "'", str13, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4668");
        app.Equipment equipment3 = new app.Equipment("EQ-2469", "EQ-120", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4669");
        app.Microscope microscope3 = new app.Microscope("EQ-1251", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4670");
        app.Guest guest3 = new app.Guest("EQ-566", "EQ-2417", "EQ-2271");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4671");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-263", "EQ-259", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-2453", "Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2271, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-4067, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3820, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2449");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4672");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2836, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-1890", "Equipment ID: EQ-4395, Name: , Description: , Location: , Status: null", "EQ-1000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2836, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4673");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4674");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4675");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "MANAGER-103232", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4676");
        app.Equipment equipment3 = new app.Equipment("EQ-559", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-851");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-851" + "'", str4, "EQ-851");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4677");
        app.Equipment equipment3 = new app.Equipment("EQ-3321", "EQ-1229", "Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4678");
        app.Student student3 = new app.Student("EQ-476", "Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null", "EQ-301");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4679");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3993", "EQ-1427");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4680");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4681");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-104" + "'", str5, "EQ-104");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MasterAdmin123!" + "'", str6, "MasterAdmin123!");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4682");
        app.Student student3 = new app.Student("EQ-276", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        student3.username = "MANAGER-824727143";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-276" + "'", str5, "EQ-276");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4683");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isapproved;
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4684");
        app.Faculty faculty3 = new app.Faculty("EQ-1243", "EQ-594", "EQ-2670");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4685");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-4298, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4686");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getRegistrationId();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        boolean boolean11 = researcher3.needsapproval;
        boolean boolean12 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4687");
        app.Guest guest3 = new app.Guest("EQ-1242", "EQ-1021", "Equipment ID: EQ-2501, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4688");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getDescription();
        app.Microscope microscope9 = new app.Microscope("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-209", "EQ-71");
        java.lang.String str10 = microscope9.getLocation();
        app.EquipmentStatus equipmentStatus11 = microscope9.getStatus();
        equipment3.setStatus(equipmentStatus11);
        java.lang.String str13 = equipment3.getLocation();
        java.lang.String str14 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-71" + "'", str10, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-104" + "'", str14, "EQ-104");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4689");
        app.Faculty faculty3 = new app.Faculty("EQ-778", "EQ-514", "EQ-496");
        double double4 = faculty3.getHourlyRate();
        faculty3.password = "EQ-735";
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4690");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null");
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-2737", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        headLabCoordinator0.password = "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4691");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.needsapproval = true;
        java.lang.String str13 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4692");
        app.Microscope microscope3 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        app.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        app.Arduino arduino11 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = arduino11.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = arduino11.getDescription();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = arduino11.isAvailable(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = arduino11.isAvailable(localDateTime19, localDateTime20);
        app.EquipmentStatus equipmentStatus22 = arduino11.getStatus();
        microscope3.setStatus(equipmentStatus22);
        java.lang.String str24 = microscope3.getEquipmentId();
        java.lang.String str25 = microscope3.getLocation();
        java.lang.String str26 = microscope3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MasterAdmin123!" + "'", str15, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(app.EquipmentStatus.AVAILABLE));
// flaky "20) test4692(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EQ-4647" + "'", str24, "EQ-4647");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str25, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
// flaky "8) test4692(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-4647" + "'", str26, "EQ-4647");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4693");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2753, Name: , Description: , Location: , Status: null", "EQ-540", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4694");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "EQ-3362", "Equipment ID: EQ-2680, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4695");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.password = "EQ-1742";
        boolean boolean10 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4696");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        boolean boolean5 = headLabCoordinator0.needsapproval;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-1624", "EQ-1007");
        java.lang.Class<?> wildcardClass12 = labManager11.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4697");
        app.Faculty faculty3 = new app.Faculty("EQ-1524", "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-382");
        faculty3.needsapproval = true;
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4698");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-592");
        app.UserAccounts userAccounts24 = userFactory0.createUser("EQ-843", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts24);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4699");
        app.Guest guest3 = new app.Guest("EQ-2591", "EQ-2715", "");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4700");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        boolean boolean7 = headLabCoordinator0.needsapproval;
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str11 = labManager10.getAccountType();
        labManager10.isapproved = true;
        java.lang.String str14 = labManager10.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab Manager" + "'", str11, "Lab Manager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4701");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3385, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "EQ-1891");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4702");
        app.Faculty faculty3 = new app.Faculty("EQ-4306", "EQ-923", "MANAGER-971154394");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4703");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "MANAGER-214492645", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4704");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null", "EQ-686", "EQ-3628");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4705");
        app.Guest guest3 = new app.Guest("Head Lab Coordinator", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.password = "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4706");
        app.Guest guest3 = new app.Guest("EQ-851", "EQ-1763", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = guest3.isapproved;
        guest3.isapproved = true;
        guest3.needsapproval = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4707");
        app.Student student3 = new app.Student("EQ-118", "MANAGER-0", "EQ-2755");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4708");
        app.Equipment equipment3 = new app.Equipment("EQ-4108", "EQ-1839", "EQ-4344");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4709");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4710");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-3978, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-4275");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4711");
        app.Student student3 = new app.Student("Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null", "EQ-539");
        student3.needsapproval = false;
        double double6 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4712");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "21) test4712(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-4657" + "'", str6, "EQ-4657");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4713");
        app.Guest guest3 = new app.Guest("EQ-4625", "EQ-2605", "EQ-811");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4714");
        app.Arduino arduino3 = new app.Arduino("EQ-296", "EQ-3072", "EQ-275");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4715");
        app.Microscope microscope3 = new app.Microscope("EQ-1468", "EQ-799", "EQ-333");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = microscope3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-799" + "'", str7, "EQ-799");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4716");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "EQ-560", "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4717");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-259");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getName();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        equipment3.setStatus(equipmentStatus10);
        java.lang.Class<?> wildcardClass12 = equipmentStatus10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4718");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.password;
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-259", "EQ-2143");
        labManager10.username = "Equipment ID: EQ-3251, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4719");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-4339", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4720");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        boolean boolean9 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4721");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        java.lang.String str8 = headLabCoordinator0.username;
        boolean boolean9 = headLabCoordinator0.isapproved;
        headLabCoordinator0.username = "EQ-781";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4722");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-380", "EQ-106");
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
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "22) test4722(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-4663" + "'", str14, "EQ-4663");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky "9) test4722(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-4663, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-4663, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "4) test4722(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-4663" + "'", str26, "EQ-4663");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4723");
        app.Student student3 = new app.Student("EQ-380", "Equipment ID: EQ-4383, Name: EQ-684, Description: EQ-1102, Location: EQ-628, Status: AVAILABLE", "Equipment ID: EQ-2162, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4724");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = researcher3.needsapproval;
        boolean boolean5 = researcher3.isapproved;
        double double6 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4725");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str5 = labManager4.getRegistrationId();
        java.lang.String str6 = labManager4.password;
        boolean boolean7 = labManager4.needsapproval;
        java.lang.String str8 = labManager4.password;
        java.lang.String str9 = labManager4.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MANAGER-66180900" + "'", str5, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lab Manager" + "'", str9, "Lab Manager");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4726");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3462, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-3642, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-1543");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4727");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        app.UserAccounts userAccounts15 = userFactory0.createUser("Lab Manager", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-341");
        app.UserAccounts userAccounts20 = userFactory0.createUser("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "EQ-118", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts25 = userFactory0.createUser("EQ-231", "Equipment ID: EQ-1632, Name: , Description: , Location: , Status: null", "EQ-977", "EQ-221");
        app.UserAccounts userAccounts30 = userFactory0.createUser("EQ-3994", "Equipment ID: EQ-2742, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1624", "EQ-2175");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4728");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-299", "EQ-344");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "EQ-4147";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4729");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-3688, Name: EQ-469, Description: EQ-981, Location: EQ-773, Status: AVAILABLE", "Equipment ID: EQ-3243, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-246");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4730");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4731");
        app.Researcher researcher3 = new app.Researcher("EQ-39", "Faculty", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        researcher3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4732");
        app.Researcher researcher3 = new app.Researcher("EQ-814", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4733");
        app.Arduino arduino3 = new app.Arduino("MANAGER-0", "EQ-470", "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4734");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-981", "EQ-221");
        headLabCoordinator0.isapproved = false;
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3698, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-355");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4735");
        app.Guest guest3 = new app.Guest("EQ-2895", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1855");
        boolean boolean4 = guest3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4736");
        app.Equipment equipment3 = new app.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        app.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4737");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
// flaky "23) test4737(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4669, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4669, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
// flaky "10) test4737(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4669, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4669, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4738");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = false;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1887, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2071, Name: , Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4739");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.isapproved = true;
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4740");
        app.Student student3 = new app.Student("EQ-1973", "Equipment ID: EQ-3889, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4741");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        student3.password = "Researcher";
        java.lang.String str8 = student3.username;
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4742");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        java.lang.String str6 = arduino3.getName();
        java.lang.String str7 = arduino3.getLocation();
        java.lang.String str8 = arduino3.getName();
        java.lang.String str9 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4743");
        app.Guest guest3 = new app.Guest("EQ-92", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-41");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4744");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-355", "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE");
        boolean boolean15 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4745");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str10 = headLabCoordinator0.password;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4746");
        app.Student student3 = new app.Student("EQ-1192", "EQ-655", "EQ-615");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = true;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4747");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty", "COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-1480, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-1526, Name: , Description: , Location: , Status: null", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = userAccounts18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4748");
        app.Equipment equipment3 = new app.Equipment("EQ-558", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1872");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4749");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4298, Name: , Description: , Location: , Status: null", "EQ-1543", "EQ-41");
        double double4 = faculty3.getHourlyRate();
        faculty3.username = "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4750");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        double double13 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4751");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4752");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        boolean boolean12 = headLabCoordinator0.isapproved;
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-304", "EQ-209");
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        boolean boolean17 = headLabCoordinator0.isapproved;
        boolean boolean18 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4753");
        app.Equipment equipment3 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getName();
        app.Microscope microscope10 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str11 = microscope10.toString();
        java.lang.String str12 = microscope10.toString();
        app.EquipmentStatus equipmentStatus13 = null;
        microscope10.setStatus(equipmentStatus13);
        java.lang.String str15 = microscope10.getName();
        app.Microscope microscope19 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str20 = microscope19.getName();
        app.EquipmentStatus equipmentStatus21 = microscope19.getStatus();
        microscope10.setStatus(equipmentStatus21);
        app.Microscope microscope26 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str27 = microscope26.getName();
        java.lang.String str28 = microscope26.getLocation();
        java.lang.String str29 = microscope26.getName();
        java.lang.String str30 = microscope26.getName();
        app.Microscope microscope34 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus35 = null;
        microscope34.setStatus(equipmentStatus35);
        app.EquipmentStatus equipmentStatus37 = null;
        microscope34.setStatus(equipmentStatus37);
        java.lang.String str39 = microscope34.getName();
        app.Arduino arduino43 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope47 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str48 = microscope47.getName();
        java.lang.String str49 = microscope47.getLocation();
        app.EquipmentStatus equipmentStatus50 = microscope47.getStatus();
        arduino43.setStatus(equipmentStatus50);
        microscope34.setStatus(equipmentStatus50);
        microscope26.setStatus(equipmentStatus50);
        microscope10.setStatus(equipmentStatus50);
        java.lang.String str55 = microscope10.getLocation();
        app.Microscope microscope59 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str60 = microscope59.getLocation();
        app.Equipment equipment64 = new app.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus65 = equipment64.getStatus();
        microscope59.setStatus(equipmentStatus65);
        microscope10.setStatus(equipmentStatus65);
        equipment3.setStatus(equipmentStatus65);
// flaky "24) test4753(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4675" + "'", str4, "EQ-4675");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-94" + "'", str6, "EQ-94");
// flaky "11) test4753(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-4676, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str11, "Equipment ID: EQ-4676, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "5) test4753(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-4676, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-4676, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus50 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus50.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus65 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus65.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4754");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        boolean boolean11 = headLabCoordinator0.needsapproval;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-4496");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4755");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.getLocation();
// flaky "25) test4755(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4684" + "'", str4, "EQ-4684");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
// flaky "12) test4755(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-4684" + "'", str6, "EQ-4684");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4756");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4178, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-2704, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4757");
        app.Student student3 = new app.Student("Equipment ID: EQ-2265, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1317, Name: , Description: , Location: , Status: null", "EQ-2376");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4758");
        app.Microscope microscope3 = new app.Microscope("EQ-1238", "EQ-209", "EQ-3512");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4759");
        app.Guest guest3 = new app.Guest("EQ-36", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-94");
        java.lang.String str4 = guest3.getAccountType();
        boolean boolean5 = guest3.isapproved;
        java.lang.String str6 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-94" + "'", str6, "EQ-94");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4760");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.username;
        double double9 = student3.getHourlyRate();
        student3.username = "EQ-3383";
        java.lang.String str12 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-3383" + "'", str12, "EQ-3383");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4761");
        app.Equipment equipment3 = new app.Equipment("EQ-1805", "EQ-2506", "EQ-1878");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4762");
        app.Arduino arduino3 = new app.Arduino("EQ-3064", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2916, Name: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null, Description: EQ-382, Location: EQ-335, Status: AVAILABLE");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4763");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4764");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null", "EQ-2273");
        java.lang.String str4 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2273" + "'", str4, "EQ-2273");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4765");
        app.Student student3 = new app.Student("COORD-001", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4766");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1437, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
        app.Microscope microscope7 = new app.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        app.Microscope microscope11 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        java.lang.String str14 = microscope11.getName();
        java.lang.String str15 = microscope11.getName();
        app.Microscope microscope19 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus20 = null;
        microscope19.setStatus(equipmentStatus20);
        app.EquipmentStatus equipmentStatus22 = null;
        microscope19.setStatus(equipmentStatus22);
        java.lang.String str24 = microscope19.getName();
        app.Arduino arduino28 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope32 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str33 = microscope32.getName();
        java.lang.String str34 = microscope32.getLocation();
        app.EquipmentStatus equipmentStatus35 = microscope32.getStatus();
        arduino28.setStatus(equipmentStatus35);
        microscope19.setStatus(equipmentStatus35);
        microscope11.setStatus(equipmentStatus35);
        microscope7.setStatus(equipmentStatus35);
        equipment3.setStatus(equipmentStatus35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus35 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus35.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4767");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        headLabCoordinator0.password = "EQ-355";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4768");
        app.Researcher researcher3 = new app.Researcher("COORD-001", "MasterAdmin123!", "MasterAdmin123!");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4769");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-179", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        double double10 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.username = "EQ-1780";
        java.lang.String str13 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-355" + "'", str13, "EQ-355");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4770");
        app.Student student3 = new app.Student("EQ-149", "Faculty", "EQ-41");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4771");
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
        java.lang.String str31 = arduino3.getEquipmentId();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
// flaky "26) test4771(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-4695" + "'", str20, "EQ-4695");
// flaky "13) test4771(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EQ-4698" + "'", str25, "EQ-4698");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-94" + "'", str26, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(app.EquipmentStatus.AVAILABLE));
// flaky "6) test4771(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment ID: EQ-4695, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE" + "'", str29, "Equipment ID: EQ-4695, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Head Lab Coordinator" + "'", str30, "Head Lab Coordinator");
// flaky "3) test4771(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-4695" + "'", str31, "EQ-4695");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4772");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str10 = guest3.password;
        guest3.needsapproval = true;
        java.lang.String str13 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4773");
        app.Faculty faculty3 = new app.Faculty("MANAGER-1244835102", "EQ-3064", "EQ-1507");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4774");
        app.Equipment equipment3 = new app.Equipment("EQ-1434", "Equipment ID: EQ-2709, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "EQ-296");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4775");
        app.Microscope microscope3 = new app.Microscope("EQ-3642", "EQ-2053", "EQ-3310");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2053" + "'", str4, "EQ-2053");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4776");
        app.Faculty faculty3 = new app.Faculty("EQ-94", "EQ-209", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.password;
        faculty3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-209" + "'", str4, "EQ-209");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4777");
        app.Arduino arduino3 = new app.Arduino("EQ-3448", "Equipment ID: EQ-2059, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-3989");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4778");
        app.Researcher researcher3 = new app.Researcher("EQ-1000", "Equipment ID: EQ-1717, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-367");
        java.lang.String str4 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-367" + "'", str4, "EQ-367");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4779");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getLocation();
        java.lang.String str12 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "27) test4779(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4702, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-4702, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4780");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-851", "EQ-4482", "Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2499, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-851");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4781");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-2836", "EQ-231");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4782");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        double double10 = headLabCoordinator0.getHourlyRate();
        double double11 = headLabCoordinator0.getHourlyRate();
        boolean boolean12 = headLabCoordinator0.needsapproval;
        boolean boolean13 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "28) test4782(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "14) test4782(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "7) test4782(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4783");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-179", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double8 = headLabCoordinator0.getHourlyRate();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-4132", "EQ-2678");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "29) test4783(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4784");
        app.Arduino arduino3 = new app.Arduino("EQ-1251", "EQ-1113", "EQ-565");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-565" + "'", str4, "EQ-565");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4785");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-627", "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null");
        double double13 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4786");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-558", "EQ-559");
        java.lang.Class<?> wildcardClass7 = labManager6.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4787");
        app.Faculty faculty3 = new app.Faculty("EQ-3380", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4788");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3356, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4516, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4789");
        app.Student student3 = new app.Student("Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-4633", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4790");
        app.Faculty faculty3 = new app.Faculty("EQ-94", "EQ-209", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.password;
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-209" + "'", str4, "EQ-209");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4791");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.password;
        faculty3.isapproved = true;
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4792");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-4051, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4793");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        boolean boolean11 = headLabCoordinator0.isapproved;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-246");
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "Equipment ID: EQ-3296, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4794");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-4179, Name: , Description: , Location: , Status: null", "EQ-1970", "Equipment ID: EQ-3977, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-4179, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4795");
        app.Student student3 = new app.Student("EQ-259", "EQ-978", "EQ-2190");
        student3.password = "Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4796");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2325", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-264", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2325");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4797");
        app.Microscope microscope3 = new app.Microscope("EQ-179", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
// flaky "30) test4797(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-4713" + "'", str5, "EQ-4713");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4798");
        app.Student student3 = new app.Student("EQ-304", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-259");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4799");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.isapproved = false;
        boolean boolean12 = headLabCoordinator0.needsapproval;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4800");
        app.Microscope microscope3 = new app.Microscope("EQ-2175", "EQ-1572", "Equipment ID: EQ-2614, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2614, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-2614, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4801");
        app.Equipment equipment3 = new app.Equipment("EQ-368", "EQ-118", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = equipment3.getLocation();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        app.Arduino arduino9 = new app.Arduino("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus10 = arduino9.getStatus();
        app.EquipmentStatus equipmentStatus11 = arduino9.getStatus();
        equipment3.setStatus(equipmentStatus11);
        java.lang.String str13 = equipment3.getName();
        java.lang.String str14 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str4, "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-368" + "'", str13, "EQ-368");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-118" + "'", str14, "EQ-118");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4802");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.password = "EQ-156";
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getAccountType();
        boolean boolean10 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4803");
        app.Faculty faculty3 = new app.Faculty("hi!", "Student", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        boolean boolean5 = faculty3.needsapproval;
        java.lang.String str6 = faculty3.password;
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4804");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        boolean boolean7 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4805");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        app.Arduino arduino15 = new app.Arduino("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "");
        app.Microscope microscope19 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus20 = null;
        microscope19.setStatus(equipmentStatus20);
        app.EquipmentStatus equipmentStatus22 = null;
        microscope19.setStatus(equipmentStatus22);
        java.lang.String str24 = microscope19.getName();
        app.Arduino arduino28 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope32 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str33 = microscope32.getName();
        java.lang.String str34 = microscope32.getLocation();
        app.EquipmentStatus equipmentStatus35 = microscope32.getStatus();
        arduino28.setStatus(equipmentStatus35);
        microscope19.setStatus(equipmentStatus35);
        java.lang.String str38 = microscope19.getLocation();
        app.EquipmentStatus equipmentStatus39 = microscope19.getStatus();
        arduino15.setStatus(equipmentStatus39);
        microscope3.setStatus(equipmentStatus39);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "31) test4805(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4717, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-4717, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus35 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus35.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus39 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus39.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4806");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-4239, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2149", "EQ-4610");
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4807");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.password;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        java.lang.String str10 = headLabCoordinator0.username;
        headLabCoordinator0.password = "EQ-2462";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4808");
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
        java.lang.String str15 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "32) test4808(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4722, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-4722, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4809");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-382", "EQ-380");
        boolean boolean15 = headLabCoordinator0.needsapproval;
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        double double19 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4810");
        app.Researcher researcher3 = new app.Researcher("EQ-3839", "Equipment ID: EQ-2678, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3633, Name: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Description: EQ-120, Location: EQ-264, Status: AVAILABLE");
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4811");
        app.Student student3 = new app.Student("EQ-2489", "Equipment ID: EQ-1976, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4812");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-106", "EQ-371", "EQ-1038", "EQ-74");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-4049", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-2190");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-1780", "EQ-1443", "EQ-1928", "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
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
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4813");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        java.lang.String str14 = microscope3.getDescription();
        java.lang.String str15 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "33) test4813(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4724, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-4724, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "15) test4813(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-4724, Name: , Description: , Location: , Status: null" + "'", str15, "Equipment ID: EQ-4724, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4814");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getDescription();
        java.lang.String str12 = microscope3.toString();
        java.lang.String str13 = microscope3.toString();
// flaky "34) test4814(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "16) test4814(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "8) test4814(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "4) test4814(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str12, "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "1) test4814(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str13, "Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4815");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null", "EQ-98");
        app.Arduino arduino7 = new app.Arduino("Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str8 = arduino7.getLocation();
        app.Arduino arduino12 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str13 = arduino12.getEquipmentId();
        app.Microscope microscope17 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str18 = microscope17.getName();
        java.lang.String str19 = microscope17.getDescription();
        app.EquipmentStatus equipmentStatus20 = null;
        microscope17.setStatus(equipmentStatus20);
        app.EquipmentStatus equipmentStatus22 = null;
        microscope17.setStatus(equipmentStatus22);
        java.lang.String str24 = microscope17.toString();
        app.Microscope microscope28 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = microscope28.isAvailable(localDateTime29, localDateTime30);
        app.EquipmentStatus equipmentStatus32 = microscope28.getStatus();
        app.Arduino arduino36 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = arduino36.isAvailable(localDateTime37, localDateTime38);
        java.lang.String str40 = arduino36.getDescription();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = arduino36.isAvailable(localDateTime41, localDateTime42);
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = arduino36.isAvailable(localDateTime44, localDateTime45);
        app.EquipmentStatus equipmentStatus47 = arduino36.getStatus();
        microscope28.setStatus(equipmentStatus47);
        microscope17.setStatus(equipmentStatus47);
        arduino12.setStatus(equipmentStatus47);
        arduino7.setStatus(equipmentStatus47);
        equipment3.setStatus(equipmentStatus47);
        java.lang.String str53 = equipment3.getDescription();
        java.lang.String str54 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
// flaky "35) test4815(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-4728" + "'", str13, "EQ-4728");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky "17) test4815(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equipment ID: EQ-4729, Name: hi!, Description: , Location: hi!, Status: null" + "'", str24, "Equipment ID: EQ-4729, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus32 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus32.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "MasterAdmin123!" + "'", str40, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null" + "'", str53, "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null" + "'", str54, "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4816");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("EQ-862", "EQ-3696", "", "EQ-2986");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4817");
        app.Arduino arduino3 = new app.Arduino("EQ-560", "EQ-1919", "EQ-1792");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1919" + "'", str4, "EQ-1919");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4818");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Lab Manager", "EQ-862", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        app.UserAccounts userAccounts36 = userFactory0.createUser("", "Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1618");
        app.UserAccounts userAccounts41 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1248", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1592");
        app.UserAccounts userAccounts45 = userFactory0.createUser("Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "EQ-1162", "Equipment ID: EQ-2928, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts41);
        org.junit.Assert.assertNull(userAccounts45);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4819");
        app.Equipment equipment3 = new app.Equipment("EQ-469", "EQ-981", "EQ-773");
        app.Microscope microscope7 = new app.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str8 = microscope7.getEquipmentId();
        app.Arduino arduino12 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope16 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus17 = null;
        microscope16.setStatus(equipmentStatus17);
        app.EquipmentStatus equipmentStatus19 = microscope16.getStatus();
        app.Microscope microscope23 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str24 = microscope23.getName();
        java.lang.String str25 = microscope23.getLocation();
        app.EquipmentStatus equipmentStatus26 = microscope23.getStatus();
        microscope16.setStatus(equipmentStatus26);
        arduino12.setStatus(equipmentStatus26);
        java.lang.String str29 = arduino12.getEquipmentId();
        app.Equipment equipment33 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str34 = equipment33.getEquipmentId();
        java.lang.String str35 = equipment33.getName();
        app.EquipmentStatus equipmentStatus36 = equipment33.getStatus();
        arduino12.setStatus(equipmentStatus36);
        microscope7.setStatus(equipmentStatus36);
        java.lang.String str39 = microscope7.getLocation();
        java.lang.String str40 = microscope7.getEquipmentId();
        java.lang.String str41 = microscope7.getEquipmentId();
        app.Equipment equipment45 = new app.Equipment("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str46 = equipment45.getLocation();
        app.EquipmentStatus equipmentStatus47 = equipment45.getStatus();
        microscope7.setStatus(equipmentStatus47);
        equipment3.setStatus(equipmentStatus47);
// flaky "36) test4819(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4734" + "'", str8, "EQ-4734");
        org.junit.Assert.assertNull(equipmentStatus19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(app.EquipmentStatus.AVAILABLE));
// flaky "18) test4819(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EQ-4735" + "'", str29, "EQ-4735");
// flaky "9) test4819(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EQ-4738" + "'", str34, "EQ-4738");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EQ-94" + "'", str35, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus36 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus36.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
// flaky "5) test4819(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EQ-4734" + "'", str40, "EQ-4734");
// flaky "2) test4819(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EQ-4734" + "'", str41, "EQ-4734");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4820");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-3652, Name: Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-2670, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4821");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double10 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.username = "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4822");
        app.Microscope microscope3 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        app.Microscope microscope10 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope10.isAvailable(localDateTime11, localDateTime12);
        app.EquipmentStatus equipmentStatus14 = microscope10.getStatus();
        microscope3.setStatus(equipmentStatus14);
        java.lang.String str16 = microscope3.getDescription();
        java.lang.String str17 = microscope3.getName();
        java.lang.String str18 = microscope3.getName();
        app.Arduino arduino22 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope26 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus27 = null;
        microscope26.setStatus(equipmentStatus27);
        app.EquipmentStatus equipmentStatus29 = microscope26.getStatus();
        app.Microscope microscope33 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str34 = microscope33.getName();
        java.lang.String str35 = microscope33.getLocation();
        app.EquipmentStatus equipmentStatus36 = microscope33.getStatus();
        microscope26.setStatus(equipmentStatus36);
        arduino22.setStatus(equipmentStatus36);
        java.lang.String str39 = arduino22.getEquipmentId();
        app.Equipment equipment43 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str44 = equipment43.getEquipmentId();
        java.lang.String str45 = equipment43.getName();
        app.EquipmentStatus equipmentStatus46 = equipment43.getStatus();
        arduino22.setStatus(equipmentStatus46);
        microscope3.setStatus(equipmentStatus46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "COORD-001" + "'", str16, "COORD-001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
        org.junit.Assert.assertNull(equipmentStatus29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus36 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus36.equals(app.EquipmentStatus.AVAILABLE));
// flaky "37) test4822(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EQ-4743" + "'", str39, "EQ-4743");
// flaky "19) test4822(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EQ-4746" + "'", str44, "EQ-4746");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EQ-94" + "'", str45, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus46 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus46.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4823");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-3152, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4824");
        app.Faculty faculty3 = new app.Faculty("MANAGER-0", "", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4825");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-2303, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2485, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4826");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "38) test4826(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4748" + "'", str4, "EQ-4748");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4827");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("", "EQ-3961");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4828");
        app.Microscope microscope3 = new app.Microscope("EQ-2149", "EQ-1940", "EQ-2683");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4829");
        app.Student student3 = new app.Student("EQ-1427", "Equipment ID: EQ-3912, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4830");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "39) test4830(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4752, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-4752, Name: , Description: , Location: , Status: null");
// flaky "20) test4830(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-4752" + "'", str11, "EQ-4752");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4831");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1476");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4832");
        app.Microscope microscope3 = new app.Microscope("EQ-578", "EQ-1039", "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "40) test4832(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4754" + "'", str4, "EQ-4754");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4833");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-258");
        boolean boolean4 = guest3.needsapproval;
        boolean boolean5 = guest3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4834");
        app.Equipment equipment3 = new app.Equipment("Guest", "EQ-36", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.toString();
        java.lang.String str7 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-36" + "'", str4, "EQ-36");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "41) test4834(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-4755, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-4755, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-36" + "'", str7, "EQ-36");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4835");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3083", "EQ-3985");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4836");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-1919", "Equipment ID: EQ-684, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        headLabCoordinator0.username = "Equipment ID: EQ-4017, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4837");
        app.Equipment equipment3 = new app.Equipment("", "Equipment ID: EQ-3444, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-3750");
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4838");
        app.Equipment equipment3 = new app.Equipment("EQ-281", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-569");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4839");
        app.Researcher researcher3 = new app.Researcher("COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4840");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1747");
        boolean boolean14 = labManager13.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4841");
        app.Microscope microscope3 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        app.Microscope microscope10 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope10.isAvailable(localDateTime11, localDateTime12);
        app.EquipmentStatus equipmentStatus14 = microscope10.getStatus();
        microscope3.setStatus(equipmentStatus14);
        app.EquipmentStatus equipmentStatus16 = microscope3.getStatus();
        java.lang.String str17 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4842");
        app.Faculty faculty3 = new app.Faculty("EQ-94", "EQ-209", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4843");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.password;
        java.lang.String str8 = guest3.getRegistrationId();
        guest3.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4844");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        boolean boolean9 = labManager8.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4845");
        app.Student student3 = new app.Student("Equipment ID: EQ-3652, Name: Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-2670, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-486", "Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4846");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        java.lang.String str7 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4847");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2903, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-4702, Name: , Description: , Location: , Status: null", "EQ-4470");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4848");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.username;
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-1643", "EQ-451");
        headLabCoordinator0.username = "Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-4017, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str7, "Equipment ID: EQ-4017, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4849");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        student3.password = "Researcher";
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4850");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-684", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        labManager8.password = "EQ-2013";
        double double11 = labManager8.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4851");
        app.Equipment equipment3 = new app.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-63" + "'", str5, "EQ-63");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-114" + "'", str6, "EQ-114");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4852");
        app.Student student3 = new app.Student("EQ-104", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        student3.needsapproval = true;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4853");
        app.Faculty faculty3 = new app.Faculty("EQ-156", "EQ-152", "EQ-296");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4854");
        app.Student student3 = new app.Student("MANAGER-0", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        student3.isapproved = false;
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4855");
        app.Guest guest3 = new app.Guest("EQ-36", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-39");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4856");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        headLabCoordinator0.username = "COORD-001";
        java.lang.String str5 = headLabCoordinator0.username;
        headLabCoordinator0.username = "EQ-2532";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE" + "'", str2, "Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4857");
        app.Guest guest3 = new app.Guest("EQ-2469", "", "EQ-99");
        java.lang.String str4 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4858");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1991, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-4110, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-2340", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1991, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4859");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isapproved;
        java.lang.String str7 = faculty3.password;
        java.lang.String str8 = faculty3.password;
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-193" + "'", str4, "EQ-193");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4860");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-1832", "Equipment ID: EQ-4729, Name: hi!, Description: , Location: hi!, Status: null", "EQ-1346");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4861");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-826", "EQ-371");
        app.Arduino arduino7 = new app.Arduino("EQ-253", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "");
        java.lang.String str8 = arduino7.getName();
        java.lang.String str9 = arduino7.getDescription();
        app.Equipment equipment13 = new app.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.lang.String str14 = equipment13.getDescription();
        app.Microscope microscope18 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str19 = microscope18.getDescription();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = microscope18.isAvailable(localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = microscope18.isAvailable(localDateTime23, localDateTime24);
        app.EquipmentStatus equipmentStatus26 = microscope18.getStatus();
        app.EquipmentStatus equipmentStatus27 = microscope18.getStatus();
        equipment13.setStatus(equipmentStatus27);
        arduino7.setStatus(equipmentStatus27);
        app.Microscope microscope33 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str34 = microscope33.getLocation();
        app.Microscope microscope38 = new app.Microscope("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "EQ-39", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus39 = microscope38.getStatus();
        microscope33.setStatus(equipmentStatus39);
        arduino7.setStatus(equipmentStatus39);
        microscope3.setStatus(equipmentStatus39);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-253" + "'", str8, "EQ-253");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str14, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "COORD-001" + "'", str34, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus39 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus39.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4862");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-333", "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts21 = userFactory0.createUser("EQ-4008", "EQ-3001", "EQ-2821");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4863");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4864");
        app.Researcher researcher3 = new app.Researcher("Faculty", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null");
        researcher3.isapproved = true;
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4865");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getEquipmentId();
        app.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
// flaky "42) test4865(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4769" + "'", str4, "EQ-4769");
// flaky "21) test4865(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4769, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4769, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
// flaky "10) test4865(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-4769" + "'", str6, "EQ-4769");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4866");
        app.Student student3 = new app.Student("", "EQ-1530", "EQ-4557");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4867");
        app.Microscope microscope3 = new app.Microscope("EQ-389", "EQ-1557", "Equipment ID: EQ-1878, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        app.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
// flaky "43) test4867(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4770" + "'", str4, "EQ-4770");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4868");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-1080", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.Class<?> wildcardClass5 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4869");
        app.Faculty faculty3 = new app.Faculty("EQ-341", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2071, Name: , Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
        faculty3.needsapproval = false;
        faculty3.username = "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE";
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4870");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4109, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2819");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4871");
        app.Student student3 = new app.Student("Equipment ID: EQ-2607, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1837, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4872");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = arduino3.isAvailable(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = arduino3.isAvailable(localDateTime16, localDateTime17);
        java.lang.String str19 = arduino3.getEquipmentId();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "44) test4872(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4772" + "'", str8, "EQ-4772");
// flaky "22) test4872(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-4772" + "'", str9, "EQ-4772");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "11) test4872(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ-4772" + "'", str19, "EQ-4772");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4873");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.username;
        faculty3.username = "EQ-205";
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4874");
        app.Microscope microscope3 = new app.Microscope("EQ-4137", "", "EQ-4769");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4875");
        app.Researcher researcher3 = new app.Researcher("EQ-1176", "EQ-4534", "EQ-3556");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4876");
        app.Microscope microscope3 = new app.Microscope("", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "45) test4876(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4774" + "'", str4, "EQ-4774");
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4877");
        app.Arduino arduino3 = new app.Arduino("EQ-104", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4878");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4879");
        app.Equipment equipment3 = new app.Equipment("EQ-74", "EQ-118", "EQ-371");
        java.lang.String str4 = equipment3.toString();
// flaky "46) test4879(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4778, Name: EQ-74, Description: EQ-118, Location: EQ-371, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4778, Name: EQ-74, Description: EQ-118, Location: EQ-371, Status: AVAILABLE");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4880");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "EQ-742");
        boolean boolean16 = labManager15.needsapproval;
        labManager15.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4881");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getLocation();
        java.lang.String str8 = microscope3.getName();
        app.Microscope microscope12 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope12.isAvailable(localDateTime13, localDateTime14);
        app.EquipmentStatus equipmentStatus16 = microscope12.getStatus();
        microscope3.setStatus(equipmentStatus16);
        app.EquipmentStatus equipmentStatus18 = microscope3.getStatus();
        java.lang.String str19 = microscope3.getLocation();
        java.lang.String str20 = microscope3.getName();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4882");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4883");
        app.Microscope microscope3 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4884");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2024");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4885");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str10 = guest3.getAccountType();
        guest3.needsapproval = true;
        java.lang.String str13 = guest3.getAccountType();
        guest3.needsapproval = true;
        java.lang.String str16 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4886");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2546, Name: EQ-92, Description: EQ-1476, Location: Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-3043", "EQ-1788", "MANAGER-1244835102");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2546, Name: EQ-92, Description: EQ-1476, Location: Equipment ID: EQ-2417, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4887");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4888");
        app.Guest guest3 = new app.Guest("EQ-4348", "Equipment ID: EQ-1837, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-2967, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4889");
        app.Student student3 = new app.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4890");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-4778, Name: EQ-74, Description: EQ-118, Location: EQ-371, Status: AVAILABLE", "MANAGER-1087176903", "EQ-1102");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4891");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4892");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4502, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE", "EQ-3669", "MANAGER-597445801");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4893");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.needsapproval = false;
        java.lang.String str6 = labManager3.getRegistrationId();
        labManager3.password = "Equipment ID: EQ-1080, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MANAGER-103232" + "'", str6, "MANAGER-103232");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4894");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-304", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "EQ-392");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-419", "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null", "EQ-558", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-1313", "EQ-3718", "EQ-4017", "");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4895");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236", "MANAGER-66180900");
        faculty3.needsapproval = false;
        boolean boolean6 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4896");
        app.Faculty faculty3 = new app.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getRegistrationId();
        boolean boolean10 = faculty3.needsapproval;
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-41" + "'", str9, "EQ-41");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4897");
        app.Microscope microscope3 = new app.Microscope("EQ-1103", "Equipment ID: EQ-1867, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-368");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4898");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        boolean boolean7 = researcher3.isapproved;
        java.lang.String str8 = researcher3.getRegistrationId();
        boolean boolean9 = researcher3.isapproved;
        researcher3.username = "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str12 = researcher3.username;
        java.lang.String str13 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4899");
        app.Microscope microscope3 = new app.Microscope("EQ-539", "EQ-131", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        app.Arduino arduino7 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str8 = arduino7.getEquipmentId();
        app.Microscope microscope12 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str13 = microscope12.getName();
        java.lang.String str14 = microscope12.getDescription();
        app.EquipmentStatus equipmentStatus15 = null;
        microscope12.setStatus(equipmentStatus15);
        app.EquipmentStatus equipmentStatus17 = null;
        microscope12.setStatus(equipmentStatus17);
        java.lang.String str19 = microscope12.toString();
        app.Microscope microscope23 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = microscope23.isAvailable(localDateTime24, localDateTime25);
        app.EquipmentStatus equipmentStatus27 = microscope23.getStatus();
        app.Arduino arduino31 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
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
        app.EquipmentStatus equipmentStatus42 = arduino31.getStatus();
        microscope23.setStatus(equipmentStatus42);
        microscope12.setStatus(equipmentStatus42);
        arduino7.setStatus(equipmentStatus42);
        microscope3.setStatus(equipmentStatus42);
        java.lang.String str47 = microscope3.toString();
// flaky "47) test4899(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4788" + "'", str8, "EQ-4788");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "23) test4899(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-4789, Name: hi!, Description: , Location: hi!, Status: null" + "'", str19, "Equipment ID: EQ-4789, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MasterAdmin123!" + "'", str35, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus42 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus42.equals(app.EquipmentStatus.AVAILABLE));
// flaky "12) test4899(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Equipment ID: EQ-4787, Name: EQ-539, Description: EQ-131, Location: Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Status: AVAILABLE" + "'", str47, "Equipment ID: EQ-4787, Name: EQ-539, Description: EQ-131, Location: Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4900");
        app.Arduino arduino3 = new app.Arduino("EQ-2090", "EQ-1082", "Equipment ID: EQ-4167, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4901");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-36", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        double double5 = guest3.getHourlyRate();
        guest3.needsapproval = false;
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4902");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        boolean boolean9 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "");
        app.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("Researcher", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager17.isapproved = true;
        labManager17.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager17);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4903");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-981", "EQ-221");
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.isapproved = true;
        app.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4749, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1745, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager20);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4904");
        app.Arduino arduino3 = new app.Arduino("EQ-301", "", "EQ-451");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "48) test4904(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4794, Name: EQ-301, Description: , Location: EQ-451, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4794, Name: EQ-301, Description: , Location: EQ-451, Status: AVAILABLE");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4905");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-1341", "EQ-688");
        boolean boolean8 = headLabCoordinator0.needsapproval;
        boolean boolean9 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4906");
        app.Student student3 = new app.Student("Equipment ID: EQ-2693, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MANAGER-1863804858");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4907");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        labManager5.isapproved = false;
        labManager5.isapproved = false;
        labManager5.isapproved = true;
        java.lang.String str14 = labManager5.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MANAGER-0" + "'", str14, "MANAGER-0");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4908");
        app.Student student3 = new app.Student("Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-275", "EQ-99");
        java.lang.String str4 = student3.getRegistrationId();
        java.lang.String str5 = student3.getRegistrationId();
        boolean boolean6 = student3.needsapproval;
        student3.password = "Equipment ID: EQ-4039, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-99" + "'", str4, "EQ-99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-99" + "'", str5, "EQ-99");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4909");
        app.Arduino arduino3 = new app.Arduino("EQ-4772", "EQ-514", "");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4910");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        labManager10.username = "EQ-75";
        boolean boolean13 = labManager10.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4911");
        app.Student student3 = new app.Student("Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4046, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-4599");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4912");
        app.Student student3 = new app.Student("Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-2737", "EQ-596");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4913");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-937");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4914");
        app.Arduino arduino3 = new app.Arduino("EQ-690", "EQ-253", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-690" + "'", str4, "EQ-690");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4915");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3416, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1476", "Equipment ID: EQ-4729, Name: hi!, Description: , Location: hi!, Status: null", "EQ-449");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3416, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4916");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-205");
        boolean boolean4 = guest3.isapproved;
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4917");
        app.Equipment equipment3 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.toString();
// flaky "49) test4917(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4797, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4797, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4918");
        app.Guest guest3 = new app.Guest("EQ-301", "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
        guest3.needsapproval = false;
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4919");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-630", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4920");
        app.Microscope microscope3 = new app.Microscope("EQ-2699", "Equipment ID: EQ-2485, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4921");
        app.Faculty faculty3 = new app.Faculty("EQ-3281", "EQ-547", "EQ-2938");
        faculty3.needsapproval = false;
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4922");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4923");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getDescription();
        app.Arduino arduino9 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        app.Microscope microscope13 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus14 = null;
        microscope13.setStatus(equipmentStatus14);
        app.EquipmentStatus equipmentStatus16 = microscope13.getStatus();
        app.Microscope microscope20 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str21 = microscope20.getName();
        java.lang.String str22 = microscope20.getLocation();
        app.EquipmentStatus equipmentStatus23 = microscope20.getStatus();
        microscope13.setStatus(equipmentStatus23);
        arduino9.setStatus(equipmentStatus23);
        java.lang.String str26 = arduino9.getEquipmentId();
        app.Equipment equipment30 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str31 = equipment30.getEquipmentId();
        java.lang.String str32 = equipment30.getName();
        app.EquipmentStatus equipmentStatus33 = equipment30.getStatus();
        arduino9.setStatus(equipmentStatus33);
        equipment3.setStatus(equipmentStatus33);
        java.lang.Class<?> wildcardClass36 = equipmentStatus33.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
// flaky "50) test4923(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-4801" + "'", str26, "EQ-4801");
// flaky "24) test4923(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-4804" + "'", str31, "EQ-4804");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EQ-94" + "'", str32, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4924");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getRegistrationId();
        java.lang.String str8 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4925");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        labManager3.needsapproval = false;
        labManager3.username = "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str11 = labManager3.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str11, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4926");
        app.Arduino arduino3 = new app.Arduino("", "EQ-773", "EQ-4551");
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4927");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1219", "EQ-2995");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4928");
        app.Student student3 = new app.Student("EQ-1624", "EQ-461", "EQ-104");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4929");
        app.Faculty faculty3 = new app.Faculty("Head Lab Coordinator", "EQ-92", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4930");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.password;
        boolean boolean7 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4931");
        app.Equipment equipment3 = new app.Equipment("EQ-106", "hi!", "EQ-74");
        app.Microscope microscope7 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus8 = microscope7.getStatus();
        equipment3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4932");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001");
        app.UserAccounts userAccounts13 = userFactory0.createUser("EQ-4422", "EQ-760", "EQ-1454");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4933");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-3651, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2625", "Equipment ID: EQ-3779, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4934");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.username;
        java.lang.String str10 = guest3.password;
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4935");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        java.lang.String str6 = researcher3.getRegistrationId();
        double double7 = researcher3.getHourlyRate();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        double double10 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4936");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = arduino3.toString();
// flaky "51) test4936(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4811, Name: Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4811, Name: Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4937");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.password = "EQ-120";
        researcher3.username = "EQ-1050";
        researcher3.username = "EQ-2670";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4938");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.password;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4939");
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
        app.LabManager labManager21 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2601, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-690");
        java.lang.String str22 = labManager21.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
// flaky "52) test4939(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Lab Manager" + "'", str22, "Lab Manager");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4940");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1526, Name: , Description: , Location: , Status: null", "EQ-1742", "");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4941");
        app.Microscope microscope3 = new app.Microscope("EQ-4769", "EQ-4264", "EQ-3149");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4942");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3892, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-3310", "");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4943");
        app.Guest guest3 = new app.Guest("EQ-382", "EQ-1340", "Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.username;
        guest3.username = "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-382" + "'", str4, "EQ-382");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4944");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.password;
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4945");
        app.Student student3 = new app.Student("Student", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-296");
        student3.isapproved = false;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4946");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4947");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        headLabCoordinator0.isapproved = false;
        java.lang.String str9 = headLabCoordinator0.password;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-1116", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4948");
        app.Student student3 = new app.Student("EQ-258", "EQ-92", "EQ-299");
        java.lang.String str4 = student3.getAccountType();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.password;
        boolean boolean7 = student3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-92" + "'", str6, "EQ-92");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4949");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2343, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-2465", "EQ-451");
        faculty3.username = "EQ-778";
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4950");
        app.Student student3 = new app.Student("Equipment ID: EQ-2940, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4951");
        app.Student student3 = new app.Student("Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2881, Name: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4952");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-246", "EQ-1179");
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4953");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-4312, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE", "EQ-1592", "EQ-976");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4954");
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
        java.lang.String str16 = microscope3.getLocation();
        java.lang.String str17 = microscope3.toString();
        app.EquipmentStatus equipmentStatus18 = microscope3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "53) test4954(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-4814" + "'", str10, "EQ-4814");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "25) test4954(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-4814, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-4814, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus18);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4955");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("", "EQ-2195");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4956");
        app.Guest guest3 = new app.Guest("EQ-476", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-335");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.Class<?> wildcardClass5 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4957");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("", "EQ-1665", "Equipment ID: EQ-2914, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4958");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.needsapproval;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4959");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!");
        java.lang.String str4 = labManager3.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4960");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4961");
        app.Arduino arduino3 = new app.Arduino("EQ-596", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.getLocation();
        java.lang.String str7 = arduino3.getLocation();
        app.Microscope microscope11 = new app.Microscope("hi!", "", "hi!");
        app.EquipmentStatus equipmentStatus12 = microscope11.getStatus();
        arduino3.setStatus(equipmentStatus12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-596" + "'", str4, "EQ-596");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-596" + "'", str5, "EQ-596");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4962");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-435", "EQ-811");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4963");
        app.Faculty faculty3 = new app.Faculty("EQ-1794", "EQ-2143", "EQ-628");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4964");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-469", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts19 = userFactory0.createUser("EQ-552", "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-4722, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4965");
        app.Microscope microscope3 = new app.Microscope("EQ-690", "Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null", "EQ-367");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4966");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4167, Name: , Description: , Location: , Status: null", "EQ-3919", "EQ-3746");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4967");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.password = "EQ-205";
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
// flaky "54) test4967(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4968");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        boolean boolean11 = headLabCoordinator0.isapproved;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-246");
        java.lang.String str15 = headLabCoordinator0.password;
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4969");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.password;
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.password = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4970");
        app.Faculty faculty3 = new app.Faculty("EQ-866", "Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-435");
        boolean boolean4 = faculty3.needsapproval;
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4971");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        java.lang.String str15 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass16 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "55) test4971(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-4818, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-4818, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "26) test4971(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-4818" + "'", str15, "EQ-4818");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4972");
        app.Faculty faculty3 = new app.Faculty("EQ-1364", "Equipment ID: EQ-4401, Name: , Description: , Location: , Status: null", "EQ-981");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4973");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2847, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-3430", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4974");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2073, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-4498, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
        guest3.username = "EQ-3705";
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4975");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "56) test4975(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4819" + "'", str4, "EQ-4819");
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4976");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        app.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        app.Arduino arduino15 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus16 = null;
        arduino15.setStatus(equipmentStatus16);
        app.EquipmentStatus equipmentStatus18 = arduino15.getStatus();
        java.lang.String str19 = arduino15.getLocation();
        java.lang.String str20 = arduino15.getEquipmentId();
        java.lang.String str21 = arduino15.getEquipmentId();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = arduino15.isAvailable(localDateTime22, localDateTime23);
        java.lang.String str25 = arduino15.getLocation();
        java.lang.String str26 = arduino15.getLocation();
        app.Microscope microscope30 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str31 = microscope30.getDescription();
        java.lang.String str32 = microscope30.toString();
        app.Microscope microscope36 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus37 = null;
        microscope36.setStatus(equipmentStatus37);
        app.EquipmentStatus equipmentStatus39 = microscope36.getStatus();
        java.lang.String str40 = microscope36.getLocation();
        java.lang.String str41 = microscope36.getName();
        app.Microscope microscope45 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = microscope45.isAvailable(localDateTime46, localDateTime47);
        app.EquipmentStatus equipmentStatus49 = microscope45.getStatus();
        microscope36.setStatus(equipmentStatus49);
        microscope30.setStatus(equipmentStatus49);
        arduino15.setStatus(equipmentStatus49);
        microscope3.setStatus(equipmentStatus49);
        java.lang.String str54 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentStatus18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
// flaky "57) test4976(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-4821" + "'", str20, "EQ-4821");
// flaky "27) test4976(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EQ-4821" + "'", str21, "EQ-4821");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str31, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
// flaky "13) test4976(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Equipment ID: EQ-4822, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str32, "Equipment ID: EQ-4822, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(equipmentStatus39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus49 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus49.equals(app.EquipmentStatus.AVAILABLE));
// flaky "6) test4976(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Equipment ID: EQ-4820, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str54, "Equipment ID: EQ-4820, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4977");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2281, Name: , Description: , Location: , Status: null", "EQ-528");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4978");
        app.Faculty faculty3 = new app.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        boolean boolean5 = faculty3.isapproved;
        java.lang.String str6 = faculty3.getRegistrationId();
        java.lang.String str7 = faculty3.getRegistrationId();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4979");
        app.Student student3 = new app.Student("EQ-3260", "EQ-2644", "EQ-2704");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4980");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-99", "EQ-104");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-99" + "'", str4, "EQ-99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4981");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4982");
        app.Faculty faculty3 = new app.Faculty("EQ-461", "EQ-304", "EQ-231");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4983");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "", "EQ-384");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        app.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        java.lang.String str8 = microscope3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
// flaky "58) test4983(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-4825" + "'", str8, "EQ-4825");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4984");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-4423, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2817, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4985");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-4475", "EQ-583", "Equipment ID: EQ-2533, Name: , Description: , Location: , Status: null", "EQ-2020");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-4475");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4986");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        double double6 = labManager5.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4987");
        app.Equipment equipment3 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        app.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getLocation();
        java.lang.String str8 = equipment3.getDescription();
        java.lang.String str9 = equipment3.toString();
// flaky "59) test4987(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4827" + "'", str4, "EQ-4827");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str8, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
// flaky "28) test4987(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-4827, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-4827, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4988");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3995, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-2519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-976, Status: AVAILABLE", "Equipment ID: EQ-3220, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-4127");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "60) test4988(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-4828" + "'", str4, "EQ-4828");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4989");
        app.Microscope microscope3 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.toString();
        app.Microscope microscope9 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus10 = null;
        microscope9.setStatus(equipmentStatus10);
        app.EquipmentStatus equipmentStatus12 = microscope9.getStatus();
        java.lang.String str13 = microscope9.getLocation();
        java.lang.String str14 = microscope9.getName();
        app.Microscope microscope18 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = microscope18.isAvailable(localDateTime19, localDateTime20);
        app.EquipmentStatus equipmentStatus22 = microscope18.getStatus();
        microscope9.setStatus(equipmentStatus22);
        microscope3.setStatus(equipmentStatus22);
        app.EquipmentStatus equipmentStatus25 = microscope3.getStatus();
        app.Microscope microscope29 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str30 = microscope29.getLocation();
        app.Equipment equipment34 = new app.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus35 = equipment34.getStatus();
        microscope29.setStatus(equipmentStatus35);
        app.Microscope microscope40 = new app.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        app.Microscope microscope44 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str45 = microscope44.getName();
        java.lang.String str46 = microscope44.getLocation();
        java.lang.String str47 = microscope44.getName();
        java.lang.String str48 = microscope44.getName();
        app.Microscope microscope52 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus53 = null;
        microscope52.setStatus(equipmentStatus53);
        app.EquipmentStatus equipmentStatus55 = null;
        microscope52.setStatus(equipmentStatus55);
        java.lang.String str57 = microscope52.getName();
        app.Arduino arduino61 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope65 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str66 = microscope65.getName();
        java.lang.String str67 = microscope65.getLocation();
        app.EquipmentStatus equipmentStatus68 = microscope65.getStatus();
        arduino61.setStatus(equipmentStatus68);
        microscope52.setStatus(equipmentStatus68);
        microscope44.setStatus(equipmentStatus68);
        microscope40.setStatus(equipmentStatus68);
        microscope29.setStatus(equipmentStatus68);
        microscope3.setStatus(equipmentStatus68);
        java.lang.String str75 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
// flaky "61) test4989(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-4829, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-4829, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(equipmentStatus12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus25 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus25.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus35 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus35.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus68 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus68.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "COORD-001" + "'", str75, "COORD-001");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4990");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-4386", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-528");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4991");
        app.Researcher researcher3 = new app.Researcher("EQ-2020", "EQ-1543", "EQ-2996");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4992");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-628", "Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "EQ-470", "MANAGER-824727143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-628");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4993");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-2059, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null", "EQ-2340");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.isapproved = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4994");
        app.Student student3 = new app.Student("EQ-932", "EQ-640", "EQ-231");
        java.lang.String str4 = student3.getRegistrationId();
        student3.needsapproval = true;
        java.lang.String str7 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-231" + "'", str4, "EQ-231");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-640" + "'", str7, "EQ-640");
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4995");
        app.Faculty faculty3 = new app.Faculty("EQ-4018", "EQ-1161", "Equipment ID: EQ-3064, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4996");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getName();
        java.lang.String str6 = microscope3.getLocation();
        app.Microscope microscope10 = new app.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
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
        microscope10.setStatus(equipmentStatus38);
        microscope3.setStatus(equipmentStatus38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4997");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-684", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3764, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-1735, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        double double12 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "62) test4997(src.test.randoop.AleenaTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4998");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null", "EQ-104");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test4999");
        app.Student student3 = new app.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        java.lang.String str6 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-1171, Name: , Description: , Location: , Status: null";
        student3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest9.test5000");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "EQ-341");
        java.lang.String str4 = guest3.username;
        java.lang.String str5 = guest3.getAccountType();
        guest3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }
}
