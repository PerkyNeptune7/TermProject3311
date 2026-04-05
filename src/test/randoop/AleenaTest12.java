package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6001");
        app.Equipment equipment3 = new app.Equipment("Guest", "EQ-36", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6002");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        app.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "1) test6002(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-5418, Name: hi!, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-5418, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6003");
        app.Researcher researcher3 = new app.Researcher("EQ-1218", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-718, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6004");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-264");
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2556, Name: Equipment ID: EQ-696, Name: , Description: , Location: , Status: null, Description: EQ-627, Location: EQ-1174, Status: AVAILABLE", "EQ-1434");
        boolean boolean11 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "2) test6004(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6005");
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
        java.lang.String str16 = labManager12.username;
        labManager12.username = "Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str16, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6006");
        app.Equipment equipment3 = new app.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.getEquipmentId();
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.String str7 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "3) test6006(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5419" + "'", str5, "EQ-5419");
// flaky "1) test6006(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-5419" + "'", str6, "EQ-5419");
// flaky "1) test6006(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-5419" + "'", str7, "EQ-5419");
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6007");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getDescription();
        java.lang.String str12 = microscope3.getDescription();
// flaky "4) test6007(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5421, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5421, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "2) test6007(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5421, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5421, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "2) test6007(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5421, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str9, "Equipment ID: EQ-5421, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6008");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts23 = userFactory0.createUser("", "EQ-496", "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1000");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-4498", "EQ-3968", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6009");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str15 = headLabCoordinator0.getRegistrationId();
        java.lang.String str16 = headLabCoordinator0.username;
        boolean boolean17 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COORD-001" + "'", str15, "COORD-001");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6010");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.username;
        researcher3.isapproved = true;
        java.lang.String str7 = researcher3.getRegistrationId();
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6011");
        app.Student student3 = new app.Student("EQ-299", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "EQ-380");
        boolean boolean4 = student3.needsapproval;
        student3.needsapproval = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6012");
        app.Equipment equipment3 = new app.Equipment("EQ-4193", "EQ-2684", "Equipment ID: EQ-2497, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6013");
        app.Guest guest3 = new app.Guest("EQ-496", "EQ-333", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        guest3.needsapproval = false;
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6014");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-5412", "EQ-931");
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6015");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-156", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        researcher3.isapproved = true;
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6016");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4551, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-731", "EQ-1747");
        java.lang.String str4 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1747" + "'", str4, "EQ-1747");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6017");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Lab Manager", "EQ-335");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6018");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.password;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "EQ-599");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-4421", "Equipment ID: EQ-2692, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
// flaky "5) test6018(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6019");
        app.Researcher researcher3 = new app.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.password;
        researcher3.username = "EQ-4231";
        researcher3.username = "EQ-4136";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6020");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        boolean boolean9 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "");
        headLabCoordinator0.isapproved = false;
        app.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("EQ-1462", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str20 = labManager19.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "6) test6020(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-1462" + "'", str20, "EQ-1462");
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6021");
        app.Arduino arduino3 = new app.Arduino("", "EQ-2317", "EQ-1310");
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6022");
        app.Guest guest3 = new app.Guest("EQ-615", "EQ-497", "EQ-866");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6023");
        app.Arduino arduino3 = new app.Arduino("EQ-3851", "EQ-2435", "Equipment ID: EQ-4717, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6024");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getName();
        app.Microscope microscope11 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus12 = null;
        microscope11.setStatus(equipmentStatus12);
        app.EquipmentStatus equipmentStatus14 = null;
        microscope11.setStatus(equipmentStatus14);
        java.lang.String str16 = microscope11.getName();
        app.Arduino arduino20 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope24 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str25 = microscope24.getName();
        java.lang.String str26 = microscope24.getLocation();
        app.EquipmentStatus equipmentStatus27 = microscope24.getStatus();
        arduino20.setStatus(equipmentStatus27);
        microscope11.setStatus(equipmentStatus27);
        microscope3.setStatus(equipmentStatus27);
        app.Arduino arduino34 = new app.Arduino("", "EQ-36", "EQ-92");
        app.Equipment equipment38 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str39 = equipment38.getEquipmentId();
        java.lang.String str40 = equipment38.getName();
        app.EquipmentStatus equipmentStatus41 = equipment38.getStatus();
        arduino34.setStatus(equipmentStatus41);
        microscope3.setStatus(equipmentStatus41);
        java.lang.String str44 = microscope3.toString();
        java.lang.String str45 = microscope3.toString();
        java.lang.String str46 = microscope3.getLocation();
        java.lang.String str47 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(app.EquipmentStatus.AVAILABLE));
