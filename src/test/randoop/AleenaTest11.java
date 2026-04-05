package src.test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5501");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-257", "EQ-335");
        boolean boolean4 = guest3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5502");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getDescription();
        java.lang.String str7 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5503");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.password = "EQ-442";
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-2996", "Equipment ID: EQ-3977, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-442" + "'", str8, "EQ-442");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5504");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-1992, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-2466", "EQ-760");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("EQ-3001", "EQ-3119", "EQ-4246");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5505");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1736", "EQ-4770", "EQ-3043");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5506");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.password;
        java.lang.String str5 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-442" + "'", str4, "EQ-442");
// flaky "1) test5506(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5507");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-4351, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3775");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5508");
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
        java.lang.String str17 = microscope3.toString();
        java.lang.String str18 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = microscope3.isAvailable(localDateTime19, localDateTime20);
        java.lang.String str22 = microscope3.getEquipmentId();
        src.java.Microscope microscope26 = new src.java.Microscope("EQ-446", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus27 = microscope26.getStatus();
        microscope3.setStatus(equipmentStatus27);
        src.java.EquipmentStatus equipmentStatus29 = microscope3.getStatus();
        java.lang.String str30 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "2) test5508(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-5131" + "'", str10, "EQ-5131");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "1) test5508(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-5131, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-5131, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "1) test5508(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EQ-5131" + "'", str22, "EQ-5131");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus29 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus29.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5509");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        boolean boolean7 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-442" + "'", str1, "EQ-442");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5510");
        src.java.Guest guest3 = new src.java.Guest("EQ-389", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        guest3.username = "EQ-503";
        guest3.needsapproval = true;
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5511");
        src.java.Faculty faculty3 = new src.java.Faculty("MANAGER-1087176903", "EQ-431", "EQ-1763");
        boolean boolean4 = faculty3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5512");
        src.java.Student student3 = new src.java.Student("EQ-209", "Head Lab Coordinator", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getRegistrationId();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5513");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-304", "EQ-384", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.username;
        faculty3.password = "Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-304" + "'", str4, "EQ-304");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5514");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-368", "EQ-859");
        java.lang.String str4 = faculty3.getRegistrationId();
        boolean boolean5 = faculty3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-859" + "'", str4, "EQ-859");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5515");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.password = "EQ-2591";
        java.lang.String str10 = researcher3.getAccountType();
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5516");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-4190", "EQ-3083", "Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5517");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-1360";
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4867, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-5034, Name: EQ-1841, Description: EQ-514, Location: EQ-570, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5518");
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
        java.lang.String str17 = labManager11.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MANAGER-214492645" + "'", str17, "MANAGER-214492645");
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5519");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5520");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-690", "EQ-284");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager16);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5521");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2999", "EQ-1103", "EQ-1176");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5522");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-931", "EQ-765", "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        researcher3.password = "EQ-2376";
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5523");
        src.java.Guest guest3 = new src.java.Guest("EQ-2317", "EQ-2128", "EQ-253");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5524");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getRegistrationId();
        java.lang.String str8 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5525");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.password;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-1360" + "'", str8, "EQ-1360");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1360" + "'", str9, "EQ-1360");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5526");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3820, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4097, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2504, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5527");
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
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        java.lang.String str17 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Researcher" + "'", str2, "Researcher");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5528");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2871, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-4239, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-4086", "EQ-684");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2871, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5529");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-3916", "EQ-4936", "EQ-4955");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5530");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        boolean boolean4 = faculty3.needsapproval;
        boolean boolean5 = faculty3.needsapproval;
        boolean boolean6 = faculty3.isapproved;
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5531");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-451, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1908, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        double double4 = researcher3.getHourlyRate();
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5532");
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
        src.java.Arduino arduino16 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.Microscope microscope20 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str21 = microscope20.getName();
        java.lang.String str22 = microscope20.getLocation();
        src.java.EquipmentStatus equipmentStatus23 = microscope20.getStatus();
        arduino16.setStatus(equipmentStatus23);
        microscope3.setStatus(equipmentStatus23);
        src.java.Microscope microscope29 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = microscope29.isAvailable(localDateTime30, localDateTime31);
        src.java.EquipmentStatus equipmentStatus33 = microscope29.getStatus();
        src.java.Equipment equipment37 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str38 = equipment37.getDescription();
        src.java.EquipmentStatus equipmentStatus39 = equipment37.getStatus();
        microscope29.setStatus(equipmentStatus39);
        java.lang.String str41 = microscope29.getName();
        src.java.Microscope microscope45 = new src.java.Microscope("EQ-539", "EQ-131", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.Equipment equipment49 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        src.java.Equipment equipment53 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino57 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope61 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str62 = microscope61.getName();
        java.lang.String str63 = microscope61.getLocation();
        src.java.EquipmentStatus equipmentStatus64 = microscope61.getStatus();
        arduino57.setStatus(equipmentStatus64);
        equipment53.setStatus(equipmentStatus64);
        equipment49.setStatus(equipmentStatus64);
        microscope45.setStatus(equipmentStatus64);
        microscope29.setStatus(equipmentStatus64);
        microscope3.setStatus(equipmentStatus64);
        java.lang.String str71 = microscope3.getLocation();
        src.java.Arduino arduino75 = new src.java.Arduino("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.Equipment equipment79 = new src.java.Equipment("EQ-335", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-851");
        src.java.EquipmentStatus equipmentStatus80 = equipment79.getStatus();
        arduino75.setStatus(equipmentStatus80);
        microscope3.setStatus(equipmentStatus80);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "3) test5532(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-5136, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-5136, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "COORD-001" + "'", str38, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus39 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus39.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Guest" + "'", str41, "Guest");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus64 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus64.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus80 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus80.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5533");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        src.java.Microscope microscope10 = new src.java.Microscope("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        src.java.Arduino arduino14 = new src.java.Arduino("COORD-001", "Researcher", "COORD-001");
        src.java.Microscope microscope18 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str19 = microscope18.getName();
        java.lang.String str20 = microscope18.getLocation();
        src.java.EquipmentStatus equipmentStatus21 = microscope18.getStatus();
        arduino14.setStatus(equipmentStatus21);
        java.lang.String str23 = arduino14.getLocation();
        src.java.EquipmentStatus equipmentStatus24 = arduino14.getStatus();
        microscope10.setStatus(equipmentStatus24);
        equipment3.setStatus(equipmentStatus24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "COORD-001" + "'", str23, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5534");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str6 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5535");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-665", "EQ-655", "EQ-1021");
        faculty3.needsapproval = true;
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5536");
        src.java.Guest guest3 = new src.java.Guest("", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2001");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5537");
        src.java.Student student3 = new src.java.Student("COORD-001", "MasterAdmin123!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5538");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.username = "EQ-2114";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5539");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-4994");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5540");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-862", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-469");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5541");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-4590", "EQ-4011", "", "EQ-2591");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-4590");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5542");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null", "EQ-275", "Equipment ID: EQ-1569, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5543");
        src.java.Equipment equipment3 = new src.java.Equipment("Student", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-246");
        src.java.Microscope microscope7 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str8 = microscope7.getEquipmentId();
        java.lang.String str9 = microscope7.getDescription();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        equipment3.setStatus(equipmentStatus10);
        java.lang.String str12 = equipment3.getEquipmentId();
// flaky "4) test5543(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5154" + "'", str8, "EQ-5154");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "2) test5543(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-5153" + "'", str12, "EQ-5153");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5544");
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
        java.lang.String str18 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus16 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus16.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "5) test5544(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-5155" + "'", str18, "EQ-5155");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5545");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-106", "EQ-209");
        faculty3.username = "EQ-970";
        java.lang.String str6 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-970" + "'", str6, "EQ-970");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5546");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        student3.username = "EQ-3535";
        double double6 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5547");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2365, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4794, Name: EQ-301, Description: , Location: EQ-451, Status: AVAILABLE", "EQ-4675");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5548");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = microscope3.toString();
        java.lang.String str9 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "6) test5548(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-5157, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-5157, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
// flaky "3) test5548(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5157, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-5157, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5549");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.toString();
        src.java.Microscope microscope14 = new src.java.Microscope("Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-508");
        src.java.EquipmentStatus equipmentStatus15 = microscope14.getStatus();
        microscope3.setStatus(equipmentStatus15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "7) test5549(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-5158" + "'", str9, "EQ-5158");
// flaky "4) test5549(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-5158, Name: hi!, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-5158, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5550");
        src.java.Guest guest3 = new src.java.Guest("EQ-222", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
        guest3.password = "EQ-1592";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5551");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str5 = labManager4.getRegistrationId();
        java.lang.String str6 = labManager4.password;
        labManager4.isapproved = false;
        java.lang.String str9 = labManager4.getRegistrationId();
        double double10 = labManager4.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MANAGER-66180900" + "'", str5, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MANAGER-66180900" + "'", str9, "MANAGER-66180900");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5552");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-685", "Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-3950", "EQ-4136");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-685");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5553");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        guest3.isapproved = true;
        java.lang.String str10 = guest3.getAccountType();
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5554");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        double double11 = labManager10.getHourlyRate();
        java.lang.String str12 = labManager10.getRegistrationId();
        java.lang.String str13 = labManager10.getRegistrationId();
        labManager10.isapproved = false;
        labManager10.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MANAGER-66180900" + "'", str12, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MANAGER-66180900" + "'", str13, "MANAGER-66180900");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5555");
        src.java.Student student3 = new src.java.Student("EQ-596", "EQ-264", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        student3.needsapproval = false;
        student3.needsapproval = false;
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5556");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-355", "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE");
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null", "EQ-5049");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5557");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = labManager3.needsapproval;
        labManager3.password = "EQ-1526";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5558");
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
        src.java.Microscope microscope39 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus40 = null;
        microscope39.setStatus(equipmentStatus40);
        src.java.EquipmentStatus equipmentStatus42 = null;
        microscope39.setStatus(equipmentStatus42);
        java.lang.String str44 = microscope39.getName();
        java.lang.String str45 = microscope39.getName();
        java.lang.String str46 = microscope39.getName();
        src.java.Microscope microscope50 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus51 = null;
        microscope50.setStatus(equipmentStatus51);
        src.java.EquipmentStatus equipmentStatus53 = microscope50.getStatus();
        src.java.Microscope microscope57 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str58 = microscope57.getName();
        java.lang.String str59 = microscope57.getLocation();
        src.java.EquipmentStatus equipmentStatus60 = microscope57.getStatus();
        microscope50.setStatus(equipmentStatus60);
        microscope39.setStatus(equipmentStatus60);
        src.java.EquipmentStatus equipmentStatus63 = microscope39.getStatus();
        equipment3.setStatus(equipmentStatus63);
        java.lang.String str65 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "8) test5558(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EQ-5164" + "'", str26, "EQ-5164");
