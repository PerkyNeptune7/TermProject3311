package src.test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0001");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        java.lang.Class<?> wildcardClass1 = equipmentFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0002");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("hi!", "MasterAdmin123!", "", "Head Lab Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0003");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.Class<?> wildcardClass5 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0004");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("MasterAdmin123!", "Guest", "MasterAdmin123!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: MasterAdmin123!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0005");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0006");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        java.lang.Class<?> wildcardClass17 = userAccounts16.getClass();
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0007");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0008");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope3.setStatus(equipmentStatus8);
        java.lang.Class<?> wildcardClass10 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0009");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0010");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Guest", "COORD-001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0011");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Researcher", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0012");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0013");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "Head Lab Coordinator");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0014");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0015");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.Class<?> wildcardClass8 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0016");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-41", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-36", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-41");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0017");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0018");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.Class<?> wildcardClass6 = microscope3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0019");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.username = "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.Class<?> wildcardClass9 = labManager3.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0020");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0021");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        java.lang.String str17 = userAccounts16.getAccountType();
        java.lang.String str18 = userAccounts16.username;
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "COORD-001" + "'", str18, "COORD-001");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0022");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.Class<?> wildcardClass6 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0023");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.Class<?> wildcardClass9 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0024");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        boolean boolean10 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0025");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Guest", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0026");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("", "Faculty", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-39");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0027");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0028");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0029");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.Class<?> wildcardClass4 = microscope3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0030");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        boolean boolean7 = researcher3.isapproved;
        java.lang.String str8 = researcher3.getRegistrationId();
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0031");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "MANAGER-66180900", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0032");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0033");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-75", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-74");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0034");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        java.lang.Class<?> wildcardClass6 = arduino3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0035");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-98", "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0036");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0037");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.Class<?> wildcardClass6 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0038");
        src.java.Researcher researcher3 = new src.java.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.username;
        java.lang.Class<?> wildcardClass5 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0039");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass13 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0040");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.Class<?> wildcardClass6 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0041");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63", "EQ-98", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0042");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("hi!", "EQ-71", "Faculty", "EQ-114");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0043");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-94", "EQ-120", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-94");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0044");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-92", "MANAGER-0", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0045");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-114", "EQ-71");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0046");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("MasterAdmin123!", "Faculty", "MANAGER-66180900", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: MasterAdmin123!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0047");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "", "EQ-104", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0048");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "COORD-001", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0049");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Guest";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0050");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getLocation();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = microscope3.isAvailable(localDateTime6, localDateTime7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0051");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-41", "EQ-104", "");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0052");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-98", "EQ-36");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0053");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        boolean boolean7 = labManager3.needsapproval;
        boolean boolean8 = labManager3.needsapproval;
        labManager3.username = "EQ-152";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0054");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-98", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-156", "MANAGER-0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-98");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0055");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        researcher3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0056");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0057");
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
        java.lang.String str20 = arduino3.getName();
        org.junit.Assert.assertNull(equipmentStatus10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null" + "'", str20, "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0058");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0059");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-39");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0060");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "", "EQ-94", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-113, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0061");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-94", "COORD-001", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("EQ-131", "EQ-118", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0062");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-92", "", "EQ-36", "EQ-104");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-92");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0063");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        labManager3.password = "EQ-75";
        double double12 = labManager3.getHourlyRate();
        labManager3.username = "hi!";
        java.lang.String str15 = labManager3.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-75" + "'", str15, "EQ-75");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0064");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator", "EQ-152");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0065");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0066");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0067");
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
        java.lang.String str15 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "1) test0067(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0068");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-149", "COORD-001", "Researcher");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0069");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        labManager3.password = "EQ-75";
        double double12 = labManager3.getHourlyRate();
        labManager3.isapproved = false;
        java.lang.Class<?> wildcardClass15 = labManager3.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0070");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-211, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MANAGER-66180900");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0071");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "EQ-156");
        labManager13.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0072");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-98", "COORD-001", "Guest", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-98");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0073");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getName();
// flaky "2) test0073(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "1) test0073(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "1) test0073(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str9, "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0074");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass2 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0075");
        src.java.Researcher researcher3 = new src.java.Researcher("Researcher", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.username;
        researcher3.password = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0076");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-94", "EQ-149");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0077");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        guest3.needsapproval = true;
        java.lang.Class<?> wildcardClass6 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0078");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-149", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "MANAGER-66180900", "EQ-114");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-149");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0079");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-75", "EQ-114");
        faculty3.needsapproval = false;
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0080");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-39", "Faculty", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0081");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0082");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        boolean boolean6 = researcher3.needsapproval;
        boolean boolean7 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0083");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        java.lang.Class<?> wildcardClass11 = userFactory0.getClass();
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0084");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getDescription();
        java.lang.String str6 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
// flaky "3) test0084(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-258" + "'", str6, "EQ-258");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0085");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        src.java.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        src.java.Equipment equipment11 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str12 = equipment11.getDescription();
        src.java.EquipmentStatus equipmentStatus13 = equipment11.getStatus();
        microscope3.setStatus(equipmentStatus13);
        java.lang.String str15 = microscope3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus13 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus13.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "4) test0085(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EQ-259" + "'", str15, "EQ-259");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0086");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Faculty", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0087");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = equipment3.isAvailable(localDateTime5, localDateTime6);
// flaky "5) test0087(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-263" + "'", str4, "EQ-263");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0088");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("MANAGER-0", "EQ-209", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: MANAGER-0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0089");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0090");
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
        java.lang.String str22 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus19 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus19.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0091");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        boolean boolean5 = headLabCoordinator0.needsapproval;
        java.lang.Class<?> wildcardClass6 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "6) test0091(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "2) test0091(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0092");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0093");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-221", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Head Lab Coordinator", "EQ-41");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-221");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0094");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Lab Manager", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-284");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts16);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0095");
        src.java.Student student3 = new src.java.Student("", "EQ-98", "EQ-94");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0096");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass4 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0097");
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
        java.lang.Class<?> wildcardClass15 = microscope3.getClass();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "7) test0097(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-296" + "'", str10, "EQ-296");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0098");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        boolean boolean6 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0099");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean13 = labManager12.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "8) test0099(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0100");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = microscope3.isAvailable(localDateTime4, localDateTime5);
        src.java.EquipmentStatus equipmentStatus7 = microscope3.getStatus();
        java.lang.Class<?> wildcardClass8 = equipmentStatus7.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0101");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean4 = researcher3.needsapproval;
        researcher3.password = "EQ-209";
        java.lang.String str7 = researcher3.getAccountType();
        boolean boolean8 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0102");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-71", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Researcher");
        java.lang.String str4 = equipment3.getName();
        java.lang.String str5 = equipment3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-71" + "'", str4, "EQ-71");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-71" + "'", str5, "EQ-71");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0103");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-75", "EQ-114");
        faculty3.needsapproval = false;
        java.lang.String str6 = faculty3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EQ-114" + "'", str6, "EQ-114");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0104");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0105");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-104", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager9.username = "Guest";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0106");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        boolean boolean7 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0107");
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
        java.lang.Class<?> wildcardClass16 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0108");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "EQ-63");
        java.lang.String str4 = equipment3.toString();
        java.lang.String str5 = equipment3.toString();
        java.lang.Class<?> wildcardClass6 = equipment3.getClass();
// flaky "9) test0108(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
// flaky "3) test0108(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0109");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        boolean boolean7 = student3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0110");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-242", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0111");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.password;
        researcher3.username = "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        boolean boolean11 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0112");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        boolean boolean6 = researcher3.isapproved;
        researcher3.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        researcher3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0113");
        src.java.Guest guest3 = new src.java.Guest("hi!", "EQ-242", "Faculty");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0114");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        java.lang.Class<?> wildcardClass1 = userFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0115");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getEquipmentId();
