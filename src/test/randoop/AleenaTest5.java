package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2501");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-616", "EQ-2146", "EQ-41", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-616");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2502");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.password;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "1) test2502(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "1) test2502(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "1) test2502(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "1) test2502(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2503");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "EQ-98");
        faculty3.username = "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null";
        faculty3.isapproved = false;
        faculty3.password = "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null";
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2504");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2505");
        app.Faculty faculty3 = new app.Faculty("EQ-637", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2506");
        app.Student student3 = new app.Student("Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-558", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        student3.isapproved = false;
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2507");
        app.Arduino arduino3 = new app.Arduino("EQ-3083", "Equipment ID: EQ-1645, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE", "");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2508");
        app.Arduino arduino3 = new app.Arduino("EQ-1872", "Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1808, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2509");
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
        faculty3.password = "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2510");
        app.Student student3 = new app.Student("EQ-253", "EQ-1981", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2511");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str13 = labManager12.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "2) test2511(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2512");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-685", "EQ-63");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2513");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-120", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts30 = userFactory0.createUser("EQ-690", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Guest", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts35 = userFactory0.createUser("Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2769, Name: EQ-36, Description: EQ-931, Location: EQ-1042, Status: AVAILABLE", "EQ-384", "Head Lab Coordinator");
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2514");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-94", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null", "EQ-2938", "EQ-2519");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-94");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2515");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        guest3.password = "Equipment ID: EQ-1699, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE";
        boolean boolean7 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2516");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-570");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2517");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.username;
        faculty3.password = "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2518");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("", "Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2519");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        boolean boolean7 = researcher3.isapproved;
        java.lang.String str8 = researcher3.getRegistrationId();
        boolean boolean9 = researcher3.isapproved;
        researcher3.username = "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str12 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2520");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null", "EQ-1192");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "3) test2520(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3119" + "'", str4, "EQ-3119");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2521");
        app.Microscope microscope3 = new app.Microscope("EQ-264", "Student", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-264" + "'", str4, "EQ-264");
// flaky "4) test2521(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2522");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "EQ-1045";
        headLabCoordinator0.username = "Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null";
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2523");
        app.Microscope microscope3 = new app.Microscope("EQ-698", "EQ-242", "");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2524");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2886, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1005");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2525");
        app.Researcher researcher3 = new app.Researcher("EQ-2625", "Equipment ID: EQ-2990, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2526");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2527");
        app.Arduino arduino3 = new app.Arduino("EQ-2409", "Equipment ID: EQ-2807, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1616");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2528");
        app.Faculty faculty3 = new app.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.username;
        java.lang.String str6 = faculty3.getAccountType();
        boolean boolean7 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2529");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        researcher3.password = "";
        java.lang.String str12 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2530");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-946", "EQ-2595", "EQ-2999", "Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-946");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2531");
        app.Faculty faculty3 = new app.Faculty("", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-2652, Name: Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-920, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-513, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2532");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getAccountType();
        boolean boolean5 = guest3.isapproved;
        guest3.username = "Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE";
        java.lang.String str8 = guest3.getAccountType();
        guest3.username = "EQ-344";
        double double11 = guest3.getHourlyRate();
        java.lang.String str12 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2533");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2883", "EQ-1557");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2534");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        java.lang.String str4 = headLabCoordinator0.username;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        double double9 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-1045" + "'", str1, "EQ-1045");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2535");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = labManager9.password;
        java.lang.String str11 = labManager9.password;
        java.lang.Class<?> wildcardClass12 = labManager9.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2536");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "5) test2536(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1045" + "'", str9, "EQ-1045");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2537");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2465, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1632, Name: , Description: , Location: , Status: null", "EQ-1762");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2538");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.username = "EQ-2192";
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
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2539");
        app.Equipment equipment3 = new app.Equipment("EQ-2423", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2904");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2540");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.isapproved = false;
        java.lang.String str14 = guest3.getAccountType();
        java.lang.String str15 = guest3.getAccountType();
        java.lang.String str16 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2541");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = false;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        java.lang.String str14 = headLabCoordinator0.password;
        headLabCoordinator0.username = "EQ-275";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2542");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts21 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-503", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2995", "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2543");
        app.Faculty faculty3 = new app.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        boolean boolean5 = faculty3.isapproved;
        java.lang.String str6 = faculty3.getRegistrationId();
        boolean boolean7 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2544");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-367");
        java.lang.String str4 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2545");
        app.Equipment equipment3 = new app.Equipment("EQ-784", "EQ-2325", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2546");
        app.Microscope microscope3 = new app.Microscope("Faculty", "Equipment ID: EQ-829, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
// flaky "6) test2546(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3131, Name: Faculty, Description: Equipment ID: EQ-829, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3131, Name: Faculty, Description: Equipment ID: EQ-829, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2547");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null");
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-2737", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-1906", "EQ-688");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2548");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-63", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "7) test2548(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3132" + "'", str4, "EQ-3132");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2549");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1045", "", "EQ-1970", "EQ-583");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1045");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2550");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        boolean boolean11 = researcher3.needsapproval;
        researcher3.needsapproval = false;
        java.lang.String str14 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2551");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-558", "EQ-559");
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1962, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2552");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-3097, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2497", "EQ-2104");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2553");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.username = "EQ-275";
        java.lang.String str6 = faculty3.username;
        java.lang.String str7 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-275" + "'", str6, "EQ-275");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2554");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-781", "EQ-937", "EQ-2113", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-781");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2555");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        double double4 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-1005");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2556");
        app.Student student3 = new app.Student("EQ-152", "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-2293");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2557");
        app.Researcher researcher3 = new app.Researcher("MANAGER-0", "EQ-264", "");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.getRegistrationId();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-264" + "'", str4, "EQ-264");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2558");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("", "Equipment ID: EQ-2566, Name: Equipment ID: EQ-232, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "", "Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2559");
        app.Researcher researcher3 = new app.Researcher("", "Equipment ID: EQ-2683, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2560");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-2692, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2561");
        app.Researcher researcher3 = new app.Researcher("EQ-2104", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1794");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2562");
        app.Student student3 = new app.Student("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "", "EQ-655");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2563");
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
        boolean boolean15 = faculty3.needsapproval;
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getAccountType();
        boolean boolean18 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2564");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "", "EQ-442");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2565");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-1592", "EQ-742");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2566");
        app.Student student3 = new app.Student("EQ-503", "Equipment ID: EQ-2683, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2567");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        java.lang.String str11 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str14 = headLabCoordinator0.getRegistrationId();
        java.lang.String str15 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "8) test2567(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COORD-001" + "'", str14, "COORD-001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2568");
        app.Arduino arduino3 = new app.Arduino("EQ-981", "Equipment ID: EQ-1755, Name: EQ-118, Description: EQ-75, Location: MANAGER-66180900, Status: AVAILABLE", "EQ-2460");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2569");
        app.Faculty faculty3 = new app.Faculty("EQ-2052", "EQ-2228", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2570");
        app.Guest guest3 = new app.Guest("EQ-253", "EQ-284", "");
        java.lang.String str4 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-284" + "'", str4, "EQ-284");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2571");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.password;
        boolean boolean6 = student3.isapproved;
        student3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2572");
        app.Student student3 = new app.Student("EQ-603", "COORD-001", "EQ-422");
        student3.isapproved = false;
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2573");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-94", "EQ-99");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getDescription();
        java.lang.String str6 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-94" + "'", str4, "EQ-94");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