// flaky "5) test5558(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EQ-5167" + "'", str31, "EQ-5167");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EQ-94" + "'", str32, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(equipmentStatus53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus60 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus60.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus63 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus63.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "2) test5558(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "EQ-5163" + "'", str65, "EQ-5163");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5559");
        src.java.Guest guest3 = new src.java.Guest("EQ-981", "Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5560");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getAccountType();
        boolean boolean8 = researcher3.needsapproval;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        double double11 = researcher3.getHourlyRate();
        java.lang.String str12 = researcher3.getAccountType();
        boolean boolean13 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5561");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-3320", "Equipment ID: EQ-1834, Name: EQ-861, Description: Equipment ID: EQ-525, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-2895");
        researcher3.password = "EQ-1927";
        boolean boolean6 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5562");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-3723, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-2251, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5563");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1992, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-944, Name: , Description: , Location: , Status: null", "EQ-1446");
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
        src.java.EquipmentStatus equipmentStatus23 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus23);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "9) test5563(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-5172" + "'", str11, "EQ-5172");
// flaky "6) test5563(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-5172, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-5172, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5564");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5565");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-118", "EQ-99");
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("EQ-442", "Equipment ID: EQ-2558, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager22 = headLabCoordinator0.autoGenerateLabManager("EQ-3668", "EQ-4024");
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
        org.junit.Assert.assertNotNull(labManager22);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5566");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        double double11 = researcher3.getHourlyRate();
        researcher3.username = "EQ-367";
        researcher3.password = "EQ-1662";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5567");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-3320", "Equipment ID: EQ-4067, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-2469");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5568");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-4822, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-734", "Equipment ID: EQ-4827, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5569");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-430, Name: , Description: , Location: , Status: null", "");
        src.java.Microscope microscope7 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope7.setStatus(equipmentStatus8);
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        java.lang.String str11 = microscope7.toString();
        java.lang.String str12 = microscope7.getName();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope7.isAvailable(localDateTime13, localDateTime14);
        java.lang.String str16 = microscope7.getLocation();
        src.java.Arduino arduino20 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.Microscope microscope24 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str25 = microscope24.getName();
        java.lang.String str26 = microscope24.getLocation();
        src.java.EquipmentStatus equipmentStatus27 = microscope24.getStatus();
        arduino20.setStatus(equipmentStatus27);
        microscope7.setStatus(equipmentStatus27);
        src.java.EquipmentStatus equipmentStatus30 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus30);
        src.java.EquipmentStatus equipmentStatus32 = arduino3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus10);
// flaky "10) test5569(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-5177, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-5177, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus30 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus30.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus32 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus32.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5570");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        java.lang.String str4 = arduino3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5571");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1794", "EQ-4136", "Equipment ID: EQ-4634, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5572");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-2279, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE", "EQ-2958", "EQ-2799");
        java.lang.String str4 = arduino3.toString();
// flaky "11) test5572(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5182, Name: Equipment ID: EQ-2279, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE, Description: EQ-2958, Location: EQ-2799, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5182, Name: Equipment ID: EQ-2279, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE, Description: EQ-2958, Location: EQ-2799, Status: AVAILABLE");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5573");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.username;
        headLabCoordinator0.username = "Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5574");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5575");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "EQ-535";
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5576");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.getLocation();
        src.java.Arduino arduino13 = new src.java.Arduino("", "EQ-36", "EQ-92");
        src.java.EquipmentStatus equipmentStatus14 = arduino13.getStatus();
        microscope3.setStatus(equipmentStatus14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = microscope3.isAvailable(localDateTime16, localDateTime17);
        java.lang.String str19 = microscope3.getLocation();
// flaky "12) test5576(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5184, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5184, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "7) test5576(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5184, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5184, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5577");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-98");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-98" + "'", str5, "EQ-98");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5578");
        src.java.Student student3 = new src.java.Student("EQ-2376", "Equipment ID: EQ-937, Name: , Description: , Location: , Status: null", "EQ-2190");
        student3.username = "EQ-719";
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5579");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Equipment ID: EQ-1625, Name: , Description: , Location: , Status: null", "EQ-1911");
        java.lang.String str4 = researcher3.username;
        researcher3.password = "Equipment ID: EQ-4902, Name: Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-368, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5580");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.password;
        boolean boolean8 = guest3.isapproved;
        guest3.isapproved = false;
        double double11 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5581");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-4345", "", "EQ-4362");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5582");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3134, Name: , Description: , Location: , Status: null", "EQ-1917");
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5583");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        researcher3.username = "EQ-991";
        researcher3.needsapproval = false;
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5584");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        guest3.needsapproval = true;
        boolean boolean6 = guest3.needsapproval;
        java.lang.String str7 = guest3.getAccountType();
        guest3.username = "EQ-419";
        double double10 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5585");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-1624", "EQ-1007");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3797, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-4179, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5586");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-758", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5587");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1413, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE", "EQ-3083");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5588");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "EQ-156");
        headLabCoordinator0.username = "Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null";
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5589");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        boolean boolean11 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-246");
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        boolean boolean16 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("EQ-1453", "Equipment ID: EQ-5020, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5590");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        boolean boolean6 = guest3.isapproved;
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5591");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-615", "Equipment ID: EQ-681, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-773");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5592");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-3950", "EQ-3448", "");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5593");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getLocation();
        java.lang.String str7 = microscope3.getEquipmentId();
        java.lang.String str8 = microscope3.toString();
        java.lang.String str9 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "13) test5593(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-5191" + "'", str7, "EQ-5191");
// flaky "8) test5593(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-5191, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-5191, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5594");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1785, Name: Equipment ID: EQ-396, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE, Location: Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getLocation();
// flaky "14) test5594(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5192" + "'", str4, "EQ-5192");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5595");
        src.java.Student student3 = new src.java.Student("EQ-1583", "Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-2532");
        java.lang.String str4 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2532" + "'", str4, "EQ-2532");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5596");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-2684", "EQ-257");
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5597");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.password;
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5598");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-3797, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE", "", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5599");
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
        src.java.Equipment equipment30 = new src.java.Equipment("EQ-514", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-528");
        src.java.Microscope microscope34 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = microscope34.isAvailable(localDateTime35, localDateTime36);
        src.java.EquipmentStatus equipmentStatus38 = microscope34.getStatus();
        equipment30.setStatus(equipmentStatus38);
        equipment3.setStatus(equipmentStatus38);
        java.lang.String str41 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus38 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus38.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "15) test5599(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EQ-5193" + "'", str41, "EQ-5193");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5600");
        src.java.Student student3 = new src.java.Student("EQ-3132", "Equipment ID: EQ-1929, Name: , Description: , Location: , Status: null", "EQ-599");
        student3.username = "Equipment ID: EQ-3384, Name: , Description: , Location: , Status: null";
        boolean boolean6 = student3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5601");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-685", "Equipment ID: EQ-4512, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5602");
        src.java.Student student3 = new src.java.Student("EQ-1412", "Equipment ID: EQ-1448, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-236");
        student3.username = "EQ-2527";
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5603");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5604");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-4281", "EQ-5160");
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5605");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getName();
        java.lang.String str6 = microscope3.getLocation();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5606");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1382, Name: Lab Manager, Description: EQ-209, Location: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-3060, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5607");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-2904", "EQ-4735");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5608");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-149", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-149" + "'", str4, "EQ-149");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5609");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1300, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "", "EQ-4226");
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5610");
        src.java.Student student3 = new src.java.Student("EQ-5020", "Equipment ID: EQ-3250, Name: Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2137, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5611");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-3962, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3748, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5612");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        headLabCoordinator0.username = "";
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-2532");
        headLabCoordinator0.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        java.lang.String str17 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5613");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-578", "Equipment ID: EQ-3251, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE", "EQ-1476");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5614");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        labManager3.username = "EQ-470";
        java.lang.String str9 = labManager3.username;
        java.lang.String str10 = labManager3.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-470" + "'", str9, "EQ-470");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MANAGER-103232" + "'", str10, "MANAGER-103232");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5615");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-686", "EQ-504");
        java.lang.Class<?> wildcardClass9 = labManager8.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5616");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1243", "EQ-1437", "EQ-4137");
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5617");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
// flaky "16) test5617(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5208, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5208, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5618");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("EQ-63", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-598", "EQ-344", "Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-2293", "Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-486");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-1969", "Equipment ID: EQ-702, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-3281, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2558, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-954, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4616, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5619");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.toString();
        java.lang.String str6 = arduino3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
// flaky "17) test5619(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5209, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5209, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
// flaky "9) test5619(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-5209, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-5209, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5620");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "EQ-1592", "EQ-866");
        java.lang.String str4 = arduino3.getDescription();
        java.lang.String str5 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1592" + "'", str4, "EQ-1592");