// flaky "10) test0115(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-341" + "'", str4, "EQ-341");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0116");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0117");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0118");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-36", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-278");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0119");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino7 = new src.java.Arduino("COORD-001", "Researcher", "COORD-001");
        src.java.Microscope microscope11 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        arduino7.setStatus(equipmentStatus14);
        microscope3.setStatus(equipmentStatus14);
        java.lang.String str17 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0120");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0121");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        boolean boolean3 = headLabCoordinator0.needsapproval;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        boolean boolean5 = headLabCoordinator0.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0122");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getRegistrationId();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MasterAdmin123!" + "'", str5, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0123");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0124");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0125");
        src.java.Guest guest3 = new src.java.Guest("EQ-75", "EQ-74", "EQ-92");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0126");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-94", "COORD-001", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("MasterAdmin123!", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-222", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-183, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-250, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-335, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0127");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.username;
        boolean boolean5 = researcher3.isapproved;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0128");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        java.lang.String str8 = labManager3.password;
        java.lang.String str9 = labManager3.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0129");
        src.java.Arduino arduino3 = new src.java.Arduino("Student", "Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0130");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-257", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-118");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0131");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0132");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "11) test0132(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0133");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "EQ-179", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0134");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = labManager3.username;
        boolean boolean5 = labManager3.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0135");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-179", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-304");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-179");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0136");
        src.java.Faculty faculty3 = new src.java.Faculty("Guest", "EQ-156", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0137");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "EQ-39", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0138");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "12) test0138(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0139");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        double double5 = researcher3.getHourlyRate();
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0140");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-39");
        faculty3.isapproved = false;
        faculty3.username = "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0141");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-361", "EQ-41", "Lab Manager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0142");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        java.lang.String str6 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0143");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "hi!", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "13) test0143(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0144");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-242", "Lab Manager");
        java.lang.String str4 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-242" + "'", str4, "EQ-242");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0145");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        labManager3.password = "EQ-75";
        java.lang.String str12 = labManager3.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MANAGER-103232" + "'", str12, "MANAGER-103232");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0146");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = microscope3.getName();
// flaky "14) test0146(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0147");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Student", "EQ-179", "", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Student");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0148");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getName();
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0149");
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
        java.lang.String str13 = arduino3.getEquipmentId();
        java.lang.String str14 = arduino3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "15) test0149(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-413" + "'", str8, "EQ-413");
// flaky "4) test0149(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-413" + "'", str9, "EQ-413");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "2) test0149(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-413" + "'", str13, "EQ-413");
// flaky "1) test0149(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null" + "'", str14, "Equipment ID: EQ-413, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0150");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        java.lang.String str8 = guest3.getAccountType();
        boolean boolean9 = guest3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0151");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-284", "EQ-386", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0152");
        src.java.Equipment equipment3 = new src.java.Equipment("", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0153");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-120", "EQ-41");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0154");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getEquipmentId();
// flaky "16) test0154(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-422" + "'", str4, "EQ-422");
// flaky "5) test0154(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-422" + "'", str5, "EQ-422");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0155");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass10 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0156");
        src.java.Equipment equipment3 = new src.java.Equipment("", "EQ-390", "MANAGER-0");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0157");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = false;
        src.java.LabManager labManager15 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager15);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0158");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-39", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0159");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.Class<?> wildcardClass9 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0160");
        src.java.Student student3 = new src.java.Student("COORD-001", "MasterAdmin123!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getRegistrationId();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0161");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0162");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-118", "EQ-75", "MANAGER-66180900");
        java.lang.String str4 = equipment3.getName();
        java.lang.Class<?> wildcardClass5 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-118" + "'", str4, "EQ-118");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0163");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.getLocation();
        java.lang.String str11 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "17) test0163(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-443, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-443, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0164");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Researcher", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0165");
        src.java.Guest guest3 = new src.java.Guest("EQ-368", "EQ-264", "EQ-413");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0166");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Faculty", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0167");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getEquipmentId();
        java.lang.String str10 = microscope3.getDescription();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "18) test0167(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "6) test0167(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-466" + "'", str9, "EQ-466");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0168");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-257", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-71");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0169");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-361", "EQ-335", "EQ-341", "EQ-242");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-361");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0170");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Student", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Guest");
        src.java.UserAccounts userAccounts15 = userFactory0.createUser("", "EQ-263", "EQ-264", "EQ-301");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts15);
        org.junit.Assert.assertNull(userAccounts19);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0171");
        src.java.Guest guest3 = new src.java.Guest("Head Lab Coordinator", "hi!", "Head Lab Coordinator");
        guest3.needsapproval = true;
        java.lang.String str6 = guest3.getAccountType();
        boolean boolean7 = guest3.isapproved;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0172");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-106", "EQ-41", "EQ-193", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-106");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0173");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-98", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "EQ-384");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0174");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-106", "EQ-209");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0175");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "EQ-99");
        java.lang.String str10 = labManager9.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-99" + "'", str10, "EQ-99");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0176");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "");
        guest3.password = "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = guest3.getAccountType();
        guest3.needsapproval = false;
        java.lang.Class<?> wildcardClass9 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0177");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        double double11 = labManager10.getHourlyRate();
        double double12 = labManager10.getHourlyRate();
        labManager10.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0178");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Researcher", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0179");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getRegistrationId();
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0180");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.Class<?> wildcardClass8 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0181");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getDescription();
        java.lang.String str9 = microscope3.toString();
        java.lang.String str10 = microscope3.toString();
        java.lang.String str11 = microscope3.getDescription();
        java.lang.String str12 = microscope3.getEquipmentId();
// flaky "19) test0181(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "7) test0181(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "3) test0181(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str9, "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
// flaky "2) test0181(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str10, "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "1) test0181(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ-486" + "'", str12, "EQ-486");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0182");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-131", "EQ-98");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0183");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-205", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-212, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0184");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0185");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        double double10 = headLabCoordinator0.getHourlyRate();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "20) test0185(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0186");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-325", "EQ-253", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0187");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-193", "Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-232, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-193");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0188");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-278");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0189");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Student", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        student3.isapproved = false;
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0190");
        src.java.Arduino arduino3 = new src.java.Arduino("", "EQ-469", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0191");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "COORD-001", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-94", "COORD-001", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts22 = userFactory0.createUser("Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-461", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts22);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0192");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-39");
        faculty3.isapproved = false;
        double double6 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0193");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        labManager3.needsapproval = false;
        java.lang.Class<?> wildcardClass9 = labManager3.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0194");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-236", "MANAGER-66180900");
        java.lang.String str4 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-236" + "'", str4, "EQ-236");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0195");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.needsapproval = true;
        boolean boolean6 = researcher3.isapproved;
        researcher3.needsapproval = false;
        java.lang.Class<?> wildcardClass9 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0196");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null", "EQ-209");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0197");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getName();
        java.lang.Class<?> wildcardClass6 = equipment3.getClass();
// flaky "21) test0197(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-509" + "'", str4, "EQ-509");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-94" + "'", str5, "EQ-94");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0198");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-281", "Equipment ID: EQ-113, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-281");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0199");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.String str9 = headLabCoordinator0.getAccountType();
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("", "Researcher");
        boolean boolean14 = labManager13.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "22) test0199(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
// flaky "8) test0199(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0200");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-371", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-371");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0201");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.username = "EQ-63";
        java.lang.Class<?> wildcardClass10 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0202");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0203");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "Guest", "EQ-41");
        boolean boolean4 = faculty3.isapproved;
        faculty3.password = "EQ-74";
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0204");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-489", "", "EQ-390", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-489");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0205");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "23) test0205(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
// flaky "9) test0205(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0206");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope3.setStatus(equipmentStatus8);
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0207");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        java.lang.String str4 = arduino3.toString();
        java.lang.String str5 = arduino3.getLocation();
