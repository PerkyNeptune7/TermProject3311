package src.test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1001");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-299", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-1446");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1002");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        java.lang.String str4 = headLabCoordinator0.username;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        double double8 = headLabCoordinator0.getHourlyRate();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "1) test1002(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "1) test1002(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1003");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = microscope3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1004");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "2) test1004(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "2) test1004(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1005");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-734", "EQ-665", "EQ-863");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1006");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        labManager11.password = "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        boolean boolean14 = labManager11.isapproved;
        labManager11.isapproved = false;
        labManager11.password = "EQ-1437";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1007");
        src.java.Guest guest3 = new src.java.Guest("EQ-834", "EQ-473", "EQ-539");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1008");
        src.java.Microscope microscope3 = new src.java.Microscope("MasterAdmin123!", "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1009");
        src.java.Researcher researcher3 = new src.java.Researcher("MANAGER-1711025779", "EQ-242", "Equipment ID: EQ-1595, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1010");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-231", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("EQ-778", "EQ-382", "EQ-734", "");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-422", "EQ-1665", "EQ-335");
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1011");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        src.java.Microscope microscope14 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus15 = null;
        microscope14.setStatus(equipmentStatus15);
        src.java.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        src.java.Microscope microscope21 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str22 = microscope21.getName();
        java.lang.String str23 = microscope21.getLocation();
        src.java.EquipmentStatus equipmentStatus24 = microscope21.getStatus();
        microscope14.setStatus(equipmentStatus24);
        microscope3.setStatus(equipmentStatus24);
        src.java.EquipmentStatus equipmentStatus27 = microscope3.getStatus();
        java.lang.String str28 = microscope3.toString();
        src.java.Arduino arduino32 = new src.java.Arduino("hi!", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
        src.java.EquipmentStatus equipmentStatus33 = arduino32.getStatus();
        microscope3.setStatus(equipmentStatus33);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "3) test1011(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equipment ID: EQ-1730, Name: , Description: , Location: , Status: AVAILABLE" + "'", str28, "Equipment ID: EQ-1730, Name: , Description: , Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1012");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-36", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1013");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1102", "EQ-452", "");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1014");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        guest3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1015");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        boolean boolean4 = labManager3.needsapproval;
        double double5 = labManager3.getHourlyRate();
        boolean boolean6 = labManager3.isapproved;
        boolean boolean7 = labManager3.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1016");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "EQ-94", "EQ-99");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "4) test1016(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1743, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-1743, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1017");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1021", "EQ-367", "EQ-765");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1018");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "";
        java.lang.String str6 = guest3.getAccountType();
        guest3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1019");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1437, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-389", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1020");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1021");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("Lab Manager", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-341");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-1242, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-361", "EQ-361");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1022");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1023");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-118", "EQ-75", "MANAGER-66180900");
        java.lang.String str4 = equipment3.getName();
        src.java.Microscope microscope8 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus9 = null;
        microscope8.setStatus(equipmentStatus9);
        src.java.EquipmentStatus equipmentStatus11 = microscope8.getStatus();
        java.lang.String str12 = microscope8.toString();
        java.lang.String str13 = microscope8.getName();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = microscope8.isAvailable(localDateTime14, localDateTime15);
        java.lang.String str17 = microscope8.getLocation();
        src.java.Arduino arduino21 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.Microscope microscope25 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str26 = microscope25.getName();
        java.lang.String str27 = microscope25.getLocation();
        src.java.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        arduino21.setStatus(equipmentStatus28);
        microscope8.setStatus(equipmentStatus28);
        src.java.EquipmentStatus equipmentStatus31 = microscope8.getStatus();
        equipment3.setStatus(equipmentStatus31);
        java.lang.String str33 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-118" + "'", str4, "EQ-118");
        org.junit.Assert.assertNull(equipmentStatus11);
// flaky "5) test1023(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "3) test1023(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Equipment ID: EQ-1755, Name: EQ-118, Description: EQ-75, Location: MANAGER-66180900, Status: AVAILABLE" + "'", str33, "Equipment ID: EQ-1755, Name: EQ-118, Description: EQ-75, Location: MANAGER-66180900, Status: AVAILABLE");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1024");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        double double11 = userAccounts10.getHourlyRate();
        boolean boolean12 = userAccounts10.needsapproval;
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1025");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-355", "EQ-508", "EQ-390");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "6) test1025(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1763" + "'", str5, "EQ-1763");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1026");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.username;
        java.lang.String str7 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "7) test1026(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1027");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.password = "";
        faculty3.username = "EQ-1392";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-193" + "'", str4, "EQ-193");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1028");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        double double8 = guest3.getHourlyRate();
        java.lang.String str9 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1029");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-535", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1030");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.password = "EQ-120";
        researcher3.needsapproval = false;
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1031");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        java.lang.String str4 = equipment3.toString();
        java.lang.String str5 = equipment3.getLocation();
        java.lang.String str6 = equipment3.getName();
// flaky "8) test1031(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1767, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1767, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-39" + "'", str5, "EQ-39");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1032");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "COORD-001", "EQ-39");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
// flaky "9) test1032(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1033");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-487, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE", "Equipment ID: EQ-1417, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1034");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-547");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("EQ-63", "EQ-685", "Lab Manager");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-1166", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-1082");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1035");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-573, Name: , Description: , Location: , Status: null", "EQ-149", "EQ-41");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1036");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-413");
        java.lang.String str4 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1037");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-326", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1038");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus8 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        src.java.Microscope microscope15 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = microscope15.isAvailable(localDateTime16, localDateTime17);
        src.java.EquipmentStatus equipmentStatus19 = microscope15.getStatus();
        src.java.Equipment equipment23 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str24 = equipment23.getDescription();
        src.java.EquipmentStatus equipmentStatus25 = equipment23.getStatus();
        microscope15.setStatus(equipmentStatus25);
        microscope3.setStatus(equipmentStatus25);
        java.lang.Class<?> wildcardClass28 = equipmentStatus25.getClass();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "10) test1038(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1774, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-1774, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "COORD-001" + "'", str24, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus25 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus25.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1039");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "", "EQ-1763");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1040");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1042", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "EQ-1491");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1041");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getEquipmentId();
        java.lang.Class<?> wildcardClass6 = arduino3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "11) test1041(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1780" + "'", str5, "EQ-1780");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1042");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-470", "EQ-489");
        java.lang.String str4 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-489" + "'", str4, "EQ-489");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1043");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.needsapproval = false;
        labManager3.isapproved = true;
        boolean boolean8 = labManager3.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1044");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-114", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Faculty");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-284", "EQ-627", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("EQ-811", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-834");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1045");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-259", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1046");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.password;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str8 = headLabCoordinator0.username;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "12) test1046(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1045" + "'", str4, "EQ-1045");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1047");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