// flaky "18) test5620(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5210" + "'", str5, "EQ-5210");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5621");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1572", "EQ-3908", "EQ-4387");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5622");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-1000", "EQ-627", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("", "Equipment ID: EQ-4268, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2497", "Equipment ID: EQ-2486, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5623");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-1911", "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getLocation();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5624");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-4444, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1163", "EQ-1103");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5625");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-665", "EQ-3783", "EQ-586");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5626");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2375", "Equipment ID: EQ-940, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5627");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        boolean boolean7 = researcher3.isapproved;
        java.lang.String str8 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5628");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-2528", "EQ-1409", "EQ-2322");
        java.lang.String str4 = microscope3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2528" + "'", str4, "EQ-2528");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5629");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getEquipmentId();
        src.java.Arduino arduino15 = new src.java.Arduino("", "EQ-36", "EQ-92");
        src.java.Equipment equipment19 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str20 = equipment19.getEquipmentId();
        java.lang.String str21 = equipment19.getName();
        src.java.EquipmentStatus equipmentStatus22 = equipment19.getStatus();
        arduino15.setStatus(equipmentStatus22);
        microscope3.setStatus(equipmentStatus22);
        java.lang.String str25 = microscope3.getName();
        java.lang.String str26 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "19) test5629(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-5216, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-5216, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "10) test5629(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-5216" + "'", str9, "EQ-5216");
// flaky "3) test5629(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-5216, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-5216, Name: , Description: , Location: , Status: null");
// flaky "1) test5629(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-5216" + "'", str11, "EQ-5216");
// flaky "1) test5629(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EQ-5218" + "'", str20, "EQ-5218");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EQ-94" + "'", str21, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5630");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        boolean boolean7 = researcher3.isapproved;
        java.lang.String str8 = researcher3.getRegistrationId();
        boolean boolean9 = researcher3.isapproved;
        researcher3.isapproved = true;
        double double12 = researcher3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5631");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        java.lang.Class<?> wildcardClass11 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5632");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getLocation();
        src.java.Microscope microscope15 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = microscope15.isAvailable(localDateTime16, localDateTime17);
        src.java.EquipmentStatus equipmentStatus19 = microscope15.getStatus();
        src.java.Arduino arduino23 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = arduino23.isAvailable(localDateTime24, localDateTime25);
        java.lang.String str27 = arduino23.getDescription();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = arduino23.isAvailable(localDateTime28, localDateTime29);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = arduino23.isAvailable(localDateTime31, localDateTime32);
        src.java.EquipmentStatus equipmentStatus34 = arduino23.getStatus();
        microscope15.setStatus(equipmentStatus34);
        microscope3.setStatus(equipmentStatus34);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = microscope3.isAvailable(localDateTime37, localDateTime38);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "20) test5632(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-5219, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-5219, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MasterAdmin123!" + "'", str27, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus34 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus34.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5633");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-92", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        boolean boolean5 = guest3.isapproved;
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5634");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1161");
        java.lang.String str4 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str4, "Equipment ID: EQ-1486, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5635");
        src.java.Student student3 = new src.java.Student("EQ-3985", "Equipment ID: EQ-3243, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "EQ-3798");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5636");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-179", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        double double8 = headLabCoordinator0.getHourlyRate();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5637");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        researcher3.password = "EQ-275";
        java.lang.String str13 = researcher3.password;
        researcher3.password = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-275" + "'", str13, "EQ-275");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5638");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-596", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = arduino3.toString();
        java.lang.String str9 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-596" + "'", str4, "EQ-596");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "21) test5638(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-5222, Name: EQ-596, Description: Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-5222, Name: EQ-596, Description: Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
// flaky "11) test5638(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-5222" + "'", str9, "EQ-5222");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5639");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5640");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-1102");
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
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5641");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-4935, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2894, Name: Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Status: AVAILABLE", "EQ-2799", "EQ-970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-4935, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5642");
        src.java.Microscope microscope3 = new src.java.Microscope("MasterAdmin123!", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-2962");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5643");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-368");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
// flaky "22) test5643(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5225, Name: Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-368, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5225, Name: Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Description: Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-368, Status: AVAILABLE");
// flaky "12) test5643(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5225" + "'", str5, "EQ-5225");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5644");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        double double6 = researcher3.getHourlyRate();
        researcher3.needsapproval = false;
        boolean boolean9 = researcher3.isapproved;
        java.lang.String str10 = researcher3.getAccountType();
        researcher3.password = "EQ-4974";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5645");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-451, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1908, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        researcher3.isapproved = false;
        researcher3.isapproved = true;
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5646");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        userAccounts17.needsapproval = false;
        userAccounts17.password = "EQ-435";
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5647");
        src.java.Student student3 = new src.java.Student("EQ-2020", "EQ-2137", "EQ-1739");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5648");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1878", "Equipment ID: EQ-5208, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2499, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5649");
        src.java.Guest guest3 = new src.java.Guest("EQ-392", "Equipment ID: EQ-949, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "");
        java.lang.String str4 = guest3.getAccountType();
        guest3.password = "";
        boolean boolean7 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5650");
        src.java.Researcher researcher3 = new src.java.Researcher("MANAGER-103232", "EQ-4554", "EQ-2412");
        java.lang.String str4 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2412" + "'", str4, "EQ-2412");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5651");
        src.java.Guest guest3 = new src.java.Guest("EQ-2819", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-3281");
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5652");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-3925, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-4461");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5653");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1911, Name: , Description: , Location: , Status: null", "EQ-758");
        java.lang.String str19 = labManager18.password;
        java.lang.String str20 = labManager18.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ-758" + "'", str19, "EQ-758");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lab Manager" + "'", str20, "Lab Manager");
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5654");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1075, Name: EQ-507, Description: EQ-63, Location: EQ-253, Status: AVAILABLE", "", "Equipment ID: EQ-2333, Name: , Description: , Location: , Status: AVAILABLE");
        boolean boolean4 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5655");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-114", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Faculty");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-284", "EQ-627", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "EQ-387", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("EQ-4526", "Equipment ID: EQ-2271, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2305, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5656");
        src.java.Arduino arduino3 = new src.java.Arduino("", "EQ-826", "EQ-814");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5657");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str6 = headLabCoordinator0.username;
        headLabCoordinator0.username = "Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        java.lang.String str9 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str9, "Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5658");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getDescription();
        java.lang.String str7 = microscope3.getName();