// flaky "24) test0207(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0208");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass10 = labManager9.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "25) test0208(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0209");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0210");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        java.lang.String str10 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.isapproved = true;
        java.lang.Class<?> wildcardClass13 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "COORD-001" + "'", str10, "COORD-001");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0211");
        src.java.Student student3 = new src.java.Student("MasterAdmin123!", "", "Equipment ID: EQ-381, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0212");
        src.java.Faculty faculty3 = new src.java.Faculty("", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-41");
        java.lang.String str4 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0213");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-222", "Guest", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0214");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-281", "EQ-63");
        labManager8.password = "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0215");
        src.java.Student student3 = new src.java.Student("EQ-258", "EQ-92", "EQ-299");
        boolean boolean4 = student3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0216");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "EQ-253", "EQ-75");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0217");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        java.lang.String str10 = labManager3.getAccountType();
        java.lang.Class<?> wildcardClass11 = labManager3.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lab Manager" + "'", str10, "Lab Manager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0218");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-275", "EQ-259", "EQ-253");
        boolean boolean4 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0219");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "26) test0219(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-547" + "'", str4, "EQ-547");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0220");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus5 = microscope3.getStatus();
// flaky "27) test0220(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0221");
        src.java.Microscope microscope3 = new src.java.Microscope("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getEquipmentId();
// flaky "28) test0221(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-550" + "'", str4, "EQ-550");
// flaky "10) test0221(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-550" + "'", str5, "EQ-550");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0222");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-513, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-296");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0223");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        src.java.EquipmentStatus equipmentStatus8 = null;
        microscope3.setStatus(equipmentStatus8);
        java.lang.String str10 = microscope3.getName();
        java.lang.String str11 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "29) test0223(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null" + "'", str11, "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0224");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        java.lang.String str8 = microscope3.getEquipmentId();
// flaky "30) test0224(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "11) test0224(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-558" + "'", str8, "EQ-558");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0225");
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
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
// flaky "31) test0225(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Head Lab Coordinator" + "'", str16, "Head Lab Coordinator");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0226");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-344", "EQ-344", "EQ-205", "EQ-535");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-344");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0227");
        src.java.Microscope microscope3 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
// flaky "32) test0227(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-560" + "'", str5, "EQ-560");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0228");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-504", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-371");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0229");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.password;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean14 = labManager13.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
// flaky "33) test0229(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0230");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        java.lang.String str9 = labManager3.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lab Manager" + "'", str9, "Lab Manager");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0231");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-263", "EQ-335", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0232");
        src.java.Student student3 = new src.java.Student("EQ-104", "Guest", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0233");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        java.lang.String str11 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0234");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-410, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-304", "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0235");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-466", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-466");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0236");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0237");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        java.lang.Class<?> wildcardClass7 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0238");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts16 = userFactory0.createUser("Researcher", "COORD-001", "");
        userAccounts16.password = "EQ-264";
        java.lang.String str19 = userAccounts16.password;
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ-264" + "'", str19, "EQ-264");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0239");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        double double11 = userAccounts10.getHourlyRate();
        userAccounts10.needsapproval = false;
        java.lang.String str14 = userAccounts10.getAccountType();
        double double15 = userAccounts10.getHourlyRate();
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0240");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("hi!", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts13 = userFactory0.createUser("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-39", "Researcher", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts27 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "EQ-231", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts31 = userFactory0.createUser("EQ-335", "EQ-539", "EQ-497");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts13);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
        org.junit.Assert.assertNull(userAccounts27);
        org.junit.Assert.assertNull(userAccounts31);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0241");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0242");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.username = "COORD-001";
        double double6 = researcher3.getHourlyRate();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getRegistrationId();
        researcher3.needsapproval = false;
        double double11 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0243");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-380");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0244");
        src.java.Student student3 = new src.java.Student("EQ-392", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0245");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.isapproved = true;
        java.lang.String str11 = faculty3.username;
        java.lang.String str12 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COORD-001" + "'", str12, "COORD-001");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0246");
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
        java.lang.String str23 = microscope3.getName();
        java.lang.String str24 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "34) test0246(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-596" + "'", str10, "EQ-596");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus21 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus21.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0247");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-422", "EQ-296");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0248");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-63", "EQ-335", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-63" + "'", str4, "EQ-63");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0249");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.String str6 = headLabCoordinator0.getRegistrationId();
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "35) test0249(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COORD-001" + "'", str6, "COORD-001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0250");
        src.java.Researcher researcher3 = new src.java.Researcher("Guest", "EQ-427", "Researcher");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0251");
        src.java.Guest guest3 = new src.java.Guest("Guest", "COORD-001", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0252");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.isapproved = true;
        java.lang.Class<?> wildcardClass7 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0253");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-371", "EQ-246", "Equipment ID: EQ-466, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0254");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-513, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null", "EQ-156", "EQ-496");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-513, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0255");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        java.lang.Class<?> wildcardClass7 = labManager6.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "36) test0255(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0256");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        guest3.needsapproval = false;
        java.lang.Class<?> wildcardClass13 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0257");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Student", "EQ-344");
        boolean boolean4 = guest3.isapproved;
        guest3.username = "Equipment ID: EQ-367, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0258");
        src.java.Faculty faculty3 = new src.java.Faculty("hi!", "Head Lab Coordinator", "Researcher");
        faculty3.isapproved = true;
        java.lang.String str6 = faculty3.getAccountType();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0259");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-384");
        java.lang.String str11 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0260");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        boolean boolean4 = researcher3.needsapproval;
        boolean boolean5 = researcher3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0261");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager8 = headLabCoordinator0.autoGenerateLabManager("EQ-222", "Head Lab Coordinator");
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("EQ-299", "EQ-344");
        java.lang.String str14 = labManager13.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EQ-299" + "'", str14, "EQ-299");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0262");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getName();
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.Class<?> wildcardClass7 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus6 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus6.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0263");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.getLocation();
        java.lang.String str6 = microscope3.toString();
// flaky "37) test0263(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-630" + "'", str4, "EQ-630");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
// flaky "12) test0263(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0264");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.isapproved = true;
        java.lang.String str11 = faculty3.username;
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COORD-001" + "'", str11, "COORD-001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0265");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "Head Lab Coordinator", "");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.String str5 = microscope3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
// flaky "38) test0265(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0266");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-246", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-344, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0267");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-586", "Equipment ID: EQ-558, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-586");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0268");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-98", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "EQ-104", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-98");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0269");
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
        java.lang.String str16 = microscope3.getEquipmentId();
        src.java.EquipmentStatus equipmentStatus17 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "39) test0269(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-643" + "'", str16, "EQ-643");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0270");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        researcher3.username = "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0271");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = researcher3.username;
        java.lang.String str7 = researcher3.getAccountType();
        researcher3.isapproved = false;
        java.lang.String str10 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0272");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = arduino3.isAvailable(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = arduino3.isAvailable(localDateTime16, localDateTime17);
        java.lang.String str19 = arduino3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "40) test0272(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-655" + "'", str8, "EQ-655");
// flaky "13) test0272(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-655" + "'", str9, "EQ-655");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0273");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE" + "'", str7, "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0274");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0275");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = guest3.getAccountType();
        guest3.isapproved = false;
        java.lang.String str7 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0276");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        researcher3.password = "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null";
        java.lang.String str11 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0277");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("EQ-36", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        java.lang.String str5 = labManager4.getRegistrationId();
        java.lang.String str6 = labManager4.password;
        boolean boolean7 = labManager4.needsapproval;
        java.lang.String str8 = labManager4.password;
        java.lang.String str9 = labManager4.getRegistrationId();
        java.lang.String str10 = labManager4.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MANAGER-66180900" + "'", str5, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MANAGER-66180900" + "'", str9, "MANAGER-66180900");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0278");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Guest", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        boolean boolean10 = headLabCoordinator0.isapproved;
        boolean boolean11 = headLabCoordinator0.needsapproval;
        boolean boolean12 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0279");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        java.lang.String str10 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0280");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-104", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-560");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-104");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0281");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0282");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.getAccountType();
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("EQ-120", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "41) test0282(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null" + "'", str1, "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Head Lab Coordinator" + "'", str3, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0283");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-571, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-528", "EQ-422");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0284");
        src.java.Guest guest3 = new src.java.Guest("EQ-431", "EQ-344", "EQ-149");
        guest3.username = "EQ-628";
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0285");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.username = "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        labManager5.isapproved = false;
        labManager5.isapproved = false;
        java.lang.String str12 = labManager5.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0286");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-513, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-495, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0287");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        boolean boolean10 = guest3.needsapproval;
        guest3.needsapproval = false;
        java.lang.String str13 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0288");
        src.java.Microscope microscope3 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str4 = microscope3.getName();
        java.lang.String str5 = microscope3.getDescription();
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getEquipmentId();
        java.lang.String str9 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "42) test0288(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-687" + "'", str8, "EQ-687");