// flaky "7) test6024(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EQ-5431" + "'", str39, "EQ-5431");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EQ-94" + "'", str40, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus41 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus41.equals(app.EquipmentStatus.AVAILABLE));
// flaky "3) test6024(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Equipment ID: EQ-5426, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str44, "Equipment ID: EQ-5426, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
// flaky "3) test6024(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Equipment ID: EQ-5426, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str45, "Equipment ID: EQ-5426, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6025");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3696", "EQ-4774");
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6026");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-466, Name: , Description: , Location: , Status: null", "EQ-1994", "EQ-3900");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6027");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "8) test6027(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5434" + "'", str5, "EQ-5434");
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6028");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str12 = labManager11.getRegistrationId();
        labManager11.password = "Equipment ID: EQ-4230, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MANAGER-1863804858" + "'", str12, "MANAGER-1863804858");
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6029");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6030");
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
        java.lang.Class<?> wildcardClass21 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6031");
        app.Researcher researcher3 = new app.Researcher("EQ-820", "EQ-2460", "EQ-106");
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6032");
        app.Researcher researcher3 = new app.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        researcher3.username = "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6033");
        app.Arduino arduino3 = new app.Arduino("EQ-325", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.toString();
// flaky "9) test6033(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5435, Name: EQ-325, Description: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5435, Name: EQ-325, Description: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6034");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = microscope3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "10) test6034(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5436, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5436, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6035");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "EQ-120", "EQ-264");
        java.lang.String str4 = equipment3.getLocation();
        app.Microscope microscope8 = new app.Microscope("Equipment ID: EQ-750, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-863");
        app.Equipment equipment12 = new app.Equipment("Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus13 = equipment12.getStatus();
        microscope8.setStatus(equipmentStatus13);
        equipment3.setStatus(equipmentStatus13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-264" + "'", str4, "EQ-264");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6036");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-120", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-3693, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-3456, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "MANAGER-207281291");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6037");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.isapproved = true;
        researcher3.username = "Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE";
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6038");
        app.Faculty faculty3 = new app.Faculty("EQ-2449", "EQ-1624", "EQ-4713");
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6039");
        app.Equipment equipment3 = new app.Equipment("EQ-1116", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3500");
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6040");
        app.Guest guest3 = new app.Guest("EQ-560", "EQ-156", "");
        guest3.isapproved = true;
        guest3.needsapproval = false;
        guest3.password = "EQ-550";
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6041");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-713, Name: , Description: , Location: , Status: null", "MANAGER-0", "");
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6042");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3806, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-4008");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6043");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        java.lang.String str13 = headLabCoordinator0.username;
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6044");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        boolean boolean11 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6045");
        app.Faculty faculty3 = new app.Faculty("", "EQ-1050", "EQ-3238");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6046");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-4516, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-3533");
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6047");
        app.Student student3 = new app.Student("EQ-946", "EQ-558", "EQ-442");
        boolean boolean4 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6048");
        app.Guest guest3 = new app.Guest("EQ-36", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-94");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6049");
        app.Faculty faculty3 = new app.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.password;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.password = "";
        java.lang.String str8 = faculty3.password;
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6050");
        app.Equipment equipment3 = new app.Equipment("", "", "EQ-2449");
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6051");
        app.Student student3 = new app.Student("EQ-3444", "EQ-3097", "EQ-5354");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6052");
        app.Microscope microscope3 = new app.Microscope("MANAGER-1023477660", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-616");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6053");
        app.Microscope microscope3 = new app.Microscope("EQ-3845", "EQ-1762", "EQ-1808");
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6054");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-598", "EQ-276");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6055");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-835", "EQ-5392");
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6056");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        labManager6.needsapproval = false;
        java.lang.String str9 = labManager6.getAccountType();
        java.lang.String str10 = labManager6.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lab Manager" + "'", str9, "Lab Manager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lab Manager" + "'", str10, "Lab Manager");
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6057");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-2001", "EQ-802");
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6058");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        app.EquipmentStatus equipmentStatus10 = arduino3.getStatus();
        java.lang.String str11 = arduino3.getDescription();
        app.EquipmentStatus equipmentStatus12 = arduino3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus12);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6059");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        app.UserAccounts userAccounts26 = userFactory0.createUser("EQ-719", "EQ-120", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-932", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-583", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-5218", "EQ-2605", "EQ-5072", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
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
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6060");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        boolean boolean2 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6061");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null", "EQ-758");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getEquipmentId();
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.Class<?> wildcardClass7 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-1351, Name: , Description: , Location: , Status: null");
// flaky "11) test6061(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5449" + "'", str5, "EQ-5449");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6062");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1878, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1981", "EQ-623");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6063");
        app.Researcher researcher3 = new app.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.username = "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        researcher3.isapproved = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6064");
        app.Student student3 = new app.Student("EQ-5216", "EQ-2512", "EQ-2138");
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6065");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.username;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6066");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-713, Name: , Description: , Location: , Status: null", "EQ-1608", "EQ-5131");
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6067");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-451, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1908, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        researcher3.isapproved = false;
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6068");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE", "MasterAdmin123!", "EQ-1058");
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6069");
        app.Student student3 = new app.Student("EQ-1000", "EQ-449", "EQ-602");
        student3.isapproved = true;
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6070");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6071");
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
        app.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("EQ-590", "EQ-946");
        labManager19.password = "Equipment ID: EQ-1774, Name: , Description: , Location: , Status: null";
        java.lang.String str22 = labManager19.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equipment ID: EQ-1774, Name: , Description: , Location: , Status: null" + "'", str22, "Equipment ID: EQ-1774, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6072");
        app.Student student3 = new app.Student("EQ-2142", "Equipment ID: EQ-4063, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-5160, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6073");
        app.Guest guest3 = new app.Guest("EQ-1340", "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.password;
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6074");
        app.Researcher researcher3 = new app.Researcher("EQ-1592", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2345, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6075");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getEquipmentId();
        java.lang.String str6 = equipment3.getName();
        app.EquipmentStatus equipmentStatus7 = null;
        equipment3.setStatus(equipmentStatus7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
// flaky "12) test6075(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5452" + "'", str5, "EQ-5452");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6076");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-3476, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "", "");
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6077");
        app.Student student3 = new app.Student("EQ-94", "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-977");
        student3.isapproved = true;
        student3.password = "Equipment ID: EQ-4179, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6078");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4879, Name: Equipment ID: EQ-2990, Name: , Description: , Location: , Status: null, Description: EQ-1973, Location: EQ-1876, Status: AVAILABLE", "Equipment ID: EQ-4634, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE", "EQ-3654");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6079");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6080");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-259", "EQ-514", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-684", "EQ-489");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-602", "Guest", "EQ-1505");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-2385", "EQ-1341", "EQ-4804");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6081");
        app.Student student3 = new app.Student("Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null", "EQ-643", "Equipment ID: EQ-1755, Name: EQ-118, Description: EQ-75, Location: MANAGER-66180900, Status: AVAILABLE");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6082");
        app.Student student3 = new app.Student("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-387", "EQ-630");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6083");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.username = "Equipment ID: EQ-2343, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6084");
        app.Guest guest3 = new app.Guest("EQ-36", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-94");
        guest3.isapproved = true;
        guest3.password = "Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6085");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-3718", "Equipment ID: EQ-1730, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-4539, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6086");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6087");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.needsapproval = false;
        boolean boolean8 = labManager5.isapproved;
        labManager5.isapproved = false;
        java.lang.String str11 = labManager5.password;
        labManager5.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6088");
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
        boolean boolean19 = headLabCoordinator0.needsapproval;
        app.LabManager labManager22 = headLabCoordinator0.autoGenerateLabManager("EQ-3315", "EQ-623");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(labManager22);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6089");
        app.Student student3 = new app.Student("MasterAdmin123!", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6090");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6091");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        labManager4.username = "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6092");
        app.Student student3 = new app.Student("Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-275", "EQ-99");
        java.lang.String str4 = student3.getRegistrationId();
        java.lang.String str5 = student3.getRegistrationId();
        boolean boolean6 = student3.needsapproval;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-99" + "'", str4, "EQ-99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-99" + "'", str5, "EQ-99");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6093");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-5399, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1991, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-4914, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6094");
        app.Microscope microscope3 = new app.Microscope("EQ-2101", "Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.toString();
// flaky "13) test6094(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5454, Name: EQ-2101, Description: Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5454, Name: EQ-2101, Description: Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6095");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-2388, Name: EQ-509, Description: Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-489, Status: AVAILABLE", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2873");
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6096");
        app.Equipment equipment3 = new app.Equipment("", "Researcher", "Equipment ID: EQ-2940, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
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
        app.EquipmentStatus equipmentStatus31 = microscope7.getStatus();
        java.lang.String str32 = microscope7.toString();
        app.EquipmentStatus equipmentStatus33 = microscope7.getStatus();
        equipment3.setStatus(equipmentStatus33);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipmentStatus21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
// flaky "14) test6096(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Equipment ID: EQ-5456, Name: , Description: , Location: , Status: AVAILABLE" + "'", str32, "Equipment ID: EQ-5456, Name: , Description: , Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6097");
        app.Researcher researcher3 = new app.Researcher("EQ-2143", "", "EQ-3746");
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6098");
        app.Student student3 = new app.Student("Equipment ID: EQ-750, Name: , Description: , Location: , Status: null", "MANAGER-1711025779", "EQ-2321");
        java.lang.String str4 = student3.password;
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-1711025779" + "'", str4, "MANAGER-1711025779");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6099");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.username = "EQ-41";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6100");
        app.Faculty faculty3 = new app.Faculty("EQ-1922", "EQ-3614", "EQ-4819");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6101");
        app.Researcher researcher3 = new app.Researcher("EQ-3358", "EQ-4482", "EQ-2904");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6102");
        app.Guest guest3 = new app.Guest("EQ-4473", "Equipment ID: EQ-4049, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6103");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3385, Name: , Description: , Location: , Status: null", "EQ-361", "EQ-731");
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6104");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1098", "EQ-257");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6105");
        app.Researcher researcher3 = new app.Researcher("EQ-643", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "");
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6106");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("", "Equipment ID: EQ-2558, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2807, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2667");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6107");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-2059, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null", "EQ-2340");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6108");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        userAccounts17.needsapproval = false;
        boolean boolean20 = userAccounts17.isapproved;
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6109");
        app.Researcher researcher3 = new app.Researcher("EQ-540", "EQ-3872", "Equipment ID: EQ-3518, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6110");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-382", "EQ-335");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "15) test6110(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-5459, Name: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null, Description: EQ-382, Location: EQ-335, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-5459, Name: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null, Description: EQ-382, Location: EQ-335, Status: AVAILABLE");
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6111");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-4786, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null, Location: EQ-1557, Status: AVAILABLE", "", "EQ-3659");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6112");
        app.Student student3 = new app.Student("EQ-5191", "EQ-778", "EQ-1670");
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6113");
        app.Researcher researcher3 = new app.Researcher("EQ-5153", "EQ-1166", "EQ-3380");
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6114");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.username;
        java.lang.String str7 = headLabCoordinator0.username;
        headLabCoordinator0.password = "EQ-760";
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2388, Name: EQ-509, Description: Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-489, Status: AVAILABLE", "Equipment ID: EQ-2903, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str13 = labManager12.getRegistrationId();
        boolean boolean14 = labManager12.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EQ-41" + "'", str2, "EQ-41");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-41" + "'", str6, "EQ-41");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-41" + "'", str7, "EQ-41");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MANAGER-631155379" + "'", str13, "MANAGER-631155379");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6115");
        app.Guest guest3 = new app.Guest("", "Equipment ID: EQ-2805, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "");
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6116");
        app.Student student3 = new app.Student("EQ-1163", "Equipment ID: EQ-4411, Name: Equipment ID: EQ-2695, Name: hi!, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2813, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE, Location: EQ-2011, Status: AVAILABLE", "EQ-1411");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6117");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6118");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1837, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-3156, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6119");
        app.Equipment equipment3 = new app.Equipment("MANAGER-0", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-382");
        java.lang.String str4 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-382" + "'", str4, "EQ-382");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6120");
        app.Researcher researcher3 = new app.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.needsapproval = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6121");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "");
        double double12 = labManager11.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6122");
        app.Microscope microscope3 = new app.Microscope("MANAGER-631155379", "Equipment ID: EQ-4399, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-3342");
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6123");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        app.Arduino arduino8 = new app.Arduino("hi!", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
        app.EquipmentStatus equipmentStatus9 = arduino8.getStatus();
        microscope3.setStatus(equipmentStatus9);
        java.lang.Class<?> wildcardClass11 = equipmentStatus9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6124");
        app.Arduino arduino3 = new app.Arduino("EQ-560", "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getLocation();
// flaky "16) test6124(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5466" + "'", str4, "EQ-5466");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6125");
        app.Student student3 = new app.Student("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6126");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str16 = headLabCoordinator0.password;
        java.lang.String str17 = headLabCoordinator0.username;
        boolean boolean18 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-760" + "'", str16, "EQ-760");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6127");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        headLabCoordinator0.username = "COORD-001";
        headLabCoordinator0.username = "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6128");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-4794, Name: EQ-301, Description: , Location: EQ-451, Status: AVAILABLE", "EQ-2670", "EQ-5345");
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6129");
        app.Equipment equipment3 = new app.Equipment("EQ-99", "EQ-149", "EQ-344");
        app.Microscope microscope7 = new app.Microscope("", "Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus8 = microscope7.getStatus();
        equipment3.setStatus(equipmentStatus8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = equipment3.isAvailable(localDateTime10, localDateTime11);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6130");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        researcher3.isapproved = false;
        researcher3.needsapproval = true;
        java.lang.String str10 = researcher3.getRegistrationId();
        java.lang.String str11 = researcher3.getAccountType();
        java.lang.String str12 = researcher3.getAccountType();
        java.lang.String str13 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6131");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1530, Name: , Description: , Location: , Status: null", "", "EQ-2753");
        app.Equipment equipment7 = new app.Equipment("EQ-104", "EQ-41", "EQ-149");
        java.lang.String str8 = equipment7.toString();
        java.lang.String str9 = equipment7.getDescription();
        app.Microscope microscope13 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus14 = null;
        microscope13.setStatus(equipmentStatus14);
        app.EquipmentStatus equipmentStatus16 = null;
        microscope13.setStatus(equipmentStatus16);
        java.lang.String str18 = microscope13.getName();
        java.lang.String str19 = microscope13.toString();
        java.lang.String str20 = microscope13.getLocation();
        app.EquipmentStatus equipmentStatus21 = microscope13.getStatus();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = microscope13.isAvailable(localDateTime22, localDateTime23);
        app.Microscope microscope28 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus29 = null;
        microscope28.setStatus(equipmentStatus29);
        app.EquipmentStatus equipmentStatus31 = microscope28.getStatus();
        java.lang.String str32 = microscope28.getLocation();
        java.lang.String str33 = microscope28.getName();
        app.Microscope microscope37 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = microscope37.isAvailable(localDateTime38, localDateTime39);
        app.EquipmentStatus equipmentStatus41 = microscope37.getStatus();
        microscope28.setStatus(equipmentStatus41);
        app.EquipmentStatus equipmentStatus43 = microscope28.getStatus();
        app.EquipmentStatus equipmentStatus44 = microscope28.getStatus();
        microscope13.setStatus(equipmentStatus44);
        equipment7.setStatus(equipmentStatus44);
        app.Arduino arduino50 = new app.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str51 = arduino50.getDescription();
        java.lang.String str52 = arduino50.getLocation();
        app.Microscope microscope56 = new app.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str57 = microscope56.getName();
        app.EquipmentStatus equipmentStatus58 = microscope56.getStatus();
        arduino50.setStatus(equipmentStatus58);
        equipment7.setStatus(equipmentStatus58);
        microscope3.setStatus(equipmentStatus58);
// flaky "17) test6131(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-5470, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-5470, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-41" + "'", str9, "EQ-41");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky "4) test6131(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-5471, Name: , Description: , Location: , Status: null" + "'", str19, "Equipment ID: EQ-5471, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(equipmentStatus21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(equipmentStatus31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus41 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus41.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus43 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus43.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus44 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus44.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EQ-152" + "'", str51, "EQ-152");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str52, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Guest" + "'", str57, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus58 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus58.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6132");
        app.Student student3 = new app.Student("EQ-39", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-264");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6133");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1412, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6134");
        app.Guest guest3 = new app.Guest("EQ-257", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.username;
        java.lang.String str5 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-257" + "'", str4, "EQ-257");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6135");
        app.Student student3 = new app.Student("Researcher", "EQ-41", "EQ-39");
        boolean boolean4 = student3.isapproved;
        student3.username = "EQ-1218";
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6136");
        app.Faculty faculty3 = new app.Faculty("EQ-834", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        faculty3.needsapproval = false;
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6137");
        app.Student student3 = new app.Student("Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-802", "EQ-1618");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6138");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        boolean boolean10 = student3.isapproved;
        java.lang.String str11 = student3.getAccountType();
        student3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6139");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "EQ-1360";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-760" + "'", str1, "EQ-760");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6140");
        app.Student student3 = new app.Student("EQ-1411", "EQ-3943", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6141");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getAccountType();
        boolean boolean8 = researcher3.isapproved;
        java.lang.String str9 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        java.lang.String str12 = researcher3.getAccountType();
        java.lang.String str13 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6142");
        app.Equipment equipment3 = new app.Equipment("EQ-489", "EQ-1742", "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.Arduino arduino7 = new app.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str8 = arduino7.getName();
        app.Microscope microscope12 = new app.Microscope("EQ-390", "EQ-731", "EQ-114");
        app.EquipmentStatus equipmentStatus13 = microscope12.getStatus();
        arduino7.setStatus(equipmentStatus13);
        equipment3.setStatus(equipmentStatus13);
        java.lang.String str16 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str16, "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6143");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3567, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-1032", "Equipment ID: EQ-3783, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6144");
        app.Equipment equipment3 = new app.Equipment("EQ-3968", "Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-829, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6145");
        app.Microscope microscope3 = new app.Microscope("EQ-179", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6146");
        app.Arduino arduino3 = new app.Arduino("", "EQ-36", "EQ-92");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getLocation();
// flaky "18) test6146(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5482, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5482, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-92" + "'", str5, "EQ-92");
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6147");
        app.Arduino arduino3 = new app.Arduino("EQ-253", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.toString();
        java.lang.String str6 = arduino3.toString();
        app.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-253" + "'", str4, "EQ-253");
// flaky "19) test6147(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5483, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5483, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
// flaky "5) test6147(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-5483, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-5483, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6148");
        app.Researcher researcher3 = new app.Researcher("EQ-4929", "EQ-5252", "Equipment ID: EQ-5160, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6149");
        app.Researcher researcher3 = new app.Researcher("EQ-4466", "Equipment ID: EQ-4103, Name: EQ-1050, Description: Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-1058, Status: AVAILABLE", "EQ-1453");
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6150");
        app.Faculty faculty3 = new app.Faculty("EQ-503", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-335");
        java.lang.String str4 = faculty3.getAccountType();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6151");
        app.Faculty faculty3 = new app.Faculty("EQ-1218", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-942, Name: , Description: , Location: , Status: null");
        boolean boolean4 = faculty3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6152");
        app.Microscope microscope3 = new app.Microscope("EQ-114", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-118");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = microscope3.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-114" + "'", str7, "EQ-114");
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6153");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null", "EQ-114", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6154");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        java.lang.String str11 = researcher3.username;
        java.lang.String str12 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6155");
        app.Microscope microscope3 = new app.Microscope("EQ-2958", "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-688");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = microscope3.getName();
// flaky "20) test6155(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5485" + "'", str4, "EQ-5485");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-2958" + "'", str8, "EQ-2958");
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6156");
        app.Equipment equipment3 = new app.Equipment("EQ-1805", "EQ-2506", "EQ-1878");
        java.lang.String str4 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        app.Equipment equipment11 = new app.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        app.EquipmentStatus equipmentStatus12 = equipment11.getStatus();
        equipment3.setStatus(equipmentStatus12);
        java.lang.String str14 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1878" + "'", str4, "EQ-1878");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(app.EquipmentStatus.AVAILABLE));
// flaky "21) test6156(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-5486" + "'", str14, "EQ-5486");
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6157");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1251", "EQ-4788");
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6158");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-104");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1945, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-1855");
        labManager12.username = "Equipment ID: EQ-1678, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6159");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-760" + "'", str1, "EQ-760");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6160");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        app.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6161");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.password;
        student3.password = "EQ-1360";
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6162");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-4850, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2379, Name: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Description: EQ-63, Location: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1475, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6163");
        app.Faculty faculty3 = new app.Faculty("EQ-3950", "EQ-977", "EQ-4275");
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6164");
        app.Researcher researcher3 = new app.Researcher("EQ-131", "Researcher", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.password = "EQ-2167";
        researcher3.password = "Equipment ID: EQ-2753, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6165");
        app.Researcher researcher3 = new app.Researcher("", "Equipment ID: EQ-3107, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4567, Name: , Description: , Location: , Status: null");
        boolean boolean4 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6166");
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
        java.lang.String str14 = microscope3.toString();
        app.EquipmentStatus equipmentStatus15 = microscope3.getStatus();
        java.lang.String str16 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "22) test6166(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-5490, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-5490, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "6) test6166(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-5490, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-5490, Name: , Description: , Location: , Status: null");
// flaky "4) test6166(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-5490, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-5490, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6167");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "EQ-156");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6168");
        app.Equipment equipment3 = new app.Equipment("EQ-325", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.Arduino arduino7 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope11 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        app.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        arduino7.setStatus(equipmentStatus14);
        java.lang.String str16 = arduino7.getLocation();
        app.EquipmentStatus equipmentStatus17 = arduino7.getStatus();
        equipment3.setStatus(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "COORD-001" + "'", str16, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6169");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        java.lang.String str13 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6170");
        app.Faculty faculty3 = new app.Faculty("EQ-368", "Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1215, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        faculty3.password = "EQ-2995";
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6171");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "EQ-41");
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean15 = headLabCoordinator0.isapproved;
        headLabCoordinator0.password = "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        app.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1823, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(labManager20);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6172");
        app.Guest guest3 = new app.Guest("EQ-1940", "EQ-598", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6173");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        boolean boolean4 = student3.isapproved;
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6174");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-304", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "EQ-392");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-861", "EQ-1346", "Equipment ID: EQ-5291, Name: Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE, Description: EQ-1434, Location: Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-3943");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6175");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts19 = userFactory0.createUser("EQ-114", "EQ-179", "EQ-104", "EQ-222");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-275");
        app.UserAccounts userAccounts27 = userFactory0.createUser("", "EQ-355", "EQ-1192");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "", "EQ-390");
        app.UserAccounts userAccounts37 = userFactory0.createUser("", "Equipment ID: EQ-4993, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "", "EQ-2142");
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
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6176");
        app.Arduino arduino3 = new app.Arduino("EQ-355", "EQ-384", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-355" + "'", str4, "EQ-355");
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6177");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "MANAGER-103232", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        boolean boolean6 = faculty3.needsapproval;
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MANAGER-103232" + "'", str5, "MANAGER-103232");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6178");
        app.Student student3 = new app.Student("EQ-2475", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        student3.needsapproval = false;
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6179");
        app.Student student3 = new app.Student("Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-4008", "Equipment ID: EQ-2367, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6180");
        app.Student student3 = new app.Student("EQ-1425", "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2271, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        student3.needsapproval = false;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6181");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-435");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-473", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-205");
        app.UserAccounts userAccounts13 = userFactory0.createUser("EQ-1616", "EQ-2137", "MANAGER-1244835102");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6182");
        app.Microscope microscope3 = new app.Microscope("EQ-4580", "", "Equipment ID: EQ-3731, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6183");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4386, Name: , Description: , Location: , Status: null", "EQ-4109");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6184");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1992, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1038", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6185");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "EQ-550", "EQ-1900");
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6186");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-802");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2765, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-2533, Name: , Description: , Location: , Status: null", "EQ-253", "EQ-3718");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6187");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getDescription();
        app.Equipment equipment9 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = equipment9.getEquipmentId();
        app.Equipment equipment14 = new app.Equipment("EQ-152", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-193");
        app.Equipment equipment18 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        app.Equipment equipment22 = new app.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        app.Arduino arduino26 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope30 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str31 = microscope30.getName();
        java.lang.String str32 = microscope30.getLocation();
        app.EquipmentStatus equipmentStatus33 = microscope30.getStatus();
        arduino26.setStatus(equipmentStatus33);
        equipment22.setStatus(equipmentStatus33);
        equipment18.setStatus(equipmentStatus33);
        equipment14.setStatus(equipmentStatus33);
        equipment9.setStatus(equipmentStatus33);
        equipment3.setStatus(equipmentStatus33);
        java.lang.String str40 = equipment3.getEquipmentId();
        app.EquipmentStatus equipmentStatus41 = equipment3.getStatus();
// flaky "23) test6187(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5501" + "'", str4, "EQ-5501");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
// flaky "7) test6187(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-5502" + "'", str10, "EQ-5502");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
// flaky "5) test6187(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EQ-5501" + "'", str40, "EQ-5501");
        org.junit.Assert.assertTrue("'" + equipmentStatus41 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus41.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6188");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double14 = labManager13.getHourlyRate();
        java.lang.String str15 = labManager13.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lab Manager" + "'", str15, "Lab Manager");
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6189");
        app.Arduino arduino3 = new app.Arduino("EQ-1530", "EQ-4011", "EQ-2342");
        app.Equipment equipment7 = new app.Equipment("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str8 = equipment7.getEquipmentId();
        java.lang.String str9 = equipment7.getDescription();
        app.EquipmentStatus equipmentStatus10 = equipment7.getStatus();
        arduino3.setStatus(equipmentStatus10);
// flaky "24) test6189(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5509" + "'", str8, "EQ-5509");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-36" + "'", str9, "EQ-36");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6190");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4298, Name: , Description: , Location: , Status: null", "EQ-3495");
        labManager12.password = "Equipment ID: EQ-4230, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6191");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-3906, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1976, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-3078");
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6192");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2013", "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "EQ-4093", "Equipment ID: EQ-4814, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6193");
        app.Arduino arduino3 = new app.Arduino("EQ-257", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-355");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.toString();
        java.lang.Class<?> wildcardClass6 = arduino3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-257" + "'", str4, "EQ-257");
// flaky "25) test6193(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5510, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5510, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6194");
        app.Microscope microscope3 = new app.Microscope("EQ-539", "EQ-1000", "EQ-1879");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "26) test6194(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5511" + "'", str4, "EQ-5511");
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6195");
        app.Student student3 = new app.Student("EQ-1176", "Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE", "EQ-2273");
        java.lang.String str4 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2273" + "'", str4, "EQ-2273");
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6196");
        app.Microscope microscope3 = new app.Microscope("EQ-598", "EQ-296", "EQ-1313");
        app.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6197");
        app.Arduino arduino3 = new app.Arduino("EQ-4929", "MANAGER-824727143", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6198");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.username = "EQ-120";
        java.lang.String str8 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-120" + "'", str8, "EQ-120");
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6199");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-592");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-221", "EQ-684", "EQ-863");
        app.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-781");
        app.UserAccounts userAccounts33 = userFactory0.createUser("Equipment ID: EQ-4109, Name: , Description: , Location: , Status: null", "EQ-4827", "");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
        org.junit.Assert.assertNull(userAccounts33);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6200");
        app.Researcher researcher3 = new app.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6201");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("", "EQ-469");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6202");
        app.Faculty faculty3 = new app.Faculty("EQ-257", "EQ-514", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6203");
        app.Guest guest3 = new app.Guest("EQ-3402", "EQ-1310", "Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6204");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("MANAGER-971154394", "EQ-5163");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6205");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null", "EQ-1082", "EQ-427");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1082" + "'", str7, "EQ-1082");
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6206");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1849, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-367");
        app.Equipment equipment7 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str8 = equipment7.getEquipmentId();
        java.lang.String str9 = equipment7.getEquipmentId();
        app.EquipmentStatus equipmentStatus10 = equipment7.getStatus();
        equipment3.setStatus(equipmentStatus10);
// flaky "27) test6206(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5527" + "'", str8, "EQ-5527");
// flaky "8) test6206(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-5527" + "'", str9, "EQ-5527");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6207");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Faculty", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-152", "EQ-74");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-1507", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "EQ-991");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-4594, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-4717, Name: , Description: , Location: , Status: null", "EQ-4212", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6208");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        guest3.password = "EQ-4625";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6209");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-1113", "Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1215, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-3506, Name: , Description: , Location: , Status: AVAILABLE", "EQ-4788", "Equipment ID: EQ-4067, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-1103");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6210");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-5471, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2886, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3001", "EQ-4397");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-5471, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6211");
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
        java.lang.String str16 = microscope3.getLocation();
        java.lang.String str17 = microscope3.getLocation();
        java.lang.String str18 = microscope3.getDescription();
// flaky "28) test6211(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5528, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5528, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "9) test6211(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5528, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5528, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6212");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3489, Name: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Description: Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-236, Status: AVAILABLE", "EQ-528", "", "Equipment ID: EQ-2343, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3489, Name: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Description: Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-236, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6213");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        double double9 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6214");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getAccountType();
        boolean boolean8 = researcher3.needsapproval;
        java.lang.String str9 = researcher3.getAccountType();
        researcher3.password = "Equipment ID: EQ-937, Name: , Description: , Location: , Status: null";
        double double12 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6215");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null");
        boolean boolean4 = faculty3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6216");
        app.Guest guest3 = new app.Guest("", "Equipment ID: EQ-3003, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4410, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6217");
        app.Equipment equipment3 = new app.Equipment("EQ-802", "Equipment ID: EQ-5116, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-863");
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6218");
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
        java.lang.String str18 = microscope3.getDescription();
        java.lang.String str19 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "29) test6218(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-5531" + "'", str10, "EQ-5531");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(equipmentStatus16);