// flaky "13) test1047(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1784, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1784, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "4) test1047(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1784, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1784, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "1) test1047(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1784" + "'", str9, "EQ-1784");
// flaky "1) test1047(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-1784" + "'", str10, "EQ-1784");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1048");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1049");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1317, Name: , Description: , Location: , Status: null");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1050");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-461", "Equipment ID: EQ-970, Name: , Description: , Location: , Status: null", "EQ-263");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1051");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
// flaky "14) test1051(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-1788" + "'", str6, "EQ-1788");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1052");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.Microscope microscope9 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str10 = microscope9.getName();
        java.lang.String str11 = microscope9.getLocation();
        src.java.EquipmentStatus equipmentStatus12 = microscope9.getStatus();
        microscope3.setStatus(equipmentStatus12);
        java.lang.String str14 = microscope3.getLocation();
// flaky "15) test1052(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "5) test1052(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1053");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.toString();
        java.lang.String str7 = microscope3.getEquipmentId();
        src.java.Equipment equipment11 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str12 = equipment11.getDescription();
        src.java.EquipmentStatus equipmentStatus13 = equipment11.getStatus();
        microscope3.setStatus(equipmentStatus13);
        src.java.EquipmentStatus equipmentStatus15 = microscope3.getStatus();
        java.lang.String str16 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
// flaky "16) test1053(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-1792, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-1792, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
// flaky "6) test1053(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1792" + "'", str7, "EQ-1792");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str16, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1054");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getEquipmentId();
        java.lang.String str6 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
// flaky "17) test1054(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1794" + "'", str5, "EQ-1794");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1055");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("EQ-114", "EQ-179", "EQ-104", "EQ-222");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("EQ-380", "EQ-296", "EQ-74", "EQ-99");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = userAccounts24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1056");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-387", "EQ-599", "EQ-39");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-39" + "'", str4, "EQ-39");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1057");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        src.java.UserAccounts userAccounts20 = userFactory0.createUser("EQ-75", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-120", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts30 = userFactory0.createUser("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1707", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null", "EQ-1340");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNull(userAccounts20);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1058");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        labManager5.isapproved = false;
        labManager5.isapproved = false;
        labManager5.username = "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1059");
        src.java.Student student3 = new src.java.Student("EQ-344", "MANAGER-1023477660", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1060");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-503", "EQ-569", "EQ-94");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-503" + "'", str4, "EQ-503");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1061");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "EQ-390", "EQ-380");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-380" + "'", str4, "EQ-380");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1062");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-99", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-325");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "18) test1062(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1805" + "'", str5, "EQ-1805");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1063");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-628", "MANAGER-1087176903");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1064");
        src.java.Guest guest3 = new src.java.Guest("Student", "Head Lab Coordinator", "EQ-36");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1065");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1425", "EQ-1242", "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1066");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        java.lang.String str8 = labManager7.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "19) test1066(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Researcher" + "'", str1, "Researcher");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lab Manager" + "'", str8, "Lab Manager");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1067");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.isapproved = false;
        researcher3.username = "";
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1068");
        src.java.Faculty faculty3 = new src.java.Faculty("", "", "EQ-75");
        faculty3.password = "EQ-1388";
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1069");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        java.lang.String str12 = guest3.getAccountType();
        java.lang.Class<?> wildcardClass13 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1070");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-687", "Equipment ID: EQ-1413, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-1098");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1071");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-573, Name: , Description: , Location: , Status: null", "EQ-149", "EQ-41");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1072");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1073");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-384", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-690");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1074");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1171, Name: , Description: , Location: , Status: null", "EQ-1524", "Equipment ID: EQ-1282, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1075");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-382", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "EQ-156");
        java.lang.String str4 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1076");
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
        java.lang.String str13 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "20) test1076(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1077");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-131", "Researcher", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1078");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-476", "Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1079");
        src.java.Guest guest3 = new src.java.Guest("EQ-36", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-39");
        guest3.isapproved = false;
        java.lang.String str6 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-39" + "'", str6, "EQ-39");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1080");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1081");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        labManager6.needsapproval = false;
        labManager6.password = "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        labManager6.password = "Equipment ID: EQ-551, Name: , Description: , Location: , Status: null";
        labManager6.password = "EQ-981";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "21) test1081(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-489" + "'", str1, "EQ-489");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1082");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1083");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getDescription();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = arduino3.isAvailable(localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = arduino3.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = arduino3.getStatus();
        java.lang.String str15 = arduino3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MasterAdmin123!" + "'", str15, "MasterAdmin123!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1084");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-193", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "EQ-281");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-281" + "'", str4, "EQ-281");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1085");
        src.java.Equipment equipment3 = new src.java.Equipment("Student", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "22) test1085(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1839" + "'", str4, "EQ-1839");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1086");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1563, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1808", "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1087");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        boolean boolean5 = headLabCoordinator0.needsapproval;
        boolean boolean6 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "23) test1087(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1088");
        src.java.Equipment equipment3 = new src.java.Equipment("Student", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = equipment3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1089");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-598", "", "EQ-1788");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1090");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getRegistrationId();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1091");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1092");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-640", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1080");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1093");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = microscope3.isAvailable(localDateTime9, localDateTime10);
        java.lang.String str12 = microscope3.getLocation();
        java.lang.String str13 = microscope3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "24) test1093(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1864, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-1864, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1094");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-131", "Researcher", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.username;
        researcher3.isapproved = true;
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-131" + "'", str4, "EQ-131");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1095");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        src.java.Microscope microscope12 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str13 = microscope12.getName();
        src.java.EquipmentStatus equipmentStatus14 = microscope12.getStatus();
        microscope3.setStatus(equipmentStatus14);
        java.lang.String str16 = microscope3.toString();
// flaky "25) test1095(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "7) test1095(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "2) test1095(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str16, "Equipment ID: EQ-1865, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1096");
        src.java.Student student3 = new src.java.Student("EQ-508", "EQ-299", "EQ-299");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.isapproved = true;
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1097");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1743, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE", "EQ-1098", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1098");
        src.java.Guest guest3 = new src.java.Guest("Guest", "COORD-001", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        guest3.needsapproval = true;
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1099");
        src.java.Student student3 = new src.java.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1100");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-596", "EQ-486");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1101");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1113", "Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null", "EQ-760");
        java.lang.String str4 = equipment3.toString();
// flaky "26) test1101(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1102");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "", "EQ-938");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1103");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1104");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        guest3.username = "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1105");
        src.java.Student student3 = new src.java.Student("EQ-392", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-209");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1106");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1107");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        java.lang.String str12 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope3.isAvailable(localDateTime13, localDateTime14);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "27) test1107(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1876, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-1876, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "8) test1107(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1876" + "'", str9, "EQ-1876");