// flaky "9) test2573(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3144" + "'", str6, "EQ-3144");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2574");
        app.Guest guest3 = new app.Guest("EQ-2585", "EQ-205", "EQ-1446");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2575");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null", "EQ-114");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2576");
        app.Equipment equipment3 = new app.Equipment("EQ-281", "", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2577");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-1341", "EQ-1042");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-829, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2578");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2271, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "10) test2578(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3149" + "'", str4, "EQ-3149");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2579");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2580");
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
        java.lang.String str19 = microscope3.getEquipmentId();
        java.lang.String str20 = microscope3.getLocation();
        java.lang.String str21 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
// flaky "11) test2580(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ-3150" + "'", str19, "EQ-3150");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2581");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        java.lang.String str11 = microscope3.getEquipmentId();
        app.Microscope microscope15 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str16 = microscope15.getName();
        java.lang.String str17 = microscope15.getName();
        java.lang.String str18 = microscope15.getLocation();
        app.EquipmentStatus equipmentStatus19 = microscope15.getStatus();
        microscope3.setStatus(equipmentStatus19);
        java.lang.String str21 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "12) test2581(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3152, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-3152, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "2) test2581(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-3152" + "'", str11, "EQ-3152");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2582");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-1992, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-2466", "EQ-760");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-2024", "EQ-2114", "Equipment ID: EQ-1743, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2583");
        app.Arduino arduino3 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope7 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        app.EquipmentStatus equipmentStatus10 = null;
        microscope7.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope7.getName();
        java.lang.String str13 = microscope7.toString();
        java.lang.String str14 = microscope7.getLocation();
        app.EquipmentStatus equipmentStatus15 = microscope7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = microscope7.isAvailable(localDateTime16, localDateTime17);
        app.Microscope microscope22 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus23 = null;
        microscope22.setStatus(equipmentStatus23);
        app.EquipmentStatus equipmentStatus25 = microscope22.getStatus();
        java.lang.String str26 = microscope22.getLocation();
        java.lang.String str27 = microscope22.getName();
        app.Microscope microscope31 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = microscope31.isAvailable(localDateTime32, localDateTime33);
        app.EquipmentStatus equipmentStatus35 = microscope31.getStatus();
        microscope22.setStatus(equipmentStatus35);
        app.EquipmentStatus equipmentStatus37 = microscope22.getStatus();
        app.EquipmentStatus equipmentStatus38 = microscope22.getStatus();
        microscope7.setStatus(equipmentStatus38);
        app.Arduino arduino43 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope47 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str48 = microscope47.getName();
        java.lang.String str49 = microscope47.getLocation();
        app.EquipmentStatus equipmentStatus50 = microscope47.getStatus();
        arduino43.setStatus(equipmentStatus50);
        java.lang.String str52 = arduino43.getDescription();
        app.EquipmentStatus equipmentStatus53 = arduino43.getStatus();
        microscope7.setStatus(equipmentStatus53);
        arduino3.setStatus(equipmentStatus53);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "13) test2583(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-3156, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-3156, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipmentStatus15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(equipmentStatus25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus35 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus35.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus50 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus50.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Researcher" + "'", str52, "Researcher");
        org.junit.Assert.assertTrue("'" + equipmentStatus53 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus53.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2584");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2585");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-156", "EQ-258");
        boolean boolean4 = student3.needsapproval;
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2586");
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
        app.EquipmentStatus equipmentStatus19 = microscope3.getStatus();
        java.lang.String str20 = microscope3.getLocation();
        java.lang.String str21 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = microscope3.isAvailable(localDateTime22, localDateTime23);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2587");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-284", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1557", "EQ-344");
        app.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-2012", "Equipment ID: EQ-1730, Name: , Description: , Location: , Status: AVAILABLE");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-2532", "Equipment ID: EQ-1755, Name: EQ-118, Description: EQ-75, Location: MANAGER-66180900, Status: AVAILABLE", "EQ-2462");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2588");
        app.Student student3 = new app.Student("EQ-1080", "EQ-442", "EQ-2469");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2589");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.password;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE");
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "14) test2589(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2590");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str8 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.needsapproval = false;
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "15) test2590(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "3) test2590(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2591");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-2958", "EQ-2052");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2592");
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
        labManager12.needsapproval = true;
        boolean boolean18 = labManager12.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
// flaky "16) test2592(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2593");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = arduino3.toString();
// flaky "17) test2593(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2594");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        boolean boolean7 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2595");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null", "EQ-977", "");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2596");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-665", "Equipment ID: EQ-3043, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2597");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.username;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "18) test2597(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2598");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null", "EQ-1310", "Equipment ID: EQ-942, Name: , Description: , Location: , Status: null");
        app.Microscope microscope7 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str8 = microscope7.getDescription();
        java.lang.String str9 = microscope7.getLocation();
        app.Equipment equipment13 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        app.Equipment equipment17 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino21 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope25 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str26 = microscope25.getName();
        java.lang.String str27 = microscope25.getLocation();
        app.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        arduino21.setStatus(equipmentStatus28);
        equipment17.setStatus(equipmentStatus28);
        equipment13.setStatus(equipmentStatus28);
        microscope7.setStatus(equipmentStatus28);
        equipment3.setStatus(equipmentStatus28);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2599");
        app.Guest guest3 = new app.Guest("EQ-1321", "", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2600");
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
        app.Microscope microscope33 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus34 = null;
        microscope33.setStatus(equipmentStatus34);
        app.EquipmentStatus equipmentStatus36 = microscope33.getStatus();
        java.lang.String str37 = microscope33.toString();
        java.lang.String str38 = microscope33.getName();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = microscope33.isAvailable(localDateTime39, localDateTime40);
        java.lang.String str42 = microscope33.getLocation();
        app.Arduino arduino46 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.Microscope microscope50 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str51 = microscope50.getName();
        java.lang.String str52 = microscope50.getLocation();
        app.EquipmentStatus equipmentStatus53 = microscope50.getStatus();
        arduino46.setStatus(equipmentStatus53);
        microscope33.setStatus(equipmentStatus53);
        app.EquipmentStatus equipmentStatus56 = microscope33.getStatus();
        microscope3.setStatus(equipmentStatus56);
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
        org.junit.Assert.assertNull(equipmentStatus36);
// flaky "19) test2600(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Equipment ID: EQ-3177, Name: , Description: , Location: , Status: null" + "'", str37, "Equipment ID: EQ-3177, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus53 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus53.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus56 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus56.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2601");
        app.Researcher researcher3 = new app.Researcher("EQ-539", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "EQ-1223");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        boolean boolean6 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1223" + "'", str4, "EQ-1223");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2602");
        app.Faculty faculty3 = new app.Faculty("EQ-1165", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-1918");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2603");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        boolean boolean7 = researcher3.isapproved;
        researcher3.password = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2604");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-971", "EQ-1808", "EQ-623");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2605");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts13 = userFactory0.createUser("", "EQ-932", "EQ-2376");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-551, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2695, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2606");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        labManager11.password = "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        boolean boolean14 = labManager11.isapproved;
        labManager11.isapproved = false;
        labManager11.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "20) test2606(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2607");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.password;
        student3.password = "EQ-2553";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2608");
        app.Student student3 = new app.Student("Equipment ID: EQ-2303, Name: , Description: , Location: , Status: null", "EQ-2340", "EQ-2090");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2609");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        app.Microscope microscope12 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str13 = microscope12.getName();
        app.EquipmentStatus equipmentStatus14 = microscope12.getStatus();
        microscope3.setStatus(equipmentStatus14);
        app.Microscope microscope19 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str20 = microscope19.getName();
        java.lang.String str21 = microscope19.getLocation();
        java.lang.String str22 = microscope19.getName();
        java.lang.String str23 = microscope19.getName();
        app.Microscope microscope27 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus28 = null;
        microscope27.setStatus(equipmentStatus28);
        app.EquipmentStatus equipmentStatus30 = null;
        microscope27.setStatus(equipmentStatus30);
        java.lang.String str32 = microscope27.getName();
        app.Arduino arduino36 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope40 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str41 = microscope40.getName();
        java.lang.String str42 = microscope40.getLocation();
        app.EquipmentStatus equipmentStatus43 = microscope40.getStatus();
        arduino36.setStatus(equipmentStatus43);
        microscope27.setStatus(equipmentStatus43);
        microscope19.setStatus(equipmentStatus43);
        microscope3.setStatus(equipmentStatus43);
        java.lang.String str48 = microscope3.getLocation();
        java.lang.String str49 = microscope3.getLocation();
        java.lang.String str50 = microscope3.toString();