// flaky "10) test6218(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-5531, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-5531, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky "6) test6218(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-5531, Name: , Description: , Location: , Status: null" + "'", str19, "Equipment ID: EQ-5531, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6219");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("EQ-3377", "EQ-932");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6220");
        app.Faculty faculty3 = new app.Faculty("EQ-2052", "EQ-2228", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
        boolean boolean4 = faculty3.needsapproval;
        faculty3.isapproved = true;
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6221");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-382", "EQ-380");
        app.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("EQ-690", "Equipment ID: EQ-551, Name: , Description: , Location: , Status: null");
        labManager17.username = "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager17);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6222");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6223");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null", "EQ-1082", "EQ-427");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "30) test6223(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5532, Name: Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null, Description: EQ-1082, Location: EQ-427, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5532, Name: Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null, Description: EQ-1082, Location: EQ-427, Status: AVAILABLE");
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6224");
        app.Microscope microscope3 = new app.Microscope("", "EQ-442", "EQ-3628");
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6225");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-4519, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1458, Name: , Description: , Location: , Status: null", "EQ-3512");
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6226");
        app.Researcher researcher3 = new app.Researcher("EQ-231", "EQ-222", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        boolean boolean7 = researcher3.needsapproval;
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6227");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.toString();
        app.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        app.Equipment equipment14 = new app.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str15 = equipment14.getEquipmentId();
        java.lang.String str16 = equipment14.getDescription();
        java.lang.String str17 = equipment14.getDescription();
        app.EquipmentStatus equipmentStatus18 = equipment14.getStatus();
        microscope3.setStatus(equipmentStatus18);
        java.lang.String str20 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "31) test6227(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-5534, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-5534, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "11) test6227(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-5534, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-5534, Name: , Description: , Location: , Status: null");
// flaky "7) test6227(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-5535" + "'", str15, "EQ-5535");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6228");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-104", "");
        researcher3.username = "";
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6229");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-3925, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3296, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6230");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-3730, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4147, Name: , Description: Researcher, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6231");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-382", "EQ-380");
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str19 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "EQ-120";
        headLabCoordinator0.username = "Equipment ID: EQ-1867, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE";
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
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6232");
        app.Researcher researcher3 = new app.Researcher("", "Guest", "MasterAdmin123!");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6233");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("EQ-389", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-74");
        app.UserAccounts userAccounts21 = userFactory0.createUser("EQ-811", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-384");
        app.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-4230, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-4393", "EQ-4946");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6234");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        double double9 = guest3.getHourlyRate();
        guest3.username = "EQ-594";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6235");
        app.Researcher researcher3 = new app.Researcher("EQ-114", "EQ-4038", "EQ-361");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6236");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1432, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2562");
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6237");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        faculty3.password = "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE";
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6238");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-469", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-539", "EQ-344", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-387", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-1218", "EQ-2272", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-2142", "Equipment ID: EQ-1718, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null", "EQ-686", "Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
        app.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-3060, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3349", "Equipment ID: EQ-551, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6239");
        app.Microscope microscope3 = new app.Microscope("EQ-3342", "EQ-504", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6240");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4473, Name: , Description: , Location: , Status: null", "EQ-2552");
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6241");
        app.Faculty faculty3 = new app.Faculty("EQ-811", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        boolean boolean4 = faculty3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6242");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-791", "EQ-552", "EQ-981");
        app.UserAccounts userAccounts36 = userFactory0.createUser("EQ-540", "Equipment ID: EQ-3152, Name: , Description: , Location: , Status: null", "EQ-2906", "EQ-4977");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6243");
        app.Student student3 = new app.Student("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Student", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = student3.password;
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6244");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        app.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        java.lang.String str8 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(equipmentStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6245");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6246");
        app.Equipment equipment3 = new app.Equipment("", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6247");
        app.Equipment equipment3 = new app.Equipment("EQ-616", "EQ-1166", "Equipment ID: EQ-3003, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6248");
        app.Arduino arduino3 = new app.Arduino("EQ-63", "EQ-335", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.String str5 = arduino3.toString();
        java.lang.String str6 = arduino3.toString();
        app.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        app.Equipment equipment11 = new app.Equipment("MANAGER-103232", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        java.lang.String str12 = equipment11.getLocation();
        app.Equipment equipment16 = new app.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str17 = equipment16.getLocation();
        java.lang.String str18 = equipment16.getName();
        app.EquipmentStatus equipmentStatus19 = equipment16.getStatus();
        equipment11.setStatus(equipmentStatus19);
        app.Arduino arduino24 = new app.Arduino("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "");
        app.Microscope microscope28 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus29 = null;
        microscope28.setStatus(equipmentStatus29);
        app.EquipmentStatus equipmentStatus31 = null;
        microscope28.setStatus(equipmentStatus31);
        java.lang.String str33 = microscope28.getName();
        app.Arduino arduino37 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope41 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str42 = microscope41.getName();
        java.lang.String str43 = microscope41.getLocation();
        app.EquipmentStatus equipmentStatus44 = microscope41.getStatus();
        arduino37.setStatus(equipmentStatus44);
        microscope28.setStatus(equipmentStatus44);
        java.lang.String str47 = microscope28.getLocation();
        app.EquipmentStatus equipmentStatus48 = microscope28.getStatus();
        arduino24.setStatus(equipmentStatus48);
        equipment11.setStatus(equipmentStatus48);
        arduino3.setStatus(equipmentStatus48);
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "32) test6248(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5543, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5543, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
// flaky "12) test6248(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-5543, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-5543, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus44 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus44.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus48 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus48.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6249");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean13 = labManager12.isapproved;
        boolean boolean14 = labManager12.needsapproval;
        labManager12.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6250");
        app.Equipment equipment3 = new app.Equipment("EQ-431", "Equipment ID: EQ-2701, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "EQ-2595");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-2701, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-2701, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6251");
        app.Microscope microscope3 = new app.Microscope("EQ-4190", "EQ-4468", "EQ-1346");
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6252");
        app.Researcher researcher3 = new app.Researcher("EQ-5079", "EQ-2880", "EQ-507");
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6253");
        app.Equipment equipment3 = new app.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6254");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str10 = guest3.password;
        java.lang.String str11 = guest3.password;
        double double12 = guest3.getHourlyRate();
        java.lang.String str13 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6255");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.lang.String str12 = microscope3.toString();
        java.lang.String str13 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "33) test6255(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-5563, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-5563, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6256");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        guest3.needsapproval = true;
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6257");
        app.Guest guest3 = new app.Guest("EQ-390", "EQ-514", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-514" + "'", str4, "EQ-514");
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6258");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE", "Equipment ID: EQ-4811, Name: Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-5088, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6259");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-3730, Name: , Description: , Location: , Status: null", "EQ-4501", "Equipment ID: EQ-5531, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6260");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        app.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6261");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6262");
        app.Student student3 = new app.Student("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6263");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.username;
        double double9 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6264");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-2634", "Equipment ID: EQ-790, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6265");
        app.Student student3 = new app.Student("EQ-4953", "EQ-2861", "Equipment ID: EQ-5471, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6266");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-5292, Name: , Description: , Location: , Status: AVAILABLE", "EQ-473", "");
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6267");
        app.Faculty faculty3 = new app.Faculty("EQ-382", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "EQ-156");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6268");
        app.Microscope microscope3 = new app.Microscope("EQ-2737", "EQ-3807", "EQ-296");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2737" + "'", str4, "EQ-2737");
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6269");
        app.Arduino arduino3 = new app.Arduino("EQ-596", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.getLocation();
        app.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        java.lang.String str8 = arduino3.getLocation();
        java.lang.String str9 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-596" + "'", str4, "EQ-596");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-596" + "'", str5, "EQ-596");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-596" + "'", str9, "EQ-596");
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6270");
        app.Student student3 = new app.Student("EQ-131", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6271");
        app.Faculty faculty3 = new app.Faculty("EQ-2532", "EQ-1261", "EQ-3456");
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6272");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null");
        faculty3.password = "";
        java.lang.String str6 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6273");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str16 = headLabCoordinator0.username;
        boolean boolean17 = headLabCoordinator0.isapproved;
        boolean boolean18 = headLabCoordinator0.needsapproval;
        app.LabManager labManager21 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "EQ-2192");
        java.lang.String str22 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "COORD-001" + "'", str22, "COORD-001");
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6274");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2475", "EQ-236", "EQ-3426", "Equipment ID: EQ-4177, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2475");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6275");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str12 = headLabCoordinator0.username;
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6276");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2670", "Equipment ID: EQ-4399, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-4201", "EQ-1163");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2670");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6277");
        app.Microscope microscope3 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getDescription();
        java.lang.String str8 = microscope3.getName();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6278");
        app.Equipment equipment3 = new app.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.toString();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime6, localDateTime7);
        java.lang.String str9 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "34) test6278(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5570, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5570, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "13) test6278(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-5570" + "'", str9, "EQ-5570");
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6279");
        app.Faculty faculty3 = new app.Faculty("", "EQ-826", "EQ-764");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6280");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-304", "EQ-299");
        labManager13.isapproved = true;
        labManager13.username = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6281");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1718, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6282");
        app.Guest guest3 = new app.Guest("Head Lab Coordinator", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.username;
        java.lang.String str5 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6283");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        app.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-1341", "EQ-688");
        double double8 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.needsapproval = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6284");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.isapproved = false;
        java.lang.String str12 = headLabCoordinator0.getRegistrationId();
        java.lang.String str13 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6285");
        app.Arduino arduino3 = new app.Arduino("EQ-765", "EQ-3376", "EQ-1082");
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6286");
        app.Microscope microscope3 = new app.Microscope("EQ-1340", "Equipment ID: EQ-1080, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6287");
        app.Equipment equipment3 = new app.Equipment("Researcher", "EQ-1437", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.getLocation();
        app.Arduino arduino8 = new app.Arduino("MANAGER-0", "EQ-221", "EQ-301");
        java.lang.String str9 = arduino8.getLocation();
        app.EquipmentStatus equipmentStatus10 = arduino8.getStatus();
        equipment3.setStatus(equipmentStatus10);
        java.lang.String str12 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-301" + "'", str9, "EQ-301");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
// flaky "35) test6287(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-5574, Name: Researcher, Description: EQ-1437, Location: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-5574, Name: Researcher, Description: EQ-1437, Location: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6288");
        app.Student student3 = new app.Student("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Student", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = true;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6289");
        app.Microscope microscope3 = new app.Microscope("EQ-784", "EQ-325", "EQ-451");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.getEquipmentId();
        java.lang.String str6 = microscope3.getDescription();
        app.Microscope microscope10 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus11 = null;
        microscope10.setStatus(equipmentStatus11);
        app.EquipmentStatus equipmentStatus13 = microscope10.getStatus();
        java.lang.String str14 = microscope10.toString();
        java.lang.String str15 = microscope10.getName();
        java.lang.String str16 = microscope10.getDescription();
        app.Arduino arduino20 = new app.Arduino("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "MasterAdmin123!");
        app.Microscope microscope24 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str25 = microscope24.getName();
        java.lang.String str26 = microscope24.getDescription();
        java.lang.String str27 = microscope24.getLocation();
        java.lang.String str28 = microscope24.getEquipmentId();
        app.Microscope microscope32 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus33 = null;
        microscope32.setStatus(equipmentStatus33);
        app.EquipmentStatus equipmentStatus35 = microscope32.getStatus();
        java.lang.String str36 = microscope32.getLocation();
        app.Microscope microscope40 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str41 = microscope40.getDescription();
        java.lang.String str42 = microscope40.getLocation();
        java.lang.String str43 = microscope40.getName();
        app.Microscope microscope47 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = microscope47.isAvailable(localDateTime48, localDateTime49);
        app.EquipmentStatus equipmentStatus51 = microscope47.getStatus();
        microscope40.setStatus(equipmentStatus51);
        microscope32.setStatus(equipmentStatus51);
        microscope24.setStatus(equipmentStatus51);
        arduino20.setStatus(equipmentStatus51);
        microscope10.setStatus(equipmentStatus51);
        app.Arduino arduino60 = new app.Arduino("Lab Manager", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        app.Equipment equipment64 = new app.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.lang.String str65 = equipment64.getDescription();
        app.Microscope microscope69 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str70 = microscope69.getDescription();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        boolean boolean73 = microscope69.isAvailable(localDateTime71, localDateTime72);
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        boolean boolean76 = microscope69.isAvailable(localDateTime74, localDateTime75);
        app.EquipmentStatus equipmentStatus77 = microscope69.getStatus();
        app.EquipmentStatus equipmentStatus78 = microscope69.getStatus();
        equipment64.setStatus(equipmentStatus78);
        arduino60.setStatus(equipmentStatus78);
        microscope10.setStatus(equipmentStatus78);
        microscope3.setStatus(equipmentStatus78);
        java.lang.Class<?> wildcardClass83 = equipmentStatus78.getClass();
// flaky "36) test6289(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5576, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5576, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE");
// flaky "14) test6289(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5576" + "'", str5, "EQ-5576");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-325" + "'", str6, "EQ-325");
        org.junit.Assert.assertNull(equipmentStatus13);
// flaky "8) test6289(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-5577, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-5577, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
// flaky "2) test6289(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EQ-5579" + "'", str28, "EQ-5579");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "COORD-001" + "'", str41, "COORD-001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str42, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Guest" + "'", str43, "Guest");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus51 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus51.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str65, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus77 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus77.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus78 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus78.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6290");
        app.Guest guest3 = new app.Guest("EQ-231", "Equipment ID: EQ-1317, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2533, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6291");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-5028", "Equipment ID: EQ-2916, Name: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null, Description: EQ-382, Location: EQ-335, Status: AVAILABLE");
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6292");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-2137, Name: , Description: , Location: , Status: null", "EQ-1839", "EQ-535");
        java.lang.String str4 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2137, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-2137, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6293");
        app.Equipment equipment3 = new app.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6294");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2847, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6295");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-384");
        labManager10.isapproved = false;
        java.lang.Class<?> wildcardClass13 = labManager10.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6296");
        app.Equipment equipment3 = new app.Equipment("EQ-131", "EQ-259", "EQ-131");
        java.lang.String str4 = equipment3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-259" + "'", str4, "EQ-259");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6297");
        app.Student student3 = new app.Student("EQ-435", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6298");
        app.Arduino arduino3 = new app.Arduino("EQ-3402", "EQ-1530", "Equipment ID: EQ-1526, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6299");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        labManager3.username = "EQ-104";
        java.lang.String str6 = labManager3.username;
        java.lang.String str7 = labManager3.getAccountType();
        labManager3.username = "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null";
        labManager3.needsapproval = true;
        labManager3.username = "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str14 = labManager3.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-104" + "'", str6, "EQ-104");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lab Manager" + "'", str7, "Lab Manager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MANAGER-1023477660" + "'", str14, "MANAGER-1023477660");
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6300");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2770, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-1879");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6301");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-41", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6302");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        headLabCoordinator0.password = "Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6303");
        app.Guest guest3 = new app.Guest("EQ-1103", "Equipment ID: EQ-3894, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6304");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        guest3.password = "EQ-799";
        double double8 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6305");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-851", "EQ-1526");
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6306");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        double double7 = researcher3.getHourlyRate();
        researcher3.needsapproval = false;
        researcher3.needsapproval = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6307");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-4229, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-3955, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6308");
        app.Researcher researcher3 = new app.Researcher("EQ-3662", "EQ-1479", "EQ-3346");
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6309");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        app.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        app.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-222", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-583", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-104");
        app.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1878, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts31 = userFactory0.createUser("EQ-2996", "", "EQ-4748", "EQ-2013");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6310");
        app.Researcher researcher3 = new app.Researcher("EQ-866", "EQ-2708", "EQ-5079");
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6311");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null", "EQ-866");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2924, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2846", "EQ-1435");
        app.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-2616, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "MANAGER-66181089", "Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6312");
        app.Faculty faculty3 = new app.Faculty("", "EQ-3798", "EQ-1434");
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6313");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        double double10 = researcher3.getHourlyRate();
        java.lang.String str11 = researcher3.getRegistrationId();
        boolean boolean12 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6314");
        app.Researcher researcher3 = new app.Researcher("EQ-1739", "Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6315");
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
        java.lang.String str31 = microscope3.getEquipmentId();
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
// flaky "37) test6315(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-5593" + "'", str31, "EQ-5593");
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6316");
        app.Student student3 = new app.Student("COORD-001", "MasterAdmin123!", "hi!");
        java.lang.String str4 = student3.getRegistrationId();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6317");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-5531", "EQ-2501");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str1, "Equipment ID: EQ-3010, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6318");
        app.Equipment equipment3 = new app.Equipment("EQ-1479", "EQ-304", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1479" + "'", str4, "EQ-1479");
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6319");
        app.Student student3 = new app.Student("EQ-221", "EQ-253", "EQ-242");
        student3.username = "EQ-2683";
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6320");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-2446, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str18 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Head Lab Coordinator" + "'", str18, "Head Lab Coordinator");
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6321");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = false;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.password = "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null";
        java.lang.String str14 = headLabCoordinator0.password;
        java.lang.String str15 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null" + "'", str15, "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6322");
        app.Guest guest3 = new app.Guest("EQ-3232", "EQ-2898", "EQ-859");
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6323");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-1248";
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        boolean boolean14 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6324");
        app.Researcher researcher3 = new app.Researcher("COORD-001", "MasterAdmin123!", "MasterAdmin123!");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MasterAdmin123!" + "'", str6, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6325");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-2623, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-497", "EQ-5354");
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6326");
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
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6327");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.isapproved = false;
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6328");
        app.Faculty faculty3 = new app.Faculty("MasterAdmin123!", "COORD-001", "");
        faculty3.isapproved = true;
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6329");
        app.Researcher researcher3 = new app.Researcher("EQ-602", "EQ-1412", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6330");
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
        java.lang.String str15 = microscope3.getName();
        java.lang.String str16 = microscope3.getName();
        app.EquipmentStatus equipmentStatus17 = null;
        microscope3.setStatus(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "38) test6330(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5598, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-5598, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6331");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-5471, Name: , Description: , Location: , Status: null", "EQ-4136", "MANAGER-631155379");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6332");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        java.lang.String str14 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COORD-001" + "'", str14, "COORD-001");
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6333");
        app.Guest guest3 = new app.Guest("EQ-3080", "Equipment ID: EQ-5563, Name: , Description: , Location: , Status: null", "EQ-3484");
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6334");
        app.Student student3 = new app.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        student3.username = "EQ-2625";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6335");
        app.Faculty faculty3 = new app.Faculty("EQ-253", "EQ-1608", "EQ-977");
        java.lang.String str4 = faculty3.username;
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-253" + "'", str4, "EQ-253");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1608" + "'", str5, "EQ-1608");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6336");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-2836, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-4713", "Equipment ID: EQ-4818, Name: , Description: , Location: , Status: null");
        java.lang.String str16 = labManager15.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-4713" + "'", str16, "EQ-4713");
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6337");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        java.lang.String str6 = arduino3.getName();
        java.lang.String str7 = arduino3.getLocation();
        app.Microscope microscope11 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus12 = null;
        microscope11.setStatus(equipmentStatus12);
        app.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        java.lang.String str15 = microscope11.getLocation();
        java.lang.String str16 = microscope11.getName();
        app.Microscope microscope20 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = microscope20.isAvailable(localDateTime21, localDateTime22);
        app.EquipmentStatus equipmentStatus24 = microscope20.getStatus();
        microscope11.setStatus(equipmentStatus24);
        app.EquipmentStatus equipmentStatus26 = microscope11.getStatus();
        arduino3.setStatus(equipmentStatus26);
        java.lang.String str28 = arduino3.getLocation();
        java.lang.String str29 = arduino3.getDescription();
        java.lang.String str30 = arduino3.getDescription();
        app.EquipmentStatus equipmentStatus31 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str29, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str30, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6338");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-179", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1717, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4533, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6339");
        app.Guest guest3 = new app.Guest("EQ-2052", "Equipment ID: EQ-2486, Name: , Description: , Location: , Status: null", "EQ-5341");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6340");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "EQ-2435", "EQ-4018", "Equipment ID: EQ-785, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-754, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6341");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-1718, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1678, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3693, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2683, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-5399, Name: , Description: , Location: , Status: null", "EQ-4362", "Equipment ID: EQ-4001, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6342");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-3866, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE");
        java.lang.String str4 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE");
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6343");
        app.Equipment equipment3 = new app.Equipment("", "MANAGER-66181089", "Equipment ID: EQ-2207, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6344");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        app.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-179", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean8 = headLabCoordinator0.isapproved;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-5028", "Equipment ID: EQ-3385, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6345");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        java.lang.String str11 = headLabCoordinator0.password;
        headLabCoordinator0.password = "EQ-751";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6346");
        app.Microscope microscope3 = new app.Microscope("EQ-118", "EQ-4421", "EQ-4393");
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6347");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-513, Name: , Description: , Location: , Status: null";
        double double11 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6348");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.isapproved = true;
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.password = "Equipment ID: EQ-2485, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6349");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getAccountType();
        boolean boolean5 = guest3.isapproved;
        java.lang.String str6 = guest3.getAccountType();
        guest3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6350");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        app.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("EQ-2460", "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
        double double19 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6351");
        app.Equipment equipment3 = new app.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.toString();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime6, localDateTime7);
        java.lang.String str9 = equipment3.getLocation();
        java.lang.String str10 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-71" + "'", str4, "EQ-71");