// flaky "3) test1107(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-1876, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-1876, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1108");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-504", "EQ-1341", "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "EQ-1434");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-504");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1109");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-615", "EQ-1419", "EQ-1099", "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-615");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1110");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "EQ-535", "EQ-535");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1111");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-781", "EQ-637", "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1112");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-98", "EQ-503", "EQ-1524");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1113");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.username = "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        researcher3.password = "Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null";
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1114");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        src.java.Microscope microscope14 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus15 = null;
        microscope14.setStatus(equipmentStatus15);
        src.java.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        src.java.Microscope microscope21 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str22 = microscope21.getName();
        java.lang.String str23 = microscope21.getLocation();
        src.java.EquipmentStatus equipmentStatus24 = microscope21.getStatus();
        microscope14.setStatus(equipmentStatus24);
        microscope3.setStatus(equipmentStatus24);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = microscope3.isAvailable(localDateTime27, localDateTime28);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1115");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1116");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-156", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1117");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        faculty3.username = "EQ-859";
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1118");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-259", "EQ-514", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-684", "EQ-489");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-1417, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-452", "Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1119");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-713, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1120");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.password;
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1121");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-976", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1122");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str8 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.needsapproval = true;
        java.lang.String str11 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "28) test1122(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "9) test1122(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1123");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getName();
        src.java.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass7 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "29) test1123(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-1890" + "'", str6, "EQ-1890");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1124");
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
        java.lang.String str28 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "30) test1124(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EQ-1891" + "'", str28, "EQ-1891");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1125");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        boolean boolean10 = labManager9.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "31) test1125(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1126");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-41", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "EQ-665";
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1399, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1058");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1127");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-106", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = labManager5.username;
        labManager5.isapproved = true;
        labManager5.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-106" + "'", str6, "EQ-106");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1128");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1891", "EQ-1180", "EQ-335");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1129");
        src.java.Student student3 = new src.java.Student("Student", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-296");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str7 = student3.getRegistrationId();
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-296" + "'", str7, "EQ-296");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1130");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-413");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.password;
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1131");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-535", "EQ-1099", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1468");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-535");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1132");
        src.java.Arduino arduino3 = new src.java.Arduino("", "EQ-685", "EQ-118");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1133");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1134");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("MANAGER-1863804858", "EQ-1742", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: MANAGER-1863804858");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1135");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "EQ-1045";
        headLabCoordinator0.isapproved = false;
        java.lang.Class<?> wildcardClass9 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1136");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-1103", "EQ-1763", "EQ-264");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("EQ-1218", "EQ-1098", "EQ-1554");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1137");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = equipment3.isAvailable(localDateTime8, localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "32) test1137(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1900" + "'", str7, "EQ-1900");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1138");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-325", "Equipment ID: EQ-937, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-991, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1139");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1317, Name: , Description: , Location: , Status: null", "EQ-594", "EQ-946");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1140");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.username;
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MasterAdmin123!" + "'", str9, "MasterAdmin123!");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1141");
        src.java.Student student3 = new src.java.Student("Student", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-296");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1142");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null", "EQ-427");
        faculty3.needsapproval = true;
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1143");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-513, Name: , Description: , Location: , Status: null");
        src.java.Arduino arduino7 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus8 = null;
        arduino7.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = arduino7.getStatus();
        java.lang.String str11 = arduino7.getLocation();
        java.lang.String str12 = arduino7.getEquipmentId();
        java.lang.String str13 = arduino7.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = arduino7.isAvailable(localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = arduino7.isAvailable(localDateTime17, localDateTime18);
        src.java.Microscope microscope23 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str24 = microscope23.getName();
        java.lang.String str25 = microscope23.getLocation();
        java.lang.String str26 = microscope23.toString();
        java.lang.String str27 = microscope23.getEquipmentId();
        src.java.Equipment equipment31 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str32 = equipment31.getDescription();
        src.java.EquipmentStatus equipmentStatus33 = equipment31.getStatus();
        microscope23.setStatus(equipmentStatus33);
        arduino7.setStatus(equipmentStatus33);
        microscope3.setStatus(equipmentStatus33);
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
// flaky "33) test1143(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-1903" + "'", str12, "EQ-1903");
// flaky "10) test1143(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-1903" + "'", str13, "EQ-1903");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Guest" + "'", str24, "Guest");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "COORD-001" + "'", str25, "COORD-001");
// flaky "4) test1143(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str26, "Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
// flaky "2) test1143(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EQ-1904" + "'", str27, "EQ-1904");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "COORD-001" + "'", str32, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1144");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "34) test1144(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-1906" + "'", str6, "EQ-1906");
// flaky "11) test1144(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1906" + "'", str7, "EQ-1906");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1145");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-368", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.isapproved = false;
        boolean boolean15 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1146");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-193" + "'", str4, "EQ-193");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1147");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("hi!", "EQ-1163");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1148");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-851", "EQ-449", "EQ-1341");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1149");
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
        src.java.EquipmentStatus equipmentStatus23 = microscope3.getStatus();
        java.lang.Class<?> wildcardClass24 = equipmentStatus23.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1150");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str4 = microscope3.getEquipmentId();
        src.java.Arduino arduino8 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        src.java.Microscope microscope12 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus13 = null;
        microscope12.setStatus(equipmentStatus13);
        src.java.EquipmentStatus equipmentStatus15 = microscope12.getStatus();
        src.java.Microscope microscope19 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str20 = microscope19.getName();
        java.lang.String str21 = microscope19.getLocation();
        src.java.EquipmentStatus equipmentStatus22 = microscope19.getStatus();
        microscope12.setStatus(equipmentStatus22);
        arduino8.setStatus(equipmentStatus22);
        java.lang.String str25 = arduino8.getEquipmentId();
        src.java.Equipment equipment29 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str30 = equipment29.getEquipmentId();
        java.lang.String str31 = equipment29.getName();
        src.java.EquipmentStatus equipmentStatus32 = equipment29.getStatus();
        arduino8.setStatus(equipmentStatus32);
        microscope3.setStatus(equipmentStatus32);
        java.lang.String str35 = microscope3.getDescription();
// flaky "35) test1150(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1918" + "'", str4, "EQ-1918");
        org.junit.Assert.assertNull(equipmentStatus15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "12) test1150(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EQ-1919" + "'", str25, "EQ-1919");