// flaky "14) test0288(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-687" + "'", str9, "EQ-687");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0289");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("Guest", "Equipment ID: EQ-33, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "hi!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("EQ-299", "EQ-275", "Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts25 = userFactory0.createUser("EQ-497", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNotNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts25);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0290");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        researcher3.password = "hi!";
        java.lang.String str6 = researcher3.getRegistrationId();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        researcher3.password = "EQ-299";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0291");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.lang.String str4 = arduino3.getName();
        java.lang.String str5 = arduino3.getEquipmentId();
        java.lang.String str6 = arduino3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "43) test0291(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-688" + "'", str5, "EQ-688");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0292");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        boolean boolean8 = headLabCoordinator0.isapproved;
        java.lang.Class<?> wildcardClass9 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
// flaky "44) test0292(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0293");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        java.lang.String str7 = arduino3.getDescription();
        java.lang.String str8 = arduino3.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-152" + "'", str7, "EQ-152");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-36" + "'", str8, "EQ-36");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0294");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus10 = microscope3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "45) test0294(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-696, Name: , Description: , Location: , Status: null" + "'", str9, "Equipment ID: EQ-696, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0295");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-193", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-99");
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0296");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        boolean boolean5 = student3.isapproved;
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0297");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-661, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0298");
        src.java.Student student3 = new src.java.Student("EQ-104", "Guest", "");
        boolean boolean4 = student3.isapproved;
        java.lang.String str5 = student3.getAccountType();
        student3.isapproved = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0299");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0300");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.needsapproval = false;
        boolean boolean8 = labManager5.isapproved;
        java.lang.String str9 = labManager5.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0301");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        java.lang.String str6 = researcher3.username;
        java.lang.Class<?> wildcardClass7 = researcher3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0302");
        src.java.Faculty faculty3 = new src.java.Faculty("MasterAdmin123!", "COORD-001", "");
        java.lang.String str4 = faculty3.password;
        java.lang.String str5 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0303");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-535", "EQ-371", "Equipment ID: EQ-257, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0304");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "COORD-001", "EQ-39");
        java.lang.String str4 = arduino3.getDescription();
        src.java.EquipmentStatus equipmentStatus5 = arduino3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus5 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus5.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0305");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        src.java.EquipmentStatus equipmentStatus4 = equipment3.getStatus();
        java.lang.String str5 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "46) test0305(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0306");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-156", "", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0307");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-275", "EQ-259", "EQ-253");
        java.lang.Class<?> wildcardClass4 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0308");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-94", "EQ-205");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0309");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-469", "Equipment ID: EQ-573, Name: , Description: , Location: , Status: null", "EQ-559");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0310");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        boolean boolean9 = headLabCoordinator0.isapproved;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager13 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-177, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        boolean boolean14 = labManager13.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "47) test0310(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str8, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
// flaky "15) test0310(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0311");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.username = "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        java.lang.String str9 = labManager3.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0312");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE", "", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-635, Name: hi!, Description: Head Lab Coordinator, Location: , Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0313");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-599", "EQ-276", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0314");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-304", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null", "EQ-392");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-509", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-257", "");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0315");
        src.java.Faculty faculty3 = new src.java.Faculty("Head Lab Coordinator", "EQ-92", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0316");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.password;
        student3.isapproved = true;
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0317");
        src.java.Guest guest3 = new src.java.Guest("EQ-36", "MANAGER-0", "EQ-569");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0318");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        student3.needsapproval = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0319");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        boolean boolean7 = labManager3.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0320");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
        java.lang.String str5 = equipment3.getDescription();
        src.java.Equipment equipment9 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        java.lang.String str10 = equipment9.getEquipmentId();
        src.java.Equipment equipment14 = new src.java.Equipment("EQ-152", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "EQ-193");
        src.java.Equipment equipment18 = new src.java.Equipment("EQ-94", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null", "MasterAdmin123!");
        src.java.Equipment equipment22 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino26 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope30 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str31 = microscope30.getName();
        java.lang.String str32 = microscope30.getLocation();
        src.java.EquipmentStatus equipmentStatus33 = microscope30.getStatus();
        arduino26.setStatus(equipmentStatus33);
        equipment22.setStatus(equipmentStatus33);
        equipment18.setStatus(equipmentStatus33);
        equipment14.setStatus(equipmentStatus33);
        equipment9.setStatus(equipmentStatus33);
        equipment3.setStatus(equipmentStatus33);
        java.lang.String str40 = equipment3.getLocation();
// flaky "48) test0320(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-734" + "'", str4, "EQ-734");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
// flaky "16) test0320(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-735" + "'", str10, "EQ-735");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus33 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus33.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str40, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0321");
        src.java.Researcher researcher3 = new src.java.Researcher("", "Guest", "MasterAdmin123!");
        boolean boolean4 = researcher3.needsapproval;
        double double5 = researcher3.getHourlyRate();
        boolean boolean6 = researcher3.needsapproval;
        boolean boolean7 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0322");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        src.java.LabManager labManager12 = headLabCoordinator0.autoGenerateLabManager("EQ-152", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "49) test0322(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0323");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-616", "EQ-152", "", "EQ-615");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-616");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0324");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = arduino3.getStatus();
        java.lang.String str7 = arduino3.getLocation();
        src.java.EquipmentStatus equipmentStatus8 = arduino3.getStatus();
        java.lang.String str9 = arduino3.getLocation();
        src.java.Equipment equipment13 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str14 = equipment13.getDescription();
        src.java.EquipmentStatus equipmentStatus15 = equipment13.getStatus();
        arduino3.setStatus(equipmentStatus15);
        java.lang.String str17 = arduino3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNull(equipmentStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COORD-001" + "'", str14, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus15 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus15.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0325");
        src.java.Equipment equipment3 = new src.java.Equipment("", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "EQ-118");
        java.lang.String str4 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-118" + "'", str4, "EQ-118");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0326");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        src.java.EquipmentStatus equipmentStatus7 = arduino3.getStatus();
        java.lang.String str8 = arduino3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus7 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus7.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "50) test0326(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-748, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0327");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-36", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-284", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.UserAccounts userAccounts21 = userFactory0.createUser("Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null", "EQ-496");
        src.java.UserAccounts userAccounts26 = userFactory0.createUser("EQ-193", "EQ-361", "EQ-75", "EQ-446");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
        org.junit.Assert.assertNull(userAccounts21);
        org.junit.Assert.assertNull(userAccounts26);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0328");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        guest3.password = "Equipment ID: EQ-718, Name: , Description: , Location: , Status: null";
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0329");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        boolean boolean4 = headLabCoordinator0.isapproved;
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        java.lang.Class<?> wildcardClass6 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
// flaky "51) test0329(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0330");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-71", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-547", "Equipment ID: EQ-115, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-71");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0331");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-431", "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-341");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-431");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0332");
        src.java.Student student3 = new src.java.Student("EQ-435", "Equipment ID: EQ-494, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-507");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0333");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE", "EQ-257");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0334");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        labManager3.password = "EQ-75";
        double double12 = labManager3.getHourlyRate();
        labManager3.username = "hi!";
        labManager3.isapproved = false;
        java.lang.Class<?> wildcardClass17 = labManager3.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0335");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.Class<?> wildcardClass8 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0336");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-461", "EQ-583", "EQ-98", "Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-461");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0337");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.needsapproval = false;
        boolean boolean6 = labManager3.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0338");
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
        java.lang.String str15 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "52) test0338(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-765" + "'", str10, "EQ-765");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipmentStatus14);
// flaky "17) test0338(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null" + "'", str15, "Equipment ID: EQ-765, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0339");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-361", "Lab Manager", "EQ-559");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0340");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-503", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-382");
        faculty3.isapproved = false;
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0341");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        boolean boolean1 = headLabCoordinator0.needsapproval;
        java.lang.String str2 = headLabCoordinator0.getAccountType();
        java.lang.String str3 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "53) test0341(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Head Lab Coordinator" + "'", str2, "Head Lab Coordinator");