// flaky "39) test6351(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5605, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5605, Name: EQ-71, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: Researcher, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-71" + "'", str10, "EQ-71");
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6352");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        app.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        app.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        app.UserAccounts userAccounts24 = userFactory0.createUser("EQ-539", "EQ-628", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1811");
        app.UserAccounts userAccounts28 = userFactory0.createUser("", "EQ-2175", "Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        app.UserAccounts userAccounts32 = userFactory0.createUser("Equipment ID: EQ-3797, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3688, Name: EQ-469, Description: EQ-981, Location: EQ-773, Status: AVAILABLE", "EQ-2138");
        app.UserAccounts userAccounts37 = userFactory0.createUser("EQ-2594", "", "EQ-503", "EQ-504");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts37);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6353");
        app.Equipment equipment3 = new app.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-63" + "'", str5, "EQ-63");
// flaky "40) test6353(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-5606" + "'", str6, "EQ-5606");
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6354");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-4820, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-2475", "EQ-5442");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-4820, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6355");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getRegistrationId();
        guest3.username = "Equipment ID: EQ-1699, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE";
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6356");
        app.Student student3 = new app.Student("EQ-4473", "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-4231");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6357");
        app.Faculty faculty3 = new app.Faculty("EQ-3144", "EQ-3518", "Equipment ID: EQ-2271, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6358");
        app.Student student3 = new app.Student("Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6359");
        app.Researcher researcher3 = new app.Researcher("EQ-264", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1261");
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6360");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-106", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = labManager5.username;
        labManager5.isapproved = true;
        double double9 = labManager5.getHourlyRate();
        boolean boolean10 = labManager5.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-106" + "'", str6, "EQ-106");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6361");
        app.Equipment equipment3 = new app.Equipment("EQ-258", "EQ-863", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-258" + "'", str4, "EQ-258");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-258" + "'", str5, "EQ-258");
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6362");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-461", "EQ-442", "Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-981");
        app.UserAccounts userAccounts32 = userFactory0.createUser("EQ-4610", "Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4856, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2990, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6363");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        headLabCoordinator0.needsapproval = false;
        java.lang.String str13 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COORD-001" + "'", str13, "COORD-001");
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6364");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-4017, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1762", "Equipment ID: EQ-4789, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6365");
        app.Student student3 = new app.Student("EQ-118", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "EQ-751");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-118" + "'", str5, "EQ-118");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6366");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null", "", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts30 = userFactory0.createUser("Equipment ID: EQ-1413, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-802", "EQ-2011");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6367");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        labManager3.username = "EQ-104";
        boolean boolean6 = labManager3.isapproved;
        java.lang.String str7 = labManager3.getRegistrationId();
        java.lang.String str8 = labManager3.password;
        labManager3.password = "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null";
        java.lang.String str11 = labManager3.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MANAGER-1023477660" + "'", str7, "MANAGER-1023477660");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-104" + "'", str11, "EQ-104");
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6368");
        app.Guest guest3 = new app.Guest("EQ-382", "EQ-1340", "Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.username;
        boolean boolean5 = guest3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-382" + "'", str4, "EQ-382");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6369");
        app.Equipment equipment3 = new app.Equipment("EQ-368", "EQ-3346", "EQ-3149");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6370");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-4557");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6371");
        app.Arduino arduino3 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getDescription();
        java.lang.String str13 = arduino3.toString();
        java.lang.String str14 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