// flaky "5) test1150(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EQ-1922" + "'", str30, "EQ-1922");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-94" + "'", str31, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus32 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus32.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Head Lab Coordinator" + "'", str35, "Head Lab Coordinator");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1151");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-820", "EQ-861", "EQ-742");
        faculty3.needsapproval = true;
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1152");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-1711025779", "EQ-843");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1153");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-222", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-419", "EQ-275", "EQ-594");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1154");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("Lab Manager", "EQ-862", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-799", "Equipment ID: EQ-1728, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-992");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1155");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-735");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1156");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1157");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1251", "EQ-599");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1158");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.lang.String str4 = arduino3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "36) test1158(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-1927" + "'", str8, "EQ-1927");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1159");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getDescription();
        java.lang.String str6 = arduino3.getEquipmentId();
        java.lang.String str7 = arduino3.getLocation();
        java.lang.String str8 = arduino3.getDescription();
// flaky "37) test1159(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1928" + "'", str4, "EQ-1928");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "13) test1159(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-1928" + "'", str6, "EQ-1928");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1160");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "38) test1160(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1161");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        boolean boolean7 = labManager3.needsapproval;
        boolean boolean8 = labManager3.needsapproval;
        boolean boolean9 = labManager3.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1162");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-599", "EQ-586");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1163");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        boolean boolean7 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1164");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        boolean boolean11 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1165");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty", "COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("EQ-1739", "EQ-98", "EQ-851", "EQ-258");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1166");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1056", "Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1583");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1167");
        src.java.Microscope microscope3 = new src.java.Microscope("", "EQ-1507", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1507" + "'", str4, "EQ-1507");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1168");
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
        boolean boolean19 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1169");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-131");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1170");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "39) test1170(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1940" + "'", str4, "EQ-1940");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1171");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE", "EQ-1637", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1172");
        src.java.Guest guest3 = new src.java.Guest("EQ-970", "EQ-1082", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        guest3.needsapproval = true;
        guest3.username = "Equipment ID: EQ-1079, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1173");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        faculty3.needsapproval = false;
        double double6 = faculty3.getHourlyRate();
        faculty3.password = "EQ-1007";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1174");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-826", "Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.toString();
// flaky "40) test1174(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1942, Name: EQ-826, Description: Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1942, Name: EQ-826, Description: Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1175");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1176");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        boolean boolean6 = researcher3.isapproved;
        java.lang.String str7 = researcher3.username;
        double double8 = researcher3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1177");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-778, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-742");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1178");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        java.lang.Class<?> wildcardClass4 = microscope3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1179");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = arduino3.toString();
        java.lang.String str11 = arduino3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "41) test1179(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str10, "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1180");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Student", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = student3.password;
        student3.username = "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null";
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1181");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "EQ-422", "EQ-1045");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1182");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getLocation();
        java.lang.String str7 = microscope3.getName();
        java.lang.String str8 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "42) test1182(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1951, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1951, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1183");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1184");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-643", "", "", "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-643");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1185");
        src.java.Researcher researcher3 = new src.java.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        researcher3.password = "EQ-278";
        boolean boolean6 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1186");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-284", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-758", "EQ-259");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-815, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1239, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1187");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1188");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1189");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("MasterAdmin123!", "Head Lab Coordinator");
        labManager3.username = "EQ-104";
        java.lang.String str6 = labManager3.username;
        double double7 = labManager3.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-104" + "'", str6, "EQ-104");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1190");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        guest3.password = "EQ-981";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1191");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1805", "EQ-368", "EQ-1098");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1192");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-596", "EQ-637", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-276");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("MANAGER-214492645", "EQ-547", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1344");
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
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1193");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-1906", "EQ-791", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1194");
        src.java.Guest guest3 = new src.java.Guest("EQ-389", "EQ-1320", "EQ-258");
        boolean boolean4 = guest3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1195");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "EQ-98");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getRegistrationId();
        faculty3.password = "EQ-719";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-98" + "'", str6, "EQ-98");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1196");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1197");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-156", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-1280");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1198");
        src.java.Student student3 = new src.java.Student("EQ-99", "EQ-1557", "Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1199");
        src.java.Student student3 = new src.java.Student("Student", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "EQ-296");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1200");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-528", "EQ-540", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
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
        src.java.Microscope microscope22 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str23 = microscope22.getName();
        java.lang.String str24 = microscope22.getLocation();
        src.java.EquipmentStatus equipmentStatus25 = microscope22.getStatus();
        microscope7.setStatus(equipmentStatus25);
        microscope3.setStatus(equipmentStatus25);
        java.lang.String str28 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "43) test1200(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-1973" + "'", str14, "EQ-1973");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus25 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus25.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "14) test1200(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE" + "'", str28, "Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1201");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
// flaky "44) test1201(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1202");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Faculty", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-152", "EQ-74");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1908, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-1098", "");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1203");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        researcher3.isapproved = false;
        researcher3.needsapproval = true;
        researcher3.password = "";
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1204");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.username;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "45) test1204(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1205");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1583", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-765");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1206");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.username;
        boolean boolean10 = headLabCoordinator0.needsapproval;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
// flaky "46) test1206(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "15) test1206(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1207");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1243", "Equipment ID: EQ-1054, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1150", "Equipment ID: EQ-1867, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1243");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1208");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-413", "EQ-586", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = microscope3.toString();
        src.java.Microscope microscope8 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str9 = microscope8.toString();
        java.lang.String str10 = microscope8.toString();
        src.java.EquipmentStatus equipmentStatus11 = null;
        microscope8.setStatus(equipmentStatus11);
        java.lang.String str13 = microscope8.getName();
        src.java.Microscope microscope17 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str18 = microscope17.getName();
        src.java.EquipmentStatus equipmentStatus19 = microscope17.getStatus();
        microscope8.setStatus(equipmentStatus19);
        microscope3.setStatus(equipmentStatus19);