// flaky "21) test2609(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "4) test2609(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus43 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus43.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
// flaky "2) test2609(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str50, "Equipment ID: EQ-3187, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2610");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-718, Name: , Description: , Location: , Status: null", "EQ-2536", "Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2611");
        app.Microscope microscope3 = new app.Microscope("EQ-193", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "EQ-281");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2612");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1503, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE", "Equipment ID: EQ-3060, Name: , Description: , Location: , Status: null", "EQ-1056", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1503, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2613");
        app.Faculty faculty3 = new app.Faculty("EQ-2198", "", "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2614");
        app.Equipment equipment3 = new app.Equipment("EQ-131", "EQ-259", "EQ-131");
        java.lang.String str4 = equipment3.getDescription();
        app.Arduino arduino8 = new app.Arduino("Equipment ID: EQ-785, Name: , Description: , Location: , Status: null", "EQ-863", "EQ-566");
        app.EquipmentStatus equipmentStatus9 = arduino8.getStatus();
        equipment3.setStatus(equipmentStatus9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-259" + "'", str4, "EQ-259");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2615");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "Head Lab Coordinator");
        guest3.username = "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2616");
        app.Microscope microscope3 = new app.Microscope("EQ-509", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-489");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-489" + "'", str4, "EQ-489");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2617");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-944, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-156");
        boolean boolean4 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2618");
        app.Student student3 = new app.Student("", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-222");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2619");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-2228");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "22) test2619(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3198" + "'", str4, "EQ-3198");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2620");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1976, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-1099", "EQ-2167");
        app.Microscope microscope7 = new app.Microscope("EQ-99", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-325");
        app.EquipmentStatus equipmentStatus8 = microscope7.getStatus();
        microscope3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2621");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1699, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE");
        java.lang.String str10 = labManager9.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MANAGER-1326009150" + "'", str10, "MANAGER-1326009150");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2622");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.toString();
        app.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        java.lang.String str12 = microscope3.getDescription();
        app.Microscope microscope16 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus17 = null;
        microscope16.setStatus(equipmentStatus17);
        app.EquipmentStatus equipmentStatus19 = microscope16.getStatus();
        java.lang.String str20 = microscope16.getLocation();
        java.lang.String str21 = microscope16.getName();
        app.Microscope microscope25 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = microscope25.isAvailable(localDateTime26, localDateTime27);
        app.EquipmentStatus equipmentStatus29 = microscope25.getStatus();
        microscope16.setStatus(equipmentStatus29);
        app.EquipmentStatus equipmentStatus31 = microscope16.getStatus();
        microscope3.setStatus(equipmentStatus31);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "23) test2622(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3201, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3201, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "5) test2622(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-3201" + "'", str9, "EQ-3201");
// flaky "3) test2622(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-3201, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-3201, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(equipmentStatus19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus29 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus29.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2623");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double4 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2624");
        app.Student student3 = new app.Student("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Faculty");
        java.lang.String str4 = student3.username;
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2625");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-3095, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "EQ-114");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2626");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2627");
        app.Student student3 = new app.Student("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2628");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-944, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2629");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        boolean boolean4 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2630");
        app.Equipment equipment3 = new app.Equipment("EQ-384", "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
        java.lang.String str4 = equipment3.toString();
// flaky "24) test2630(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3206, Name: EQ-384, Description: Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3206, Name: EQ-384, Description: Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2631");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        app.Microscope microscope7 = new app.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino11 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.Microscope microscope15 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str16 = microscope15.getName();
        java.lang.String str17 = microscope15.getLocation();
        app.EquipmentStatus equipmentStatus18 = microscope15.getStatus();
        arduino11.setStatus(equipmentStatus18);
        microscope7.setStatus(equipmentStatus18);
        microscope3.setStatus(equipmentStatus18);
        java.lang.String str22 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2632");
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
        labManager3.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2633");
        app.Arduino arduino3 = new app.Arduino("Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getEquipmentId();
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
// flaky "25) test2633(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3213" + "'", str5, "EQ-3213");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2634");
        app.Student student3 = new app.Student("EQ-603", "COORD-001", "EQ-422");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2635");
        app.Faculty faculty3 = new app.Faculty("EQ-820", "EQ-861", "EQ-742");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2636");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3131, Name: Faculty, Description: Equipment ID: EQ-829, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2817, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2011");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2637");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getDescription();
        app.Microscope microscope10 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str11 = microscope10.getDescription();
        java.lang.String str12 = microscope10.getLocation();
        java.lang.String str13 = microscope10.getName();
        app.Microscope microscope17 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope17.isAvailable(localDateTime18, localDateTime19);
        app.EquipmentStatus equipmentStatus21 = microscope17.getStatus();
        microscope10.setStatus(equipmentStatus21);
        microscope3.setStatus(equipmentStatus21);
        java.lang.Class<?> wildcardClass24 = equipmentStatus21.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2638");
        app.Guest guest3 = new app.Guest("EQ-431", "EQ-344", "EQ-149");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        java.lang.String str6 = guest3.getAccountType();
        guest3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-344" + "'", str5, "EQ-344");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2639");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2012", "EQ-2192", "EQ-570", "EQ-263");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2012");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2640");
        app.Researcher researcher3 = new app.Researcher("", "EQ-2799", "EQ-2347");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2641");
        app.Guest guest3 = new app.Guest("Head Lab Coordinator", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.username;
        boolean boolean5 = guest3.isapproved;
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2642");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str11 = labManager10.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "26) test2642(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "6) test2642(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab Manager" + "'", str11, "Lab Manager");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2643");
        app.Faculty faculty3 = new app.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        faculty3.username = "EQ-104";
        java.lang.String str6 = faculty3.getRegistrationId();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.needsapproval = true;
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2644");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-735", "Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2645");
        app.Equipment equipment3 = new app.Equipment("", "EQ-1736", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.toString();
// flaky "27) test2645(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3218, Name: , Description: EQ-1736, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3218, Name: , Description: EQ-1736, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Status: AVAILABLE");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2646");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        boolean boolean6 = faculty3.isapproved;
        faculty3.password = "EQ-2473";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2647");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = microscope3.isAvailable(localDateTime19, localDateTime20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "28) test2647(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3219, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-3219, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "7) test2647(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-3219, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-3219, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2648");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = microscope3.isAvailable(localDateTime6, localDateTime7);
        java.lang.Class<?> wildcardClass9 = microscope3.getClass();
// flaky "29) test2648(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3220, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3220, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "8) test2648(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-3220, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-3220, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2649");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-104" + "'", str5, "EQ-104");
// flaky "30) test2649(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3221" + "'", str6, "EQ-3221");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2650");
        app.Student student3 = new app.Student("MANAGER-214492645", "EQ-1113", "");
        student3.username = "Equipment ID: EQ-1645, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE";
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2651");
        app.Researcher researcher3 = new app.Researcher("EQ-304", "EQ-496", "EQ-503");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2652");
        app.Arduino arduino3 = new app.Arduino("EQ-36", "EQ-222", "EQ-547");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "31) test2652(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3222" + "'", str4, "EQ-3222");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2653");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "32) test2653(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2654");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-2968, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2655");
        app.Arduino arduino3 = new app.Arduino("hi!", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2656");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE", "EQ-75", "EQ-616");
        app.Microscope microscope7 = new app.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str8 = microscope7.getName();
        app.Microscope microscope12 = new app.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino16 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope20 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str21 = microscope20.getName();
        java.lang.String str22 = microscope20.getLocation();
        app.EquipmentStatus equipmentStatus23 = microscope20.getStatus();
        arduino16.setStatus(equipmentStatus23);
        microscope12.setStatus(equipmentStatus23);
        app.Arduino arduino29 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = arduino29.isAvailable(localDateTime30, localDateTime31);
        java.lang.String str33 = arduino29.getDescription();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = arduino29.isAvailable(localDateTime34, localDateTime35);
        app.EquipmentStatus equipmentStatus37 = arduino29.getStatus();
        microscope12.setStatus(equipmentStatus37);
        microscope7.setStatus(equipmentStatus37);
        app.EquipmentStatus equipmentStatus40 = microscope7.getStatus();
        microscope3.setStatus(equipmentStatus40);
        java.lang.String str42 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MasterAdmin123!" + "'", str33, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus40 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus40.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE" + "'", str42, "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2657");
        app.Arduino arduino3 = new app.Arduino("EQ-690", "EQ-253", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2658");
        app.Student student3 = new app.Student("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-387", "EQ-630");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2659");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-344");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "33) test2659(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3231" + "'", str4, "EQ-3231");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2660");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        java.lang.String str11 = researcher3.getRegistrationId();
        researcher3.needsapproval = false;
        double double14 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2661");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        app.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-106", "EQ-371", "EQ-1038", "EQ-74");
        app.UserAccounts userAccounts30 = userFactory0.createUser("Equipment ID: EQ-2968, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE", "EQ-1411", "Equipment ID: EQ-2473, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2662");
        app.Student student3 = new app.Student("Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2663");
        app.Faculty faculty3 = new app.Faculty("EQ-586", "Equipment ID: EQ-2636, Name: Equipment ID: EQ-1965, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE, Description: EQ-1919, Location: Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2664");
        app.Student student3 = new app.Student("Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE", "EQ-1784", "Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2665");
        app.Student student3 = new app.Student("MANAGER-214492645", "EQ-1113", "");
        student3.password = "EQ-1050";
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2666");
        app.Researcher researcher3 = new app.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.username;
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2667");
        app.Equipment equipment3 = new app.Equipment("EQ-2460", "EQ-2497", "EQ-71");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2668");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.password;
        java.lang.Class<?> wildcardClass10 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2669");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-603");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2670");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        boolean boolean8 = labManager7.needsapproval;
        java.lang.Class<?> wildcardClass9 = labManager7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2671");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getAccountType();
        boolean boolean5 = guest3.isapproved;
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.username;
        java.lang.String str8 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2672");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str5 = labManager4.getRegistrationId();
        boolean boolean6 = labManager4.needsapproval;
        labManager4.needsapproval = false;
        boolean boolean9 = labManager4.needsapproval;
        java.lang.String str10 = labManager4.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MANAGER-66180900" + "'", str5, "MANAGER-66180900");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2673");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-978", "EQ-623");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2674");
        app.Student student3 = new app.Student("COORD-001", "MasterAdmin123!", "hi!");
        student3.isapproved = false;
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2675");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2676");
        app.Guest guest3 = new app.Guest("EQ-392", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2677");
        app.Arduino arduino3 = new app.Arduino("Researcher", "hi!", "hi!");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2678");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        boolean boolean7 = faculty3.isapproved;
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.isapproved = false;
        java.lang.String str11 = faculty3.username;
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2679");
        app.Student student3 = new app.Student("Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-281", "MANAGER-0");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2680");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "", "EQ-1080");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2681");
        app.Researcher researcher3 = new app.Researcher("COORD-001", "MasterAdmin123!", "MasterAdmin123!");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2682");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1951, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2683");
        app.Student student3 = new app.Student("", "Equipment ID: EQ-2683, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2684");
        app.Student student3 = new app.Student("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1098", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
        student3.needsapproval = true;
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2685");
        app.Guest guest3 = new app.Guest("EQ-2265", "EQ-570", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2686");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-750, Name: , Description: , Location: , Status: null", "EQ-2945", "EQ-1243");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2687");
        app.Faculty faculty3 = new app.Faculty("", "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-578");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2688");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-209", "EQ-333");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2689");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-2728, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2264");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2690");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2531, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1699, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-2634");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2531, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2691");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.password;
        headLabCoordinator0.password = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