// flaky "41) test6371(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-5610, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-5610, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COORD-001" + "'", str14, "COORD-001");
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6372");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        boolean boolean6 = researcher3.isapproved;
        java.lang.String str7 = researcher3.username;
        double double8 = researcher3.getHourlyRate();
        researcher3.username = "Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE";
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6373");
        app.Equipment equipment3 = new app.Equipment("", "EQ-413", "EQ-547");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.toString();
// flaky "42) test6373(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5612" + "'", str4, "EQ-5612");
// flaky "15) test6373(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5612, Name: , Description: EQ-413, Location: EQ-547, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5612, Name: , Description: EQ-413, Location: EQ-547, Status: AVAILABLE");
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6374");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6375");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-586", "Equipment ID: EQ-2967, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "Equipment ID: EQ-5543, Name: EQ-63, Description: EQ-335, Location: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6376");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.String str5 = arduino3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "43) test6376(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5613" + "'", str5, "EQ-5613");
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6377");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6378");
        app.Student student3 = new app.Student("MasterAdmin123!", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        student3.password = "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6379");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        student3.username = "Equipment ID: EQ-761, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6380");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-4008", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6381");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.username = "Equipment ID: EQ-718, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6382");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6383");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null";
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6384");
        app.Student student3 = new app.Student("EQ-39", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-264");
        double double4 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6385");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "EQ-156");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        app.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("EQ-3445", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str19 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Head Lab Coordinator" + "'", str19, "Head Lab Coordinator");
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6386");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3923, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6387");
        app.Microscope microscope3 = new app.Microscope("EQ-489", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getName();
        app.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        java.lang.String str6 = microscope3.getEquipmentId();
        app.Arduino arduino10 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus11 = null;
        arduino10.setStatus(equipmentStatus11);
        app.EquipmentStatus equipmentStatus13 = arduino10.getStatus();
        java.lang.String str14 = arduino10.getName();
        app.EquipmentStatus equipmentStatus15 = arduino10.getStatus();
        app.Microscope microscope19 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str20 = microscope19.getDescription();
        java.lang.String str21 = microscope19.getLocation();
        java.lang.String str22 = microscope19.getName();
        app.Microscope microscope26 = new app.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = microscope26.isAvailable(localDateTime27, localDateTime28);
        app.EquipmentStatus equipmentStatus30 = microscope26.getStatus();
        microscope19.setStatus(equipmentStatus30);
        app.EquipmentStatus equipmentStatus32 = microscope19.getStatus();
        app.EquipmentStatus equipmentStatus33 = microscope19.getStatus();
        app.EquipmentStatus equipmentStatus34 = microscope19.getStatus();
        arduino10.setStatus(equipmentStatus34);
        microscope3.setStatus(equipmentStatus34);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-489" + "'", str4, "EQ-489");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
// flaky "44) test6387(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-5615" + "'", str6, "EQ-5615");
        org.junit.Assert.assertNull(equipmentStatus13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipmentStatus15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "COORD-001" + "'", str20, "COORD-001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus30 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus30.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus32 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus32.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus34 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus34.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6388");
        app.Equipment equipment3 = new app.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6389");
        app.Faculty faculty3 = new app.Faculty("EQ-361", "Lab Manager", "EQ-559");
        faculty3.username = "EQ-1557";
        java.lang.String str6 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-559" + "'", str6, "EQ-559");
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6390");
        app.Researcher researcher3 = new app.Researcher("EQ-4246", "EQ-528", "Equipment ID: EQ-2706, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6391");
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
        java.lang.String str21 = arduino3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
// flaky "45) test6391(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-5620" + "'", str20, "EQ-5620");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6392");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = true;
        app.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-1530", "EQ-4814");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6393");
        app.Microscope microscope3 = new app.Microscope("EQ-1340", "EQ-1969", "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = microscope3.toString();
// flaky "46) test6393(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5623, Name: EQ-1340, Description: EQ-1969, Location: Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5623, Name: EQ-1340, Description: EQ-1969, Location: Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6394");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1742", "EQ-4393");
        researcher3.username = "Equipment ID: EQ-2680, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE";
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6395");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getRegistrationId();
        boolean boolean7 = student3.needsapproval;
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6396");
        app.Faculty faculty3 = new app.Faculty("EQ-389", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.password = "EQ-3750";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6397");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-205", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = microscope3.getName();
        java.lang.String str8 = microscope3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
// flaky "47) test6397(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5624" + "'", str8, "EQ-5624");
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6398");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-489";
        boolean boolean13 = headLabCoordinator0.isapproved;
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Researcher" + "'", str2, "Researcher");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6399");
        app.Student student3 = new app.Student("EQ-2459", "EQ-1050", "Equipment ID: EQ-5172, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6400");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.username;
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6401");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-4539, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-4008");
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6402");
        app.Equipment equipment3 = new app.Equipment("", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        app.Arduino arduino7 = new app.Arduino("hi!", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
        app.EquipmentStatus equipmentStatus8 = arduino7.getStatus();
        equipment3.setStatus(equipmentStatus8);
        java.lang.String str10 = equipment3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6403");
        app.Guest guest3 = new app.Guest("Faculty", "", "Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6404");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getLocation();
        app.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        java.lang.String str9 = arduino3.getLocation();
        java.lang.String str10 = arduino3.getLocation();
        java.lang.String str11 = arduino3.getLocation();
        java.lang.String str12 = arduino3.getLocation();
        java.lang.String str13 = arduino3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6405");
        app.Student student3 = new app.Student("Equipment ID: EQ-2680, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-1808", "EQ-1904");
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6406");
        app.Researcher researcher3 = new app.Researcher("EQ-623", "EQ-114", "EQ-992");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6407");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1161");
        researcher3.needsapproval = false;
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6408");
        app.Student student3 = new app.Student("EQ-2017", "EQ-2340", "Equipment ID: EQ-2065, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6409");
        app.Faculty faculty3 = new app.Faculty("", "", "EQ-75");
        faculty3.needsapproval = false;
        faculty3.isapproved = true;
        faculty3.isapproved = true;
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6410");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "", "EQ-470");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.toString();
// flaky "48) test6410(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5628, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5628, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
// flaky "16) test6410(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5628, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5628, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6411");
        app.Student student3 = new app.Student("EQ-569", "", "Equipment ID: EQ-4316, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE");
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6412");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        headLabCoordinator0.needsapproval = true;
        app.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1215, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        double double16 = labManager15.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6413");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3440", "EQ-3916", "Equipment ID: EQ-4317, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6414");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        double double11 = researcher3.getHourlyRate();
        researcher3.username = "EQ-367";
        java.lang.String str14 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6415");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null", "EQ-937", "EQ-325");
        app.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6416");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1412, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3145", "Equipment ID: EQ-2614, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6417");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = equipment3.isAvailable(localDateTime6, localDateTime7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6418");
        app.Equipment equipment3 = new app.Equipment("EQ-118", "EQ-75", "MANAGER-66180900");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.String str7 = equipment3.getEquipmentId();
        java.lang.String str8 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-118" + "'", str4, "EQ-118");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-118" + "'", str5, "EQ-118");
// flaky "49) test6418(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-5631" + "'", str6, "EQ-5631");
// flaky "17) test6418(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-5631" + "'", str7, "EQ-5631");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MANAGER-66180900" + "'", str8, "MANAGER-66180900");
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6419");
        app.Researcher researcher3 = new app.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.password;
        researcher3.username = "EQ-1000";
        researcher3.needsapproval = true;
        java.lang.String str10 = researcher3.getRegistrationId();
        researcher3.username = "Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6420");
        app.Student student3 = new app.Student("Equipment ID: EQ-4539, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1479", "Equipment ID: EQ-5219, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6421");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        guest3.isapproved = false;
        java.lang.String str7 = guest3.password;
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-36" + "'", str7, "EQ-36");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6422");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3113, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE", "EQ-4190", "EQ-3659");
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6423");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-1767, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-1922", "Equipment ID: EQ-1432, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1432, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1432, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6424");
        app.Microscope microscope3 = new app.Microscope("", "Equipment ID: EQ-2704, Name: , Description: , Location: , Status: null", "EQ-2473");
        app.Microscope microscope7 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getName();
        app.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        java.lang.String str11 = microscope7.getEquipmentId();
        app.EquipmentStatus equipmentStatus12 = microscope7.getStatus();
        microscope3.setStatus(equipmentStatus12);
        java.lang.Class<?> wildcardClass14 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