// flaky "47) test1208(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1976, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1976, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
// flaky "16) test1208(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-1977, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-1977, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "6) test1208(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-1977, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-1977, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1209");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        boolean boolean4 = student3.needsapproval;
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1210");
        src.java.Arduino arduino3 = new src.java.Arduino("COORD-001", "Researcher", "COORD-001");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus13 = arduino3.getStatus();
        java.lang.String str14 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "48) test1210(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-1981" + "'", str14, "EQ-1981");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1211");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "MANAGER-103232", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1212");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "EQ-435", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1213");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1007", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1800, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1214");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1215");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-281", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.Class<?> wildcardClass5 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1216");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1282, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-866", "Equipment ID: EQ-859, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1217");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        boolean boolean7 = labManager3.needsapproval;
        java.lang.String str8 = labManager3.password;
        labManager3.needsapproval = false;
        boolean boolean11 = labManager3.needsapproval;
        java.lang.String str12 = labManager3.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1218");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1219");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1220");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-802", "EQ-539", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1221");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-478, Name: , Description: , Location: , Status: null");
        boolean boolean4 = guest3.isapproved;
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1222");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass14 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "49) test1222(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1223");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-813, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1224");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1317, Name: , Description: , Location: , Status: null", "");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1225");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null", "EQ-977", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1226");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-71", "Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-71");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1227");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-799", "EQ-865", "EQ-333");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-98", "EQ-120", "EQ-106");
        src.java.EquipmentStatus equipmentStatus8 = equipment7.getStatus();
        equipment3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1228");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.username;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1229");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-814");
        java.lang.String str4 = researcher3.password;
        boolean boolean5 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1230");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1312, Name: , Description: , Location: , Status: null", "EQ-179", "Equipment ID: EQ-1678, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1231");
        src.java.Guest guest3 = new src.java.Guest("Student", "Head Lab Coordinator", "EQ-36");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1232");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-435");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1233");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "EQ-1045", "EQ-1192");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1234");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = arduino3.toString();
        src.java.EquipmentStatus equipmentStatus11 = arduino3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "50) test1234(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-1991, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str10, "Equipment ID: EQ-1991, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertNull(equipmentStatus11);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1235");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1236");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-616", "EQ-552", "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1237");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-476");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-509", "Equipment ID: EQ-992, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1543", "EQ-452");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1238");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-1058");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1239");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1179", "Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1240");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getRegistrationId();
        faculty3.username = "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1241");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.username = "EQ-698";
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1242");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.password;
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1243");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("EQ-106", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1244");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        java.lang.String str13 = headLabCoordinator0.username;
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        boolean boolean15 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1245");
        src.java.Guest guest3 = new src.java.Guest("EQ-36", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-94");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1246");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        boolean boolean9 = labManager3.needsapproval;
        labManager3.username = "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null";
        labManager3.isapproved = false;
        boolean boolean14 = labManager3.isapproved;
        labManager3.username = "EQ-466";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1247");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-992, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1248");
        src.java.Student student3 = new src.java.Student("EQ-209", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-970");
        boolean boolean4 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1249");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass11 = microscope3.getClass();
// flaky "51) test1249(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "17) test1249(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "7) test1249(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1994" + "'", str9, "EQ-1994");
// flaky "3) test1249(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-1994" + "'", str10, "EQ-1994");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1250");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1344", "Equipment ID: EQ-1867, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1251");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "EQ-1462", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1252");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-540", "EQ-392", "", "EQ-637");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-540");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1253");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null", "EQ-1437", "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1254");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1665", "Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1255");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("EQ-1618", "EQ-1150");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1256");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = false;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1257");
        src.java.Student student3 = new src.java.Student("EQ-390", "EQ-446", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.username = "EQ-1056";
        java.lang.String str7 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-446" + "'", str7, "EQ-446");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1258");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1878", "Equipment ID: EQ-1504, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-785, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1259");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null", "EQ-616");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "52) test1259(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2012" + "'", str4, "EQ-2012");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1260");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager12.password = "EQ-41";
        boolean boolean15 = labManager12.isapproved;
        labManager12.password = "EQ-299";
        labManager12.password = "EQ-630";
        labManager12.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "53) test1260(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1261");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-368", "EQ-156", "EQ-63");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-264", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null", "EQ-598", "EQ-259");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-1624", "", "EQ-598");
        src.java.UserAccounts userAccounts35 = userFactory0.createUser("MANAGER-66180900", "EQ-1927", "EQ-276");
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1262");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1263");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "54) test1263(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-2015, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-2015, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1264");
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
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope3.isAvailable(localDateTime18, localDateTime19);
        src.java.EquipmentStatus equipmentStatus21 = microscope3.getStatus();
        java.lang.String str22 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "55) test1264(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-2017" + "'", str10, "EQ-2017");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(equipmentStatus21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1265");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1282, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE", "Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1266");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-361", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-390");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1267");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-259", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getRegistrationId();
        faculty3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1268");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-869", "EQ-754");
        org.junit.Assert.assertNull(userAccounts4);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1269");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1238", "EQ-1608", "EQ-1310", "EQ-1784");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1238");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1270");
        src.java.Student student3 = new src.java.Student("COORD-001", "MasterAdmin123!", "hi!");
        java.lang.String str4 = student3.getRegistrationId();
        boolean boolean5 = student3.needsapproval;
        java.lang.String str6 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MasterAdmin123!" + "'", str6, "MasterAdmin123!");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1271");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        java.lang.String str6 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MANAGER-66180900" + "'", str6, "MANAGER-66180900");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1272");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        src.java.Arduino arduino8 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str9 = arduino8.getEquipmentId();
        java.lang.String str10 = arduino8.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = arduino8.isAvailable(localDateTime11, localDateTime12);
        src.java.Equipment equipment17 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str18 = equipment17.getName();
        src.java.EquipmentStatus equipmentStatus19 = equipment17.getStatus();
        arduino8.setStatus(equipmentStatus19);
        src.java.EquipmentStatus equipmentStatus21 = arduino8.getStatus();
        microscope3.setStatus(equipmentStatus21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "56) test1272(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-2020" + "'", str9, "EQ-2020");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-71" + "'", str18, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1273");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1274");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1792", "Equipment ID: EQ-1390, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE", "EQ-861", "Equipment ID: EQ-1530, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1792");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1275");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass23 = userFactory0.getClass();
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1276");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1255, Name: EQ-99, Description: EQ-149, Location: EQ-344, Status: AVAILABLE", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null", "EQ-616");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1277");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1278");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1279");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-75" + "'", str4, "EQ-75");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1280");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-0", "EQ-152", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        src.java.Microscope microscope7 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str8 = microscope7.getLocation();
        src.java.Equipment equipment12 = new src.java.Equipment("", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus13 = equipment12.getStatus();
        microscope7.setStatus(equipmentStatus13);
        src.java.Microscope microscope18 = new src.java.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        src.java.Microscope microscope22 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str23 = microscope22.getName();
        java.lang.String str24 = microscope22.getLocation();
        java.lang.String str25 = microscope22.getName();
        java.lang.String str26 = microscope22.getName();
        src.java.Microscope microscope30 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus31 = null;
        microscope30.setStatus(equipmentStatus31);
        src.java.EquipmentStatus equipmentStatus33 = null;
        microscope30.setStatus(equipmentStatus33);
        java.lang.String str35 = microscope30.getName();
        src.java.Arduino arduino39 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope43 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str44 = microscope43.getName();
        java.lang.String str45 = microscope43.getLocation();
        src.java.EquipmentStatus equipmentStatus46 = microscope43.getStatus();
        arduino39.setStatus(equipmentStatus46);
        microscope30.setStatus(equipmentStatus46);
        microscope22.setStatus(equipmentStatus46);
        microscope18.setStatus(equipmentStatus46);
        microscope7.setStatus(equipmentStatus46);
        equipment3.setStatus(equipmentStatus46);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus46 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus46.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1281");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-435");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1282");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1062", "EQ-1099", "EQ-687", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1062");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1283");
        src.java.Student student3 = new src.java.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.password;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1284");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Faculty", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-152", "EQ-74");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("EQ-1180", "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-590", "EQ-1927");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts10);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1285");
        src.java.Student student3 = new src.java.Student("", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null");
        boolean boolean4 = student3.isapproved;
        student3.password = "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null";
        student3.needsapproval = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1286");
        src.java.Arduino arduino3 = new src.java.Arduino("Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1287");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1288");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-341", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1289");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("hi!", "Equipment ID: EQ-1595, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-942, Name: , Description: , Location: , Status: null", "EQ-236");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1290");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-965, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1291");
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
        java.lang.String str28 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str28, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1292");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = arduino3.toString();