// flaky "18) test0341(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE" + "'", str3, "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0342");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-586", "Researcher", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-586");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0343");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        double double6 = labManager3.getHourlyRate();
        java.lang.String str7 = labManager3.password;
        labManager3.password = "Guest";
        java.lang.String str10 = labManager3.getAccountType();
        labManager3.username = "EQ-258";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lab Manager" + "'", str10, "Lab Manager");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0344");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-209", "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getDescription();
// flaky "54) test0344(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-784" + "'", str4, "EQ-784");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str5, "Equipment ID: EQ-141, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0345");
        src.java.Guest guest3 = new src.java.Guest("EQ-179", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-536");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0346");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-341", "EQ-281", "", "EQ-560");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-341");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0347");
        src.java.Guest guest3 = new src.java.Guest("EQ-221", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-120");
        boolean boolean4 = guest3.needsapproval;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0348");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.username;
        java.lang.String str9 = headLabCoordinator0.username;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "55) test0348(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "19) test0348(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0349");
        src.java.Guest guest3 = new src.java.Guest("EQ-684", "Equipment ID: EQ-147, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "COORD-001");
        guest3.username = "EQ-578";
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0350");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.Class<?> wildcardClass7 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0351");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-50, Name: , Description: , Location: , Status: null");
        guest3.needsapproval = true;
        java.lang.String str6 = guest3.getAccountType();
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.Class<?> wildcardClass9 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0352");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.password;
        student3.isapproved = true;
        student3.password = "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0353");
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
        java.lang.String str13 = microscope3.getLocation();
        java.lang.String str14 = microscope3.getName();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "56) test0353(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-815, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0354");
        src.java.Student student3 = new src.java.Student("COORD-001", "EQ-74", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        student3.password = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0355");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("EQ-104", "EQ-104", "Equipment ID: EQ-350, Name: , Description: , Location: , Status: null", "EQ-99");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0356");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-791", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0357");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        boolean boolean5 = researcher3.needsapproval;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0358");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getAccountType();
        java.lang.String str8 = researcher3.getAccountType();
        java.lang.String str9 = researcher3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0359");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = arduino3.isAvailable(localDateTime13, localDateTime14);
        java.lang.String str16 = arduino3.getEquipmentId();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "57) test0359(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-826" + "'", str8, "EQ-826");
// flaky "20) test0359(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-826" + "'", str9, "EQ-826");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "4) test0359(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EQ-826" + "'", str16, "EQ-826");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0360");
        src.java.Guest guest3 = new src.java.Guest("EQ-335", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0361");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.password;
        java.lang.String str7 = guest3.getAccountType();
        java.lang.String str8 = guest3.getAccountType();
        java.lang.String str9 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0362");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0363");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        java.lang.String str12 = headLabCoordinator0.username;
        java.lang.Class<?> wildcardClass13 = headLabCoordinator0.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0364");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-630", "EQ-461", "EQ-565", "EQ-92");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-630");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0365");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-367", "EQ-106", "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0366");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.username;
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.password = "EQ-205";
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COORD-001" + "'", str7, "COORD-001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0367");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-627", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-253");
        java.lang.String str4 = arduino3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-253" + "'", str4, "EQ-253");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0368");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("MANAGER-66180900", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "EQ-586", "EQ-156");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: MANAGER-66180900");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0369");
        src.java.Microscope microscope3 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str4 = microscope3.toString();
        java.lang.String str5 = microscope3.toString();
        java.lang.String str6 = microscope3.getName();
        java.lang.String str7 = microscope3.getEquipmentId();
// flaky "58) test0369(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "21) test0369(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-851, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
// flaky "5) test0369(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-851" + "'", str7, "EQ-851");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0370");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty", "COORD-001", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("EQ-98", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-99", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        src.java.UserAccounts userAccounts24 = userFactory0.createUser("Student", "EQ-578", "EQ-275", "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str25 = userAccounts24.getAccountType();
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNotNull(userAccounts24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0371");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-232, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = equipment3.getEquipmentId();
// flaky "59) test0371(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-861" + "'", str4, "EQ-861");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0372");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "COORD-001", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getEquipmentId();
        java.lang.String str5 = microscope3.toString();
        java.lang.Class<?> wildcardClass6 = microscope3.getClass();
// flaky "60) test0372(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-862" + "'", str4, "EQ-862");
// flaky "22) test0372(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-862, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0373");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("Researcher", "MasterAdmin123!", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts10 = userFactory0.createUser("Guest", "EQ-63", "Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-39, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-112, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        src.java.UserAccounts userAccounts19 = userFactory0.createUser("Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-616, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-547");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-228, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-344");
        org.junit.Assert.assertNotNull(userAccounts5);
        org.junit.Assert.assertNotNull(userAccounts10);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts19);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0374");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        src.java.EquipmentStatus equipmentStatus7 = null;
        microscope3.setStatus(equipmentStatus7);
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getEquipmentId();
        java.lang.String str11 = microscope3.getLocation();
        java.lang.String str12 = microscope3.toString();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "61) test0374(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EQ-866" + "'", str10, "EQ-866");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "23) test0374(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null" + "'", str12, "Equipment ID: EQ-866, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0375");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-773", "EQ-503", "EQ-435", "EQ-628");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-773");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0376");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getRegistrationId();
        headLabCoordinator0.needsapproval = true;
        java.lang.String str4 = headLabCoordinator0.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COORD-001" + "'", str1, "COORD-001");
// flaky "62) test0376(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0377");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.username = "";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0378");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-820", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-470", "Equipment ID: EQ-363, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-820");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0379");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-504", "EQ-834", "EQ-209", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-504");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0380");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getRegistrationId();
        java.lang.String str5 = faculty3.password;
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MasterAdmin123!" + "'", str4, "MasterAdmin123!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COORD-001" + "'", str8, "COORD-001");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0381");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-120", "EQ-264", "EQ-473");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0382");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-36", "EQ-152", "Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        src.java.Microscope microscope7 = new src.java.Microscope("Head Lab Coordinator", "", "hi!");
        java.lang.String str8 = microscope7.toString();
        java.lang.String str9 = microscope7.toString();
        src.java.EquipmentStatus equipmentStatus10 = null;
        microscope7.setStatus(equipmentStatus10);
        java.lang.String str12 = microscope7.getName();
        src.java.Microscope microscope16 = new src.java.Microscope("Guest", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "COORD-001");
        java.lang.String str17 = microscope16.getName();
        src.java.EquipmentStatus equipmentStatus18 = microscope16.getStatus();
        microscope7.setStatus(equipmentStatus18);
        src.java.Microscope microscope23 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str24 = microscope23.getName();
        java.lang.String str25 = microscope23.getLocation();
        java.lang.String str26 = microscope23.getName();
        java.lang.String str27 = microscope23.getName();
        src.java.Microscope microscope31 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus32 = null;
        microscope31.setStatus(equipmentStatus32);
        src.java.EquipmentStatus equipmentStatus34 = null;
        microscope31.setStatus(equipmentStatus34);
        java.lang.String str36 = microscope31.getName();
        src.java.Arduino arduino40 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope44 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str45 = microscope44.getName();
        java.lang.String str46 = microscope44.getLocation();
        src.java.EquipmentStatus equipmentStatus47 = microscope44.getStatus();
        arduino40.setStatus(equipmentStatus47);
        microscope31.setStatus(equipmentStatus47);
        microscope23.setStatus(equipmentStatus47);
        microscope7.setStatus(equipmentStatus47);
        arduino3.setStatus(equipmentStatus47);
        java.lang.String str53 = arduino3.toString();