// flaky "34) test2691(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-550" + "'", str7, "EQ-550");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2692");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-3246, Name: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Description: EQ-120, Location: EQ-264, Status: AVAILABLE", "EQ-1826", "EQ-1762");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2693");
        app.Student student3 = new app.Student("EQ-222", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        boolean boolean4 = student3.needsapproval;
        java.lang.String str5 = student3.username;
        java.lang.String str6 = student3.getRegistrationId();
        boolean boolean7 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-222" + "'", str5, "EQ-222");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2694");
        app.Guest guest3 = new app.Guest("", "EQ-2017", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2695");
        app.Student student3 = new app.Student("Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null", "EQ-1396", "Equipment ID: EQ-1808, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2696");
        app.Student student3 = new app.Student("EQ-222", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2697");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "", "EQ-1526");
        java.lang.String str4 = arduino3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
// flaky "35) test2697(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3251, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3251, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2698");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-427");
        app.UserAccounts userAccounts28 = userFactory0.createUser("EQ-616", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "EQ-1162", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-2742, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2699");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-326", "EQ-2904", "Equipment ID: EQ-3105, Name: EQ-778, Description: EQ-2498, Location: EQ-231, Status: AVAILABLE", "Equipment ID: EQ-2558, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-326");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2700");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1878, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2701");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getName();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2702");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-118", "EQ-99");
        headLabCoordinator0.isapproved = true;
        app.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-2625, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.LabManager labManager23 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-781");
        labManager23.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "36) test2702(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
// flaky "9) test2702(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(labManager23);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2703");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        boolean boolean9 = faculty3.needsapproval;
        java.lang.String str10 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2704");
        app.Faculty faculty3 = new app.Faculty("EQ-2562", "Equipment ID: EQ-718, Name: , Description: , Location: , Status: null", "EQ-2808");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2705");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "MasterAdmin123!", "MANAGER-0");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        guest3.password = "Equipment ID: EQ-1965, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2706");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-552", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null", "EQ-992");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-552");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2707");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.isapproved = false;
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2708");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.isapproved = false;
        java.lang.String str14 = guest3.getAccountType();
        java.lang.String str15 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2709");
        app.Equipment equipment3 = new app.Equipment("EQ-263", "EQ-104", "EQ-486");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2710");
        app.Faculty faculty3 = new app.Faculty("EQ-2138", "", "");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2711");
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
        java.lang.String str18 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2712");
        app.Arduino arduino3 = new app.Arduino("EQ-2175", "EQ-938", "EQ-452");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2713");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-513, Name: , Description: , Location: , Status: null";
        java.lang.String str11 = guest3.password;
        java.lang.String str12 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2714");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        double double11 = headLabCoordinator0.getHourlyRate();
        java.lang.String str12 = headLabCoordinator0.username;
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-418626758", "EQ-1839");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2715");
        app.Guest guest3 = new app.Guest("EQ-1940", "EQ-598", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-598" + "'", str4, "EQ-598");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2716");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-2473, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE", "EQ-734");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2717");
        app.Guest guest3 = new app.Guest("EQ-3087", "EQ-2175", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2718");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = microscope3.isAvailable(localDateTime10, localDateTime11);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2719");
        app.Student student3 = new app.Student("EQ-1557", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2720");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        boolean boolean7 = labManager3.needsapproval;
        boolean boolean8 = labManager3.needsapproval;
        labManager3.username = "EQ-390";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2721");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1742", "EQ-1045", "EQ-528", "EQ-1643");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1742");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2722");
        app.Faculty faculty3 = new app.Faculty("EQ-637", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = faculty3.username;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getRegistrationId();
        boolean boolean7 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-637" + "'", str4, "EQ-637");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2723");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1792, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-539", "Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2724");
        app.Equipment equipment3 = new app.Equipment("EQ-41", "EQ-104", "");
        java.lang.String str4 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-104" + "'", str8, "EQ-104");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2725");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = equipment3.toString();
        app.Arduino arduino8 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope12 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str13 = microscope12.getName();
        java.lang.String str14 = microscope12.getLocation();
        app.EquipmentStatus equipmentStatus15 = microscope12.getStatus();
        arduino8.setStatus(equipmentStatus15);
        java.lang.String str17 = arduino8.getDescription();
        app.EquipmentStatus equipmentStatus18 = arduino8.getStatus();
        equipment3.setStatus(equipmentStatus18);
        java.lang.String str20 = equipment3.getName();
// flaky "37) test2725(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3264, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3264, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null" + "'", str20, "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2726");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-104", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = true;
        double double12 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.username = "EQ-259";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2727");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        boolean boolean6 = guest3.isapproved;
        guest3.password = "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        guest3.isapproved = true;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2728");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        headLabCoordinator0.needsapproval = false;
        boolean boolean14 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EQ-259" + "'", str2, "EQ-259");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2729");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2898", "Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-550", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2898");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2730");
        app.Guest guest3 = new app.Guest("EQ-751", "EQ-569", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        guest3.username = "EQ-2711";
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2731");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        labManager11.username = "EQ-431";
        boolean boolean14 = labManager11.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2732");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getLocation();
        app.Equipment equipment8 = new app.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus9 = equipment8.getStatus();
        microscope3.setStatus(equipmentStatus9);
        app.Microscope microscope14 = new app.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        app.Microscope microscope18 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str19 = microscope18.getName();
        java.lang.String str20 = microscope18.getLocation();
        java.lang.String str21 = microscope18.getName();
        java.lang.String str22 = microscope18.getName();
        app.Microscope microscope26 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus27 = null;
        microscope26.setStatus(equipmentStatus27);
        app.EquipmentStatus equipmentStatus29 = null;
        microscope26.setStatus(equipmentStatus29);
        java.lang.String str31 = microscope26.getName();
        app.Arduino arduino35 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope39 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str40 = microscope39.getName();
        java.lang.String str41 = microscope39.getLocation();
        app.EquipmentStatus equipmentStatus42 = microscope39.getStatus();
        arduino35.setStatus(equipmentStatus42);
        microscope26.setStatus(equipmentStatus42);
        microscope18.setStatus(equipmentStatus42);
        microscope14.setStatus(equipmentStatus42);
        microscope3.setStatus(equipmentStatus42);
        java.lang.String str48 = microscope3.getName();
        java.lang.String str49 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus42 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus42.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str48, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2733");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-392", "EQ-325", "EQ-461");
        app.UserAccounts userAccounts23 = userFactory0.createUser("EQ-2708", "EQ-382", "Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null", "EQ-278");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2734");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1079, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "EQ-361", "EQ-2175");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1079, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2735");
        app.Arduino arduino3 = new app.Arduino("EQ-1176", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2736");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-558");
        boolean boolean9 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "38) test2736(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