// flaky "57) test1292(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2071, Name: , Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2071, Name: , Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1293");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
        src.java.Arduino arduino7 = new src.java.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str8 = arduino7.toString();
        src.java.EquipmentStatus equipmentStatus9 = arduino7.getStatus();
        equipment3.setStatus(equipmentStatus9);
// flaky "58) test1293(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-2073, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-2073, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1294");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-41", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "EQ-665";
        java.lang.String str11 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-665" + "'", str11, "EQ-665");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1295");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1050", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1058");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1058" + "'", str4, "EQ-1058");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1296");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-335", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "Student");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1297");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = microscope3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1298");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Guest", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = guest3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1299");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1413, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2052");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1300");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        guest3.needsapproval = false;
        java.lang.String str9 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-1887, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1301");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        guest3.password = "EQ-131";
        java.lang.Class<?> wildcardClass9 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1302");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass9 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "59) test1302(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-2080" + "'", str8, "EQ-2080");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1303");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-114", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null", "EQ-1454");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-114");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1304");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.Class<?> wildcardClass5 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1305");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = equipment3.isAvailable(localDateTime7, localDateTime8);
        java.lang.String str10 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "60) test1305(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-2081, Name: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-2081, Name: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1306");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-152");
        boolean boolean4 = faculty3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1307");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.password;
        java.lang.String str7 = researcher3.getRegistrationId();
        boolean boolean8 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1308");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.Class<?> wildcardClass5 = microscope3.getClass();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1309");
        src.java.Researcher researcher3 = new src.java.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        researcher3.password = "EQ-278";
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1310");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino7 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope11 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        arduino7.setStatus(equipmentStatus14);
        equipment3.setStatus(equipmentStatus14);
        java.lang.String str17 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1311");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        student3.password = "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1312");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-259", "EQ-514", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "EQ-242", "EQ-149");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-1080, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565", "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1313");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-2015, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1314");
        src.java.Student student3 = new src.java.Student("EQ-851", "Equipment ID: EQ-2059, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-442");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1315");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-843", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-862");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-843" + "'", str4, "EQ-843");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1316");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-946, Name: , Description: , Location: , Status: null", "EQ-41", "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        boolean boolean4 = guest3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1317");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1318");
        src.java.Student student3 = new src.java.Student("EQ-1176", "EQ-368", "Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1319");
        src.java.Student student3 = new src.java.Student("EQ-615", "Equipment ID: EQ-1501, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1320");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-560", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1747");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1321");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-569", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1763");
        java.lang.Class<?> wildcardClass4 = arduino3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1322");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1323");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-114", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Faculty");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-284", "EQ-627", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("EQ-1505", "Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-1922");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1324");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE", "EQ-75", "EQ-616");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1325");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-242", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str4, "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1326");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-565", "EQ-1927", "EQ-1736");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1327");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        faculty3.isapproved = true;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1328");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-758", "EQ-341", "Equipment ID: EQ-1632, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1329");
        src.java.Faculty faculty3 = new src.java.Faculty("", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-41");
        faculty3.password = "Equipment ID: EQ-1104, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        faculty3.password = "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE";
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1330");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        boolean boolean6 = researcher3.isapproved;
        double double7 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1331");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-231", "EQ-1340");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1332");
        src.java.Student student3 = new src.java.Student("EQ-36", "EQ-75", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        student3.password = "EQ-799";
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1333");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getName();
        src.java.Microscope microscope14 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus15 = null;
        microscope14.setStatus(equipmentStatus15);
        src.java.EquipmentStatus equipmentStatus17 = microscope14.getStatus();
        src.java.Microscope microscope21 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str22 = microscope21.getName();
        java.lang.String str23 = microscope21.getLocation();
        src.java.EquipmentStatus equipmentStatus24 = microscope21.getStatus();
        microscope14.setStatus(equipmentStatus24);
        microscope3.setStatus(equipmentStatus24);
        java.lang.String str27 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1334");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-389", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-74");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-811", "Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-384");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-496", "Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1335");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-442");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1336");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "EQ-535";
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1337");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
// flaky "61) test1337(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-2114" + "'", str6, "EQ-2114");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1338");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-205", "Equipment ID: EQ-1239, Name: hi!, Description: , Location: hi!, Status: null", "EQ-982");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1339");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-630", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-284", "EQ-489");
        src.java.UserAccounts userAccounts30 = userFactory0.createUser("EQ-205", "Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-977");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts30);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1340");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        guest3.password = "Equipment ID: EQ-1699, Name: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Description: EQ-94, Location: EQ-99, Status: AVAILABLE";
        guest3.username = "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1341");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-596", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getName();
        java.lang.String str6 = arduino3.getLocation();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = arduino3.isAvailable(localDateTime7, localDateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-596" + "'", str4, "EQ-596");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-596" + "'", str5, "EQ-596");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1342");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1343");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Head Lab Coordinator", "EQ-179", "EQ-1918", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Head Lab Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1344");
        src.java.Student student3 = new src.java.Student("COORD-001", "MasterAdmin123!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        student3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1345");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        guest3.needsapproval = true;
        boolean boolean6 = guest3.needsapproval;
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getAccountType();
        guest3.password = "EQ-371";
        guest3.password = "EQ-1396";
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1346");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-36", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.Class<?> wildcardClass6 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1347");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.isapproved = false;
        guest3.password = "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null";
        java.lang.String str16 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1348");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-106", "EQ-371", "EQ-1038", "EQ-74");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-686");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1349");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        java.lang.String str11 = microscope3.getLocation();
        src.java.Arduino arduino15 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus16 = null;
        arduino15.setStatus(equipmentStatus16);
        java.lang.String str18 = arduino15.getEquipmentId();
        src.java.Equipment equipment22 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        src.java.Equipment equipment26 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino30 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope34 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str35 = microscope34.getName();
        java.lang.String str36 = microscope34.getLocation();
        src.java.EquipmentStatus equipmentStatus37 = microscope34.getStatus();
        arduino30.setStatus(equipmentStatus37);
        equipment26.setStatus(equipmentStatus37);
        equipment22.setStatus(equipmentStatus37);
        arduino15.setStatus(equipmentStatus37);
        microscope3.setStatus(equipmentStatus37);
        src.java.EquipmentStatus equipmentStatus43 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "62) test1349(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-2121" + "'", str18, "EQ-2121");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus43 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus43.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1350");
        src.java.Student student3 = new src.java.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1351");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1505, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-978");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1352");
        src.java.Faculty faculty3 = new src.java.Faculty("Head Lab Coordinator", "EQ-92", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.isapproved = true;
        java.lang.String str7 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1353");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-558", "EQ-583", "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1354");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-205", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-264");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-1407, Name: , Description: , Location: , Status: null", "EQ-851", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-2024");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1355");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        boolean boolean3 = headLabCoordinator0.isapproved;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "63) test1355(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "18) test1355(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1356");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236", "MANAGER-66180900");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1357");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        guest3.isapproved = true;
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1358");
        src.java.Student student3 = new src.java.Student("", "Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "MANAGER-1711025779");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1359");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-333", "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-489", "EQ-193", "EQ-120", "EQ-863");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1491", "EQ-976", "EQ-1502");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1360");
        src.java.Student student3 = new src.java.Student("EQ-630", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1361");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        researcher3.isapproved = false;
        researcher3.needsapproval = true;
        java.lang.String str10 = researcher3.getRegistrationId();
        java.lang.String str11 = researcher3.getAccountType();
        java.lang.String str12 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1362");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-131", "Researcher", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1363");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-384");
        labManager10.password = "EQ-1238";
        double double13 = labManager10.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "64) test1363(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1364");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        boolean boolean9 = labManager3.needsapproval;
        labManager3.password = "Equipment ID: EQ-713, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1365");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        guest3.password = "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1366");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1502, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1491", "EQ-1411");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1367");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-382", "EQ-335");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.Class<?> wildcardClass5 = arduino3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-335" + "'", str4, "EQ-335");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1368");
        src.java.Student student3 = new src.java.Student("Researcher", "EQ-41", "EQ-39");
        boolean boolean4 = student3.isapproved;
        java.lang.String str5 = student3.password;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-41" + "'", str5, "EQ-41");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1369");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-540", "EQ-361", "EQ-550");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1370");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        java.lang.String str11 = microscope3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus12 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus13 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "65) test1370(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-2137, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-2137, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "19) test1370(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-2137" + "'", str11, "EQ-2137");
        org.junit.Assert.assertNull(equipmentStatus12);
        org.junit.Assert.assertNull(equipmentStatus13);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1371");
        src.java.Arduino arduino3 = new src.java.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str4 = arduino3.toString();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        java.lang.String str6 = arduino3.getDescription();