// flaky "23) test5658(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5228, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5228, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "13) test5658(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5228, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5228, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5659");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-114", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Faculty");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-284", "EQ-627", "Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("EQ-1050", "EQ-1098", "EQ-276");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-4725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-778, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5660");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-4946", "EQ-92", "EQ-4647");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5661");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-3149", "EQ-764");
        boolean boolean14 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5662");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-193");
        java.lang.String str4 = faculty3.password;
        faculty3.isapproved = true;
        faculty3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5663");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus9 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5664");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Lab Manager", "EQ-384");
        student3.username = "EQ-1742";
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5665");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-1341", "EQ-688");
        boolean boolean8 = headLabCoordinator0.needsapproval;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5666");
        src.java.Student student3 = new src.java.Student("EQ-508", "EQ-299", "EQ-299");
        student3.isapproved = false;
        java.lang.String str6 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-299" + "'", str6, "EQ-299");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5667");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-41", "EQ-104", "");
        java.lang.String str4 = equipment3.getLocation();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = equipment3.isAvailable(localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = equipment3.isAvailable(localDateTime11, localDateTime12);
        java.lang.String str14 = equipment3.toString();
        src.java.Microscope microscope18 = new src.java.Microscope("EQ-355", "EQ-508", "EQ-390");
        src.java.EquipmentStatus equipmentStatus19 = microscope18.getStatus();
        equipment3.setStatus(equipmentStatus19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "24) test5667(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-5232, Name: EQ-41, Description: EQ-104, Location: , Status: AVAILABLE" + "'", str14, "Equipment ID: EQ-5232, Name: EQ-41, Description: EQ-104, Location: , Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5668");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.needsapproval = false;
        java.lang.String str8 = labManager5.getRegistrationId();
        java.lang.String str9 = labManager5.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MANAGER-0" + "'", str8, "MANAGER-0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5669");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-4041, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-4070", "EQ-2594");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5670");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Student", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        student3.username = "EQ-74";
        java.lang.String str6 = student3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-74" + "'", str6, "EQ-74");
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5671");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-259", "EQ-628", "EQ-386");
        java.lang.Class<?> wildcardClass4 = arduino3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5672");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        java.lang.String str5 = headLabCoordinator0.password;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5673");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-563, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "EQ-1616", "Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1616" + "'", str4, "EQ-1616");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1616" + "'", str5, "EQ-1616");
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5674");
        src.java.Student student3 = new src.java.Student("EQ-539", "EQ-569", "EQ-392");
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
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5675");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getLocation();
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus10 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "25) test5675(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5237, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-5237, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5676");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null", "MANAGER-0", "EQ-3321");
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5677");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.needsapproval = false;
        guest3.isapproved = false;
        java.lang.String str14 = guest3.getAccountType();
        java.lang.String str15 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5678");
        src.java.Student student3 = new src.java.Student("COORD-001", "EQ-74", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.isapproved = true;
        boolean boolean7 = student3.needsapproval;
        java.lang.String str8 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-74" + "'", str8, "EQ-74");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5679");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-382");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5680");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5681");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-791", "EQ-552", "EQ-981");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-590", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1730, Name: , Description: , Location: , Status: AVAILABLE", "Equipment ID: EQ-1417, Name: EQ-104, Description: EQ-41, Location: EQ-149, Status: AVAILABLE");
        src.java.UserAccounts userAccounts40 = userFactory0.createUser("EQ-2264", "Equipment ID: EQ-2807, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-118");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5682");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.password;
        double double7 = faculty3.getHourlyRate();
        faculty3.password = "Equipment ID: EQ-4312, Name: , Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: , Status: AVAILABLE";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5683");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-3495", "EQ-509", "EQ-535");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5684");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "EQ-149", "EQ-1762");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5685");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5686");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1570, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-1970", "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5687");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        java.lang.String str12 = headLabCoordinator0.username;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str15 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Head Lab Coordinator" + "'", str15, "Head Lab Coordinator");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5688");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1928");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5689");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-284", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "EQ-39", "EQ-1739");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5690");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        headLabCoordinator0.username = "COORD-001";
        headLabCoordinator0.username = "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-4702, Name: , Description: , Location: , Status: null", "EQ-1176");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5691");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-1007", "EQ-1411", "EQ-2149");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        src.java.Microscope microscope9 = new src.java.Microscope("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "MasterAdmin123!", "Researcher");
        src.java.EquipmentStatus equipmentStatus10 = microscope9.getStatus();
        microscope3.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1411" + "'", str4, "EQ-1411");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1411" + "'", str5, "EQ-1411");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "26) test5691(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-5243" + "'", str12, "EQ-5243");
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5692");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.isapproved = true;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        student3.isapproved = false;
        java.lang.String str13 = student3.username;
        student3.needsapproval = true;
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.password;
        student3.username = "";
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str17, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5693");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "EQ-2409", "EQ-1502");
        student3.username = "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        java.lang.String str6 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-1502" + "'", str6, "EQ-1502");
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5694");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5695");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.Class<?> wildcardClass6 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5696");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-4394, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE", "Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null", "EQ-4769");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5697");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-3925, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5698");
        src.java.Guest guest3 = new src.java.Guest("EQ-2190", "EQ-2954", "Equipment ID: EQ-5049, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5699");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5700");
        src.java.Guest guest3 = new src.java.Guest("EQ-442", "EQ-476", "");
        java.lang.String str4 = guest3.getAccountType();
        guest3.needsapproval = false;
        java.lang.String str7 = guest3.username;
        java.lang.String str8 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-442" + "'", str7, "EQ-442");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5701");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "MasterAdmin123!");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5702");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-627", "Equipment ID: EQ-1448, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE", "EQ-3671");
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5703");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1878, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1910", "EQ-2623");
        java.lang.String str4 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1878, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str4, "Equipment ID: EQ-1878, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5704");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-5216, Name: , Description: , Location: , Status: null", "EQ-1045", "Equipment ID: EQ-992, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5705");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Student", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.password;
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5706");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-5110, Name: EQ-114, Description: EQ-301, Location: EQ-94, Status: AVAILABLE", "Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3251, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5707");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1624, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5708");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-4743", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-4178, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5709");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-869", "EQ-242", "Equipment ID: EQ-822, Name: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: MasterAdmin123!, Location: EQ-75, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5710");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        boolean boolean9 = guest3.needsapproval;
        guest3.username = "EQ-106";
        boolean boolean12 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5711");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getName();
        java.lang.String str6 = equipment3.getEquipmentId();
        src.java.Microscope microscope10 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str11 = microscope10.getDescription();
        java.lang.String str12 = microscope10.getLocation();
        java.lang.String str13 = microscope10.getName();
        src.java.Microscope microscope17 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = microscope17.isAvailable(localDateTime18, localDateTime19);
        src.java.EquipmentStatus equipmentStatus21 = microscope17.getStatus();
        microscope10.setStatus(equipmentStatus21);
        src.java.EquipmentStatus equipmentStatus23 = microscope10.getStatus();
        src.java.EquipmentStatus equipmentStatus24 = microscope10.getStatus();
        equipment3.setStatus(equipmentStatus24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
// flaky "27) test5711(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-5246" + "'", str6, "EQ-5246");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus24 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus24.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5712");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        double double7 = researcher3.getHourlyRate();
        java.lang.String str8 = researcher3.getAccountType();
        double double9 = researcher3.getHourlyRate();
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5713");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1388", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null", "EQ-246");
        faculty3.needsapproval = false;
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5714");
        src.java.Student student3 = new src.java.Student("EQ-104", "Guest", "");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "EQ-643";
        java.lang.String str7 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-104" + "'", str7, "EQ-104");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5715");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-39", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-2113");
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5716");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        double double5 = headLabCoordinator0.getHourlyRate();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.username;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2398, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null", "EQ-2423");
        labManager14.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5717");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1824, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "EQ-392");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5718");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = microscope3.isAvailable(localDateTime13, localDateTime14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "28) test5718(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5250, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-5250, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "14) test5718(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-5250" + "'", str11, "EQ-5250");
        org.junit.Assert.assertNull(equipmentStatus12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5719");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.isapproved = true;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-3894");
        boolean boolean10 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5720");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null", "EQ-2409", "EQ-1502");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5721");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-2928, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-3243, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5722");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-368", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.isapproved = true;
        double double17 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager20 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2894, Name: Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: , Location: Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE, Status: AVAILABLE", "EQ-2483");
        java.lang.String str21 = labManager20.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE" + "'", str2, "Equipment ID: EQ-1662, Name: EQ-193, Description: Equipment ID: EQ-1018, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Location: Guest, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(labManager20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EQ-2483" + "'", str21, "EQ-2483");
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5723");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        double double9 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5724");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-449", "EQ-2497", "EQ-2190", "Equipment ID: EQ-1217, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-449");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5725");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-461", "EQ-304", "EQ-231");
        faculty3.isapproved = true;
        java.lang.String str6 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-231" + "'", str6, "EQ-231");
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5726");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-2644", "EQ-4362", "Equipment ID: EQ-1465, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5727");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = microscope3.isAvailable(localDateTime6, localDateTime7);
// flaky "29) test5727(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5252" + "'", str4, "EQ-5252");
// flaky "15) test5727(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5252" + "'", str5, "EQ-5252");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5728");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.password;
        boolean boolean5 = guest3.isapproved;
        guest3.password = "EQ-1994";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5729");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-4498", "EQ-1878", "Equipment ID: EQ-3641, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5730");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2190", "EQ-389", "EQ-3064");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-3064" + "'", str4, "EQ-3064");
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5731");
        src.java.Guest guest3 = new src.java.Guest("EQ-452", "EQ-386", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = guest3.isapproved;
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5732");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        java.lang.String str13 = headLabCoordinator0.username;
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5733");
        src.java.Student student3 = new src.java.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        boolean boolean6 = student3.isapproved;
        student3.password = "Equipment ID: EQ-2892, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5734");
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
        java.lang.String str18 = headLabCoordinator0.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Head Lab Coordinator" + "'", str18, "Head Lab Coordinator");
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5735");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-284", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-114", "EQ-466", "Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("EQ-361", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4230, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        src.java.UserAccounts userAccounts29 = userFactory0.createUser("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-713, Name: , Description: , Location: , Status: null", "EQ-1557");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
        org.junit.Assert.assertNull(userAccounts29);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5736");
        src.java.Faculty faculty3 = new src.java.Faculty("", "Equipment ID: EQ-2994, Name: Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: EQ-296, Location: EQ-387, Status: AVAILABLE", "EQ-3022");
        boolean boolean4 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5737");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "EQ-630", "EQ-2449");
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5738");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-258", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        boolean boolean4 = faculty3.needsapproval;
        java.lang.String str5 = faculty3.getRegistrationId();
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5739");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "EQ-1102");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = equipment3.getEquipmentId();
        java.lang.Class<?> wildcardClass8 = equipment3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "30) test5739(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-5255" + "'", str7, "EQ-5255");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5740");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-758", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = microscope3.getEquipmentId();
        java.lang.String str8 = microscope3.getEquipmentId();
        java.lang.String str9 = microscope3.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "31) test5740(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-5256" + "'", str7, "EQ-5256");
// flaky "16) test5740(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5256" + "'", str8, "EQ-5256");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5741");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getName();
        src.java.Microscope microscope10 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str11 = microscope10.getName();
        java.lang.String str12 = microscope10.getName();
        java.lang.String str13 = microscope10.getLocation();
        src.java.Equipment equipment17 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino21 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope25 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str26 = microscope25.getName();
        java.lang.String str27 = microscope25.getLocation();
        src.java.EquipmentStatus equipmentStatus28 = microscope25.getStatus();
        arduino21.setStatus(equipmentStatus28);
        equipment17.setStatus(equipmentStatus28);
        microscope10.setStatus(equipmentStatus28);
        microscope3.setStatus(equipmentStatus28);
        java.lang.String str33 = microscope3.getDescription();
        src.java.Microscope microscope37 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str38 = microscope37.getName();
        java.lang.String str39 = microscope37.getLocation();
        java.lang.String str40 = microscope37.toString();
        java.lang.String str41 = microscope37.getEquipmentId();
        src.java.Equipment equipment45 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str46 = equipment45.getDescription();
        src.java.EquipmentStatus equipmentStatus47 = equipment45.getStatus();
        microscope37.setStatus(equipmentStatus47);
        microscope3.setStatus(equipmentStatus47);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Guest" + "'", str38, "Guest");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "COORD-001" + "'", str39, "COORD-001");
// flaky "32) test5741(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equipment ID: EQ-5262, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str40, "Equipment ID: EQ-5262, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
// flaky "17) test5741(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EQ-5262" + "'", str41, "EQ-5262");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "COORD-001" + "'", str46, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5742");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("EQ-114", "EQ-179", "EQ-104", "EQ-222");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-275");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("Equipment ID: EQ-1630, Name: , Description: , Location: , Status: null", "EQ-1162", "EQ-566", "EQ-1050");
        src.java.UserAccounts userAccounts33 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4786, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null, Location: EQ-1557, Status: AVAILABLE", "Equipment ID: EQ-3489, Name: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE, Description: Equipment ID: EQ-1574, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: EQ-236, Status: AVAILABLE");
        src.java.UserAccounts userAccounts38 = userFactory0.createUser("EQ-5243", "Equipment ID: EQ-3360, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1871, Name: EQ-1113, Description: Equipment ID: EQ-1756, Name: , Description: , Location: , Status: null, Location: EQ-760, Status: AVAILABLE", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts33);
        org.junit.Assert.assertNull(userAccounts38);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5743");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MANAGER-1087176903");
        double double14 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.username = "EQ-257";
        java.lang.String str17 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5744");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-965, Name: , Description: , Location: , Status: null", "", "EQ-1526");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getLocation();
// flaky "33) test5744(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5266, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5266, Name: Equipment ID: EQ-965, Name: , Description: , Location: , Status: null, Description: , Location: EQ-1526, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-1526" + "'", str5, "EQ-1526");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5745");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getRegistrationId();
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-3894, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5746");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-1005", "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2305, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE", "EQ-1903");
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        boolean boolean14 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5747");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2881, Name: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2711", "EQ-1811");
        researcher3.isapproved = true;
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5748");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.username;
        guest3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5749");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        student3.needsapproval = true;
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5750");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-4431, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-2207, Name: , Description: , Location: , Status: null", "EQ-4136");
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5751");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-281");
        java.lang.String str4 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-1062, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5752");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5753");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-435");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("EQ-1042", "EQ-2127", "EQ-2053");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("MANAGER-597445801", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3994, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5754");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        java.lang.String str8 = headLabCoordinator0.password;
        java.lang.String str9 = headLabCoordinator0.password;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        double double11 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5755");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        double double11 = headLabCoordinator0.getHourlyRate();
        java.lang.String str12 = headLabCoordinator0.username;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5756");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2905, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str14 = labManager13.password;
        java.lang.String str15 = labManager13.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null" + "'", str14, "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lab Manager" + "'", str15, "Lab Manager");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5757");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-4628", "Equipment ID: EQ-5136, Name: , Description: , Location: , Status: null", "EQ-3705");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5758");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.password = "Head Lab Coordinator";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        double double8 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = false;
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5759");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-3615", "Equipment ID: EQ-1671, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5760");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.getEquipmentId();
        java.lang.String str7 = microscope3.getEquipmentId();
        java.lang.String str8 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