// flaky "10) test2736(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2737");
        app.Guest guest3 = new app.Guest("EQ-970", "EQ-1082", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2738");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3156, Name: , Description: , Location: , Status: null", "EQ-275");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2739");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
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
        java.lang.String str17 = microscope3.getEquipmentId();
        java.lang.String str18 = microscope3.getDescription();
        java.lang.String str19 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "39) test2739(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3281, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3281, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "11) test2739(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-3281, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-3281, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "4) test2739(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EQ-3281" + "'", str17, "EQ-3281");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky "2) test2739(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-3281, Name: , Description: , Location: , Status: null" + "'", str19, "Equipment ID: EQ-3281, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2740");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-592");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-221", "EQ-684", "EQ-863");
        app.UserAccounts userAccounts30 = userFactory0.createUser("EQ-2142", "", "EQ-94", "Equipment ID: EQ-1685, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts35 = userFactory0.createUser("EQ-599", "EQ-156", "EQ-594", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts30);
        org.junit.Assert.assertNull(userAccounts35);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2741");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        boolean boolean8 = faculty3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2742");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts21 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass22 = userFactory0.getClass();
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2743");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.isapproved = true;
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2744");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2745");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1171, Name: , Description: , Location: , Status: null", "EQ-2347", "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        faculty3.needsapproval = true;
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2746");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        double double8 = researcher3.getHourlyRate();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2747");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-802", "EQ-536");
        java.lang.String str4 = arduino3.getDescription();
        app.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-802" + "'", str4, "EQ-802");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2748");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1800, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2749");
        app.Equipment equipment3 = new app.Equipment("EQ-2579", "", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2750");
        app.Guest guest3 = new app.Guest("EQ-3164", "Equipment ID: EQ-3078, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-3106, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2751");
        app.Microscope microscope3 = new app.Microscope("", "EQ-834", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-834" + "'", str4, "EQ-834");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2752");
        app.Arduino arduino3 = new app.Arduino("EQ-1280", "EQ-389", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "40) test2752(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-3289" + "'", str7, "EQ-3289");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2753");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-75", "EQ-114");
        faculty3.needsapproval = false;
        java.lang.String str6 = faculty3.username;
        faculty3.isapproved = true;
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2754");
        app.Faculty faculty3 = new app.Faculty("EQ-1502", "hi!", "EQ-3059");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2755");
        app.Researcher researcher3 = new app.Researcher("EQ-684", "EQ-2789", "EQ-2996");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2756");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.password;
        researcher3.needsapproval = true;
        researcher3.isapproved = true;
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2757");
        app.Faculty faculty3 = new app.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2758");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        guest3.username = "Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2759");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-118", "EQ-99");
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        app.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("EQ-442", "Equipment ID: EQ-2558, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        double double20 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "41) test2759(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
// flaky "12) test2759(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2760");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2644", "EQ-630", "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-263");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2644");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2761");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.username;
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2762");
        app.Researcher researcher3 = new app.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        double double5 = researcher3.getHourlyRate();
        boolean boolean6 = researcher3.needsapproval;
        researcher3.username = "EQ-2340";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2763");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-1005", "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2305, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-1903");
        java.lang.String str13 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "42) test2763(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2764");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.password;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "43) test2764(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "13) test2764(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2765");
        app.Researcher researcher3 = new app.Researcher("EQ-120", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-41");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2766");
        app.Guest guest3 = new app.Guest("", "EQ-1165", "EQ-1462");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2767");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        double double8 = researcher3.getHourlyRate();
        researcher3.isapproved = false;
        researcher3.username = "EQ-486";
        boolean boolean13 = researcher3.isapproved;
        boolean boolean14 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2768");
        app.Student student3 = new app.Student("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1808, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-371");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2769");
        app.Arduino arduino3 = new app.Arduino("EQ-1910", "EQ-1526", "");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2770");
        app.Researcher researcher3 = new app.Researcher("EQ-2562", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2771");
        app.Researcher researcher3 = new app.Researcher("Faculty", "EQ-843", "EQ-1192");
        researcher3.username = "EQ-231";
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2772");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-2987, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2773");
        app.Guest guest3 = new app.Guest("EQ-179", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        boolean boolean4 = guest3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2774");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2137", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2775");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1412, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1530, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2776");
        app.Student student3 = new app.Student("EQ-536", "EQ-3221", "EQ-835");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2777");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        java.lang.String str10 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2778");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-149", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2779");
        app.Researcher researcher3 = new app.Researcher("EQ-39", "Faculty", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2780");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts8 = userFactory0.createUser("EQ-859", "EQ-1788", "EQ-1900");
        app.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-1918", "EQ-1557");
        app.UserAccounts userAccounts16 = userFactory0.createUser("Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null", "EQ-242", "Equipment ID: EQ-2616, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts16);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2781");
        app.Researcher researcher3 = new app.Researcher("EQ-539", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "EQ-1223");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2782");
        app.Student student3 = new app.Student("Equipment ID: EQ-750, Name: , Description: , Location: , Status: null", "MANAGER-1711025779", "EQ-2321");
        java.lang.String str4 = student3.getAccountType();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2783");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-264");
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2784");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getRegistrationId();
        researcher3.username = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2785");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        app.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(equipmentStatus8);
// flaky "44) test2785(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-3297" + "'", str9, "EQ-3297");
// flaky "14) test2785(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-3297, Name: hi!, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-3297, Name: hi!, Description: , Location: hi!, Status: null");
// flaky "5) test2785(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-3297, Name: hi!, Description: , Location: hi!, Status: null" + "'", str11, "Equipment ID: EQ-3297, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2786");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1767, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-1911", "EQ-946");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2787");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        app.Arduino arduino12 = new app.Arduino("", "EQ-36", "EQ-92");
        app.EquipmentStatus equipmentStatus13 = arduino12.getStatus();
        microscope3.setStatus(equipmentStatus13);
        java.lang.String str15 = microscope3.getName();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "45) test2787(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3299, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3299, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2788");
        app.Student student3 = new app.Student("EQ-2186", "Equipment ID: EQ-829, Name: , Description: , Location: , Status: null", "EQ-2104");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2789");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        app.Microscope microscope7 = new app.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino11 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.Microscope microscope15 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str16 = microscope15.getName();
        java.lang.String str17 = microscope15.getLocation();
        app.EquipmentStatus equipmentStatus18 = microscope15.getStatus();
        arduino11.setStatus(equipmentStatus18);
        microscope7.setStatus(equipmentStatus18);
        microscope3.setStatus(equipmentStatus18);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = microscope3.isAvailable(localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = microscope3.isAvailable(localDateTime25, localDateTime26);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2790");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-104");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2791");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2115, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2792");
        app.Microscope microscope3 = new app.Microscope("EQ-253", "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1039");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2793");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1437, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-1670", "EQ-1430");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2794");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2795");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-98");
        java.lang.String str4 = guest3.getAccountType();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2796");
        app.Guest guest3 = new app.Guest("", "EQ-594", "EQ-2175");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2797");
        app.Equipment equipment3 = new app.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
// flaky "46) test2797(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-3307" + "'", str6, "EQ-3307");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2798");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-94", "EQ-99");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        app.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2799");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-63", "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2800");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null", "EQ-451", "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1310");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2801");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-304", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "EQ-392");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-2704", "EQ-665", "EQ-99", "Equipment ID: EQ-2769, Name: EQ-36, Description: EQ-931, Location: EQ-1042, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2802");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-442", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2803");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "47) test2803(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3315" + "'", str5, "EQ-3315");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2804");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-368", "EQ-156", "EQ-63");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-1248", "Equipment ID: EQ-2281, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2162, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-981");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2805");
        app.Researcher researcher3 = new app.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2806");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        boolean boolean7 = labManager3.needsapproval;
        labManager3.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2807");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-486");
        faculty3.isapproved = true;
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.password = "EQ-1557";
        java.lang.String str9 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2808");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-1102");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getDescription();
        java.lang.String str8 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