// flaky "66) test1371(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1372");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1373");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-98", "EQ-120", "EQ-106");
        java.lang.String str4 = equipment3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
// flaky "67) test1373(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2142" + "'", str4, "EQ-2142");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1374");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1310", "Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-627");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1375");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-264", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1735, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1376");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.username = "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "68) test1376(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-1616" + "'", str1, "EQ-1616");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1377");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-1870, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1417, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1378");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1662", "COORD-001", "EQ-1005", "Equipment ID: EQ-1116, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1662");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1379");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        src.java.EquipmentStatus equipmentStatus6 = equipment3.getStatus();
        java.lang.String str7 = equipment3.getLocation();
        java.lang.String str8 = equipment3.getDescription();
        java.lang.String str9 = equipment3.getDescription();
// flaky "69) test1379(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2143" + "'", str4, "EQ-2143");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MasterAdmin123!" + "'", str7, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str8, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str9, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1380");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.username;
        java.lang.String str7 = headLabCoordinator0.username;
        headLabCoordinator0.password = "EQ-760";
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str2, "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1381");
        src.java.Guest guest3 = new src.java.Guest("EQ-36", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-39");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1382");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-758", "");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1383");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1340", "EQ-764", "");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1384");
        src.java.Student student3 = new src.java.Student("EQ-1855", "EQ-1940", "EQ-863");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1385");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-735", "EQ-859", "");
        java.lang.String str4 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-735" + "'", str4, "EQ-735");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1386");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1951, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-66180900", "EQ-665");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1387");
        src.java.Guest guest3 = new src.java.Guest("EQ-431", "EQ-344", "EQ-149");
        guest3.username = "EQ-1411";
        java.lang.Class<?> wildcardClass6 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1388");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        labManager10.needsapproval = true;
        boolean boolean13 = labManager10.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1389");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-2011", "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1390");
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
        java.lang.String str34 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "70) test1390(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-2149" + "'", str7, "EQ-2149");
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "COORD-001" + "'", str20, "COORD-001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus30 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus30.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1391");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = arduino3.isAvailable(localDateTime12, localDateTime13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1392");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Equipment ID: EQ-1503, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE", "EQ-814");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1393");
        src.java.Researcher researcher3 = new src.java.Researcher("Lab Manager", "", "EQ-623");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1394");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-284", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-496");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-221", "EQ-734");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-781", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1171, Name: , Description: , Location: , Status: null", "EQ-1502");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("", "EQ-1879", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "EQ-835");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1395");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1637, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1396");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.password;
        researcher3.username = "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        researcher3.password = "EQ-685";
        java.lang.String str13 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1397");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1000", "Equipment ID: EQ-1717, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "EQ-367");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1398");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("", "EQ-731", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "EQ-802");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null", "EQ-1832", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "EQ-1904");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1399");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE", "", "EQ-259", "Equipment ID: EQ-1769, Name: EQ-368, Description: EQ-118, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1400");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-257", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1401");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-120", "EQ-118", "EQ-75");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-120" + "'", str4, "EQ-120");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-118" + "'", str5, "EQ-118");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1402");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        student3.needsapproval = false;
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.isapproved;
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1403");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getRegistrationId();
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1404");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("MANAGER-103232", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-1578, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1534", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("EQ-760", "Researcher", "EQ-1826", "EQ-179");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts32);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1405");
        src.java.Guest guest3 = new src.java.Guest("EQ-221", "EQ-758", "EQ-299");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1406");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1780", "EQ-684", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-536");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1780");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1407");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-640");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-390");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1408");
        src.java.Guest guest3 = new src.java.Guest("EQ-2113", "EQ-851", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1409");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-361", "EQ-1910");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1410");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-861", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getName();
// flaky "71) test1410(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2162, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2162, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-861" + "'", str5, "EQ-861");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1411");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "72) test1411(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-2163, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-2163, Name: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Description: MANAGER-66180900, Location: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1412");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        java.lang.String str12 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1413");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("EQ-637", "EQ-1243", "EQ-1320", "EQ-106");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("EQ-301", "EQ-1192", "EQ-637", "EQ-63");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1414");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-586", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass12 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1415");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        java.lang.String str9 = arduino3.getLocation();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = arduino3.isAvailable(localDateTime10, localDateTime11);
        java.lang.String str13 = arduino3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1416");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1589", "EQ-616", "EQ-559", "EQ-1662");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1589");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1417");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1388", "EQ-731");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1418");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-478, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-528");
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1419");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("", "EQ-599", "Equipment ID: EQ-2015, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-778, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1420");
        src.java.Student student3 = new src.java.Student("EQ-390", "EQ-446", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        boolean boolean4 = student3.isapproved;
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1421");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        headLabCoordinator0.password = "";
        boolean boolean11 = headLabCoordinator0.needsapproval;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1422");
        src.java.Guest guest3 = new src.java.Guest("EQ-333", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1423");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1454", "EQ-1248", "EQ-1707", "EQ-1665");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1454");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1424");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-503", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-335");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1425");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "");
        guest3.password = "EQ-1592";
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1426");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1554", "", "EQ-869");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1427");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-586", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass12 = labManager11.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1428");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.username = "MasterAdmin123!";
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.password = "";
        researcher3.username = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1429");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getDescription();
        java.lang.String str6 = equipment3.getDescription();
        src.java.EquipmentStatus equipmentStatus7 = equipment3.getStatus();
        java.lang.String str8 = equipment3.getDescription();