// flaky "50) test6424(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-5633" + "'", str11, "EQ-5633");
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6425");
        app.Guest guest3 = new app.Guest("EQ-851", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null", "EQ-690");
        java.lang.String str4 = guest3.getAccountType();
        guest3.password = "Equipment ID: EQ-3295, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6426");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "EQ-98");
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-3376", "EQ-4348");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-489" + "'", str1, "EQ-489");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6427");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "EQ-325", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6428");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-384");
        labManager10.password = "EQ-1238";
        java.lang.String str13 = labManager10.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MANAGER-1711025779" + "'", str13, "MANAGER-1711025779");
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6429");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        app.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        app.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-1180", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
        java.lang.String str12 = labManager11.getAccountType();
        labManager11.username = "EQ-1808";
        java.lang.String str15 = labManager11.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lab Manager" + "'", str12, "Lab Manager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-1808" + "'", str15, "EQ-1808");
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6430");
        app.Faculty faculty3 = new app.Faculty("Head Lab Coordinator", "EQ-92", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.password;
        java.lang.String str7 = faculty3.username;
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-92" + "'", str6, "EQ-92");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6431");
        app.Student student3 = new app.Student("Equipment ID: EQ-3426, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE", "EQ-469", "EQ-427");
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6432");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-4912", "EQ-592");
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6433");
        app.Guest guest3 = new app.Guest("", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6434");
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
        app.EquipmentStatus equipmentStatus17 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope3.isAvailable(localDateTime18, localDateTime19);
        java.lang.String str21 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "51) test6434(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-5635, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str21, "Equipment ID: EQ-5635, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6435");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-2305, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-2090", "Equipment ID: EQ-3518, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6436");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        app.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        app.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        app.UserAccounts userAccounts22 = userFactory0.createUser("EQ-869", "EQ-1484", "");
        app.UserAccounts userAccounts27 = userFactory0.createUser("EQ-558", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-179");
        app.UserAccounts userAccounts32 = userFactory0.createUser("MANAGER-971154394", "Equipment ID: EQ-2196, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts37 = userFactory0.createUser("Equipment ID: EQ-5208, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4155, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-4676, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3615");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts37);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6437");
        app.Faculty faculty3 = new app.Faculty("EQ-764", "Equipment ID: EQ-4297, Name: Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null, Description: EQ-1970, Location: Equipment ID: EQ-432, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2412");
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6438");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.username;
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        faculty3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6439");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        app.Arduino arduino11 = new app.Arduino("Equipment ID: EQ-790, Name: , Description: , Location: , Status: null", "EQ-2127", "EQ-1042");
        java.lang.String str12 = arduino11.getLocation();
        app.EquipmentStatus equipmentStatus13 = arduino11.getStatus();
        microscope3.setStatus(equipmentStatus13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-1042" + "'", str12, "EQ-1042");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6440");
        app.Student student3 = new app.Student("EQ-4339", "EQ-4343", "Equipment ID: EQ-2527, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6441");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getName();
        app.Microscope microscope11 = new app.Microscope("", "", "");
        app.EquipmentStatus equipmentStatus12 = null;
        microscope11.setStatus(equipmentStatus12);
        app.EquipmentStatus equipmentStatus14 = null;
        microscope11.setStatus(equipmentStatus14);
        java.lang.String str16 = microscope11.getName();
        app.Arduino arduino20 = new app.Arduino("Researcher", "hi!", "hi!");
        app.Microscope microscope24 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str25 = microscope24.getName();
        java.lang.String str26 = microscope24.getLocation();
        app.EquipmentStatus equipmentStatus27 = microscope24.getStatus();
        arduino20.setStatus(equipmentStatus27);
        microscope11.setStatus(equipmentStatus27);
        microscope3.setStatus(equipmentStatus27);
        java.lang.String str31 = microscope3.getName();
        java.lang.String str32 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6442");
        app.Faculty faculty3 = new app.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.username = "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getRegistrationId();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-41" + "'", str9, "EQ-41");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6443");
        app.Guest guest3 = new app.Guest("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-1058", "EQ-558");
        boolean boolean4 = guest3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6444");
        app.Arduino arduino3 = new app.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        app.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        app.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getName();
        java.lang.String str8 = arduino3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6445");
        app.Microscope microscope3 = new app.Microscope("EQ-602", "EQ-120", "EQ-2460");
        java.lang.String str4 = microscope3.toString();
// flaky "52) test6445(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5644, Name: EQ-602, Description: EQ-120, Location: EQ-2460, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5644, Name: EQ-602, Description: EQ-120, Location: EQ-2460, Status: AVAILABLE");
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6446");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getLocation();
        app.Arduino arduino13 = new app.Arduino("", "EQ-36", "EQ-92");
        app.EquipmentStatus equipmentStatus14 = arduino13.getStatus();
        microscope3.setStatus(equipmentStatus14);
        java.lang.String str16 = microscope3.getName();
        app.Microscope microscope20 = new app.Microscope("MasterAdmin123!", "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "");
        app.EquipmentStatus equipmentStatus21 = microscope20.getStatus();
        microscope3.setStatus(equipmentStatus21);
        app.Arduino arduino26 = new app.Arduino("Equipment ID: EQ-1979, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-990, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        app.Microscope microscope30 = new app.Microscope("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        app.Arduino arduino34 = new app.Arduino("COORD-001", "Researcher", "COORD-001");
        app.Microscope microscope38 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str39 = microscope38.getName();
        java.lang.String str40 = microscope38.getLocation();
        app.EquipmentStatus equipmentStatus41 = microscope38.getStatus();
        arduino34.setStatus(equipmentStatus41);
        java.lang.String str43 = arduino34.getLocation();
        app.EquipmentStatus equipmentStatus44 = arduino34.getStatus();
        microscope30.setStatus(equipmentStatus44);
        arduino26.setStatus(equipmentStatus44);
        microscope3.setStatus(equipmentStatus44);
// flaky "53) test6446(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5645, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5645, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "18) test6446(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5645, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5645, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus41 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus41.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "COORD-001" + "'", str43, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus44 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus44.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6447");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-296", "");
        java.lang.String str4 = faculty3.username;
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6448");
        app.Faculty faculty3 = new app.Faculty("EQ-4176", "EQ-4974", "Equipment ID: EQ-3456, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE");
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6449");
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
        java.lang.String str21 = labManager20.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EQ-489" + "'", str17, "EQ-489");
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MANAGER-66181082" + "'", str21, "MANAGER-66181082");
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6450");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1745, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "EQ-1179");
        app.Equipment equipment7 = new app.Equipment("Equipment ID: EQ-1714, Name: , Description: , Location: , Status: null", "EQ-1082", "EQ-427");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = equipment7.isAvailable(localDateTime8, localDateTime9);
        app.Arduino arduino14 = new app.Arduino("EQ-99", "EQ-74", "Researcher");
        app.EquipmentStatus equipmentStatus15 = arduino14.getStatus();
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
        arduino14.setStatus(equipmentStatus43);
        equipment7.setStatus(equipmentStatus43);
        equipment3.setStatus(equipmentStatus43);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus43 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus43.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6451");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-3297, Name: hi!, Description: , Location: hi!, Status: null", "EQ-5246", "Equipment ID: EQ-3078, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6452");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        app.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-2644", "Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str15 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6453");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.username;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6454");
        app.Arduino arduino3 = new app.Arduino("Equipment ID: EQ-2817, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-469", "Equipment ID: EQ-4704, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6455");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6456");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        app.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6457");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-2712", "EQ-2553");
        java.lang.String str4 = equipment3.toString();