// flaky "34) test5760(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-5268" + "'", str6, "EQ-5268");
// flaky "18) test5760(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-5268" + "'", str7, "EQ-5268");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5761");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-335", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-851");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        src.java.EquipmentStatus equipmentStatus5 = equipment3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5762");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-361", "Lab Manager", "EQ-559");
        faculty3.username = "EQ-1557";
        double double6 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5763");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "MasterAdmin123!");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getDescription();
        java.lang.String str10 = microscope7.getLocation();
        java.lang.String str11 = microscope7.getEquipmentId();
        src.java.Microscope microscope15 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus16 = null;
        microscope15.setStatus(equipmentStatus16);
        src.java.EquipmentStatus equipmentStatus18 = microscope15.getStatus();
        java.lang.String str19 = microscope15.getLocation();
        src.java.Microscope microscope23 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str24 = microscope23.getDescription();
        java.lang.String str25 = microscope23.getLocation();
        java.lang.String str26 = microscope23.getName();
        src.java.Microscope microscope30 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = microscope30.isAvailable(localDateTime31, localDateTime32);
        src.java.EquipmentStatus equipmentStatus34 = microscope30.getStatus();
        microscope23.setStatus(equipmentStatus34);
        microscope15.setStatus(equipmentStatus34);
        microscope7.setStatus(equipmentStatus34);
        arduino3.setStatus(equipmentStatus34);
        java.lang.String str39 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "35) test5763(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EQ-5271" + "'", str11, "EQ-5271");
        org.junit.Assert.assertNull(equipmentStatus18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "COORD-001" + "'", str24, "COORD-001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str25, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Guest" + "'", str26, "Guest");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus34 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus34.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MasterAdmin123!" + "'", str39, "MasterAdmin123!");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5764");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-2399", "EQ-2399", "EQ-1665");
        faculty3.username = "Equipment ID: EQ-2693, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5765");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        src.java.Microscope microscope8 = new src.java.Microscope("EQ-390", "EQ-731", "EQ-114");
        src.java.EquipmentStatus equipmentStatus9 = microscope8.getStatus();
        arduino3.setStatus(equipmentStatus9);
        java.lang.String str11 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5766");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5767");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str4 = microscope3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "36) test5767(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5277" + "'", str8, "EQ-5277");
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5768");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1526, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        src.java.Arduino arduino10 = new src.java.Arduino("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "MasterAdmin123!");
        src.java.Microscope microscope14 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str15 = microscope14.getName();
        java.lang.String str16 = microscope14.getDescription();
        java.lang.String str17 = microscope14.getLocation();
        java.lang.String str18 = microscope14.getEquipmentId();
        src.java.Microscope microscope22 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus23 = null;
        microscope22.setStatus(equipmentStatus23);
        src.java.EquipmentStatus equipmentStatus25 = microscope22.getStatus();
        java.lang.String str26 = microscope22.getLocation();
        src.java.Microscope microscope30 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str31 = microscope30.getDescription();
        java.lang.String str32 = microscope30.getLocation();
        java.lang.String str33 = microscope30.getName();
        src.java.Microscope microscope37 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = microscope37.isAvailable(localDateTime38, localDateTime39);
        src.java.EquipmentStatus equipmentStatus41 = microscope37.getStatus();
        microscope30.setStatus(equipmentStatus41);
        microscope22.setStatus(equipmentStatus41);
        microscope14.setStatus(equipmentStatus41);
        arduino10.setStatus(equipmentStatus41);
        src.java.EquipmentStatus equipmentStatus46 = arduino10.getStatus();
        equipment3.setStatus(equipmentStatus46);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
// flaky "37) test5768(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EQ-5280" + "'", str18, "EQ-5280");
        org.junit.Assert.assertNull(equipmentStatus25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "COORD-001" + "'", str31, "COORD-001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str32, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Guest" + "'", str33, "Guest");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus41 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus41.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus46 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus46.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5769");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-152", "EQ-380", "EQ-923");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5770");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-942, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5771");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Student", "Guest");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        java.lang.String str13 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5772");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getEquipmentId();
        src.java.Equipment equipment9 = new src.java.Equipment("EQ-106", "hi!", "EQ-74");
        src.java.EquipmentStatus equipmentStatus10 = equipment9.getStatus();
        equipment3.setStatus(equipmentStatus10);
        java.lang.String str12 = equipment3.getEquipmentId();
// flaky "38) test5772(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5285" + "'", str4, "EQ-5285");
// flaky "19) test5772(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5285" + "'", str5, "EQ-5285");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "4) test5772(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-5285" + "'", str12, "EQ-5285");
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5773");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-4395, Name: , Description: , Location: , Status: null", "EQ-4386", "EQ-3238");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5774");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1082", "Equipment ID: EQ-1864, Name: , Description: , Location: , Status: null");
        src.java.Microscope microscope7 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus8 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5775");
        src.java.Faculty faculty3 = new src.java.Faculty("", "EQ-2684", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5776");
        src.java.Guest guest3 = new src.java.Guest("EQ-1637", "EQ-1965", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.getRegistrationId();
        boolean boolean6 = guest3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5777");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("EQ-539", "EQ-628", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1811");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("", "EQ-2175", "Equipment ID: EQ-2685, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("EQ-2683", "EQ-1427", "Equipment ID: EQ-3576, Name: EQ-209, Description: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5778");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-2008, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-74", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5779");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1369, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2807, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-4827, Name: EQ-94, Description: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Location: MasterAdmin123!, Status: AVAILABLE");
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5780");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-4229, Name: EQ-257, Description: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: EQ-355, Status: AVAILABLE", "Equipment ID: EQ-2931, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5781");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = true;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-4070", "EQ-4769");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager16);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5782");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-495, Name: , Description: , Location: , Status: null", "", "EQ-152");
        faculty3.password = "EQ-422";
        boolean boolean6 = faculty3.isapproved;
        boolean boolean7 = faculty3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5783");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-1377, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-341", "EQ-2980");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5784");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-942, Name: , Description: , Location: , Status: null", "EQ-2876", "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1261, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5785");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.username = "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null";
        researcher3.username = "Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str8 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5786");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager12.needsapproval = false;
        java.lang.String str15 = labManager12.username;
        labManager12.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null" + "'", str15, "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5787");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.isapproved = true;
        java.lang.String str11 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5788");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-1434", "Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str4, "Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