// flaky "48) test2808(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2809");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2701, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-2706, Name: , Description: , Location: , Status: null", "EQ-1476");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2810");
        app.Researcher researcher3 = new app.Researcher("EQ-341", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2156, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2811");
        app.Equipment equipment3 = new app.Equipment("Student", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2812");
        app.Arduino arduino3 = new app.Arduino("", "EQ-36", "EQ-92");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getEquipmentId();
        java.lang.String str6 = arduino3.toString();
        java.lang.String str7 = arduino3.getEquipmentId();
// flaky "49) test2812(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3320, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3320, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
// flaky "15) test2812(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-3320" + "'", str5, "EQ-3320");
// flaky "6) test2812(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3320, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3320, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
// flaky "3) test2812(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-3320" + "'", str7, "EQ-3320");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2813");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.isapproved = false;
        java.lang.String str9 = faculty3.getRegistrationId();
        boolean boolean10 = faculty3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MasterAdmin123!" + "'", str9, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2814");
        app.Faculty faculty3 = new app.Faculty("EQ-1412", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "EQ-861");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2815");
        app.Student student3 = new app.Student("EQ-276", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2816");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-981", "EQ-221");
        java.lang.Class<?> wildcardClass14 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2817");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1425", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2818");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager14.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2819");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.password;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.needsapproval = true;
        faculty3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2820");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.password;
        java.lang.Class<?> wildcardClass10 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
// flaky "50) test2820(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-760" + "'", str8, "EQ-760");
// flaky "16) test2820(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-760" + "'", str9, "EQ-760");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2821");
        app.Guest guest3 = new app.Guest("EQ-222", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2822");
        app.Arduino arduino3 = new app.Arduino("EQ-36", "MANAGER-0", "");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getLocation();
        java.lang.String str6 = arduino3.toString();
// flaky "51) test2822(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3321" + "'", str4, "EQ-3321");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "17) test2822(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-3321, Name: EQ-36, Description: MANAGER-0, Location: , Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-3321, Name: EQ-36, Description: MANAGER-0, Location: , Status: AVAILABLE");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2823");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isapproved;
        java.lang.String str7 = faculty3.password;
        boolean boolean8 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-193" + "'", str4, "EQ-193");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2824");
        app.Arduino arduino3 = new app.Arduino("EQ-508", "EQ-1425", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2825");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-99");
        boolean boolean10 = headLabCoordinator0.isapproved;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass12 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2826");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2011", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2827");
        app.Faculty faculty3 = new app.Faculty("EQ-335", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "Student");
        faculty3.isapproved = false;
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2828");
        app.Microscope microscope3 = new app.Microscope("EQ-598", "EQ-296", "EQ-1313");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1313" + "'", str4, "EQ-1313");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2829");
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
        java.lang.String str17 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2830");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getRegistrationId();
        double double8 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2831");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2832");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("EQ-63", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-614, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-1099", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-2994, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE", "Equipment ID: EQ-2916, Name: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null, Description: EQ-382, Location: EQ-335, Status: AVAILABLE", "EQ-1608");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2833");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.username = "EQ-120";
        headLabCoordinator0.username = "MANAGER-0";
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-550", "");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2834");
        app.Arduino arduino3 = new app.Arduino("EQ-2011", "EQ-2469", "EQ-685");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2835");
        app.Microscope microscope3 = new app.Microscope("EQ-1341", "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2317, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2836");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-99", "EQ-104");
        java.lang.String str4 = researcher3.password;
        researcher3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-99" + "'", str4, "EQ-99");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2837");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-551, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-1826");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2838");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        headLabCoordinator0.password = "";
        boolean boolean11 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "EQ-802";
        java.lang.String str14 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COORD-001" + "'", str14, "COORD-001");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2839");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2840");
        app.Microscope microscope3 = new app.Microscope("EQ-932", "EQ-3289", "EQ-3243");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2841");
        app.Student student3 = new app.Student("EQ-264", "EQ-2321", "EQ-586");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2842");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        boolean boolean4 = student3.isapproved;
        boolean boolean5 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2843");
        app.Guest guest3 = new app.Guest("EQ-2137", "Equipment ID: EQ-2903, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2844");
        app.Guest guest3 = new app.Guest("", "EQ-390", "EQ-92");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2845");
        app.Arduino arduino3 = new app.Arduino("EQ-2013", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2846");
        app.Student student3 = new app.Student("Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-275", "EQ-99");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2847");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-478, Name: , Description: , Location: , Status: null", "EQ-36", "");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2848");
        app.Arduino arduino3 = new app.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        app.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        java.lang.Class<?> wildcardClass6 = equipmentStatus5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-152" + "'", str4, "EQ-152");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2849");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2850");
        app.Faculty faculty3 = new app.Faculty("", "", "EQ-75");
        faculty3.isapproved = true;
        java.lang.String str6 = faculty3.getAccountType();
        boolean boolean7 = faculty3.isapproved;
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2851");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1730, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-992, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-504", "EQ-2958");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2852");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-489";
        boolean boolean13 = headLabCoordinator0.needsapproval;
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        boolean boolean15 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
// flaky "52) test2852(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2853");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.password;
        guest3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2854");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("EQ-131", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-36");
        app.UserAccounts userAccounts20 = userFactory0.createUser("Equipment ID: EQ-765, Name: , Description: , Location: , Status: null", "EQ-3022", "EQ-104");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2855");
        app.Arduino arduino3 = new app.Arduino("EQ-333", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-333" + "'", str4, "EQ-333");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2856");
        app.Arduino arduino3 = new app.Arduino("EQ-1340", "EQ-2623", "");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2857");
        app.Microscope microscope3 = new app.Microscope("EQ-94", "Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-826");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2858");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-413", "", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-1261", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-427");
        app.UserAccounts userAccounts35 = userFactory0.createUser("EQ-866", "EQ-427", "Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts39 = userFactory0.createUser("EQ-615", "EQ-382", "Equipment ID: EQ-2592, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts35);
        org.junit.Assert.assertNull(userAccounts39);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2859");
        app.Arduino arduino3 = new app.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.Microscope microscope7 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str8 = microscope7.toString();
        java.lang.String str9 = microscope7.toString();
        app.EquipmentStatus equipmentStatus10 = null;
        microscope7.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope7.getName();
        app.Microscope microscope16 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str17 = microscope16.getName();
        app.EquipmentStatus equipmentStatus18 = microscope16.getStatus();
        microscope7.setStatus(equipmentStatus18);
        app.Microscope microscope23 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str24 = microscope23.getName();
        java.lang.String str25 = microscope23.getLocation();
        java.lang.String str26 = microscope23.getName();
        java.lang.String str27 = microscope23.getName();
        app.Microscope microscope31 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus32 = null;
        microscope31.setStatus(equipmentStatus32);
        app.EquipmentStatus equipmentStatus34 = null;
        microscope31.setStatus(equipmentStatus34);
        java.lang.String str36 = microscope31.getName();
        app.Arduino arduino40 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope44 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str45 = microscope44.getName();
        java.lang.String str46 = microscope44.getLocation();
        app.EquipmentStatus equipmentStatus47 = microscope44.getStatus();
        arduino40.setStatus(equipmentStatus47);
        microscope31.setStatus(equipmentStatus47);
        microscope23.setStatus(equipmentStatus47);
        microscope7.setStatus(equipmentStatus47);
        arduino3.setStatus(equipmentStatus47);
        java.lang.String str53 = arduino3.getLocation();
        app.EquipmentStatus equipmentStatus54 = arduino3.getStatus();
        java.lang.String str55 = arduino3.getEquipmentId();
// flaky "53) test2859(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-3350, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-3350, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "18) test2859(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3350, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-3350, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str53, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus54 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus54.equals(app.EquipmentStatus.AVAILABLE));
// flaky "7) test2859(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EQ-3349" + "'", str55, "EQ-3349");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2860");
        app.Student student3 = new app.Student("EQ-299", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "EQ-380");
        java.lang.String str4 = student3.getRegistrationId();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-380" + "'", str4, "EQ-380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-380" + "'", str6, "EQ-380");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2861");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2862");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-790, Name: , Description: , Location: , Status: null", "EQ-2449", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2863");
        app.Faculty faculty3 = new app.Faculty("EQ-826", "MANAGER-103232", "EQ-570");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2864");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        boolean boolean6 = guest3.isapproved;
        java.lang.String str7 = guest3.getAccountType();
        guest3.isapproved = false;
        double double10 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2865");
        app.Student student3 = new app.Student("EQ-603", "COORD-001", "EQ-422");
        student3.needsapproval = true;
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2866");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-231", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        app.UserAccounts userAccounts35 = userFactory0.createUser("Equipment ID: EQ-937, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null", "EQ-1788");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts35);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2867");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getDescription();
        app.Arduino arduino13 = new app.Arduino("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "MasterAdmin123!");
        app.Microscope microscope17 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str18 = microscope17.getName();
        java.lang.String str19 = microscope17.getDescription();
        java.lang.String str20 = microscope17.getLocation();
        java.lang.String str21 = microscope17.getEquipmentId();
        app.Microscope microscope25 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus26 = null;
        microscope25.setStatus(equipmentStatus26);
        app.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        java.lang.String str29 = microscope25.getLocation();
        app.Microscope microscope33 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str34 = microscope33.getDescription();
        java.lang.String str35 = microscope33.getLocation();
        java.lang.String str36 = microscope33.getName();
        app.Microscope microscope40 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = microscope40.isAvailable(localDateTime41, localDateTime42);
        app.EquipmentStatus equipmentStatus44 = microscope40.getStatus();
        microscope33.setStatus(equipmentStatus44);
        microscope25.setStatus(equipmentStatus44);
        microscope17.setStatus(equipmentStatus44);
        arduino13.setStatus(equipmentStatus44);
        microscope3.setStatus(equipmentStatus44);
        app.Equipment equipment53 = new app.Equipment("EQ-341", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-246");
        java.lang.String str54 = equipment53.getEquipmentId();
        app.EquipmentStatus equipmentStatus55 = equipment53.getStatus();
        microscope3.setStatus(equipmentStatus55);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "54) test2867(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky "19) test2867(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EQ-3362" + "'", str21, "EQ-3362");
        org.junit.Assert.assertNull(equipmentStatus28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "COORD-001" + "'", str34, "COORD-001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str35, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Guest" + "'", str36, "Guest");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus44 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus44.equals(app.EquipmentStatus.AVAILABLE));
// flaky "8) test2867(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "EQ-3366" + "'", str54, "EQ-3366");
        org.junit.Assert.assertTrue("'" + equipmentStatus55 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus55.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2868");
        app.Arduino arduino3 = new app.Arduino("EQ-843", "EQ-976", "EQ-640");
        app.Microscope microscope7 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        java.lang.String str11 = microscope7.getLocation();
        java.lang.String str12 = microscope7.getName();
        app.Microscope microscope16 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = microscope16.isAvailable(localDateTime17, localDateTime18);
        app.EquipmentStatus equipmentStatus20 = microscope16.getStatus();
        microscope7.setStatus(equipmentStatus20);
        app.EquipmentStatus equipmentStatus22 = microscope7.getStatus();
        app.EquipmentStatus equipmentStatus23 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus23);
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus20 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus20.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2869");
        app.Arduino arduino3 = new app.Arduino("", "EQ-259", "EQ-503");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2870");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2162, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-2271", "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2871");
        app.Arduino arduino3 = new app.Arduino("EQ-1425", "MANAGER-0", "EQ-655");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1425" + "'", str4, "EQ-1425");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2872");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-193";
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "55) test2872(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
// flaky "20) test2872(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2873");
        app.Arduino arduino3 = new app.Arduino("", "EQ-36", "EQ-92");
        app.Equipment equipment7 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str8 = equipment7.getEquipmentId();
        java.lang.String str9 = equipment7.getName();
        app.EquipmentStatus equipmentStatus10 = equipment7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        app.EquipmentStatus equipmentStatus12 = arduino3.getStatus();
        java.lang.Class<?> wildcardClass13 = arduino3.getClass();