// flaky "63) test0382(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str8, "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
// flaky "24) test0382(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str9, "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Head Lab Coordinator" + "'", str12, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
        org.junit.Assert.assertTrue("'" + equipmentStatus18 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus18.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus47 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus47.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "6) test0382(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE" + "'", str53, "Equipment ID: EQ-889, Name: EQ-36, Description: EQ-152, Location: Equipment ID: EQ-207, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE, Status: AVAILABLE");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0383");
        src.java.Arduino arduino3 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.EquipmentStatus equipmentStatus4 = null;
        arduino3.setStatus(equipmentStatus4);
        java.lang.String str6 = arduino3.getLocation();
        java.lang.Class<?> wildcardClass7 = arduino3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0384");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-615", "EQ-326");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0385");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-470", "EQ-734", "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0386");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "MasterAdmin123!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.username;
        student3.password = "Equipment ID: EQ-452, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str5, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0387");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-852, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-236, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0388");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-344", "EQ-861");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0389");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-443, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "Equipment ID: EQ-403, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-443, Name: , Description: , Location: , Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0390");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-491, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-242");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0391");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-118", "Equipment ID: EQ-124, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0392");
        src.java.Student student3 = new src.java.Student("EQ-71", "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "EQ-862");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0393");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-152", "Equipment ID: EQ-770, Name: , Description: , Location: , Status: null", "", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-152");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0394");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.password = "";
        headLabCoordinator0.isapproved = false;
        double double10 = headLabCoordinator0.getHourlyRate();
        headLabCoordinator0.isapproved = false;
        headLabCoordinator0.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0395");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-688", "Equipment ID: EQ-370, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-826");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0396");
        src.java.Student student3 = new src.java.Student("EQ-446", "EQ-731", "EQ-371");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0397");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-811", "Equipment ID: EQ-785, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-524, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0398");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Lab Manager");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0399");
        src.java.Guest guest3 = new src.java.Guest("EQ-335", "Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null");
        guest3.isapproved = true;
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0400");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-573, Name: , Description: , Location: , Status: null", "EQ-333", "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0401");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-344, Name: , Description: , Location: , Status: null", "EQ-862", "EQ-835");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0402");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        labManager3.isapproved = true;
        java.lang.String str6 = labManager3.password;
        labManager3.password = "MasterAdmin123!";
        java.lang.String str9 = labManager3.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0403");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("EQ-784", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-263");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0404");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino7 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope11 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        arduino7.setStatus(equipmentStatus14);
        equipment3.setStatus(equipmentStatus14);
        java.lang.String str17 = equipment3.getEquipmentId();
        java.lang.String str18 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "64) test0404(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EQ-932" + "'", str17, "EQ-932");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null" + "'", str18, "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0405");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0406");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-452", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-71", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-452");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0407");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "MANAGER-66180900", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = microscope3.getDescription();
        java.lang.Class<?> wildcardClass5 = microscope3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-66180900" + "'", str4, "MANAGER-66180900");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0408");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-578", "Equipment ID: EQ-874, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0409");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager4 = headLabCoordinator0.autoGenerateLabManager("Student", "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        labManager4.needsapproval = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0410");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        src.java.LabManager labManager7 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-535");
        labManager7.username = "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertNotNull(labManager7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0411");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-477, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "EQ-258");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0412");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        researcher3.password = "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null";
        boolean boolean6 = researcher3.needsapproval;
        java.lang.String str7 = researcher3.getAccountType();
        boolean boolean8 = researcher3.needsapproval;
        java.lang.String str9 = researcher3.username;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0413");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.lang.String str8 = microscope3.getName();
        src.java.EquipmentStatus equipmentStatus9 = microscope3.getStatus();
        java.lang.String str10 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope3.isAvailable(localDateTime11, localDateTime12);
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "65) test0413(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-944, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-944, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(equipmentStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0414");
        src.java.Student student3 = new src.java.Student("EQ-209", "Head Lab Coordinator", "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getRegistrationId();
        student3.username = "Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE";
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-86, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0415");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = microscope3.getStatus();
        java.lang.String str7 = microscope3.toString();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = microscope3.isAvailable(localDateTime8, localDateTime9);
        java.lang.String str11 = microscope3.getLocation();
        src.java.EquipmentStatus equipmentStatus12 = microscope3.getStatus();
        java.lang.String str13 = microscope3.getEquipmentId();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "66) test0415(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-946, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(equipmentStatus12);
// flaky "25) test0415(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-946" + "'", str13, "EQ-946");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0416");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Head Lab Coordinator", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.password;
        student3.isapproved = true;
        java.lang.String str11 = student3.password;
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0417");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getName();
        java.lang.String str10 = microscope3.getDescription();
        src.java.Equipment equipment14 = new src.java.Equipment("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.lang.String str15 = equipment14.getLocation();
        java.lang.String str16 = equipment14.getName();
        src.java.EquipmentStatus equipmentStatus17 = equipment14.getStatus();
        microscope3.setStatus(equipmentStatus17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str15, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str16, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + equipmentStatus17 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus17.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0418");
        src.java.Researcher researcher3 = new src.java.Researcher("EQ-231", "EQ-222", "Equipment ID: EQ-299, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        researcher3.needsapproval = true;
        boolean boolean6 = researcher3.needsapproval;
        researcher3.password = "EQ-560";
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0419");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-114", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-63");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = equipment3.isAvailable(localDateTime4, localDateTime5);
        src.java.Microscope microscope10 = new src.java.Microscope("Guest", "COORD-001", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = microscope10.isAvailable(localDateTime11, localDateTime12);
        src.java.EquipmentStatus equipmentStatus14 = microscope10.getStatus();
        src.java.Equipment equipment18 = new src.java.Equipment("MasterAdmin123!", "COORD-001", "Researcher");
        java.lang.String str19 = equipment18.getDescription();
        src.java.EquipmentStatus equipmentStatus20 = equipment18.getStatus();
        microscope10.setStatus(equipmentStatus20);
        equipment3.setStatus(equipmentStatus20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "COORD-001" + "'", str19, "COORD-001");
        org.junit.Assert.assertTrue("'" + equipmentStatus20 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus20.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0420");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        java.lang.String str6 = headLabCoordinator0.getAccountType();
        java.lang.String str7 = headLabCoordinator0.username;
        java.lang.String str8 = headLabCoordinator0.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Head Lab Coordinator" + "'", str6, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "67) test0420(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str8, "Equipment ID: EQ-915, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0421");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "Equipment ID: EQ-682, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: , Location: EQ-470, Status: AVAILABLE", "Equipment ID: EQ-614, Name: , Description: , Location: , Status: null", "EQ-451");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-489, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0422");
        src.java.Student student3 = new src.java.Student("EQ-719", "EQ-296", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0423");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-75", "EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        src.java.EquipmentStatus equipmentStatus4 = arduino3.getStatus();
        java.lang.String str5 = arduino3.getName();
        org.junit.Assert.assertTrue("'" + equipmentStatus4 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus4.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-75" + "'", str5, "EQ-75");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0424");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        java.lang.String str2 = headLabCoordinator0.username;
        headLabCoordinator0.username = "COORD-001";
        java.lang.String str5 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.needsapproval = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Head Lab Coordinator" + "'", str5, "Head Lab Coordinator");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0425");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-39", "MANAGER-0", "MANAGER-0");
        java.lang.String str4 = microscope3.getDescription();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = microscope3.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MANAGER-0" + "'", str4, "MANAGER-0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0426");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-802", "EQ-371", "EQ-616");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0427");
        src.java.Guest guest3 = new src.java.Guest("", "", "EQ-75");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0428");
        src.java.Student student3 = new src.java.Student("COORD-001", "EQ-74", "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0429");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-392", "EQ-259", "EQ-427");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0430");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-124, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-923, Name: , Description: EQ-36, Location: EQ-92, Status: AVAILABLE", "");
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0431");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "EQ-41", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0432");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Researcher" + "'", str4, "Researcher");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0433");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts5 = userFactory0.createUser("", "COORD-001", "Researcher", "");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "EQ-242", "EQ-118", "EQ-98");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("EQ-392", "EQ-325", "EQ-461");
        src.java.UserAccounts userAccounts23 = userFactory0.createUser("Equipment ID: EQ-450, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE", "Equipment ID: EQ-778, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE", "Equipment ID: EQ-630, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "Equipment ID: EQ-705, Name: EQ-114, Description: Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Location: EQ-63, Status: AVAILABLE");
        org.junit.Assert.assertNull(userAccounts5);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
        org.junit.Assert.assertNull(userAccounts23);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0434");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        java.lang.String str8 = headLabCoordinator0.getAccountType();
        java.lang.String str9 = headLabCoordinator0.username;
        double double10 = headLabCoordinator0.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
// flaky "68) test0434(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Head Lab Coordinator" + "'", str8, "Head Lab Coordinator");
// flaky "26) test0434(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0435");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-71", "Equipment ID: EQ-239, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "Equipment ID: EQ-112, Name: , Description: , Location: , Status: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-612, Name: EQ-75, Description: EQ-71, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0436");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean10 = labManager9.isapproved;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "69) test0436(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-489" + "'", str1, "EQ-489");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0437");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-187, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "EQ-427", "Equipment ID: EQ-396, Name: , Description: , Location: , Status: null");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0438");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "EQ-92", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0439");
        src.java.Arduino arduino3 = new src.java.Arduino("", "EQ-94", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = arduino3.isAvailable(localDateTime4, localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0440");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        headLabCoordinator0.needsapproval = false;
        double double6 = headLabCoordinator0.getHourlyRate();
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("EQ-470", "Equipment ID: EQ-272, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        boolean boolean10 = labManager9.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "70) test0440(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-489" + "'", str1, "EQ-489");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0441");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        faculty3.username = "EQ-104";
        java.lang.String str6 = faculty3.getRegistrationId();
        faculty3.username = "EQ-242";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null" + "'", str6, "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0442");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "EQ-514", "Equipment ID: EQ-380, Name: Equipment ID: EQ-50, Name: , Description: , Location: , Status: null, Description: , Location: Head Lab Coordinator, Status: AVAILABLE");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0443");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null", "", "EQ-442");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null" + "'", str4, "Equipment ID: EQ-125, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0444");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-661, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0445");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.password = "COORD-001";
        java.lang.String str6 = researcher3.username;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str6, "Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0446");
        src.java.Guest guest3 = new src.java.Guest("hi!", "hi!", "");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getRegistrationId();
        java.lang.String str6 = guest3.getRegistrationId();
        java.lang.String str7 = guest3.getRegistrationId();
        boolean boolean8 = guest3.isapproved;
        java.lang.String str9 = guest3.getAccountType();
        guest3.username = "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0447");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-287, Name: , Description: , Location: , Status: null", "EQ-442");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0448");
        src.java.Student student3 = new src.java.Student("EQ-258", "EQ-92", "EQ-299");
        java.lang.String str4 = student3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-258" + "'", str4, "EQ-258");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0449");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-603", "EQ-473", "EQ-120", "EQ-578");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-603");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0450");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        src.java.LabManager labManager3 = headLabCoordinator0.autoGenerateLabManager("hi!", "Head Lab Coordinator");
        java.lang.String str4 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        boolean boolean7 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Equipment ID: EQ-176, Name: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Description: hi!, Location: , Status: AVAILABLE";
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        java.lang.String str11 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Head Lab Coordinator" + "'", str4, "Head Lab Coordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Head Lab Coordinator" + "'", str11, "Head Lab Coordinator");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0451");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.getAccountType();
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.getRegistrationId();
        java.lang.String str5 = headLabCoordinator0.getRegistrationId();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head Lab Coordinator" + "'", str1, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COORD-001" + "'", str4, "COORD-001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "COORD-001" + "'", str5, "COORD-001");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0452");
        src.java.Arduino arduino3 = new src.java.Arduino("Equipment ID: EQ-50, Name: , Description: , Location: , Status: null", "", "Head Lab Coordinator");
        java.lang.String str4 = arduino3.getEquipmentId();
        java.lang.String str5 = arduino3.getDescription();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = arduino3.isAvailable(localDateTime6, localDateTime7);
        java.lang.String str9 = arduino3.getLocation();
// flaky "71) test0452(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-982" + "'", str4, "EQ-982");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Head Lab Coordinator" + "'", str9, "Head Lab Coordinator");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0453");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-404, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-422", "EQ-536");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0454");
        src.java.Researcher researcher3 = new src.java.Researcher("Head Lab Coordinator", "Guest", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = researcher3.getRegistrationId();
        java.lang.String str5 = researcher3.password;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0455");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "EQ-263", "MANAGER-66180900");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-230, Name: hi!, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0456");
        src.java.Guest guest3 = new src.java.Guest("Researcher", "", "Equipment ID: EQ-437, Name: hi!, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0457");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "EQ-36", "EQ-98");
        java.lang.String str4 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0458");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-57, Name: , Description: , Location: , Status: null", "");
        src.java.Arduino arduino7 = new src.java.Arduino("", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Researcher");
        src.java.Microscope microscope11 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str12 = microscope11.getName();
        java.lang.String str13 = microscope11.getLocation();
        src.java.EquipmentStatus equipmentStatus14 = microscope11.getStatus();
        arduino7.setStatus(equipmentStatus14);
        microscope3.setStatus(equipmentStatus14);
        src.java.Arduino arduino20 = new src.java.Arduino("Equipment ID: EQ-49, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MasterAdmin123!", "EQ-75");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = arduino20.isAvailable(localDateTime21, localDateTime22);
        java.lang.String str24 = arduino20.getDescription();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = arduino20.isAvailable(localDateTime25, localDateTime26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = arduino20.isAvailable(localDateTime28, localDateTime29);
        src.java.EquipmentStatus equipmentStatus31 = arduino20.getStatus();
        microscope3.setStatus(equipmentStatus31);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus14 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus14.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MasterAdmin123!" + "'", str24, "MasterAdmin123!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus31 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus31.equals(src.java.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0459");
        src.java.Student student3 = new src.java.Student("EQ-496", "EQ-592", "EQ-179");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0460");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Student", "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null");
        java.lang.String str4 = student3.password;
        student3.username = "Equipment ID: EQ-52, Name: hi!, Description: , Location: hi!, Status: null";
        student3.isapproved = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0461");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        java.lang.String str3 = headLabCoordinator0.getRegistrationId();
        boolean boolean4 = headLabCoordinator0.needsapproval;
        headLabCoordinator0.username = "Researcher";
        boolean boolean7 = headLabCoordinator0.isapproved;
        headLabCoordinator0.isapproved = true;
        java.lang.String str10 = headLabCoordinator0.getAccountType();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "COORD-001" + "'", str3, "COORD-001");
// flaky "72) test0461(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Head Lab Coordinator" + "'", str10, "Head Lab Coordinator");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0462");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "", "EQ-98");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-192, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0463");
        src.java.Arduino arduino3 = new src.java.Arduino("Researcher", "hi!", "hi!");
        src.java.Microscope microscope7 = new src.java.Microscope("hi!", "", "hi!");
        java.lang.String str8 = microscope7.getName();
        java.lang.String str9 = microscope7.getLocation();
        src.java.EquipmentStatus equipmentStatus10 = microscope7.getStatus();
        arduino3.setStatus(equipmentStatus10);
        java.lang.String str12 = arduino3.getDescription();
        java.lang.String str13 = arduino3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(src.java.EquipmentStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "73) test0463(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EQ-1005" + "'", str13, "EQ-1005");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0464");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("", "", "");
        src.java.UserAccounts userAccounts8 = userFactory0.createUser("", "MasterAdmin123!", "Head Lab Coordinator");
        src.java.UserAccounts userAccounts12 = userFactory0.createUser("MasterAdmin123!", "Head Lab Coordinator", "MasterAdmin123!");
        src.java.UserAccounts userAccounts17 = userFactory0.createUser("EQ-596", "EQ-392", "EQ-765", "EQ-75");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts8);
        org.junit.Assert.assertNull(userAccounts12);
        org.junit.Assert.assertNull(userAccounts17);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0465");
        src.java.Equipment equipment3 = new src.java.Equipment("", "EQ-284", "EQ-602");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0466");
        src.java.Faculty faculty3 = new src.java.Faculty("COORD-001", "hi!", "MasterAdmin123!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.password = "EQ-156";
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0467");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Researcher", "Equipment ID: EQ-18, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        researcher3.password = "COORD-001";
        boolean boolean6 = researcher3.isapproved;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0468");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-686", "EQ-640", "MANAGER-103232", "Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-686");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0469");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "", "hi!");
        java.lang.String str4 = researcher3.getRegistrationId();
        researcher3.username = "";
        researcher3.isapproved = false;
        java.lang.String str9 = researcher3.getAccountType();
        java.lang.String str10 = researcher3.getAccountType();
        researcher3.isapproved = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0470");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getRegistrationId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0471");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.needsapproval = false;
        java.lang.String str8 = labManager5.password;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0472");
        src.java.Equipment equipment3 = new src.java.Equipment("EQ-514", "Equipment ID: EQ-387, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-528");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0473");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-614, Name: , Description: , Location: , Status: null", "Student", "EQ-371");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0474");
        src.java.Faculty faculty3 = new src.java.Faculty("Equipment ID: EQ-342, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-890, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-231");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0475");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-99", "EQ-536", "Equipment ID: EQ-486, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0476");
        src.java.Researcher researcher3 = new src.java.Researcher("MANAGER-103232", "Researcher", "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0477");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-205", "EQ-559", "EQ-422", "EQ-599");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-205");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0478");
        src.java.Guest guest3 = new src.java.Guest("", "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null", "EQ-976");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0479");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-719", "EQ-578", "EQ-284");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0480");
        src.java.Microscope microscope3 = new src.java.Microscope("", "", "");
        src.java.EquipmentStatus equipmentStatus4 = null;
        microscope3.setStatus(equipmentStatus4);
        src.java.EquipmentStatus equipmentStatus6 = null;
        microscope3.setStatus(equipmentStatus6);
        java.lang.String str8 = microscope3.getName();
        java.lang.String str9 = microscope3.getLocation();
        java.lang.String str10 = microscope3.toString();
        src.java.EquipmentStatus equipmentStatus11 = microscope3.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = microscope3.isAvailable(localDateTime12, localDateTime13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "74) test0480(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-1036, Name: , Description: , Location: , Status: null" + "'", str10, "Equipment ID: EQ-1036, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertNull(equipmentStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0481");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("EQ-688", "EQ-469", "Equipment ID: EQ-991, Name: hi!, Description: , Location: hi!, Status: AVAILABLE", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: EQ-688");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0482");
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
        java.lang.Class<?> wildcardClass14 = arduino3.getClass();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "75) test0482(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-1038" + "'", str8, "EQ-1038");