// flaky "39) test5788(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5291, Name: Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE, Description: EQ-1434, Location: Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5291, Name: Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE, Description: EQ-1434, Location: Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5789");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-616", "EQ-435", "Faculty");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "Equipment ID: EQ-3058, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5790");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-850, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-257", "EQ-335");
        guest3.password = "EQ-2506";
        guest3.password = "EQ-2755";
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5791");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-63", "EQ-335", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getLocation();
        java.lang.String str5 = arduino3.getLocation();
        java.lang.String str6 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-63" + "'", str6, "EQ-63");
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5792");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5793");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1630, Name: , Description: , Location: , Status: null", "EQ-1918", "Researcher");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5794");
        src.java.Equipment equipment3 = new src.java.Equipment("", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-486");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5795");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-3087", "EQ-4738", "EQ-3029");
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5796");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-74", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("EQ-99", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager21 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE", "EQ-4373");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(labManager21);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5797");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-156", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-325");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-242", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-75", "COORD-001");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-596", "EQ-637", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "EQ-276");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("EQ-509", "EQ-536", "", "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
        src.java.UserAccounts userAccounts40 = userFactory0.createUser("Equipment ID: EQ-2805, Name: EQ-341, Description: EQ-242, Location: Equipment ID: EQ-1000, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-808, Name: , Description: , Location: , Status: null", "EQ-390");
        src.java.UserAccounts userAccounts44 = userFactory0.createUser("EQ-2375", "Equipment ID: EQ-2383, Name: EQ-547, Description: Researcher, Location: Equipment ID: EQ-367, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "");
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
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5798");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-39", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-94");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-259");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-4786, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null, Location: EQ-1557, Status: AVAILABLE", "Equipment ID: EQ-4923, Name: EQ-253, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-4122, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-4238, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5799");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3426, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE", "Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-1099");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5800");
        src.java.Microscope microscope3 = new src.java.Microscope("Student", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getLocation();
        java.lang.String str5 = microscope3.getEquipmentId();
        java.lang.String str6 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null");
// flaky "40) test5800(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-5299" + "'", str5, "EQ-5299");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str6, "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5801");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Faculty", "", "EQ-419", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        boolean boolean28 = userAccounts27.isapproved;
        java.lang.String str29 = userAccounts27.getAccountType();
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNotNull(userAccounts27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5802");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getName();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        java.lang.String str9 = arduino3.toString();
        java.lang.String str10 = arduino3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipmentStatus8);
// flaky "41) test5802(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5300, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str9, "Equipment ID: EQ-5300, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
// flaky "20) test5802(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-5300, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str10, "Equipment ID: EQ-5300, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5803");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-3512", "Equipment ID: EQ-4820, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-566");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5804");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-380", "EQ-106");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        src.java.Arduino arduino8 = new src.java.Arduino("", "EQ-36", "EQ-92");
        src.java.EquipmentStatus equipmentStatus9 = arduino8.getStatus();
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
        src.java.EquipmentStatus equipmentStatus28 = microscope13.getStatus();
        src.java.EquipmentStatus equipmentStatus29 = microscope13.getStatus();
        arduino8.setStatus(equipmentStatus29);
        equipment3.setStatus(equipmentStatus29);
        java.lang.String str32 = equipment3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNull(equipmentStatus16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus28 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus28.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus29 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus29.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str32, "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5805");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str6 = userAccounts5.password;
        boolean boolean7 = userAccounts5.needsapproval;
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5806");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2594", "EQ-3154", "EQ-2146");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5807");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4935, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-1526");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5808");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-1409");
        java.lang.String str4 = guest3.password;
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str4, "Equipment ID: EQ-1949, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5809");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-981", "Equipment ID: EQ-2822, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1832");
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5810");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5811");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-104", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-3083";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5812");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        java.lang.String str4 = researcher3.getAccountType();
        boolean boolean5 = researcher3.isapproved;
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.username = "EQ-2789";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5813");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("", "EQ-413");
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertNotNull(labManager4);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5814");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-5216, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-451, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5815");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-382", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str9 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5816");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str13 = labManager12.password;
        labManager12.needsapproval = false;
        labManager12.needsapproval = true;
        labManager12.password = "MANAGER-2132366233";
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
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5817");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-4929", "EQ-861", "EQ-2376");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5818");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.isapproved = true;
        java.lang.String str12 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5819");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2532", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null", "EQ-74");
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5820");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        boolean boolean8 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "EQ-98");
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.password = "EQ-2499";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-3083" + "'", str1, "EQ-3083");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5821");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        java.lang.String str11 = headLabCoordinator0.password;
        java.lang.Class<?> wildcardClass12 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5822");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1608", "EQ-3358", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.Equipment equipment7 = new src.java.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        java.lang.String str8 = equipment7.getName();
        src.java.EquipmentStatus equipmentStatus9 = equipment7.getStatus();
        arduino3.setStatus(equipmentStatus9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MANAGER-66180900" + "'", str8, "MANAGER-66180900");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5823");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-2409", "Equipment ID: EQ-1575, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4155, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5824");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        labManager6.needsapproval = true;
        labManager6.username = "EQ-2149";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(labManager6);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5825");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1747");
        java.lang.String str14 = labManager13.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str14, "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5826");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.Class<?> wildcardClass6 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5827");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        boolean boolean6 = guest3.isapproved;
        java.lang.String str7 = guest3.getAccountType();
        guest3.isapproved = false;
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5828");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-1430", "EQ-1670", "EQ-2489");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5829");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "42) test5829(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-760" + "'", str1, "EQ-760");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5830");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-754, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-529, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        java.lang.String str5 = guest3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5831");
        src.java.Student student3 = new src.java.Student("EQ-2499", "EQ-466", "Equipment ID: EQ-1609, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5832");
        src.java.Faculty faculty3 = new src.java.Faculty("Lab Manager", "Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5833");
        src.java.Student student3 = new src.java.Student("MANAGER-214492645", "EQ-1113", "");
        java.lang.String str4 = student3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5834");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        boolean boolean10 = student3.isapproved;
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5835");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        java.lang.String str4 = student3.username;
        student3.isapproved = true;
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5836");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5837");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-41");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("EQ-539", "EQ-628", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1811");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1261", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts33 = userFactory0.createUser("Equipment ID: EQ-1174, Name: , Description: , Location: , Status: null", "EQ-486", "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null", "EQ-2465");
        src.java.UserAccounts userAccounts38 = userFactory0.createUser("EQ-278", "EQ-1007", "EQ-4825", "Equipment ID: EQ-2527, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts24);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts33);
        org.junit.Assert.assertNull(userAccounts38);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5838");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-489", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getName();
        src.java.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        java.lang.Class<?> wildcardClass6 = equipmentStatus5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-489" + "'", str4, "EQ-489");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5839");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-2575, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-4458, Name: Equipment ID: EQ-1220, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-1058, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5840");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2146", "Equipment ID: EQ-1908, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-384");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5841");
        src.java.Guest guest3 = new src.java.Guest("EQ-2699", "Equipment ID: EQ-1272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1320");
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5842");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2280, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3696");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5843");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-558", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-1872");
        src.java.Microscope microscope7 = new src.java.Microscope("EQ-719", "EQ-39", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus8 = microscope7.getStatus();
        equipment3.setStatus(equipmentStatus8);
        org.junit.Assert.assertTrue("'" + equipmentStatus8 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus8.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5844");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-869", "Equipment ID: EQ-1033, Name: hi!, Description: , Location: hi!, Status: null", "EQ-355");
        java.lang.String str4 = researcher3.getAccountType();
        java.lang.String str5 = researcher3.getAccountType();
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5845");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-696, Name: , Description: , Location: , Status: null", "EQ-627", "EQ-1174");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-627" + "'", str4, "EQ-627");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5846");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE", "EQ-1637", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.username;
        researcher3.password = "EQ-4557";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1588, Name: EQ-263, Description: EQ-104, Location: EQ-486, Status: AVAILABLE");
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5847");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-263", "EQ-39", "EQ-258");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5848");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "", "hi!");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "EQ-253", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-368", "EQ-156", "EQ-63");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-264", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null", "EQ-598", "EQ-259");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-1624", "", "EQ-598");
        src.java.UserAccounts userAccounts35 = userFactory0.createUser("EQ-5203", "Equipment ID: EQ-4404, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-3683, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
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
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5849");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.isapproved = true;
        student3.password = "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5850");
        src.java.Microscope microscope3 = new src.java.Microscope("MasterAdmin123!", "Equipment ID: EQ-962, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "43) test5850(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5319" + "'", str4, "EQ-5319");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5851");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-2012", "EQ-2962", "EQ-2459", "EQ-1310");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-2012");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5852");
        src.java.Guest guest3 = new src.java.Guest("EQ-5280", "Equipment ID: EQ-2742, Name: Guest, Description: COORD-001, Location: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-1448, Name: EQ-413, Description: EQ-586, Location: Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5853");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-3145, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-4264", "Equipment ID: EQ-2497, Name: , Description: , Location: , Status: null");
        faculty3.isapproved = true;
        boolean boolean6 = faculty3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5854");
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
        java.lang.String str24 = microscope3.getName();
        java.lang.String str25 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5855");
        src.java.Researcher researcher3 = new src.java.Researcher("", "EQ-92", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.username = "";
        researcher3.needsapproval = false;
        researcher3.needsapproval = false;
        boolean boolean10 = researcher3.needsapproval;
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5856");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.toString();
        src.java.Microscope microscope8 = new src.java.Microscope("Equipment ID: EQ-1155, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-1717, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1036, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus9 = microscope8.getStatus();
        arduino3.setStatus(equipmentStatus9);
// flaky "44) test5856(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5329, Name: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-483, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5329, Name: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-483, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5857");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        boolean boolean13 = headLabCoordinator0.needsapproval;
        java.lang.String str14 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
// flaky "45) test5857(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5858");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3782, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3839, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2688, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5859");
        src.java.Student student3 = new src.java.Student("EQ-221", "EQ-449", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5860");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-5216", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-4669, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5861");
        src.java.Guest guest3 = new src.java.Guest("EQ-253", "EQ-284", "");
        java.lang.String str4 = guest3.getAccountType();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5862");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-304", "EQ-299");
        src.java.LabManager labManager16 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "46) test5862(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager16);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5863");
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
        java.lang.String str15 = microscope3.getName();
        java.lang.String str16 = microscope3.getName();
        java.lang.String str17 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "47) test5863(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5332, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-5332, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5864");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-4698", "", "EQ-688");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5865");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.toString();
        java.lang.String str13 = arduino3.getDescription();
        java.lang.String str14 = arduino3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "48) test5865(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-5333, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-5333, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "21) test5865(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-5333, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE" + "'", str14, "Equipment ID: EQ-5333, Name: Researcher, Description: hi!, Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5866");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = labManager9.password;
        double double11 = labManager9.getHourlyRate();
        java.lang.String str12 = labManager9.username;
        labManager9.username = "Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str12, "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5867");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-3750, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-903, Name: , Description: , Location: , Status: AVAILABLE", "EQ-435");
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5868");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-821, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-627", "EQ-4017");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5869");
        src.java.Guest guest3 = new src.java.Guest("", "EQ-193", "EQ-473");
        guest3.isapproved = false;
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5870");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null", "");
        java.lang.String str4 = student3.getAccountType();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5871");
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
        java.lang.String str13 = arduino3.getLocation();
        src.java.Equipment equipment17 = new src.java.Equipment("Student", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.Microscope microscope21 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus22 = null;
        microscope21.setStatus(equipmentStatus22);
        src.java.EquipmentStatus equipmentStatus24 = microscope21.getStatus();
        java.lang.String str25 = microscope21.toString();
        java.lang.String str26 = microscope21.getName();
        java.lang.String str27 = microscope21.getEquipmentId();
        java.lang.String str28 = microscope21.toString();
        java.lang.String str29 = microscope21.getEquipmentId();
        src.java.Arduino arduino33 = new src.java.Arduino("", "EQ-36", "EQ-92");
        src.java.Equipment equipment37 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str38 = equipment37.getEquipmentId();
        java.lang.String str39 = equipment37.getName();
        src.java.EquipmentStatus equipmentStatus40 = equipment37.getStatus();
        arduino33.setStatus(equipmentStatus40);
        microscope21.setStatus(equipmentStatus40);
        equipment17.setStatus(equipmentStatus40);
        arduino3.setStatus(equipmentStatus40);
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "49) test5871(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5341" + "'", str8, "EQ-5341");
// flaky "22) test5871(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-5341" + "'", str9, "EQ-5341");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus24);
// flaky "5) test5871(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equipment ID: EQ-5343, Name: , Description: , Location: , Status: null" + "'", str25, "Equipment ID: EQ-5343, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky "2) test5871(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EQ-5343" + "'", str27, "EQ-5343");
// flaky "2) test5871(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equipment ID: EQ-5343, Name: , Description: , Location: , Status: null" + "'", str28, "Equipment ID: EQ-5343, Name: , Description: , Location: , Status: null");
// flaky "1) test5871(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EQ-5343" + "'", str29, "EQ-5343");
// flaky "1) test5871(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EQ-5345" + "'", str38, "EQ-5345");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EQ-94" + "'", str39, "EQ-94");
        org.junit.Assert.assertTrue("'" + equipmentStatus40 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus40.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5872");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-4801", "EQ-3232", "EQ-5089");
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5873");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-368", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null");
        headLabCoordinator0.isapproved = false;
        src.java.LabManager labManager17 = headLabCoordinator0.autoGenerateLabManager("EQ-2670", "EQ-2121");
        java.lang.String str18 = headLabCoordinator0.password;
        java.lang.String str19 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Head Lab Coordinator" + "'", str19, "Head Lab Coordinator");
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5874");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getRegistrationId();
        researcher3.username = "Equipment ID: EQ-1242, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5875");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1745", "Equipment ID: EQ-869, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-5264, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5876");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("EQ-1180", "Equipment ID: EQ-920, Name: , Description: , Location: , Status: null");
        java.lang.String str12 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5877");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        boolean boolean11 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-246");
        java.lang.String str15 = headLabCoordinator0.password;
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        java.lang.String str17 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5878");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        java.lang.String str6 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5879");
        src.java.Guest guest3 = new src.java.Guest("EQ-2684", "Equipment ID: EQ-2465, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-3535");
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5880");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-152");
        java.lang.String str4 = equipment3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5881");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "EQ-281");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        src.java.Arduino arduino8 = new src.java.Arduino("MANAGER-0", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        java.lang.String str9 = arduino8.toString();
        src.java.EquipmentStatus equipmentStatus10 = arduino8.getStatus();
        microscope3.setStatus(equipmentStatus10);
        src.java.EquipmentStatus equipmentStatus12 = microscope3.getStatus();
        java.lang.String str13 = microscope3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus14 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = microscope3.isAvailable(localDateTime15, localDateTime16);
        src.java.Equipment equipment21 = new src.java.Equipment("EQ-106", "hi!", "EQ-74");
        src.java.EquipmentStatus equipmentStatus22 = equipment21.getStatus();
        microscope3.setStatus(equipmentStatus22);
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "50) test5881(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-5349, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-5349, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "23) test5881(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-5348" + "'", str13, "EQ-5348");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus22 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus22.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5882");
        src.java.Microscope microscope3 = new src.java.Microscope("", "EQ-2996", "EQ-2962");
        src.java.Equipment equipment7 = new src.java.Equipment("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        java.lang.String str8 = equipment7.getName();
        src.java.Equipment equipment12 = new src.java.Equipment("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        java.lang.String str13 = equipment12.getLocation();
        src.java.Microscope microscope17 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str18 = microscope17.getName();
        java.lang.String str19 = microscope17.getDescription();
        src.java.EquipmentStatus equipmentStatus20 = null;
        microscope17.setStatus(equipmentStatus20);
        java.lang.String str22 = microscope17.getEquipmentId();
        src.java.Microscope microscope26 = new src.java.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino30 = new src.java.Arduino("COORD-001", "Researcher", "COORD-001");
        src.java.Microscope microscope34 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str35 = microscope34.getName();
        java.lang.String str36 = microscope34.getLocation();
        src.java.EquipmentStatus equipmentStatus37 = microscope34.getStatus();
        arduino30.setStatus(equipmentStatus37);
        microscope26.setStatus(equipmentStatus37);
        src.java.Arduino arduino43 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = arduino43.isAvailable(localDateTime44, localDateTime45);
        java.lang.String str47 = arduino43.getDescription();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = arduino43.isAvailable(localDateTime48, localDateTime49);
        src.java.EquipmentStatus equipmentStatus51 = arduino43.getStatus();
        microscope26.setStatus(equipmentStatus51);
        microscope17.setStatus(equipmentStatus51);
        equipment12.setStatus(equipmentStatus51);
        equipment7.setStatus(equipmentStatus51);
        microscope3.setStatus(equipmentStatus51);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-39" + "'", str13, "EQ-39");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky "51) test5882(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EQ-5354" + "'", str22, "EQ-5354");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus37 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus37.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MasterAdmin123!" + "'", str47, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus51 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus51.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5883");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
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
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5884");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-4364, Name: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null, Description: EQ-39, Location: Equipment ID: EQ-177, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-2623", "Equipment ID: EQ-3134, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-2623" + "'", str4, "EQ-2623");
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5885");
        src.java.Student student3 = new src.java.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-179" + "'", str7, "EQ-179");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5886");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-4849, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-2903, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        java.lang.String str10 = microscope7.getName();
        java.lang.String str11 = microscope7.getName();
        src.java.EquipmentStatus equipmentStatus12 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus12 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus12.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5887");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-5264, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE", "EQ-5131", "EQ-1808", "Equipment ID: EQ-3797, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-5264, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5888");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        java.lang.String str5 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = microscope3.isAvailable(localDateTime6, localDateTime7);
        java.lang.String str9 = microscope3.getDescription();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5889");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getAccountType();
        boolean boolean5 = guest3.isapproved;
        java.lang.String str6 = guest3.getAccountType();
        guest3.password = "Equipment ID: EQ-754, Name: , Description: , Location: , Status: null";
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5890");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-4594, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-835", "EQ-3696");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5891");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5892");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39", "");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-719", "EQ-120", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-3145", "Equipment ID: EQ-2817, Name: MANAGER-103232, Description: Equipment ID: EQ-495, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-257, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-640", "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass32 = userFactory0.getClass();
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts22);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5893");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        boolean boolean4 = headLabCoordinator0.isapproved;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-275");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5894");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        java.lang.String str4 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5895");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.needsapproval = false;
        boolean boolean8 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5896");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1942, Name: EQ-826, Description: Equipment ID: EQ-1320, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Location: Equipment ID: EQ-1514, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        labManager10.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5897");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-3908", "EQ-193", "Equipment ID: EQ-5131, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2692, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-3908");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5898");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-974, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-1784", "");
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5899");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
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
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5900");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "";
        java.lang.String str6 = guest3.getAccountType();
        guest3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5901");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-296", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "EQ-106");
        java.lang.String str4 = arduino3.getName();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = arduino3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-296" + "'", str4, "EQ-296");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5902");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE", "EQ-758", "EQ-5131");
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5903");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5904");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-944, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-1658, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.isapproved = false;
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5905");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-71", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "52) test5905(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5368" + "'", str4, "EQ-5368");
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5906");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-221", "EQ-2375");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5907");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5908");
        src.java.Researcher researcher3 = new src.java.Researcher("Guest", "EQ-799", "EQ-120");
        java.lang.String str4 = researcher3.username;
        boolean boolean5 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5909");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5910");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null", "EQ-2001", "EQ-1643", "EQ-3746");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3457, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5911");
        src.java.Guest guest3 = new src.java.Guest("EQ-1502", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1979, Name: Equipment ID: EQ-112, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE, Status: AVAILABLE");
        guest3.password = "Equipment ID: EQ-2905, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5912");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-590", "EQ-684", "Equipment ID: EQ-831, Name: , Description: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str8 = equipment7.getName();
        src.java.EquipmentStatus equipmentStatus9 = equipment7.getStatus();
        microscope3.setStatus(equipmentStatus9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-71" + "'", str8, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5913");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.username = "EQ-535";
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5914");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str11 = labManager10.getAccountType();
        boolean boolean12 = labManager10.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lab Manager" + "'", str11, "Lab Manager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5915");
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
        java.lang.String str17 = microscope3.toString();
        java.lang.String str18 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = microscope3.isAvailable(localDateTime19, localDateTime20);
        java.lang.String str22 = microscope3.getEquipmentId();
        java.lang.String str23 = microscope3.getEquipmentId();
        java.lang.String str24 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "53) test5915(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-5372" + "'", str10, "EQ-5372");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "24) test5915(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equipment ID: EQ-5372, Name: , Description: , Location: , Status: null" + "'", str17, "Equipment ID: EQ-5372, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "6) test5915(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EQ-5372" + "'", str22, "EQ-5372");
// flaky "3) test5915(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EQ-5372" + "'", str23, "EQ-5372");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5916");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-205");
        headLabCoordinator0.username = "";
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-1781, Name: , Description: , Location: , Status: null", "EQ-2532");
        headLabCoordinator0.username = "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE";
        java.lang.String str16 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager19 = headLabCoordinator0.autoGenerateLabManager("", "EQ-982");
        labManager19.username = "Equipment ID: EQ-4051, Name: Student, Description: Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-183, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5917");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-1087176903", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-1087176903" + "'", str4, "MANAGER-1087176903");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5918");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("MANAGER-0", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str16 = headLabCoordinator0.password;
        java.lang.String str17 = headLabCoordinator0.username;
        java.lang.String str18 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str16, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Head Lab Coordinator" + "'", str18, "Head Lab Coordinator");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5919");
        src.java.Student student3 = new src.java.Student("EQ-5154", "", "EQ-3119");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5920");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5921");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("EQ-106", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null", "EQ-263", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts28 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-1163, Name: , Description: , Location: , Status: null", "EQ-301", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts32 = userFactory0.createUser("EQ-552", "EQ-978", "EQ-1219");
        src.java.UserAccounts userAccounts36 = userFactory0.createUser("Equipment ID: EQ-1969, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE", "EQ-1098", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts40 = userFactory0.createUser("Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-3220, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-565");
        src.java.UserAccounts userAccounts45 = userFactory0.createUser("EQ-3908", "Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-2167, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts28);
        org.junit.Assert.assertNull(userAccounts32);
        org.junit.Assert.assertNull(userAccounts36);
        org.junit.Assert.assertNull(userAccounts40);
        org.junit.Assert.assertNull(userAccounts45);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5922");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-94", "COORD-001", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-2499, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-1711025779", "EQ-2682", "EQ-2895");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-5338, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-3764, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5923");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1864, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-3567, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-3567, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-3567, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5924");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.username = "EQ-4018";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5925");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1735, Name: EQ-104, Description: MasterAdmin123!, Location: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-559");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5926");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-4445, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "Equipment ID: EQ-3683, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE", "EQ-296");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-296" + "'", str4, "EQ-296");
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5927");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-2692, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1904, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-3346");
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5928");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-2682, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-4099", "Equipment ID: EQ-1908, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5929");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getName();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        src.java.Microscope microscope12 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str13 = microscope12.getDescription();
        java.lang.String str14 = microscope12.getLocation();
        java.lang.String str15 = microscope12.getName();
        src.java.Microscope microscope19 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = microscope19.isAvailable(localDateTime20, localDateTime21);
        src.java.EquipmentStatus equipmentStatus23 = microscope19.getStatus();
        microscope12.setStatus(equipmentStatus23);
        src.java.EquipmentStatus equipmentStatus25 = microscope12.getStatus();
        src.java.EquipmentStatus equipmentStatus26 = microscope12.getStatus();
        src.java.EquipmentStatus equipmentStatus27 = microscope12.getStatus();
        arduino3.setStatus(equipmentStatus27);
        src.java.EquipmentStatus equipmentStatus29 = arduino3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COORD-001" + "'", str13, "COORD-001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str14, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus23 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus23.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus25 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus25.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus26 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus26.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus29 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus29.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5930");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-1157, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-3201", "EQ-5162");
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5931");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = microscope3.isAvailable(localDateTime10, localDateTime11);
        src.java.EquipmentStatus equipmentStatus13 = microscope3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "54) test5931(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-5380, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-5380, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "25) test5931(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-5380" + "'", str9, "EQ-5380");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(equipmentStatus13);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5932");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-442");
        java.lang.String str4 = faculty3.password;
        boolean boolean5 = faculty3.isapproved;
        java.lang.String str6 = faculty3.getAccountType();
        boolean boolean7 = faculty3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5933");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-2343, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "EQ-2465", "EQ-451");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5934");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2460", "", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5935");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5936");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-4728", "Equipment ID: EQ-2770, Name: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Description: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Location: , Status: AVAILABLE", "EQ-1364");
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5937");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Researcher", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5938");
        src.java.Equipment equipment3 = new src.java.Equipment("MANAGER-66180900", "EQ-355", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null");
        src.java.Equipment equipment7 = new src.java.Equipment("EQ-341", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-246");
        java.lang.String str8 = equipment7.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus9 = equipment7.getStatus();
        equipment3.setStatus(equipmentStatus9);
// flaky "55) test5938(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5383" + "'", str8, "EQ-5383");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5939");
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
        java.lang.String str36 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "56) test5939(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EQ-5384" + "'", str36, "EQ-5384");
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5940");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1554", "", "EQ-869");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5941");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-99", "EQ-104");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5942");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-333", "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-750, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "EQ-1530", "Equipment ID: EQ-1800, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-4316", "EQ-4315", "Equipment ID: EQ-2024, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-1370, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5943");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.needsapproval;
        java.lang.String str10 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str13 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COORD-001" + "'", str13, "COORD-001");
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5944");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-4393", "Equipment ID: EQ-5361, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-1938, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-4393");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5945");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null", "EQ-1557");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.getDescription();
// flaky "57) test5945(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5390, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null, Location: EQ-1557, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5390, Name: Equipment ID: EQ-2483, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE, Description: Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null, Location: EQ-1557, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-1664, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5946");
        src.java.Student student3 = new src.java.Student("EQ-539", "EQ-569", "EQ-392");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-539" + "'", str6, "EQ-539");
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5947");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-1280", "Equipment ID: EQ-813, Name: , Description: , Location: , Status: null", "EQ-209");
        faculty3.needsapproval = false;
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5948");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        boolean boolean4 = researcher3.needsapproval;
        java.lang.String str5 = researcher3.getAccountType();
        researcher3.password = "EQ-1150";
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        boolean boolean10 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5949");
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
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
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
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5950");
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
        java.lang.String str47 = microscope3.getDescription();
        java.lang.String str48 = microscope3.getDescription();