// flaky "56) test2873(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3383" + "'", str8, "EQ-3383");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-94" + "'", str9, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2874");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2875");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        researcher3.needsapproval = false;
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2876");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.username;
        java.lang.String str7 = headLabCoordinator0.username;
        headLabCoordinator0.password = "EQ-760";
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2388, Name: EQ-509, Description: Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-489, Status: AVAILABLE", "Equipment ID: EQ-2903, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2877");
        app.Guest guest3 = new app.Guest("EQ-851", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null", "EQ-690");
        guest3.username = "EQ-1219";
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2878");
        app.Student student3 = new app.Student("EQ-1346", "EQ-264", "EQ-3150");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2879");
        app.Student student3 = new app.Student("MANAGER-214492645", "EQ-1113", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2880");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.toString();
        app.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "57) test2880(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "21) test2880(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2881");
        app.Student student3 = new app.Student("Equipment ID: EQ-1808, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-3297", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2882");
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
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2883");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2884");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager12.needsapproval = false;
        java.lang.String str15 = labManager12.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MANAGER-418626758" + "'", str15, "MANAGER-418626758");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2885");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2706, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3113, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2886");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2317, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1800, Name: , Description: , Location: , Status: null", "EQ-2628", "Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2317, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2887");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-3218, Name: , Description: EQ-1736, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Status: AVAILABLE", "Equipment ID: EQ-2678, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2888");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("", "EQ-333", "Equipment ID: EQ-1800, Name: , Description: , Location: , Status: null", "EQ-799");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2889");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str1, "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2890");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "EQ-2416", "EQ-1736");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2891");
        app.Microscope microscope3 = new app.Microscope("EQ-1707", "Equipment ID: EQ-3310, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2892");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        labManager3.username = "EQ-104";
        java.lang.String str6 = labManager3.getRegistrationId();
        java.lang.String str7 = labManager3.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MANAGER-1023477660" + "'", str6, "MANAGER-1023477660");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab Manager" + "'", str7, "Lab Manager");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2893");
        app.Arduino arduino3 = new app.Arduino("EQ-1062", "EQ-547", "EQ-387");
        app.Microscope microscope7 = new app.Microscope("EQ-539", "EQ-131", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        app.Equipment equipment11 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        app.Equipment equipment15 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino19 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope23 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str24 = microscope23.getName();
        java.lang.String str25 = microscope23.getLocation();
        app.EquipmentStatus equipmentStatus26 = microscope23.getStatus();
        arduino19.setStatus(equipmentStatus26);
        equipment15.setStatus(equipmentStatus26);
        equipment11.setStatus(equipmentStatus26);
        microscope7.setStatus(equipmentStatus26);
        app.EquipmentStatus equipmentStatus31 = microscope7.getStatus();
        app.Equipment equipment35 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str36 = equipment35.getEquipmentId();
        app.Equipment equipment40 = new app.Equipment("EQ-152", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-193");
        app.Equipment equipment44 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        app.Equipment equipment48 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino52 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope56 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str57 = microscope56.getName();
        java.lang.String str58 = microscope56.getLocation();
        app.EquipmentStatus equipmentStatus59 = microscope56.getStatus();
        arduino52.setStatus(equipmentStatus59);
        equipment48.setStatus(equipmentStatus59);
        equipment44.setStatus(equipmentStatus59);
        equipment40.setStatus(equipmentStatus59);
        equipment35.setStatus(equipmentStatus59);
        microscope7.setStatus(equipmentStatus59);
        arduino3.setStatus(equipmentStatus59);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        boolean boolean69 = arduino3.isAvailable(localDateTime67, localDateTime68);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
// flaky "58) test2893(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EQ-3396" + "'", str36, "EQ-3396");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus59 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus59.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2894");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-259", "EQ-514", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "EQ-242", "EQ-149");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-719", "EQ-2497", "EQ-2501", "MANAGER-214492645");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2895");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = false;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        boolean boolean14 = headLabCoordinator0.needsapproval;
        java.lang.String str15 = headLabCoordinator0.username;
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("EQ-118", "EQ-861");
        headLabCoordinator0.password = "EQ-835";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2896");
        app.Guest guest3 = new app.Guest("", "Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2897");
        app.Arduino arduino3 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.toString();
        java.lang.String str13 = arduino3.getDescription();
        app.EquipmentStatus equipmentStatus14 = arduino3.getStatus();
        java.lang.String str15 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
// flaky "59) test2897(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-3402, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-3402, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
// flaky "22) test2897(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-3402" + "'", str15, "EQ-3402");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2898");
        app.Equipment equipment3 = new app.Equipment("EQ-1062", "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null", "EQ-99");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2899");
        app.Microscope microscope3 = new app.Microscope("EQ-39", "MANAGER-0", "MANAGER-0");
        java.lang.String str4 = microscope3.getName();
        app.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-39" + "'", str4, "EQ-39");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2900");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-3150");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2901");
        app.Guest guest3 = new app.Guest("EQ-452", "EQ-386", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = guest3.isapproved;
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2902");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-2090", "EQ-1248");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2903");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.getLocation();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2904");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-296", "EQ-3310");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
// flaky "60) test2904(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2905");
        app.Arduino arduino3 = new app.Arduino("EQ-3144", "EQ-1028", "EQ-1906");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2906");
        app.Faculty faculty3 = new app.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "EQ-535";
        faculty3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2907");
        app.Arduino arduino3 = new app.Arduino("EQ-2711", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null", "");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2908");
        app.Researcher researcher3 = new app.Researcher("", "EQ-596", "Equipment ID: EQ-1475, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        researcher3.needsapproval = true;
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2909");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.username;
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2910");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2911");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        java.lang.String str7 = labManager6.getRegistrationId();
        labManager6.username = "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        java.lang.String str10 = labManager6.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MANAGER-1087176903" + "'", str7, "MANAGER-1087176903");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lab Manager" + "'", str10, "Lab Manager");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2912");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-466, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2769, Name: EQ-36, Description: EQ-931, Location: EQ-1042, Status: AVAILABLE", "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-466, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2913");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getRegistrationId();
        boolean boolean6 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2914");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = false;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2915");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.password;
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2916");
        app.Guest guest3 = new app.Guest("Head Lab Coordinator", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.password = "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2917");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-592");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-221", "EQ-684", "EQ-863");
        app.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-781");
        app.UserAccounts userAccounts34 = userFactory0.createUser("EQ-863", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-301", "EQ-473");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
        org.junit.Assert.assertNull(userAccounts34);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2918");
        app.Arduino arduino3 = new app.Arduino("EQ-3325", "EQ-3213", "Equipment ID: EQ-1645, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2919");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2073, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-1608", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2920");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1530, Name: , Description: , Location: , Status: null", "EQ-1310");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2921");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass6 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2922");
        app.Researcher researcher3 = new app.Researcher("EQ-193", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-99");
        boolean boolean4 = researcher3.needsapproval;
        boolean boolean5 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2923");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-36", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        boolean boolean6 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2924");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-684", "Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-489");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2925");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-99", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean10 = labManager9.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2926");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.username = "EQ-1505";
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2927");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getRegistrationId();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2928");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str8 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.isapproved = false;
        java.lang.String str13 = headLabCoordinator0.username;
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2929");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2930");
        app.Arduino arduino3 = new app.Arduino("EQ-1479", "EQ-1176", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2931");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-368", "EQ-859");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-859" + "'", str4, "EQ-859");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2932");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.needsapproval;
        java.lang.String str9 = student3.getRegistrationId();
        student3.password = "Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2933");
        app.Researcher researcher3 = new app.Researcher("MANAGER-0", "EQ-264", "");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-264" + "'", str4, "EQ-264");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-264" + "'", str6, "EQ-264");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2934");
        app.Student student3 = new app.Student("Equipment ID: EQ-2990, Name: , Description: , Location: , Status: null", "EQ-684", "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2935");
        app.Researcher researcher3 = new app.Researcher("EQ-1468", "Equipment ID: EQ-1726, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2936");
        app.Equipment equipment3 = new app.Equipment("EQ-422", "EQ-281", "EQ-1113");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2937");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MANAGER-1087176903");
        double double14 = headLabCoordinator0.getHourlyRate();
        boolean boolean15 = headLabCoordinator0.needsapproval;
        java.lang.String str16 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2938");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        boolean boolean9 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "");
        app.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("Researcher", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str18 = headLabCoordinator0.getAccountType();
        java.lang.String str19 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Head Lab Coordinator" + "'", str18, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "COORD-001" + "'", str19, "COORD-001");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2939");
        app.Microscope microscope3 = new app.Microscope("EQ-2195", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2636, Name: Equipment ID: EQ-1965, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE, Description: EQ-1919, Location: Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2940");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.Arduino arduino7 = new app.Arduino("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "MasterAdmin123!");
        app.Microscope microscope11 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getDescription();
        java.lang.String str14 = microscope11.getLocation();
        java.lang.String str15 = microscope11.getEquipmentId();
        app.Microscope microscope19 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus20 = null;
        microscope19.setStatus(equipmentStatus20);
        app.EquipmentStatus equipmentStatus22 = microscope19.getStatus();
        java.lang.String str23 = microscope19.getLocation();
        app.Microscope microscope27 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str28 = microscope27.getDescription();
        java.lang.String str29 = microscope27.getLocation();
        java.lang.String str30 = microscope27.getName();
        app.Microscope microscope34 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = microscope34.isAvailable(localDateTime35, localDateTime36);
        app.EquipmentStatus equipmentStatus38 = microscope34.getStatus();
        microscope27.setStatus(equipmentStatus38);
        microscope19.setStatus(equipmentStatus38);
        microscope11.setStatus(equipmentStatus38);
        arduino7.setStatus(equipmentStatus38);
        arduino3.setStatus(equipmentStatus38);
        java.lang.String str44 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky "61) test2940(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-3440" + "'", str15, "EQ-3440");
        org.junit.Assert.assertNull(equipmentStatus22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "COORD-001" + "'", str28, "COORD-001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str29, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Guest" + "'", str30, "Guest");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(app.EquipmentStatus.AVAILABLE));