// flaky "54) test6457(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5661, Name: Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: EQ-2712, Location: EQ-2553, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5661, Name: Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Description: EQ-2712, Location: EQ-2553, Status: AVAILABLE");
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6458");
        app.Microscope microscope3 = new app.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6459");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-3299, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-5184, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1919");
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6460");
        app.Faculty faculty3 = new app.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        boolean boolean6 = faculty3.isapproved;
        boolean boolean7 = faculty3.isapproved;
        faculty3.needsapproval = false;
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6461");
        app.Microscope microscope3 = new app.Microscope("EQ-3615", "Equipment ID: EQ-2817, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-4868, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6462");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-2724, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4755, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6463");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1712, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null", "EQ-1261", "Equipment ID: EQ-3678, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1712, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6464");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.password = "EQ-442";
        headLabCoordinator0.needsapproval = false;
        java.lang.Class<?> wildcardClass8 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6465");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE", "EQ-1900", "Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6466");
        app.UserFactory userFactory0 = new app.UserFactory();
        app.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        app.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        app.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        app.UserAccounts userAccounts16 = userFactory0.createUser("EQ-131", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-36");
        app.UserAccounts userAccounts20 = userFactory0.createUser("Equipment ID: EQ-1417, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        app.UserAccounts userAccounts25 = userFactory0.createUser("EQ-3512", "Equipment ID: EQ-4311, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-2683, Name: , Description: , Location: , Status: null", "EQ-1032");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6467");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.password;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-442" + "'", str12, "EQ-442");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6468");
        app.Equipment equipment3 = new app.Equipment("EQ-981", "EQ-489", "EQ-1099");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "55) test6468(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5666" + "'", str4, "EQ-5666");
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6469");
        app.Student student3 = new app.Student("EQ-2020", "EQ-2137", "EQ-1739");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6470");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        app.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-558", "EQ-2684");
        headLabCoordinator0.password = "EQ-2325";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6471");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-3642, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-4829, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6472");
        app.Guest guest3 = new app.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.username = "EQ-106";
        guest3.username = "MANAGER-597445801";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6473");
        app.Researcher researcher3 = new app.Researcher("EQ-131", "Researcher", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.username;
        java.lang.Class<?> wildcardClass5 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-131" + "'", str4, "EQ-131");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6474");
        app.EquipmentFactory equipmentFactory0 = new app.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            app.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6475");
        app.Student student3 = new app.Student("Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-221", "EQ-2375");
        student3.needsapproval = true;
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6476");
        app.Arduino arduino3 = new app.Arduino("EQ-1583", "EQ-5192", "EQ-3448");
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6477");
        app.Equipment equipment3 = new app.Equipment("EQ-1878", "EQ-304", "EQ-4264");
        java.lang.String str4 = equipment3.toString();
// flaky "56) test6477(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5668, Name: EQ-1878, Description: EQ-304, Location: EQ-4264, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5668, Name: EQ-1878, Description: EQ-304, Location: EQ-4264, Status: AVAILABLE");
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6478");
        app.Arduino arduino3 = new app.Arduino("EQ-449", "Equipment ID: EQ-3243, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6479");
        app.Equipment equipment3 = new app.Equipment("Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.toString();
        app.Microscope microscope9 = new app.Microscope("EQ-590", "EQ-684", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        app.EquipmentStatus equipmentStatus10 = microscope9.getStatus();
        equipment3.setStatus(equipmentStatus10);
        java.lang.String str12 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(app.EquipmentStatus.AVAILABLE));
// flaky "57) test6479(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5670, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5670, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6480");
        app.Researcher researcher3 = new app.Researcher("Equipment ID: EQ-5338, Name: hi!, Description: , Location: hi!, Status: null", "", "Equipment ID: EQ-3137, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6481");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-1437, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4287, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6482");
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
        java.lang.String str21 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Head Lab Coordinator" + "'", str21, "Head Lab Coordinator");
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6483");
        app.Microscope microscope3 = new app.Microscope("EQ-5392", "EQ-5191", "Equipment ID: EQ-4526, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "58) test6483(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5672" + "'", str4, "EQ-5672");
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6484");
        app.Student student3 = new app.Student("EQ-1784", "EQ-1179", "");
        student3.username = "Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null";
        student3.password = "";
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6485");
        app.Microscope microscope3 = new app.Microscope("Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "EQ-826", "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
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
        microscope3.setStatus(equipmentStatus23);
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus20 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus20.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6486");
        app.Researcher researcher3 = new app.Researcher("Guest", "EQ-799", "EQ-120");
        java.lang.String str4 = researcher3.username;
        boolean boolean5 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6487");
        app.Equipment equipment3 = new app.Equipment("EQ-301", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-301" + "'", str4, "EQ-301");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6488");
        app.Researcher researcher3 = new app.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.password;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6489");
        app.Guest guest3 = new app.Guest("EQ-751", "EQ-569", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-569" + "'", str4, "EQ-569");
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6490");
        app.Microscope microscope3 = new app.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        app.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getName();
// flaky "59) test6490(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5677, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5677, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "19) test6490(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5677, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5677, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "9) test6490(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-5677" + "'", str10, "EQ-5677");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6491");
        app.Faculty faculty3 = new app.Faculty("Equipment ID: EQ-4811, Name: Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2603, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3652, Name: Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-2670, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-3097, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6492");
        app.Faculty faculty3 = new app.Faculty("EQ-4086", "EQ-2483", "EQ-4226");
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6493");
        app.HeadLabCoordinator headLabCoordinator0 = app.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        app.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        app.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "EQ-156");
        app.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-1530", "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        labManager16.username = "Equipment ID: EQ-2556, Name: Equipment ID: EQ-696, Name: , Description: , Location: , Status: null, Description: EQ-627, Location: EQ-1174, Status: AVAILABLE";
        labManager16.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager16);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6494");
        app.Guest guest3 = new app.Guest("EQ-442", "EQ-476", "");
        java.lang.String str4 = guest3.getAccountType();
        guest3.needsapproval = false;
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6495");
        app.Student student3 = new app.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        boolean boolean10 = student3.needsapproval;
        java.lang.String str11 = student3.getRegistrationId();
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6496");
        app.Guest guest3 = new app.Guest("EQ-209", "Equipment ID: EQ-4298, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4594, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6497");
        app.Researcher researcher3 = new app.Researcher("COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6498");
        app.Equipment equipment3 = new app.Equipment("MANAGER-103232", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        app.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        java.lang.String str6 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(app.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6499");
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
        java.lang.String str36 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(app.EquipmentStatus.AVAILABLE));
// flaky "60) test6499(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-5680" + "'", str26, "EQ-5680");
// flaky "20) test6499(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-5683" + "'", str31, "EQ-5683");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EQ-94" + "'", str32, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + app.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(app.EquipmentStatus.AVAILABLE));
// flaky "10) test6499(src.test.randoop.AleenaTest12)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EQ-5679" + "'", str36, "EQ-5679");
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest12.test6500");
        app.Student student3 = new app.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        boolean boolean6 = student3.needsapproval;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }
}