// flaky "58) test5950(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-5392" + "'", str8, "EQ-5392");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "26) test5950(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equipment ID: EQ-5393, Name: hi!, Description: , Location: hi!, Status: null" + "'", str19, "Equipment ID: EQ-5393, Name: hi!, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus27 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus27.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MasterAdmin123!" + "'", str35, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus42 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus42.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EQ-131" + "'", str47, "EQ-131");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EQ-131" + "'", str48, "EQ-131");
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5951");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-4041, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-5020", "EQ-5155");
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5952");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "EQ-368", "EQ-859");
        java.lang.String str4 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5953");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-1940", "EQ-422", "EQ-1162");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1162" + "'", str4, "EQ-1162");
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5954");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-539", "EQ-131", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5955");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-3246, Name: Equipment ID: EQ-350, Name: , Description: , Location: , Status: null, Description: EQ-120, Location: EQ-264, Status: AVAILABLE", "Equipment ID: EQ-1643, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-3755, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5956");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-99", "Researcher", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("MANAGER-214492645", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-1000", "EQ-627", "Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-4316", "Equipment ID: EQ-937, Name: , Description: , Location: , Status: null", "EQ-5055", "Equipment ID: EQ-5361, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5957");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.password = "COORD-001";
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5958");
        src.java.Faculty faculty3 = new src.java.Faculty("", "", "EQ-75");
        faculty3.needsapproval = true;
        faculty3.password = "Equipment ID: EQ-2271, Name: Student, Description: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Status: AVAILABLE";
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5959");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        headLabCoordinator0.needsapproval = true;
        java.lang.String str8 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.needsapproval = false;
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5960");
        src.java.Student student3 = new src.java.Student("EQ-104", "Guest", "");
        student3.isapproved = false;
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isapproved;
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5961");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.isapproved;
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.password;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.getRegistrationId();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        boolean boolean11 = headLabCoordinator0.isapproved;
        java.lang.String str12 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "COORD-001" + "'", str9, "COORD-001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5962");
        src.java.Guest guest3 = new src.java.Guest("EQ-1841", "EQ-486", "Equipment ID: EQ-2886, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5963");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-2466", "EQ-5191", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5964");
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
        src.java.EquipmentStatus equipmentStatus13 = microscope3.getStatus();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "59) test5964(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-5399, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-5399, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(equipmentStatus13);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5965");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-2861", "EQ-4246", "EQ-3900");
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5966");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5967");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        java.lang.String str4 = headLabCoordinator0.username;
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        double double8 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5968");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        boolean boolean1 = headLabCoordinator0.isapproved;
        java.lang.String str2 = headLabCoordinator0.password;
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str2, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5969");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-1462", "EQ-3231", "EQ-4373");
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5970");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-242", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "60) test5970(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-5402" + "'", str4, "EQ-5402");
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5971");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1146, Name: , Description: , Location: , Status: null", "EQ-630", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5972");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-264");
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-2556, Name: Equipment ID: EQ-696, Name: , Description: , Location: , Status: null, Description: EQ-627, Location: EQ-1174, Status: AVAILABLE", "EQ-1434");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5973");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("", "EQ-731", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "EQ-802");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-507", "Equipment ID: EQ-1994, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("EQ-5049", "EQ-2935", "Equipment ID: EQ-5291, Name: Equipment ID: EQ-3862, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE, Description: EQ-1434, Location: Equipment ID: EQ-2569, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5974");
        src.java.Student student3 = new src.java.Student("EQ-2317", "EQ-4498", "EQ-4625");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5975");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.password = "Researcher";
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = false;
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("EQ-1747", "Equipment ID: EQ-4067, Name: Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5976");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE", "Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.toString();
// flaky "61) test5976(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-5403, Name: Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE, Description: Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-315, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-5403, Name: Equipment ID: EQ-3165, Name: , Description: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE, Description: Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Location: Equipment ID: EQ-315, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5977");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-4722, Name: , Description: , Location: , Status: null", "EQ-758", "EQ-3426");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5978");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-2143", "EQ-92", "EQ-2682");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5979");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        boolean boolean4 = headLabCoordinator0.needsapproval;
        java.lang.String str5 = headLabCoordinator0.password;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-684", "Equipment ID: EQ-2590, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Researcher" + "'", str1, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5980");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-1446", "Equipment ID: EQ-2931, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-1524");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-3120, Name: EQ-264, Description: Student, Location: Equipment ID: EQ-250, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5981");
        src.java.Arduino arduino3 = new src.java.Arduino("COORD-001", "Researcher", "COORD-001");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getDescription();
        java.lang.String str13 = arduino3.toString();
        src.java.EquipmentStatus equipmentStatus14 = arduino3.getStatus();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = arduino3.isAvailable(localDateTime15, localDateTime16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
// flaky "62) test5981(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-5406, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE" + "'", str13, "Equipment ID: EQ-5406, Name: COORD-001, Description: Researcher, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5982");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "EQ-560", "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getAccountType();
        researcher3.password = "EQ-764";
        researcher3.password = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5983");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-104", "MasterAdmin123!", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getDescription();
        java.lang.String str5 = equipment3.getDescription();
        src.java.Microscope microscope9 = new src.java.Microscope("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-209", "EQ-71");
        java.lang.String str10 = microscope9.getLocation();
        src.java.EquipmentStatus equipmentStatus11 = microscope9.getStatus();
        equipment3.setStatus(equipmentStatus11);
        java.lang.String str13 = equipment3.getLocation();
        java.lang.String str14 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-71" + "'", str10, "EQ-71");
        org.junit.Assert.assertTrue("'" + equipmentStatus11 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus11.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
// flaky "63) test5983(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-5408" + "'", str14, "EQ-5408");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5984");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.password = "EQ-1248";
        java.lang.String str13 = headLabCoordinator0.getAccountType();
        java.lang.String str14 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Head Lab Coordinator" + "'", str13, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Head Lab Coordinator" + "'", str14, "Head Lab Coordinator");
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5985");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-4888", "EQ-5008", "EQ-5158");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5986");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        headLabCoordinator0.password = "COORD-001";
        src.java.LabManager labManager14 = headLabCoordinator0.autoGenerateLabManager("EQ-382", "EQ-380");
        boolean boolean15 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager18 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-2091, Name: MANAGER-0, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: hi!, Status: AVAILABLE");
        boolean boolean19 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager22 = headLabCoordinator0.autoGenerateLabManager("EQ-1792", "EQ-3022");
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
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5987");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-1630, Name: , Description: , Location: , Status: null", "EQ-1918", "Researcher");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5988");
        src.java.Student student3 = new src.java.Student("EQ-39", "EQ-179", "MANAGER-66180900");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.needsapproval;
        java.lang.String str6 = student3.getAccountType();
        student3.needsapproval = true;
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-179" + "'", str10, "EQ-179");
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5989");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-99");
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        java.lang.String str11 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5990");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-513, Name: , Description: , Location: , Status: null";
        java.lang.String str11 = guest3.password;
        guest3.password = "EQ-4974";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str11, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5991");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-427", "EQ-5218", "");
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5992");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.password = "Equipment ID: EQ-4496, Name: EQ-784, Description: EQ-325, Location: EQ-451, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5993");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-389");
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-3656, Name: , Description: , Location: , Status: null", "EQ-2342");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5994");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        boolean boolean12 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5995");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus12 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "64) test5995(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-5412" + "'", str10, "EQ-5412");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(equipmentStatus12);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5996");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getLocation();
        src.java.Microscope microscope8 = new src.java.Microscope("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "EQ-39", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus9 = microscope8.getStatus();
        microscope3.setStatus(equipmentStatus9);
        java.lang.String str11 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus9 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus9.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "65) test5996(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-5413, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str11, "Equipment ID: EQ-5413, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5997");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "66) test5997(src.test.randoop.AleenaTest11)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-5415, Name: Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-5415, Name: Equipment ID: EQ-1790, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-2112, Name: hi!, Description: , Location: hi!, Status: null, Location: Equipment ID: EQ-1279, Name: MANAGER-66180900, Description: EQ-355, Location: Equipment ID: EQ-614, Name: , Description: , Location: , Status: null, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5998");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-1491, Name: , Description: , Location: , Status: null", "EQ-1670", "EQ-422");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test5999");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        java.lang.String str11 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str14 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.username = "Equipment ID: EQ-3763, Name: EQ-98, Description: EQ-120, Location: EQ-106, Status: AVAILABLE";
        java.lang.String str17 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COORD-001" + "'", str14, "COORD-001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Head Lab Coordinator" + "'", str17, "Head Lab Coordinator");
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest11.test6000");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = false;
        java.lang.Class<?> wildcardClass11 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}