// flaky "23) test2940(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EQ-3438" + "'", str44, "EQ-3438");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2941");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts24 = userFactory0.createUser("Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null", "EQ-3289", "EQ-1166");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2942");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2916, Name: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null, Description: EQ-382, Location: EQ-335, Status: AVAILABLE", "EQ-1616", "Equipment ID: EQ-1962, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-2024");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2916, Name: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null, Description: EQ-382, Location: EQ-335, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2943");
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
        java.lang.String str36 = equipment3.toString();
        app.Arduino arduino40 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope44 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str45 = microscope44.getName();
        java.lang.String str46 = microscope44.getLocation();
        app.EquipmentStatus equipmentStatus47 = microscope44.getStatus();
        arduino40.setStatus(equipmentStatus47);
        equipment3.setStatus(equipmentStatus47);
        java.lang.String str50 = equipment3.getEquipmentId();
        java.lang.String str51 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
// flaky "62) test2943(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-3445" + "'", str26, "EQ-3445");
// flaky "24) test2943(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-3448" + "'", str31, "EQ-3448");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EQ-94" + "'", str32, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
// flaky "9) test2943(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equipment ID: EQ-3444, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str36, "Equipment ID: EQ-3444, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(app.EquipmentStatus.AVAILABLE));
// flaky "4) test2943(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EQ-3444" + "'", str50, "EQ-3444");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MasterAdmin123!" + "'", str51, "MasterAdmin123!");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2944");
        app.Equipment equipment3 = new app.Equipment("EQ-41", "EQ-104", "");
        java.lang.String str4 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = equipment3.getLocation();
        java.lang.String str9 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-41" + "'", str9, "EQ-41");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2945");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-231", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-1038", "EQ-637", "EQ-253");
        app.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE", "EQ-419", "EQ-536");
        app.UserAccounts userAccounts41 = userFactory0.createUser("Equipment ID: EQ-2682, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-1062", "EQ-784", "EQ-758");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts41);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2946");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2947");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = false;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2948");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getName();
        java.lang.String str8 = arduino3.getName();
        java.lang.String str9 = arduino3.getDescription();
        app.EquipmentStatus equipmentStatus10 = arduino3.getStatus();
        java.lang.String str11 = arduino3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2949");
        app.Student student3 = new app.Student("EQ-209", "Head Lab Coordinator", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getRegistrationId();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.password = "EQ-615";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2950");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-246", "EQ-419");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-246" + "'", str5, "EQ-246");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2951");
        app.Student student3 = new app.Student("EQ-2904", "Equipment ID: EQ-3264, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "EQ-773");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2952");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2379, Name: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Description: EQ-63, Location: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "EQ-2527");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2953");
        app.Arduino arduino3 = new app.Arduino("EQ-476", "EQ-540", "EQ-496");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.toString();
        java.lang.String str8 = arduino3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "63) test2953(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3456, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-3456, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE");
// flaky "25) test2953(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-3456" + "'", str8, "EQ-3456");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2954");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-558", "EQ-838", "EQ-547", "COORD-001");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2955");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        app.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.lang.String str12 = microscope3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "64) test2955(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2956");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null");
        labManager6.username = "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2957");
        app.Equipment equipment3 = new app.Equipment("EQ-1163", "Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-992, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1163" + "'", str4, "EQ-1163");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1163" + "'", str5, "EQ-1163");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2958");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2968, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-106", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2968, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2959");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-489", "EQ-257");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2960");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        app.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2961");
        app.Researcher researcher3 = new app.Researcher("EQ-586", "EQ-1530", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2962");
        app.Researcher researcher3 = new app.Researcher("EQ-3320", "Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-2895");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2963");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("hi!", "EQ-1163");
        double double13 = labManager12.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2964");
        app.Researcher researcher3 = new app.Researcher("EQ-2895", "Equipment ID: EQ-2407, Name: , Description: , Location: , Status: null", "");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2965");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1784, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-754");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2966");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-811", "Guest");
        labManager5.password = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2967");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getLocation();
        app.Equipment equipment8 = new app.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus9 = equipment8.getStatus();
        microscope3.setStatus(equipmentStatus9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2968");
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
        app.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("EQ-92", "MANAGER-207281291");
        boolean boolean21 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2969");
        app.Equipment equipment3 = new app.Equipment("EQ-765", "EQ-1943", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2970");
        app.Microscope microscope3 = new app.Microscope("hi!", "Head Lab Coordinator", "");
        app.Microscope microscope7 = new app.Microscope("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "MasterAdmin123!", "Researcher");
        app.Equipment equipment11 = new app.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str12 = equipment11.getDescription();
        app.EquipmentStatus equipmentStatus13 = equipment11.getStatus();
        microscope7.setStatus(equipmentStatus13);
        microscope3.setStatus(equipmentStatus13);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2971");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "", "EQ-470");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2972");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-94", "COORD-001", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-2499, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-1711025779", "EQ-2682", "EQ-2895");
        app.UserAccounts userAccounts28 = userFactory0.createUser("Equipment ID: EQ-2248, Name: EQ-368, Description: EQ-118, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-1239, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3426, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE", "Equipment ID: EQ-2137, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2973");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-826", "EQ-3358", "Equipment ID: EQ-3356, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-826");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2974");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-41", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "EQ-665";
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2305, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2975");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-253", "Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3131, Name: Faculty, Description: Equipment ID: EQ-829, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-661, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-253");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2976");
        app.Arduino arduino3 = new app.Arduino("Lab Manager", "EQ-773", "Equipment ID: EQ-1503, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-773" + "'", str4, "EQ-773");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2977");
        app.Faculty faculty3 = new app.Faculty("", "Equipment ID: EQ-2836, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-1028");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2978");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2805, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1878", "Equipment ID: EQ-2294, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2979");
        app.Microscope microscope3 = new app.Microscope("MANAGER-1863804858", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "EQ-1409");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1409" + "'", str4, "EQ-1409");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2980");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-2709, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "Equipment ID: EQ-1992, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2981");
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
        java.lang.String str14 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2982");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        boolean boolean6 = researcher3.isapproved;
        java.lang.String str7 = researcher3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2983");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-461", "EQ-442", "Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-981");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1928", "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null", "EQ-2466");
        app.UserAccounts userAccounts37 = userFactory0.createUser("EQ-1310", "", "EQ-1909", "EQ-1637");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts37);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2984");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2985");
        app.Faculty faculty3 = new app.Faculty("EQ-1534", "Equipment ID: EQ-1171, Name: , Description: , Location: , Status: null", "EQ-497");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2986");
        app.Guest guest3 = new app.Guest("EQ-2149", "EQ-473", "EQ-390");
        guest3.password = "EQ-539";
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2987");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-509", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-2186", "EQ-469");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "65) test2987(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2988");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.needsapproval = false;
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2989");
        app.Student student3 = new app.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.username;
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-104" + "'", str7, "EQ-104");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2990");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-655", "EQ-569");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2991");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        app.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2992");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2993");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2485, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "Head Lab Coordinator", "Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2994");
        app.Guest guest3 = new app.Guest("EQ-687", "EQ-687", "");
        guest3.isapproved = true;
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2995");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
// flaky "66) test2995(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "26) test2995(src.test.randoop.AleenaTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2996");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-643", "EQ-231");
        java.lang.String str14 = headLabCoordinator0.password;
        app.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("EQ-3297", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(labManager17);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2997");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        java.lang.String str6 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2998");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE", "EQ-2537", "EQ-92", "Equipment ID: EQ-2836, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3317, Name: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: EQ-1102, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test2999");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.username = "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        labManager3.needsapproval = false;
        labManager3.isapproved = false;
        double double13 = labManager3.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest5.test3000");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getRegistrationId();
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "EQ-1248";
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }
}