// flaky "73) test1429(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2175" + "'", str4, "EQ-2175");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1430");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1965", "Equipment ID: EQ-1079, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1431");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getRegistrationId();
        researcher3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1432");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1433");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1839", "Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1434");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.username;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("", "EQ-1174");
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1435");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!");
        double double4 = labManager3.getHourlyRate();
        labManager3.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1436");
        src.java.Microscope microscope3 = new src.java.Microscope("", "EQ-1174", "EQ-1524");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1437");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "Equipment ID: EQ-1502, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "MANAGER-207281291", "EQ-1903");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1438");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1480, Name: , Description: , Location: , Status: AVAILABLE", "EQ-1313", "Equipment ID: EQ-1501, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1439");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "EQ-382", "EQ-335");
        java.lang.String str4 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-335" + "'", str4, "EQ-335");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1440");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getLocation();
        src.java.EquipmentStatus equipmentStatus7 = equipment3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1441");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-2138");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1442");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        src.java.Microscope microscope12 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str13 = microscope12.getName();
        src.java.EquipmentStatus equipmentStatus14 = microscope12.getStatus();
        microscope3.setStatus(equipmentStatus14);
        java.lang.Class<?> wildcardClass16 = microscope3.getClass();
// flaky "74) test1442(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "20) test1442(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-2182, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1443");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getRegistrationId();
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1444");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        student3.password = "Researcher";
        java.lang.String str8 = student3.getAccountType();
        student3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1445");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1446");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.password = "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1447");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-120", "", "Equipment ID: EQ-1872, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1448");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1927", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1449");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        double double11 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1450");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.Class<?> wildcardClass7 = microscope3.getClass();
// flaky "75) test1450(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2190" + "'", str4, "EQ-2190");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
// flaky "21) test1450(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-2190" + "'", str6, "EQ-2190");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1451");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-301", "", "EQ-451");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1452");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
// flaky "76) test1452(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-2192" + "'", str6, "EQ-2192");
// flaky "22) test1452(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-2192" + "'", str7, "EQ-2192");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1453");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.username = "EQ-1805";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "77) test1453(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1454");
        src.java.Student student3 = new src.java.Student("EQ-380", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean4 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1455");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1313", "EQ-1161", "EQ-843");
        faculty3.password = "EQ-419";
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1456");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1317, Name: , Description: , Location: , Status: null", "");
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "78) test1456(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1457");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2101", "EQ-1491", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1458");
        src.java.Student student3 = new src.java.Student("COORD-001", "MasterAdmin123!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.username = "EQ-978";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1459");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-1341", "EQ-688");
        boolean boolean8 = labManager7.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1460");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-688", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.Microscope microscope7 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = null;
        microscope7.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope7.getDescription();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope7.isAvailable(localDateTime13, localDateTime14);
        src.java.Equipment equipment19 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str20 = equipment19.getEquipmentId();
        java.lang.String str21 = equipment19.getName();
        src.java.EquipmentStatus equipmentStatus22 = equipment19.getStatus();
        microscope7.setStatus(equipmentStatus22);
        equipment3.setStatus(equipmentStatus22);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "79) test1460(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-2195" + "'", str20, "EQ-2195");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EQ-94" + "'", str21, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1461");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1462");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.password;
        researcher3.password = "EQ-536";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1463");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-508");
        java.lang.String str4 = microscope3.toString();
// flaky "80) test1463(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1464");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        faculty3.isapproved = false;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1465");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2011", "EQ-1891", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2011");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1466");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-528", "EQ-486", "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null", "EQ-1165");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-528");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1467");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-214492645", "EQ-253", "EQ-1762");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1468");
        src.java.Student student3 = new src.java.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        boolean boolean6 = student3.needsapproval;
        student3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1469");
        src.java.Guest guest3 = new src.java.Guest("EQ-389", "Head Lab Coordinator", "EQ-231");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1470");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-281", "EQ-382", "EQ-355");
        faculty3.isapproved = true;
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1471");
        src.java.Student student3 = new src.java.Student("EQ-1940", "EQ-764", "Equipment ID: EQ-785, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1472");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "EQ-384", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "81) test1472(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2212" + "'", str4, "EQ-2212");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1473");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        src.java.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        java.lang.String str8 = microscope3.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1474");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-1174", "", "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1878");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-1174");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1475");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-71", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-92");
        java.lang.Class<?> wildcardClass4 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1476");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1477");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-156", "EQ-152", "EQ-296");
        java.lang.String str4 = faculty3.getAccountType();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.password;
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-152" + "'", str6, "EQ-152");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1478");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        guest3.username = "EQ-325";
        boolean boolean8 = guest3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-36" + "'", str5, "EQ-36");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1479");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        userAccounts17.needsapproval = false;
        java.lang.String str20 = userAccounts17.getRegistrationId();
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str20, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1480");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1481");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        boolean boolean6 = researcher3.isapproved;
        java.lang.String str7 = researcher3.username;
        double double8 = researcher3.getHourlyRate();
        double double9 = researcher3.getHourlyRate();
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1482");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "EQ-731");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1483");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1685, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1762", "EQ-1969");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1484");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "EQ-536";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1485");
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
        src.java.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("EQ-1425", "Equipment ID: EQ-1908, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
// flaky "82) test1485(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1486");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-843", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-862");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.String str5 = arduino3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "83) test1486(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-2220, Name: EQ-843, Description: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: EQ-862, Status: AVAILABLE");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1487");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        java.lang.String str17 = userAccounts16.getAccountType();
        userAccounts16.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        userAccounts16.password = "Equipment ID: EQ-1942, Name: EQ-826, Description: Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1488");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-380", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-361");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1489");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-242", "Lab Manager");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1490");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "EQ-98");
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.password = "EQ-1855";
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "84) test1490(src.test.randoop.AleenaTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1491");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.isapproved = false;
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1492");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "EQ-355", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-2139, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-392");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1493");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean16 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1494");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-263", "EQ-259", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-1972, Name: EQ-528, Description: EQ-540, Location: Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE, Status: AVAILABLE", "EQ-1637", "EQ-688", "");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1495");
        src.java.Student student3 = new src.java.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        java.lang.String str6 = student3.password;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1496");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.Class<?> wildcardClass5 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1497");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        java.lang.String str11 = headLabCoordinator0.password;
        double double12 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null");
        labManager15.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-1855" + "'", str11, "EQ-1855");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1498");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-296", "EQ-1794");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1499");
        src.java.Guest guest3 = new src.java.Guest("EQ-326", "EQ-422", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest2.test1500");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-1855" + "'", str1, "EQ-1855");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }
}