// flaky "27) test0482(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1038" + "'", str9, "EQ-1038");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0483");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = true;
        java.lang.String str4 = headLabCoordinator0.username;
        headLabCoordinator0.isapproved = true;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        src.java.LabManager labManager10 = headLabCoordinator0.autoGenerateLabManager("EQ-71", "Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        labManager10.isapproved = true;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
// flaky "76) test0483(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EQ-489" + "'", str1, "EQ-489");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0484");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-99", "EQ-74", "Researcher");
        java.lang.String str4 = arduino3.getEquipmentId();
// flaky "77) test0484(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-1039" + "'", str4, "EQ-1039");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0485");
        src.java.Guest guest3 = new src.java.Guest("EQ-71", "Equipment ID: EQ-559, Name: Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: COORD-001, Location: Equipment ID: EQ-86, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-859");
        java.lang.String str4 = guest3.username;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-71" + "'", str4, "EQ-71");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0486");
        src.java.Equipment equipment3 = new src.java.Equipment("Equipment ID: EQ-717, Name: EQ-476, Description: EQ-540, Location: EQ-496, Status: AVAILABLE", "Equipment ID: EQ-556, Name: hi!, Description: , Location: hi!, Status: null", "Equipment ID: EQ-749, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0487");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-86, Name: , Description: , Location: , Status: null", "EQ-209", "EQ-333");
        java.lang.String str4 = researcher3.password;
        java.lang.String str5 = researcher3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-209" + "'", str4, "EQ-209");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0488");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-820", "EQ-503", "EQ-971");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0489");
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
        java.lang.String str34 = microscope3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "78) test0489(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EQ-1045" + "'", str7, "EQ-1045");
        org.junit.Assert.assertNull(equipmentStatus14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "COORD-001" + "'", str20, "COORD-001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null" + "'", str21, "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + equipmentStatus30 + "' != '" + src.java.EquipmentStatus.AVAILABLE + "'", equipmentStatus30.equals(src.java.EquipmentStatus.AVAILABLE));
// flaky "28) test0489(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EQ-1045" + "'", str34, "EQ-1045");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0490");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "EQ-39");
        boolean boolean12 = headLabCoordinator0.needsapproval;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
// flaky "79) test0490(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-489" + "'", str8, "EQ-489");
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0491");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = arduino3.isAvailable(localDateTime13, localDateTime14);
        java.lang.String str16 = arduino3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
// flaky "80) test0491(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ-1050" + "'", str8, "EQ-1050");
// flaky "29) test0491(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EQ-1050" + "'", str9, "EQ-1050");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0492");
        src.java.Arduino arduino3 = new src.java.Arduino("MANAGER-0", "EQ-179", "Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: null");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-179" + "'", str4, "EQ-179");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0493");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        boolean boolean6 = headLabCoordinator0.needsapproval;
        java.lang.String str7 = headLabCoordinator0.getAccountType();
        java.lang.String str8 = headLabCoordinator0.username;
        src.java.LabManager labManager11 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-432, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-483, Name: , Description: , Location: , Status: null");
        labManager11.password = "EQ-978";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0494");
        src.java.UserFactory userFactory0 = new src.java.UserFactory();
        src.java.UserAccounts userAccounts4 = userFactory0.createUser("EQ-71", "Equipment ID: EQ-54, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "MANAGER-0");
        src.java.UserAccounts userAccounts9 = userFactory0.createUser("EQ-259", "EQ-514", "Equipment ID: EQ-226, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null", "Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE");
        src.java.UserAccounts userAccounts14 = userFactory0.createUser("Equipment ID: EQ-206, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-525, Name: , Description: , Location: , Status: null", "EQ-684", "EQ-489");
        src.java.UserAccounts userAccounts18 = userFactory0.createUser("Equipment ID: EQ-199, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-707, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "EQ-843");
        org.junit.Assert.assertNull(userAccounts4);
        org.junit.Assert.assertNull(userAccounts9);
        org.junit.Assert.assertNull(userAccounts14);
        org.junit.Assert.assertNull(userAccounts18);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0495");
        src.java.Microscope microscope3 = new src.java.Microscope("Equipment ID: EQ-83, Name: , Description: , Location: , Status: null", "MasterAdmin123!", "Researcher");
        java.lang.String str4 = microscope3.toString();
// flaky "81) test0495(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE" + "'", str4, "Equipment ID: EQ-1053, Name: Equipment ID: EQ-83, Name: , Description: , Location: , Status: null, Description: MasterAdmin123!, Location: Researcher, Status: AVAILABLE");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0496");
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
        java.lang.String str17 = microscope3.getEquipmentId();
        java.lang.String str18 = microscope3.getDescription();
        java.lang.String str19 = microscope3.getLocation();
        org.junit.Assert.assertNull(equipmentStatus6);
// flaky "82) test0496(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "30) test0496(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null" + "'", str13, "Equipment ID: EQ-1056, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "7) test0496(src.test.randoop.AleenaTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EQ-1056" + "'", str17, "EQ-1056");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0497");
        src.java.Researcher researcher3 = new src.java.Researcher("hi!", "Equipment ID: EQ-16, Name: , Description: , Location: , Status: null", "Head Lab Coordinator");
        boolean boolean4 = researcher3.isapproved;
        java.lang.String str5 = researcher3.getAccountType();
        java.lang.String str6 = researcher3.getAccountType();
        java.lang.String str7 = researcher3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Researcher" + "'", str5, "Researcher");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head Lab Coordinator" + "'", str7, "Head Lab Coordinator");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0498");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-943, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE", "EQ-36", "EQ-469", "EQ-382");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-943, Name: Equipment ID: EQ-308, Name: , Description: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Location: Researcher, Status: null, Description: EQ-242, Location: Equipment ID: EQ-57, Name: , Description: , Location: , Status: null, Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0499");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        headLabCoordinator0.needsapproval = false;
        java.lang.String str8 = headLabCoordinator0.password;
        headLabCoordinator0.isapproved = false;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest0.test0500");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        headLabCoordinator0.username = "";
        src.java.LabManager labManager5 = headLabCoordinator0.autoGenerateLabManager("", "hi!");
        labManager5.needsapproval = false;
        labManager5.username = "";
        boolean boolean10 = labManager5.isapproved;
        java.lang.String str11 = labManager5.username;
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}
